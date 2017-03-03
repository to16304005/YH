package pac;

public class ResBean{

  private String resId;
  private String resContents;
  private String resDate;
  private String resName;

  public String getResId(){
    return this.resId;
  }
  public String getResDate(){
    return this.resDate;
  }
  public String getResContents(){
    return this.resContents;
  }
  public String getResName(){
    return this.resName;
  }

  public void setResId(String resId){
    this.resId = resId;
  }
  public void setResDate(String resDate){
    this.resDate = resDate;
  }
  public void setResContents(String resContents){
    this.resContents = resContents;
  }
  public void setResName(String resName){
    this.resName = resName;
  }
}
