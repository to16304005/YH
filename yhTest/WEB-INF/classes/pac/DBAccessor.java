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
			Class.forName("oracle.jdbc.driver.OracleDriver");

			cn=
			   DriverManager.getConnection
	 	 	 ("jdbc:oracle:thin:@localhost:1521:orcl",	"info","pro");
			System.out.println("ê⁄ë±äÆóπ");

		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
      e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

  public Connection getConnection(){
    if(this.cn == null){
      createConnection();
    }
    return this.cn;
  }


  public ArrayList<ThreadBean> readThreads(){  	//sql?øΩ?øΩ?„ÇíÔøΩ??øΩ?øΩ?øΩ?
    String sql = "select thread_name, thread_created_date, thread_id from thread order by thread_created_date desc";

    ArrayList<ThreadBean> threadList= new ArrayList<ThreadBean>();
  	try{
      Connection con = getConnection();
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    while(rs.next()){

	      ThreadBean tb = new ThreadBean();

	      tb.setThreadName(rs.getString(1));
        tb.setThreadCreatedDate(rs.getString(2));
        tb.setThreadId(rs.getString(3));

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

	    String sql = "SELECT res_id,res_content, res_date FROM res WHERE thread_Id =" + threadid + "order by res_date desc";
	  	ThreadBean tb = new ThreadBean();
		//ArrayList<ResBean> resList= new ArrayList<ResBean>();

  	try{
      Connection con = getConnection();
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);

	    while(rs.next()){
	    	ResBean rb = new ResBean();
	    	rb.setResId(rs.getString(1));
	    	rb.setResContents(rs.getString(2));
	    	rb.setResDate(rs.getString(3));
	    	tb.setResBeanList(rb);

        System.out.println(rs.getString(2));
	    }

  	}catch(SQLException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
  	return tb.getResBeanList();
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
       String seq = "CREATE SEQUENCE res_id_seq_" + name + " increment by 1minvalue 0start with 1";
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

  public String getTName(String threadId){

    String sql = "SELECT thread_name FROM Thread WHERE thread_Id =" + threadId ;
    String tname = "";
    try{
      Connection con = getConnection();
      Statement st = con.createStatement();
      ResultSet rs = st.executeQuery(sql);
      rs.next();
      tname = rs.getString(1);
    }catch(SQLException e){
      e.printStackTrace();
    }catch(Exception e){
      e.printStackTrace();
    }
    return tname;
  }
}
