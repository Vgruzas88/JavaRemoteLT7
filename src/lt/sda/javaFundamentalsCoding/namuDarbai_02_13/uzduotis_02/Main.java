package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_02;

public class Main {
    public static void main(String[] args) {
        Dog[] dogArray;
        dogArray = new Dog[3];
        dogArray[0] = new Dog("Joshis", 3, "Geltona");
        dogArray[1] = new Dog("Kumpis", 7, "Ruda");
        dogArray[2] = new Dog("Shyva", 2, "Juoda");

        System.out.println(findOldestDog(dogArray));
        System.out.println(findAverageDogAge(dogArray));
    }

    private static String findOldestDog(Dog[] dogArray) {
        String oldestDog = null;
        int oldestAge = 0;
        for (Dog dog : dogArray) {
            if (dog.getAge() > oldestAge) {
                oldestAge = dog.getAge();
                oldestDog = dog.getName();
            }
        }
        return oldestDog;
    }
    private static String findAverageDogAge(Dog[] dogArray) {
        double sum = 0;
        for (Dog dog : dogArray) {
            sum = sum + dog.getAge();
        }
        return "Average dog age is: " + sum/dogArray.length;
    }
}