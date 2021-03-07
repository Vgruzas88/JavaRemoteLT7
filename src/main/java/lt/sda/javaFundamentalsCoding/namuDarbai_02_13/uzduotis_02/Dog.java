package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_02;


class Dog {

    private String name;
    private int age;
    private String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;  
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

}

