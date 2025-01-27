package in.ashokit.entitis;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	

private Integer passportId;
	
private String passportNum;
	
private LocalDate issuedDate;
	
private LocalDate expDate;
@OneToOne
@JoinColumn(name = "person_id") /*Join column used to reefer foreign key */
                        //Which passport belongs to which person 
private Person person; // To representing a relationship we write person entity in passport entity

public Integer getPassportId() {
	return passportId;
}
public void setPassportId(Integer passportId) {
	this.passportId = passportId;
}
public String getPassportNum() {
	return passportNum;
}
public void setPassportNum(String passportNum) {
	this.passportNum = passportNum;
}
public LocalDate getIssuedDate() {
	return issuedDate;
}
public void setIssuedDate(LocalDate issuedDate) {
	this.issuedDate = issuedDate;
}
public LocalDate getExpDate() {
	return expDate;
}
public void setExpDate(LocalDate expDate) {
	this.expDate = expDate;
}
public Person getPerson() {
	return person;
}
public void setPerson(Person person) {
	this.person = person;
}


}
