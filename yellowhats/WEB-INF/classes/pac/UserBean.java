package pac;

public class UserBean{

  private String userId;
  private String userName;
  private String userPass;

  public String getUserId(){
    return this.userId;
  }
  public String getUserName(){
    return this.userName;
  }
  public String getUserPass(){
    return this.userPass;
  }

  public void setUserId(String userId){
    this.userId = userId;
  }
  public void setUserName(String userName){
    this.userName = userName;
  }
  public void setUserPass(String userPass){
    this.userPass = userPass;
  }
}
