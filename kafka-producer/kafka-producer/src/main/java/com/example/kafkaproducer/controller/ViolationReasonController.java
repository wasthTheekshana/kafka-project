package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.User;
import com.example.kafkaproducer.service.ViolationReasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ViolationReasonController {

    @Autowired
    private ViolationReasonService violationReasonService;

    @PostMapping("/vehicle-details")
    public ResponseEntity message(@RequestBody User user){
        try {
        violationReasonService.sendMessage(user);
        return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }
}
