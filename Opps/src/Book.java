import java.util.Scanner;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int isbnNumber;

//    default constructor
    public Book(){
        System.out.println("this is default constructor");
    }
//    parametrized constructor
public Book(String bookTitle,String bookAuthor,int isbnNumber){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.isbnNumber=isbnNumber;
}

//getter and setter method start
public  String getBookTitle(){
        return bookTitle;
}
public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
}
public String getBookAuthor(){
        return  bookAuthor;
}
public void setBookAuthor(String bookAuthor){
        this.bookAuthor=bookAuthor;
}
public int getIsbnNumber(){
        return isbnNumber;
}
public void setIsbnNumber(int isbnNumber){
        this.isbnNumber=isbnNumber;
}

//getter and setter method close

public void addBook(){

}

public  void removeBook(){

}

//    main method start
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Book Title");
        String bookTitle=obj.nextLine();
        System.out.println("Enter Book Author");
        String bookAuthor=obj.nextLine();
        System.out.println("Enter ISBN Number");
        int isbnNumber=obj.nextInt();

        Book book=new Book();
        book.setBookTitle(bookTitle);
        book.setBookAuthor(bookAuthor);
        book.setIsbnNumber(isbnNumber);

        System.out.println("Book Title = "+book.getBookTitle());
        System.out.println("Book Author = "+book.getBookAuthor());
        System.out.println("Book ISBN Number = "+book.getIsbnNumber());

    }
}
