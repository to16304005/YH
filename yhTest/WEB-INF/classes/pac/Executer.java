package pac;

import java.util.ArrayList;
import java.util.List;


public class Executer{
  public void addThreads(String tb){
    DBAccessor dba = new DBAccessor();
    dba.createConnection();
    dba.writeThreads(tb);
  }

  public void addRes(String ThreadId, String ResContent){
    DBAccessor dba = new DBAccessor();
    dba.createConnection();
    dba.writeRes(ThreadId, ResContent);
  }

  public ArrayList<ThreadBean> getThreads(){
    DBAccessor DBA=new DBAccessor();
    //?申f?申[?申^?申x?申[?申X?申����鐃�
    DBA.createConnection();

    //DBAccessor?申?申?申?申?申X?申?申?申b?申g?申?申?申���
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
}
