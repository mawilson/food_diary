package com.foodDiary.foodDiary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodRestController {

    @RequestMapping("/api/")
    public String sayHi() {
        return "Hi";
    }

}
