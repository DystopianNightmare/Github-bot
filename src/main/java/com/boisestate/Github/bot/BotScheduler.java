package com.boisestate.Github.bot;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import service.RestService;

@Component
public class BotScheduler {

    private static final Logger log = LoggerFactory.getLogger(BotScheduler.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${test.issue.comment}")     //loads value from resources/application.properties file
    String commentUrl;

    //run every 10 seconds
    @Scheduled(fixedDelay = 10000L)
    public void checkForIssues() {

        //make a get request to a sample github repo. Repo must NOT be private
        //Here is a public repo with an issue created https://api.github.com/repos/DystopianNightmare/Github-bot/issues

        //makes a get request for the json string
        String response = restTemplate.getForObject(commentUrl, String.class);



        /**
         * todo next we need to build a class to store the json as an object which we can work on. I have a framework
         * but I dont know if its fully correct since I used an online generator. Check the domain directory for classes
         */


        /** here is some stuff to make the resulting string formatted better. Its not necessary, only used to
         *  make it ewasier for us to read while building this
         */
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response);
        System.out.println(gson.toJson(je));
    }

    //maybe move this to a bean class idk
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
