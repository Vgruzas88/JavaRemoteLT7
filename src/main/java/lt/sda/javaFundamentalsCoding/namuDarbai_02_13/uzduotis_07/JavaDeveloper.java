package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_07;

public class JavaDeveloper extends Developer{

    public JavaDeveloper(String name, int experienceAge) {
        super(name, experienceAge);
        System.out.println("JavaDeveloper konstriuktorius iskviestas");
    }

    @Override
    public String greet() {
        return name + " has " + experienceAge + " years of coding experience";
    }
}
