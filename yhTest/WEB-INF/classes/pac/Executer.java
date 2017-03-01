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
    //?øΩf?øΩ[?øΩ^?øΩx?øΩ[?øΩX?øΩ…ê⁄ëÔøΩ
    DBA.createConnection();

    //DBAccessor?øΩ?øΩ?øΩ?øΩ?øΩX?øΩ?øΩ?øΩb?øΩg?øΩ?øΩ?øΩÊìæ
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
