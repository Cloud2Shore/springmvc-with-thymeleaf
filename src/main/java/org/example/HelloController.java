package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    //    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name, Model model) {
        model.addAttribute("user", name);
        return "helloPage";
    }
}
