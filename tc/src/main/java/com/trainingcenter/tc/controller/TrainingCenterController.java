package com.trainingcenter.tc.controller;


import com.trainingcenter.tc.models.TrainingCenter;
import com.trainingcenter.tc.service.TrainingCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TrainingCenterController {
    @Autowired
    private TrainingCenterService service;

    @PostMapping("/training-centers")
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        TrainingCenter savedCenter = service.createTrainingCenter(trainingCenter);
        return new ResponseEntity<>(savedCenter, HttpStatus.CREATED);
    }

    @GetMapping("/training-centers")
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        List<TrainingCenter> centers = service.getAllTrainingCenters();
        return new ResponseEntity<>(centers, HttpStatus.OK);
    }
}

