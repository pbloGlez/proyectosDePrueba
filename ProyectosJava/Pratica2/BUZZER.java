package Pratica2;

public class BUZZER extends Component{
    BUZZER(int pin){
        super(pin,eGPIO.OUTPUT);
    }

public void start(){}
public void stop(){}
public String doTask(){
    return "hi";
}
}
