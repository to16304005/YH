package pac;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class Executer{
  public void addThreads(String tb){
    DBAccessor dba = new DBAccessor();
    dba.createConnection();
    dba.writeThreads(tb);
  }

  public void addRes(String ThreadId, String ResContent, String userName){
    DBAccessor dba = new DBAccessor();
    dba.createConnection();
    dba.writeRes(ThreadId, ResContent, userName);
  }

  public ArrayList<ThreadBean> getThreads(){
    DBAccessor DBA=new DBAccessor();

    DBA.createConnection();


    return DBA.readThreads();
  }

  public ArrayList<ResBean> getRes(String threadid){

    DBAccessor DBA=new DBAccessor();

    DBA.createConnection();
    return DBA.readRes(threadid);
  }

  public String getTname(String threadId){
    DBAccessor DBA = new DBAccessor();
    DBA.createConnection();

    return DBA.getTName(threadId);
  }

  public String createAccount(String id, String pass){
    DBAccessor DBA = new DBAccessor();
    DBA.createConnection();

    return DBA.addUser(id, pass);
  }

  public ArrayList getUserList(){
    DBAccessor DBA = new DBAccessor();
    DBA.createConnection();
    return DBA.userListRe();
  }
}
