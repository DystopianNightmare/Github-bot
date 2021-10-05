package com.boisestate.Github.bot;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class BotScheduler {

    private static final Logger log = LoggerFactory.getLogger(BotScheduler.class);

    //run every 10 seconds
    @Scheduled(fixedDelay = 10000L)
    public void checkForIssues() {

        


        System.out.println("meh");
    }
}
