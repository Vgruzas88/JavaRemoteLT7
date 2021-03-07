package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_01;

public class Main {

    public static void main(String[] args) {

        String text = "Ad Astra Per Aspera";
        System.out.println("Original string: " + text);
        System.out.println();

        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());

        String text2 = text.replace("A","X");
        System.out.println(text2);

        System.out.println(text.startsWith("Ad"));
    }
}
