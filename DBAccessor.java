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
			//JDBCドライバ 使用するための記述
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracleに接続する
			Connection cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("接続完了");
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
    //SELECT文
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
    //SELECT文
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
  }
}
