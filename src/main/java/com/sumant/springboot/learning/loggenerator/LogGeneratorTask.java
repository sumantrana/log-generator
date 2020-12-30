package com.sumant.springboot.learning.loggenerator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LogGeneratorTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(LogGeneratorTask.class);

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate=2000)
    public void generateLog(){
        LOGGER.info("Test log generated from the Log Generator Application at {}", dateFormat.format(new Date()));
    }

}
