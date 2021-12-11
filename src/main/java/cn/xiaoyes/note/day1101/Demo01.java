package cn.xiaoyes.note.day1101;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Dialogue d1 = new Dialogue("Mike","Joy, How do you do!");
        Dialogue d2 = new Dialogue("Joy","Mike, How do you do!");
        Dialogue d3 = new Dialogue("Joy","say something");
        Dialogue d4 = new Dialogue("Mike","Nice to eet you again.Bye.");
        Dialogue d5 = new Dialogue("Joy","JNice to meet you again.Bye");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }

    static class Dialogue{
        private String author;
        private String message;

        public Dialogue(){

        }

        public Dialogue(String author, String message) {
            this.author = author;
            this.message = message;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return getAuthor() + ": " + getMessage();
        }
    }
}
