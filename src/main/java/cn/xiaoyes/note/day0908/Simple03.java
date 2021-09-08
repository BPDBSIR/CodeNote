package cn.xiaoyes.note.day0908;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * 现有若干图书信息（包含名称title、作者author、定价price）需要存储到set集合中，保证集合中无重复元素，并遍历查看。可以认为所有信息都相同的图书为重复数据。
 */
public class Simple03 {
    public static void main(String[] args) {

        Book b1 = new Book("时间简史","霍金",99.99);
        Book b2 = new Book("红与黑","司汤达",88.88);
        Book b3 = new Book("时间简史","霍金",99.99);
        Set<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.forEach(System.out::println);
    }

    static class Book{
        private String title;
        private String author;
        private double price;

        public Book(){

        }

        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public String getTitle() {

            return title;
        }

        public void getTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, author, price);
        }

        @Override
        public String toString() {
            return "书名: " + getTitle() + " 作者: " + getAuthor() + " 价格: " + getPrice();
        }
    }
}
