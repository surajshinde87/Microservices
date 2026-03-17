package com.microservices.rest.web_services.versioning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Name {
    private String firstName;
    private String lastName;
}
