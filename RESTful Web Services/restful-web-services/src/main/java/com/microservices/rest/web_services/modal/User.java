package com.microservices.rest.web_services.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User_Details")
public class User {

    @Id
    @GeneratedValue
    private int id;

    @Size(min = 2, message = "Name Should Have at Least 2 Characters")
    @JsonProperty("user_name")
    private String name;

    @Past(message = "Birth Date should be in past")
    @JsonProperty("birth_date")
    private LocalDate birthDate;

}
