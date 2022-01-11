package com.practice;

public class Library {
    public static void main(String[] args) {
        Librarys L = new Librarys();
        L.AddBook("ML1 Book");
        L.AddBook("ML2 Book");
        L.AddBook("ML3 Book");
        L.AddBook("ML4 Book");
        L.ShowAvailableBooks();
        L.IssueBook("ML3 Book");
        L.ShowAvailableBooks();
        L.returnBook("ML3 Book");
        L.ShowAvailableBooks();

    }

}
class Librarys{
    String[] books;
    int NoOfBooks= 0;

    Librarys(){
        this.books =new String[100];
        this.NoOfBooks = 0;
    }
    void AddBook(String book){
        this.books[NoOfBooks] = book;
        NoOfBooks++;
        System.out.println(book+"Book been added");
    }
    void ShowAvailableBooks(){
        System.out.println("Available Book are:");
        for (String book:this.books ){
            if (book==null) {
                continue;
            }
            System.out.println("* " + book);
        }
    }
    void IssueBook(String book){
        for (int i=0;i<this.books.length;i++ ){

            if (this.books[i].equals(book)) {
                System.out.println("The book has been issued!");
                this.books[i]=null;
                return;
            }

        }
        System.out.println("this book not available");
    }
    void returnBook(String book){
     // this.books[NoOfBooks]=book;
        AddBook(book);
    }
}
