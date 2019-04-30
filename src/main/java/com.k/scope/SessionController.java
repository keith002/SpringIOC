package com.k.scope;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {

    @RequestMapping("session")
    @ResponseBody
    public String test(){
        return this.toString();
    }
}
