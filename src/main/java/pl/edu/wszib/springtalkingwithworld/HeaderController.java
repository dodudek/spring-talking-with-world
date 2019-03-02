package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@Controller
//@RestController
@RequestMapping("/koteczki")
public class HeaderController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static class MyFirstException extends RuntimeException{}
    @ResponseStatus(HttpStatus.OK)
    public  static class MySecondException extends RuntimeException{}
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class MyThirdException extends RuntimeException{}

//    @GetMapping
//    @ResponseBody
//    public String test (@RequestHeader String testHeader){
//        return testHeader.toUpperCase();
//    }


//    @GetMapping
//    public String test (){
//        return  "kot";
//    }


    @GetMapping
    public static String test (){
        int rzut = new Random().nextInt(3);

        if(rzut == 0) throw new MyFirstException();
        else if (rzut==1) throw new MySecondException();
        else throw new MyThirdException();
    }



}


