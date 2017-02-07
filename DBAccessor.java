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
			//JDBC?申h?申?申?申C?申o ?申g?申p?申?申?申���?申����L?申q
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle?申����鐃�?申?申?申?申
			cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("?申��鐃�?申?申?申?申");
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
    //SELECT?申?申
    String sql = "SELECT thread_name, thread_created_date FROM Tread";
    ArrayList<ThreadBean> al<ThreadBean> = new ArrayList()<ThreadBean>;

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
    //SELECT?申?申
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
    String sql = "INSERT INTO Thread(thread_id, thread_name) VALUES(thread_id_seq.nextval, '"+ ThreadName +"')";
    try{
      Statement st = cn.createStatement();
      st.executeUpdate(sql);

      cn.commit();

      st.close();

      cn.close();
    }catch(SQLException e){
      e.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public void writeRes(String ThreadId){
    String sql = "INSERT INTO Res(res_id, res)"
  }
}
