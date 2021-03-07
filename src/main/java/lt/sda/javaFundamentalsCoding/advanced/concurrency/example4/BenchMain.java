package lt.sda.javaFundamentalsCoding.advanced.concurrency.example4;

public class BenchMain {

    public static void main(String[] args) {

        Bench bench = new Bench(1);

        SeatTakerThread STT1 = new SeatTakerThread(bench);
        SeatTakerThread STT2 = new SeatTakerThread(bench);

        STT1.start();
        STT2.start();
    }
}
