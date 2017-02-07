
import java.util.ArrayList;
import java.util.List;

public class ThreadBean{

  private int threadId;
  private String threadName;
  private String threadCreatedDate;
  private ArrayList <ResBean>ResBeanList;
	
	ResBean RB=new ResBean();

  public int getThreadId(){
    return this.threadId;
  }
  public String getThreadName(){
    return this.threadName;
  }
  public String getThreadCreatedDate(){
    return this.threadCreatedDate;
  }
  public ArrayList getResBean(){
    return this.ResBeanList;
  }

  public void setThreadId(int threadId){
    this.threadId = threadId;
  }
  public void setThreadName(String threadName){
    this.threadName = threadName;
  }
  public void setThreadCreatedDate(String threadCreatedDate){
    this.threadCreatedDate = threadCreatedDate;
  }
	public void setResBeanList(ResBean rb){
		ResBeanList.add(rb);
	}
}
