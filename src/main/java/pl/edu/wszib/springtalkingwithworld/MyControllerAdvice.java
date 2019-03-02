package pl.edu.wszib.springtalkingwithworld;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Component
@ControllerAdvice
public class MyControllerAdvice {

    @ExceptionHandler(HeaderController.MyFirstException.class)
    public String exception(){
        return "kot";
    }

    @ExceptionHandler (HeaderController.MySecondException.class)
    public String exception2(){
        return "kot1";
    }

    @ExceptionHandler (HeaderController.MyThirdException.class)
    public String exception3(){
        return "kot2";
    }
}
