package com.foodDiary.foodDiary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
    
    @GetMapping("/")
    public String food() {
        return "food";
    }
}
