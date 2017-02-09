package pac;

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
}
