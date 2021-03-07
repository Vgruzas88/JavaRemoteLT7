package lt.sda.javaFundamentalsCoding.advanced.classes.anonymous_classes;

public class AnonymousMainExample {
    public static void main(String[] args) {


        HttpExecutor executor = new HttpExecutor() {
            public String executeRequest() {
                return "Labas labas";
            }
        };
        System.out.println(executor.executeRequest());
    }
}