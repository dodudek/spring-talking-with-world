package pl.edu.wszib.springtalkingwithworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/new")
public class NewController {

    @GetMapping
    public  String test(){
        throw new HeaderController.MyFirstException();
    }
}
