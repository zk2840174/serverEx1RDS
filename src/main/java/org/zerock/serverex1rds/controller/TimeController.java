package org.zerock.serverex1rds.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.serverex1rds.service.TimeService;

import java.util.Map;

@RestController
@RequestMapping("/api/time")
@RequiredArgsConstructor
@Log4j2
public class TimeController {

    private final TimeService timeService;

    @GetMapping("")
    public ResponseEntity<Map<String,String>> healthCheck() {

        return ResponseEntity.ok().body(Map.of("time", timeService.getTime()));

    }


}
