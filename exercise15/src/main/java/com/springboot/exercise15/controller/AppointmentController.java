package com.springboot.exercise15.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class AppointmentController {

   @RequestMapping("/appointment")
   public String displayAppForm(){
      return "appform";
   }

   @RequestMapping("/form")
   public String processData(HttpServletRequest request, Model model) throws ParseException {
      String firstName = request.getParameter("firstName");
      String lastName = request.getParameter("lastName");
      String email = request.getParameter("email");
      String appDate = request.getParameter("appDate");


    return "processData";

   }







}
