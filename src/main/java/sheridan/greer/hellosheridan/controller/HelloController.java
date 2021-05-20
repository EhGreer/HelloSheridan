package sheridan.greer.hellosheridan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/Hello")
    public String hello(@RequestParam(defaultValue = "Sheridan") String name, Model model) {
        model.addAttribute("name", name);
        return "Hello";
    }

    @GetMapping("/Hello/{name}")
    public String hello2(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "Hello";
    }

}
