package xmlindogshowentry;



import java.util.Arrays;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement specifies the root element for the xml document.

@XmlRootElement  
public class DogShowEntryModel{
	
	String dogName;
	String breed;
	String ownerName;
	String phone;
	String[] categories;
	
	public DogShowEntryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DogShowEntryModel(String dogName, String breed, String ownerName, String phone, String[] categories) {
		super();
		this.dogName = dogName;
		this.breed = breed;
		this.ownerName = ownerName;
		this.phone = phone;
		this.categories = categories;
	}

	
	//@XmlAttribute specifies the attribute for the root element.


	@XmlAttribute  
	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	//@XmlElement specifies the sub element for the root element.


	@XmlElement  
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	//@XmlElement specifies the sub element for the root element.


	@XmlElement  
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	//@XmlElement specifies the sub element for the root element.


	@XmlElement  

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//@XmlElement specifies the sub element for the root element.


	@XmlElement  
	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}

	@Override
	public String toString() {
		return "DogShowEntryModel [dogName=" + dogName + ", breed=" + breed + ", ownerName=" + ownerName + ", phone="
				+ phone + ", categories=" + Arrays.toString(categories) + "]";
	}
	
	
	

}
