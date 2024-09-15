 package in.ashokit.service;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entitis.Passport;
import in.ashokit.entitis.Person;
import in.ashokit.repo.PersonRepo;

@Service
public class PersonService {
    @Autowired
	private PersonRepo personRepo;
	/*
    @Autowired
	private PassportRepo passportRepo;
	*/
	public void saveData() {
		Person person = new Person();
		person.setPersonName("Ram");
		person.setPersonGender("Male");
		
		Passport passport = new Passport();
		passport.setPassportNum("D5SFVDS65");
		passport.setIssuedDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		
		person.setPassport(passport);
		passport.setPerson(person);
		
		// we are calling save method only one time because Person record having passport reference
		personRepo.save(person);
		
	}
	public void deleteData() {
		personRepo.deleteById(1);
	}
}
