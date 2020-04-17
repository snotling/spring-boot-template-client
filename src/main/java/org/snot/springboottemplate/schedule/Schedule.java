package org.snot.springboottemplate.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Schedule {

    @Scheduled(fixedDelay = 36000)
    public void process() {
        log.info("Process ...");
    }


}
