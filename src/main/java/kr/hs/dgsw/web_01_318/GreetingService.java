package kr.hs.dgsw.web_01_318;

import org.springframework.stereotype.Service;

public interface GreetingService {
    String sayHi(String name);

    int sayValue(int num1, String combo, String num2);
    double sayValue(double num1, String combo, String num2);
}
