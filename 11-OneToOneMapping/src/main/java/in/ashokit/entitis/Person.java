package in.ashokit.entitis;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer personId;

	private String personName;

	private String personGender;
	         //mappedBy means what relation we are having
	         // mapped means what variable we used in the child table
	@OneToOne(mappedBy = "person" , cascade = CascadeType.ALL)//# Mapped by represent the reference passport is refrying to person #only use jakarta case cade
	private Passport passport;
	

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonGender() {
		return personGender;
	}

	public void setPersonGender(String personGender) {
		this.personGender = personGender;
	}
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}


}
