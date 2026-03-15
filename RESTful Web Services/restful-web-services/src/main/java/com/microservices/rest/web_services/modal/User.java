package com.microservices.rest.web_services.modal;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;

    @Size(min = 2, message = "Name Should Have at Least 2 Characters")
    private String name;

    @Past(message = "Birth Date should be in past")
    private LocalDate birthDate;

}
