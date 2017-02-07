package pac;

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
			//JDBC�h���C�o �g�p���邽�߂̋L�q
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle�ɐڑ�����
			Connection cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("�ڑ�����");
      cn.setAutoCommit(false);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

  public Connection getConnection(){
      return this.cn;
  }



  public ArrayList readThreads(){
    //SELECT��
    String sql = "SELECT thread_name, thread_created_date FROM Tread";
    ArrayList al<ThreadBean> = new ArrayList()<ThreadBean>;

    Statement st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);

    //
    while(rs.next()){

      TreadBean tb = new ThreadBean();

      tb.setThreadName(rs.getString(1));
      tb.setThreadCreatedDate(rs.getString(2));

      al.add(tb);
    }

    return this.al;
  }

  public ArrayList readRes(int threadId){
    //SELECT��
    String sql = "SELECT res_id, res_date, res_content FROM Res WHERE thread_Id =" + threadId ;

    Statement st = cn.createStatement();
    ResultSet rs = st.executeQuery(sql);

    //
    while(rs.next()){

      TreadBean tb = new ThreadBean();

      tb.setResName(rs.getString(1));
      tb.setThreadCreatedDate(rs.getString(2));

      al.add(tb);
    }

    return this.al;
  }

  public void writeThreads(String ThreadName){

  }
}
