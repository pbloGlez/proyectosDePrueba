package Pratica2;

public class LED extends Component{
    LED(int led){
        super(led, eGPIO.OUTPUT);
    } 
public void start(){}
public void stop(){}
public String doTask(){
    return "hi";
}
}
