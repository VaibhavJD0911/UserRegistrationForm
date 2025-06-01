package com.example.user.UserRegistrationForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repository;

    public String register(Registration reg) {
        if (reg.getDob() == null || 
            reg.getName() == null || reg.getName().isEmpty() ||
            reg.getCity() == null || reg.getCity().isEmpty() ||
            reg.getMobile() == null || reg.getMobile().isEmpty() ||
            reg.getId() == null || reg.getId().isEmpty()) {
            return "All fields are required.";
        }

        if (!reg.getMobile().matches("\\d+")) {
            return "Mobile number must be numeric.";
        }

        repository.save(reg);
        return "success";
    }
}
