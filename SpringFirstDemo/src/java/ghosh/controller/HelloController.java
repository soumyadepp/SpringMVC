/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ghosh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author ghosh
 */

@Controller
public class HelloController {
    @RequestMapping("/welcome.php")
    public ModelAndView printHello(){
        ModelAndView mv = new ModelAndView("Hello");
        mv.addObject("name","Soumyadeep");
        return mv;
    }
}
