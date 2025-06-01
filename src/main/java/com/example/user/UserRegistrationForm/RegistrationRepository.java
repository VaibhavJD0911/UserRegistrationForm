package com.example.user.UserRegistrationForm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RegistrationRepository extends JpaRepository<Registration, String> {

	

}
