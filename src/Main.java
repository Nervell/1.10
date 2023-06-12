public class Main {
    public static void main(String[] args) {
        Author author = new Author("William", "Shakespeare");
        Book gamlet = new Book("Gamlet", author, 1601);
        Book gamlet2 = new Book("Gamlet", author, 1601);

        System.out.println(gamlet.hashCode() == gamlet2.hashCode());
        System.out.println(gamlet.equals(gamlet2));
    }
}