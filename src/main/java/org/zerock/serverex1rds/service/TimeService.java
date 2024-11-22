package org.zerock.serverex1rds.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.serverex1rds.repository.TimeRepository;

@Service
@Transactional
@RequiredArgsConstructor
@Log4j2
public class TimeService {

    private final TimeRepository timeRepository;


    public String getTime() {

        return timeRepository.getCurrentTime();
    }
}
