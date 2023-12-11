package com.example.kafkaconsumer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String VehicleNumber;
    private String Violation;
    private String location;
}
