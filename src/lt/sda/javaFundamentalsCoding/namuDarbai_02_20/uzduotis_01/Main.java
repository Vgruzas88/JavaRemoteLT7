package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Country country1 = new Country(80000,"Lietuva");
        Country country2 = new Country(9000000,"Vokietija");
        Person person1 = new Person(1224,"Vytautas");
        Person person2 = new Person(10000000,"Bilas");

        int highestPersonAmount = 0;
        String richestPerson = null;
        List<Person> richestPeople = new ArrayList<>();
        richestPeople.add(person1);
        richestPeople.add(person2);

        for(Person person : richestPeople) {
            if(highestPersonAmount < person.findRichest()) {
                highestPersonAmount = person.findRichest();
                richestPerson = person.getName();
            }
        }
        System.out.println("Richest person is: " + richestPerson);


            int highestCountryAmount = 0;
            String richestCountry = null;
        List<Country> richestCountries = new ArrayList<>();
        richestCountries.add(country1);
        richestCountries.add(country2);

        for(Country country : richestCountries) {
            if(highestCountryAmount < country.findRichest()) {
                highestCountryAmount = country.findRichest();
                richestCountry = country.getName();
            }
        }
        System.out.println("Richest country is: " + richestCountry);
    }
}
