package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entitis.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
