package kr.hs.dgsw.web_01_318;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetController {

    @Autowired
    private GreetingService gs;

    //REQUEST : hostname:port/greeting?name=DGSW
    //RESPONSE : hello DGSW
    @GetMapping("/greeting")
    public String SayHi(@RequestParam String name){
        return "Hello "+name;
    }

    //REQUEST : http://hostname:port/greeting/DGSW
    //RESPONSE : hello DGSW
    @GetMapping("/greeting/{num1}/{combo}/{num2}")
    public String SayHi1(@PathVariable String num1, @PathVariable  String combo, @PathVariable String num2){
        try {
            int d = Integer.parseInt(num1);
            return "The Answer is " + gs.sayValue(d, combo, num2);
        } catch (Exception e) {
            double val = Double.parseDouble(num1);
            return "The Answer is " + gs.sayValue(val, combo, num2);
        }
    }
}
