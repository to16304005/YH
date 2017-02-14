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
			//JDBC?ｿｽh?ｿｽ?ｿｽ?ｿｽC?ｿｽo ?ｿｽg?ｿｽp?ｿｽ?ｿｽ?ｿｽ驍ｽ?ｿｽﾟの記?ｿｽq
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle?ｿｽﾉ接托ｿｽ?ｿｽ?ｿｽ?ｿｽ?ｿｽ
			cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("接続完了");
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
    //SELECT文でスレット名を取ってくるための
  	//sql文を格納
    String sql = "select thread_name from thread";
  	
  	
  	//取り出したデータ(スレット名)を格納するための配列
    ArrayList<ThreadBean> threadList= new ArrayList<ThreadBean>();
  	ThreadBean tb = new ThreadBean();
  	try{
  		//sql文の実行
	    Statement st = cn.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    //取り出したデータを格納
  		//next()で1行ずつ取り出す
	    while(rs.next()){
		  
	      //ThreadBean tb = new ThreadBean();
		  
	      //ThreadBeanのセッターに取り出したデータをセット
	      tb.setThreadName(rs.getString(1));
	    	
	      //tb.setThreadCreatedDate(rs.getString(2));

	      //配列に追加
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

