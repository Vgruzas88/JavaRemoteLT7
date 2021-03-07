package lt.sda.javaFundamentalsCoding.advanced.composition;

public class CompositionMain {

    public static void main(String[] args) {

        Tv tv = new Tv("UHD", 42);
        Bed bed = new Bed("Best bed", "Guestroom");

        Room room1 = new Room(tv,bed);

        //Cia tiesiogiai kvieciam konkrecios klases konstruktorius
        //nereikia atskirai kurti objektu
        Room room2 = new Room(
                new Tv("HD",28),
                new Bed("Queen bed","Livingroom")
        );
    }
}
