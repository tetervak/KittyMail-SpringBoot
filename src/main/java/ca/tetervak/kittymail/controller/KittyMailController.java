package ca.tetervak.kittymail.controller;

import ca.tetervak.kittymail.domain.Envelope;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class KittyMailController {

    private final Logger logger = LoggerFactory.getLogger(KittyMailController.class);

    @GetMapping(value={"/", "/input"})
    public ModelAndView input(){
        logger.trace("input() is called");
        return new ModelAndView("Input", "envelope", new Envelope());
    }

    @GetMapping("/process")
    public ModelAndView process(
            @Validated @ModelAttribute Envelope envelope,
            BindingResult bindingResult){
        logger.trace("process() is called");
        logger.debug("envelope = " + envelope);
        if(bindingResult.hasErrors()){
            return new ModelAndView("Input");
        }
        return new ModelAndView("Output", "envelope", envelope);
    }
}
