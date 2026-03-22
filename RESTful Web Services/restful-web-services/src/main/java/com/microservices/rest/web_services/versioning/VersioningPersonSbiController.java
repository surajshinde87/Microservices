//package com.microservices.rest.web_services.versioning;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class VersioningPersonSbiController {
//    // URI Versioning
////    @GetMapping(value = "/{version}/personsbi", version = "1.0.0")
////    public PersonV1 getFirstVersionOfPerson(){
////        return new PersonV1("Suraj");
////    }
////
////    @GetMapping(value = "/v2/personsbi", version = "2.0.0")
////    public PersonV2 getSecondVersionOfPerson(){
////        return new PersonV2(new Name("Suraj", "Shinde"));
////    }
//
//    // Request Parameter Versioning
//    @GetMapping(path = "/personsbi", version = "1.0.0")
//    public PersonV1 getFirstVersionOfPersonRequestParam(){
//        return new PersonV1("Suraj");
//    }
//
//    @GetMapping(path = "/personsbi", version = "2.0.0")
//    public PersonV2 getSecondVersionOfPersonRequestParam(){
//        return new PersonV2(new Name("Suraj", "Shinde"));
//    }
//
//    // Request Header Versioning
//    @GetMapping(path = "/personsbi/header", headers = "X-API-VERSION=1")
//    public PersonV1 getFirstVersionOfPersonRequestHeader(){
//        return new PersonV1("Suraj");
//    }
//
//    @GetMapping(path = "/personsbi/header", headers = "X-API-VERSION=2")
//    public PersonV2 getSecondVersionOfPersonRequestHeader(){
//        return new PersonV2(new Name("Suraj", "Shinde"));
//    }
//
//    // Media Type Versioning
//    @GetMapping(path = "/personsbi/accept", produces = "application/vnd.company.app-v1+json")
//    public PersonV1 getFirstVersionOfPersonAcceptHeader(){
//        return new PersonV1("Suraj");
//    }
//
//    @GetMapping(path = "/personsbi/accept", produces = "application/vnd.company.app-v2+json")
//    public PersonV2 getSecondVersionOfPersonAcceptHeader(){
//        return new PersonV2(new Name("Suraj", "Shinde"));
//    }
//}
