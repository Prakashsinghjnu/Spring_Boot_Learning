package springmvc1.controller;


public class User {
  private String exampleInputName;
  private String exampleInputEmail1;
  public String getExampleInputName() {
	return exampleInputName;
}
public void setExampleInputName(String exampleInputName) {
	this.exampleInputName = exampleInputName;
}
public String getExampleInputEmail1() {
	return exampleInputEmail1;
}
public void setExampleInputEmail1(String exampleInputEmail1) {
	this.exampleInputEmail1 = exampleInputEmail1;
}
public String getExampleInputPassword1() {
	return exampleInputPassword1;
}
public void setExampleInputPassword1(String exampleInputPassword1) {
	this.exampleInputPassword1 = exampleInputPassword1;
}
private String exampleInputPassword1;
@Override
public String toString() {
	return "User [exampleInputName=" + exampleInputName + ", exampleInputEmail1=" + exampleInputEmail1
			+ ", exampleInputPassword1=" + exampleInputPassword1 + "]";
}
  
  
}
