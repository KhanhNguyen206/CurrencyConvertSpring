package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @RequestMapping(value = "/result", method= RequestMethod.POST)
    public String exchange(@RequestParam int usd, Model model) {
        model.addAttribute("usd", usd);
        return "results";
    }
}
