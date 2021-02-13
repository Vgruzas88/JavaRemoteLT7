package lt.sda.javaFundamentalsCoding.uzduotis19;

public class Main {

    public static void main(String[] args) {

        Author author1 = new Author();
        author1.setSurname("Karpis");
        author1.setNationality("Lietuvis");

        Author author2 = new Author("Kumpis", "Lenkas");
        Author author3 = new Author("Kepenis", "Latvis");

        Poem poem1 = new Poem();
        poem1.setAuthor(author1);
        poem1.setNumOfStrophes(150);

        Poem poem2 = new Poem(author2, 250);
        Poem poem3 = new Poem(author3, 450);

        Poem[] poems = new Poem[3];
        poems[0] = poem1;
        poems[1] = poem2;
        poems[2] = poem3;

        int longestPoem = 0;

        Author longestPoemAuthor = null;

        for(Poem p : poems) {
            if(longestPoem < p.getNumOfStrophes()) {
                longestPoem = p.getNumOfStrophes();
                longestPoemAuthor = p.getAuthor();
            }
        }
        System.out.println(longestPoemAuthor.getSurname() + " wrote longest poem with " + longestPoem + " strophes");
    }
}