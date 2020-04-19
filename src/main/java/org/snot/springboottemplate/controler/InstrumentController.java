package org.snot.springboottemplate.controler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class InstrumentController {

    @GetMapping("/api/instrument")
    public boolean getInsterument(@RequestParam("id")String id) throws InterruptedException {
        log.info(id);
        Thread.sleep(5000);
        return true;
    }

}
