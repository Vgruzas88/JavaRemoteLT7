package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Country country1 = new Country(80000,"Lietuva");
        Country country2 = new Country(9000000,"Vokietija");
        Person person1 = new Person(1224,"Vytautas");
        Person person2 = new Person(10000000,"Bilas");

        List objektai = new ArrayList();
        objektai.add(country1);
        objektai.add(country2);
        objektai.add(person1);
        objektai.add(person2);



    }
}
