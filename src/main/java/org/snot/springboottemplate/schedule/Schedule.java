package org.snot.springboottemplate.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Schedule {

    private final static int DELAY = 1000 * 60 * 5;

    @Scheduled(fixedDelay = DELAY)
    public void process() {
        log.info("Process ...");
    }


}
