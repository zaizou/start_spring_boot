package dz.start.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by MEDJDOUB SEIFEDDINE on 15/03/2017.
 */

@Controller
public class HelloController {


    @RequestMapping("/halo")
    public String hello() {
        return "hello";
    }



}
