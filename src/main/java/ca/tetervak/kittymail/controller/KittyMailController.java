package ca.tetervak.kittymail.controller;

import ca.tetervak.kittymail.domain.Envelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class KittyMailController {

    private final Logger logger = LoggerFactory.getLogger(KittyMailController.class);

    @GetMapping(value={"/", "/Input"})
    public ModelAndView input(){
        logger.trace("input() is called");
        return new ModelAndView("Input", "envelope", new Envelope());
    }

    @GetMapping("/Process")
    public ModelAndView process(@ModelAttribute Envelope envelope){
        logger.trace("process() is called");
        logger.debug("envelope = " + envelope);
        return new ModelAndView("Output", "envelope", envelope);
    }
}
