package be.vdab.atbean.controllers;

import be.vdab.atbean.services.KwadraatService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
public class ControllerBeansConfiguration {
@Bean
    IndexController index(KwadraatService kwadraatService){
    return new IndexController(kwadraatService);
}
}
