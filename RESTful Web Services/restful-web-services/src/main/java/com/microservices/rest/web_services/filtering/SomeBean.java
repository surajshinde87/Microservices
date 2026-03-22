package com.microservices.rest.web_services.filtering;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SomeBean {

    @JsonView(View.View1.class) // dynamic filtering
    private String field1;

//   @JsonIgnore         // static filtering
    @JsonView(View.View2.class)
    private String field2;

    @JsonView({View.View1.class, View.View2.class})
    private String field3;

}
