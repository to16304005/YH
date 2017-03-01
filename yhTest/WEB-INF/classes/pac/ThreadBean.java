package pac;

import java.util.ArrayList;
import java.util.List;


public class ThreadBean{

  private String threadId;
  private String threadName;
  private String threadCreatedDate;
  private ArrayList<ResBean> ResBeanList = new ArrayList<ResBean>();

	//ResBean RB=new ResBean();

  public String getThreadId(){
    return this.threadId;
  }
  public String getThreadName(){
    return this.threadName;
  }
  public String getThreadCreatedDate(){
    return this.threadCreatedDate;
  }
  public ArrayList<ResBean> getResBeanList(){
    return this.ResBeanList;
  }

  public void setThreadId(String threadId){
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
