package com.sppjava.laba1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {


    @GetMapping("/")
    public ModelAndView index() {
        Map<String, String> templateVar = new HashMap<>();
        templateVar.put("status", "App rinning");
        //logger.debug("open main page");
        return new ModelAndView("index", templateVar);
    }

    @RequestMapping(value = {"/action"}, method = RequestMethod.GET)
    public ModelAndView action(@RequestParam Map<String,String> allRequestParams) {
        Map<String, String> templateVar = new HashMap<>();
        templateVar.put("status", allRequestParams.get("submit"));
        //logger.debug("button %s pressed", allRequestParams.get("submit"));
        return new ModelAndView("index", templateVar);
    }



}