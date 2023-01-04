public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Рей", "Брэдбери");
        Author author2 = new Author("Жюль", "Верн");
        Author author3 = new Author("Джек", "Лондон");
        Book book1 = new Book("451 по Фаренгейту", author1, 2019);
        Book book2 = new Book("Школа робинзонов", author2, 2000);
        Book book3 = new Book("Белый клык", author3, 1996);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}