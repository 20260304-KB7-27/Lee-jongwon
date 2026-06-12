package org.scoula.frontcontroller.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeController {
    //Service
    public String getIndex(HttpServletRequest request, HttpServletResponse response){
        //service.###()
        //비지니스 로직 목적

        return "index";
    }
}
