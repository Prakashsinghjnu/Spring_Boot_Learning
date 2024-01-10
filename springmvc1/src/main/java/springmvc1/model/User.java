package springmvc1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.EnableMBeanExport;

@EnableMBeanExport
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
  private String exampleInputName;
  private String exampleInputEmail1;
  private String exampleCheck1;
  public String getExampleCheck1() {
	return exampleCheck1;
}
public void setExampleCheck1(String exampleCheck1) {
	this.exampleCheck1 = exampleCheck1;
}
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
	return "User [Id=" + Id + ", exampleInputName=" + exampleInputName + ", exampleInputEmail1=" + exampleInputEmail1
			+ ", exampleCheck1=" + exampleCheck1 + ", exampleInputPassword1=" + exampleInputPassword1 + "]";
}
  
  
}
