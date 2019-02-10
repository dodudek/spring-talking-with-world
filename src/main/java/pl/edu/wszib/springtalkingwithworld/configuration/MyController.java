package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.activation.MimeType;

@Controller
@RequestMapping("/moj")
public class MyController {

    //zamiast Request Mapping  metod można dąć GetMapping, nie zmieni się nic funkcjonalnie
    //localhost/moj
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public ResponseEntity get (){

        ResponseEntity responseEntity = new ResponseEntity("Hello World", HttpStatus.OK);
        return responseEntity ;
    }

    //localhost/moj/json
//    @RequestMapping(value = "/json", method = RequestMethod.GET, produces = "application/json")
    @GetMapping(value = "/json", produces = "application/json")
    public ResponseEntity getJson (){

        String json = "{\n" +
                "\n" +
                "            \"imie\": \"Adam\",\n" +
                "                    \"szkola\":{\n" +
                "                \"nazwa\": \"SP11\",\n" +
                "                        \"adres\": \"Smiechowo 22\"\n" +
                "            },\n" +
                "\n" +
                "            \"oceny\": [5,5,2]\n" +
                "        }";

        ResponseEntity responseEntity = new ResponseEntity(json, HttpStatus.OK);
        return responseEntity ;
    }
}
