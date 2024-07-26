package com.foodDiary.foodDiary;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoodController {
    
    @GetMapping("/")
    public String food(@RequestParam(name="foods", required=false, defaultValue="fud") String foods, Model model) {
        model.addAttribute("foods", foods);
        return "food";
    }
}
