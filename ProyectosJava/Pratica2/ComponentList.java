package Pratica2;

public enum ComponentList {
    LED,IR,BUZZER;

    public static String[] getItems(){
        ComponentList[] Components = ComponentList.values();
        String [] stock = new String[Components.length];

        for(int i=0; i<Components.length;i++ ){
            stock[i] = (String) Components[i].toString();
        }

        return stock;
    }
}
