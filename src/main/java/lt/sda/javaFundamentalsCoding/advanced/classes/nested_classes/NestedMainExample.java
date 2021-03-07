package lt.sda.javaFundamentalsCoding.advanced.classes.nested_classes;

public class NestedMainExample {
    public static void main(String[] args) {

        // zinoti ka main eilute reiskia pazodziui

        Bicycle bicycle = new Bicycle(5);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Mechanic mechanic = new Bicycle.Mechanic();
        mechanic.upgrade(bicycle);

        System.out.println(bicycle.getMaxSpeed());
    }

}
