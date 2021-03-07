package lt.sda.javaFundamentalsCoding.advanced.concurrency.example2;

public class ConcurrencyExample {

    public static void main(String[] args) {
        System.out.println("Main thread starts!");

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            //sustabdys kazkiek laiko pagrindini thread
            // kuris paleidineja koda main klaseje
            Thread.sleep(2000);
            System.out.println("Main thread still running");

            Thread.sleep(3000);
            System.out.println("Main thread ends!");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted on sleep");
        }
    }
}
