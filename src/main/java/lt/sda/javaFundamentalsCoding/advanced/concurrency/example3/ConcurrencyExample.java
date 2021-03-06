package lt.sda.javaFundamentalsCoding.advanced.concurrency.example3;

public class ConcurrencyExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts!");

        StopWatch sw1 = new StopWatch("SW1");
        StopWatch sw2 = new StopWatch("SW2");

        sw1.start();
        try {
            //sustabdys kazkiek laiko pagrindini thread
            // kuris paleidineja koda main klaseje
            Thread.sleep(1000);
            sw2.start();

            System.out.println("Main thread still running");

            Thread.sleep(3000);
            System.out.println("Main thread ends!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted on sleep");
        }
    }
}
