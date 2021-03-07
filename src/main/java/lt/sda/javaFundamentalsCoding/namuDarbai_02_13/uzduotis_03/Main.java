package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_03;

public class Main {

    public static void main(String[] args) {

        Car[] cars;
        cars = new Car[3];
        cars[0] = new Car("Audi", 2.4, 1998, 5889, "sedan");
        cars[1] = new Car("Volvo", 2.2, 2002, 7777, "suv");
        cars[2] = new Car("Fiat", 1.6, 1996, 3189, "sedan");

        System.out.println(getNewestCatAge(cars));
        System.out.println(getAveragePrice(cars));
        getSedanModels(cars);
        System.out.println(getMostExpensiveModel(cars));
    }
        private static String getNewestCatAge(Car[] cars) {
            int newestCarAge = 0;
            for (Car car : cars) {
                if (car.getYear() > newestCarAge) {
                    newestCarAge = car.getYear();
                }
            }
            return "Newest Car Age is: " + newestCarAge;
        }

        private static String getAveragePrice(Car[] cars) {
            double sum = 0;
            for (Car car : cars) {
                sum = sum + car.getPrice();
            }
            return "Average car price is: " + sum/ cars.length;
        }

        private static void getSedanModels(Car[] cars) {
            System.out.println("Sedan type models are: ");
            for (Car car : cars) {
                if (car.getType().equals("sedan")) {
                    System.out.println(car.getModel() + " ");
                }
            }
        }

        private static String getMostExpensiveModel(Car[] cars) {
            double highestPrice = 0;
            String mostExpensiveCarModel = null;
            for (Car car : cars) {
                if (highestPrice < car.getPrice()) {
                    highestPrice = car.getPrice();
                    mostExpensiveCarModel = car.getModel();
                }
            }
            return "Most expensive car model is: " + mostExpensiveCarModel;
        }

}
