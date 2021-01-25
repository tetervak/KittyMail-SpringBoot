package ca.tetervak.kittymail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class KittyMailController {

    private final Logger logger = LoggerFactory.getLogger(KittyMailController.class);

    private static final String[] MESSAGES = {"Purr", "Mew", "Hiss"};

    @GetMapping(value={"/", "/Input"})
    public String input(){
        logger.trace("input() is called");
        return "Input";
    }

    /*@GetMapping("/Process")
    public String process(@ModelAttribute Envelope envelope, Model model){
        logger.trace("process() is called");
        logger.debug("envelope = " + envelope);
        model.addAttribute("messages", messages);
        return "Output";
    }*/
}
