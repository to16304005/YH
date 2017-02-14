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
			//JDBC???��?��??��?��h???��?��??��?��???��?��??��?��???��?��??��?��C???��?��??��?��o ???��?��??��?��g???��?��??��?��p???��?��??��?��???��?��??��?��???��?��??��?��邽???��?��??��?��߂̋L???��?��??��?��q
			Class.forName("oracle.jdbc.driver.OracleDriver");

			//Oracle???��?��??��?��ɐڑ�???��?��??��?��???��?��??��?��???��?��??��?��???��?��??��?��
			cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("�ڑ��ł������[");
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


  public void writeThreads(String ThreadName){
    String sql = "INSERT INTO Thread(thread_id, thread_name) VALUES(thread_id_seq.nextval, '"+ ThreadName +"')";
    String id="select max(thread_id) from thread";

    try{
      Statement st = cn.createStatement();
      st.executeUpdate(sql);
      ResultSet rs=st.executeQuery(id);
      rs.next();
			String name =rs.getString(1);
       String seq = "CREATE SEQUENCE res_id_seq_"+name+" increment by 1minvalue 0start with 1";
       st.executeUpdate(seq);


      cn.commit();

      st.close();

      cn.close();
    }catch(SQLException e){
      e.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

  public void writeRes(String ThreadId, String ResContent){
   String sql="null";
       int si=0;
  while(true){
    String ko=String.valueOf(si);

if(ThreadId.equals(ko)){
     sql = "INSERT INTO Res(thread_id, res_id, res_content) VALUES('"+ThreadId+"', res_id_seq_"+ThreadId+".nextval, '" + ResContent + "')";
     break;
   }
   si++;
   }
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
}
