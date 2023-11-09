package com.example.crud.controller;

import com.example.crud.dtos.TimesRecordDto;
import com.example.crud.models.TimeModels;
import com.example.crud.repository.RepositoryTimes;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ControllerTimes {
    @Autowired
    RepositoryTimes repositoryTimes;
    @CrossOrigin("*")
    @GetMapping("/times")
    public ResponseEntity<List<TimeModels>> getAllTimes(){
        return ResponseEntity.status(HttpStatus.OK).body(repositoryTimes.findAll());
    }
    @CrossOrigin("*")
    @PostMapping("/cadastro")
    public ResponseEntity<TimeModels> saveTimes(@RequestBody @Valid TimesRecordDto timesRecordDto){
        var timesModel = new TimeModels();
        BeanUtils.copyProperties(timesRecordDto, timesModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(repositoryTimes.save(timesModel));
    }
}
