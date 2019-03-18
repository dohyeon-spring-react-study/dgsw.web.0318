package kr.hs.dgsw.web_01_318;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name){
        return "Hello "+name+"{SERVICE}";
    }

    @Override
    public int sayValue(int num1, String combo, String num2){
        int val2 = Integer.parseInt(num2);
        int how = Integer.parseInt(combo);
        switch(how){
            case 1:
                return num1+val2;
            case 2:
                return num1-val2;
            case 3:
                return num1*val2;
            case 4:
                return num1/val2;
        }
        return 0;
    }

    @Override
    public double sayValue(double num1, String combo, String num2){
        double val2 = Double.parseDouble(num2);
        int how = Integer.parseInt(combo);
        switch(how){
            case 1:
                return num1+val2;
            case 2:
                return num1-val2;
            case 3:
                return num1*val2;
            case 4:
                return num1/val2;
        }
        return 0;
    }
}
