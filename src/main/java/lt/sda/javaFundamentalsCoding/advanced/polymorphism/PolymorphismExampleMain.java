package lt.sda.javaFundamentalsCoding.advanced.polymorphism;

public class PolymorphismExampleMain {

    public static void main(String[] args) {
        // Polimorfizmas
        RemoteController remote = new TvRemoteController();
        remote.enable(true);
        System.out.println(remote.getClass().getSimpleName());

        remote = new AcRemoteController();
        System.out.println(remote.getClass().getSimpleName());

        TvRemoteController tvRemoteController = new TvRemoteController();
        AcRemoteController acRemoteController = new AcRemoteController();

        //Sitie metodai gali priimti tik savo atitinkamus objektus
        //printAcObject(tvRemoteController);
        //printTvObject(acRemoteController);

        printRemoteControllerObject(tvRemoteController);
        printRemoteControllerObject(acRemoteController);
        printRemoteControllerObject(remote);
    }

    private static void printTvObject(TvRemoteController tv) {
        System.out.println(tv.getClass().getSimpleName());
    }

    private static void printAcObject(AcRemoteController ac) {
        System.out.println(ac.getClass().getSimpleName());
    }

    //Sis metodas priima bendra objekta RemoteController ir nereikia kurti
    //atskiru metodu kiekvienam objektui
    private static void printRemoteControllerObject(RemoteController remote) {
        System.out.println(remote.getClass().getSimpleName());
    }
}
