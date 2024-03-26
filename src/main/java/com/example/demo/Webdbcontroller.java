/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Anusha
 */
@Controller
public class Webdbcontroller {
    @Autowired
    Custrepo crepo;
    
    @RequestMapping("/samplewebpage")
    public String sampleWP(){
    
        //System.out.println("HelloWorld");
        return "sample";
    }
    
    @PostMapping("/savedetails")
    public String saveDetails(Custlist clist){
    
        crepo.save(clist);
        return "sample";
    }
    
    @RequestMapping("/showdetails")
    public String showDetails(){
    
        return "details";
    }
    @PostMapping("/showdetails")
    public ModelAndView showDetails(@RequestParam int custid){
    
        ModelAndView mv= new ModelAndView("retrieve");
        Custlist clist=crepo.findById(custid).orElse(null);
        mv.addObject("clist",clist);
        return mv;
      
    }
   
   /* @PostMapping("/details")
    public String vDetails(@RequestParam("custid") int custid,
            @RequestParam("custname") String custname,
            @RequestParam("custemail") String custemail,
            ModelMap modelMap){
        modelMap.put("custid", custid);
        modelMap.put("custname", custname);
        modelMap.put("custemail", custemail);
        return "details";
    }*/
    
       
}
    
