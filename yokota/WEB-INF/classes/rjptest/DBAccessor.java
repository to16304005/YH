package rjptest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DBAccessor{

  private Connection cn;

  public void createConnection(){
		try{
			//JDBC?��h?��?��?��C?��o ?��g?��p?��?��?��邽?��߂̋L?��q
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle?��ɐڑ�?��?��?��?��
			cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("�ڑ�����");
      cn.setAutoCommit(false);
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
		}catch(Exception e){
			e.printStackTrace();
		}
	}

  public Connection getConnection(){
      return this.cn;
  }


  public ArrayList<ThreadBean> readThreads(){
    //SELECT���ŃX���b�g��������Ă��邽�߂�
  	//sql�����i�[
    String sql = "select thread_name from thread";
  	
  	
  	//���o�����f�[�^(�X���b�g��)���i�[���邽�߂̔z��
    ArrayList<ThreadBean> threadList= new ArrayList<ThreadBean>();
  	ThreadBean tb = new ThreadBean();
  	try{
  		//sql���̎��s
	    Statement st = cn.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    //���o�����f�[�^���i�[
  		//next()��1�s�����o��
	    while(rs.next()){
		  
	      //ThreadBean tb = new ThreadBean();
		  
	      //ThreadBean�̃Z�b�^�[�Ɏ��o�����f�[�^���Z�b�g
	      tb.setThreadName(rs.getString(1));
	    	
	      //tb.setThreadCreatedDate(rs.getString(2));

	      //�z��ɒǉ�
	      threadList.add(tb);
	    }
  		
    	
  	}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
  	return threadList;
  }

  public ArrayList<ResBean> readRes(String threadid){
  	
	    String sql = "SELECT res_id,res_content, res_date FROM res WHERE thread_Id =" + threadid ;
	  	
		//ArrayList<ResBean> resList= new ArrayList<ResBean>();
  		
  	try{
	    Statement st = cn.createStatement();
	    ResultSet rs = st.executeQuery(sql);
  		//ThreaBean TB = new ThreadBean(); 
	    ThreadBean tb = new ThreadBean();
	    while(rs.next()){

	      //ThreadBean tb = new ThreadBean();
	      //ResBean rb = new ResBean();

	      //tb.setResContents(rs.getString(1));
	      //tb.setThreadCreatedDate(rs.getString(2));

	      //resList.add(rb);
	    	
	    	ResBean rb=new ResBean();
	    	rb.setResId(rs.getString(1));
	    	rb.setResContent(rs.getString(2));
	    	rb.setResDate(rs.getString(3));
	    	
	    	tb.setResBeanList(rb);
	      
	    }
  	
    
  	}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
  	return getResBeanList();
  }
	
  
}

