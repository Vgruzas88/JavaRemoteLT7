package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_07;

public abstract class Developer extends Person{

    protected int experienceAge;

    public Developer(String name, int experienceAge) {
        super(name);
        this.experienceAge = experienceAge;
        System.out.println("Developer konstriuktorius iskviestas");
    }
    public abstract String greet();
}
