package kr.hs.dgsw.web_01_318;

import org.springframework.stereotype.Service;

public interface GreetingService {

    //수업용 메소드
    String sayHi(String name);


    //정수, 실수 계산 메소드 정의
    int sayValue(int num1, String combo, String num2);
    double sayValue(double num1, String combo, String num2);
}
