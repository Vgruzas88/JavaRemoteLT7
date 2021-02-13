package lt.sda.javaFundamentalsCoding.advanced.inheritance.animal_example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public abstract class Animal {

    protected String voice;
    protected boolean mammal;

    public Animal(String voice, boolean mammal) {
        this.voice = voice;
        this.mammal = mammal;
    }

    public abstract String yieldVoice();

    public void printAnimal() {
        System.out.println(mammal + " " + voice);
    }

}
