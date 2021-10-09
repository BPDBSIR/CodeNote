package cn.xiaoyes.note.day0929;

import java.io.*;

public class Test03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        ObjectInputStream ois = new ObjectInputStream("")
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj"));
        oos.writeObject(new Person("小花",20));
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj"));
        System.out.println(((Person) ois.readObject()));
    }

    static class Person implements Serializable{


        private String name;

        private int age;

        public Person(){

        }
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
