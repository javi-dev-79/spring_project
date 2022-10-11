package com.aruteros.spring_project.controller;


import com.aruteros.spring_project.persistence.entity.Greating;
import com.aruteros.spring_project.persistence.entity.SplitRequestBody;
import com.aruteros.spring_project.persistence.entity.SplitResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
@RequestMapping("/greating")
public class GreatingController {


    @GetMapping("/hello")
    public Greating greating(){
        return new Greating("world");
    }

    @PostMapping("/split")
    public SplitResponseBody greatingByLetters(@RequestBody SplitRequestBody splitRequestBody) {
        return new SplitResponseBody(Arrays.asList(splitRequestBody.getWord().split("")));
    }

}
