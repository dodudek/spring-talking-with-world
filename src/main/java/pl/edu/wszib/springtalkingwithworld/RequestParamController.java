package pl.edu.wszib.springtalkingwithworld;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
@RequestMapping("/parameterTest")

public class RequestParamController {

//    public ResponseEntity get (@RequestParam("pierwszy") int liczba1,
//                               @RequestParam("druga") int liczba2,
//                                @RequestParam(value = "trzecia", required = false) Integer trzecia){
//        return ResponseEntity.of(liczba1 + liczba2);
//    }

    @GetMapping
    public ResponseEntity get (@RequestParam("liczby") int [] liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).count());

    }

    @GetMapping("/suma")
    public ResponseEntity suma (@RequestParam("liczby") int [] liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).sum());

    }

    @GetMapping("/srednia")
    public ResponseEntity average (@RequestParam("liczby") int [] liczby){
        return ResponseEntity.ok(Arrays.stream(liczby).average());

    }

    @GetMapping("/mnozenie")
    public ResponseEntity multiple(@RequestParam("liczby") int [] liczby){
        int a =1;
        for (int i = 0; i<liczby.length; i++){
            a= a* liczby[i];

        }
        return ResponseEntity.ok(a);

    }

    @GetMapping ("/sub")
    public ResponseEntity sub (@RequestParam("liczby") int [] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).reduce((x, y) -> x * y));
    }

    @GetMapping ("/dzielenie")
    public ResponseEntity dzie (@RequestParam("liczby") int [] liczby) {
        return ResponseEntity.ok(Arrays.stream(liczby).filter(i-> i !=0 ).reduce((x, y) -> x /y));
    }

//    @GetMapping("/roznica")
//    public ResponseEntity subtraction(@RequestParam("liczby") int [] liczby){
//        int a =liczby[0];
//        for (int i = 1; i<liczby.length; i++){
//            a = a - liczby[i];
//        }
//        return ResponseEntity.ok(a);
//
//    }

//    @GetMapping("/dzielenie")
//    public ResponseEntity dzielenie(@RequestParam("liczby") int [] liczby){
//        int a =liczby[0];
//        for (int i = 1; i<liczby.length; i++){
//            a = liczby[i]/a;
//        }
//        return ResponseEntity.ok(a);
//
//    }


}
