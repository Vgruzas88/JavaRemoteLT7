package lt.sda.javaFundamentalsCoding.uzduotis19;

public class Poem {
    public Author author;
    private int numOfStrophes;

    public Poem() {
    }

    public Poem (Author author, int numOfStrophes) {
        this.author = author;
        this.numOfStrophes = numOfStrophes;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor (Author author) {
        this.author = author;
    }
    public int getNumOfStrophes () {
        return numOfStrophes;
    }
    public void setNumOfStrophes (int numOfStrophes) {
        this.numOfStrophes = numOfStrophes;
    }
}

