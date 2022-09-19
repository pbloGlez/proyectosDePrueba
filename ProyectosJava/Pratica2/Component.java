package Pratica2;

public abstract class Component {
    
    protected int pin;
    protected eGPIO pinMode; //eGPIO --> General Purpose Input/Output
    protected ePinState pinState; 

    public Component(int pin, eGPIO pinMode){
        this.pin = pin;
        this.pinMode = pinMode;
    
    }
    public abstract String doTask();
}
