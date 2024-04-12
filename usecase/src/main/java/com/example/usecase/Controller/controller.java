package com.example.usecase.Controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.usecase.model.info;



@RestController
public class controller 
{
    @GetMapping("/welcome")
    public List<info> details()
    {
        List<info> li = new ArrayList<info>();
        info a = new info();
        a.setName("Sowjanya K");
        a.setRegno("727722EUCS173");
        a.setCourse("BE-CSE");
        a.setHobbies("playing Chess");
        a.setFavfood("Dosa");
        a.setFunnyExperiance("");
        a.setAim("Improve my skills");
        a.setGoal("To travel and gain knowledge");
        a.setQuote("consistency is the key");
        li.add(a); 
        return li;
    }
}