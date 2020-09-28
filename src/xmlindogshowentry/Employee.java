package xmlindogshowentry;


import java.beans.PropertyChangeListener;

import java.beans.PropertyChangeSupport;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

//@XmlRootElement specifies the root element for the xml document.
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement  

public class Employee {

 int flag = 1;
private String empId;
private String empName;
private String empAge;
private String empSalary;
String gender;

private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(
           this);

public Employee() {
super();
// TODO Auto-generated constructor stub
}
   
   public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
       propertyChangeSupport.addPropertyChangeListener(propertyName, listener);
   }

   public void removePropertyChangeListener(PropertyChangeListener listener) {
       propertyChangeSupport.removePropertyChangeListener(listener);
   }




public Employee(String empId, String empName, String empAge, String empSalary , String gender) {
super();
this.empId = empId;
this.empName = empName;
this.empAge = empAge;
this.empSalary = empSalary;
this.gender = gender;
}
//@XmlAttribute specifies the attribute for the root element.


@XmlAttribute  
public String getEmpId() {
return empId;
}

public void setEmpId(String eId) {
propertyChangeSupport.firePropertyChange("empId", this.empId,this.empId = eId);
//this.empId = empId;
}
//@XmlElement specifies the sub element for the root element.


@XmlElement  
public String getEmpName() {
return empName;
}

public void setEmpName(String empName) {
propertyChangeSupport.firePropertyChange("empName", this.empName,this.empName = empName);

//this.empName = empName;
}
//@XmlElement specifies the sub element for the root element.


@XmlElement  
public String getEmpAge() {
return empAge;
}

public void setEmpAge(String empAge) {
propertyChangeSupport.firePropertyChange("EmpAge", this.empAge,this.empAge = empAge);

//this.empAge = empAge;
}
//@XmlElement specifies the sub element for the root element.


@XmlElement  
public String getEmpSalary() {
return empSalary;
}

public void setEmpSalary(String salary) {
propertyChangeSupport.firePropertyChange("empSalary", this.empSalary,this.empSalary = salary);

//this.empSalary = empSalary;
}


//@XmlElement specifies the sub element for the root element.


@XmlElement  
public String getGender() {
	return gender;
}

public void setGender(String gender) {
	propertyChangeSupport.firePropertyChange("gender", this.gender,this.gender= gender);

	//this.gender = gender;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
			+ ", gender=" + gender + "]";
}









}