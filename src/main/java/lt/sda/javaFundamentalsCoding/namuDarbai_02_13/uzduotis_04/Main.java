package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_04;

public class Main {

    public static void main(String[] args) {

        Mobile[] phones = new Mobile[3];
        phones[0] = new Mobile("3310","Nokia",59.99);
        phones[1] = new Mobile("Ferrari", "Alcatel",899.99);
        phones[2] = new Mobile("Pi3","Blackberry", 199.88);

        System.out.println(getMostExpensivePhone(phones));
    }

    private static String getMostExpensivePhone(Mobile[] phones) {
        double highestPrice = 0;
        String mostExpensivePhoneManucafturer = null;
        String mostExpensivePhoneModel = null;

        for (Mobile phone : phones ) {
            if(highestPrice < phone.getPrice()) {
                highestPrice = phone.getPrice();
                mostExpensivePhoneManucafturer = phone.getManufacturer();
                mostExpensivePhoneModel = phone.getModel();
            }
        }
       return "Most expensive phone is: " + mostExpensivePhoneManucafturer + " " + mostExpensivePhoneModel;
    }
}
