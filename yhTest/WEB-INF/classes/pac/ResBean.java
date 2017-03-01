package pac;

public class ResBean{

  private String resId;
  private String resContents;
  private String resDate;

  public String getResId(){
    return this.resId;
  }
  public String getResDate(){
    return this.resDate;
  }
  public String getResContents(){
    return this.resContents;
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
}
