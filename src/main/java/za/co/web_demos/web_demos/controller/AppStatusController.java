package za.co.web_demos.web_demos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppStatusController {

    /***
     *
     * @return - returns a hello world string
     */
    @GetMapping(path="/ping")
    public String getStatus(){
        return "hello world";
    }
}
