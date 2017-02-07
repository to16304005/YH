package pac;

import java.util.ArrayList;

public class ThreadBean{

  private int threadId;
  private String threadName;
  private String threadCreatedDate;
  private ArrayList ResBeanList;

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
    return this.resBean;
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
	public void setResBeanList(ResBean){
		this.ResBeanList=ResBeanList;
	}
}
