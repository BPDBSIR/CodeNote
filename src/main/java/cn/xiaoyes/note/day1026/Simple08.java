package cn.xiaoyes.note.day1026;

import java.util.*;

public class Simple08 {
    public static void main(String[] args) {

        Student s1 = new Student("张三",18,85);
        Student s2 = new Student("李四",18,89);
        Student s3 = new Student("王五",16,89);
        Student s4 = new Student("张三",14,70);
        List<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        Set<Student> sets = new HashSet<>();
        for (Student student : arr) {
            sets.add(student);
        }

        for (Student set : sets) {

            System.out.println(set);
        }
    }

    static class Student {
        private String name;
        private int age;
        private double score;

        public Student(){

        }

        public Student(String name, int age, double score) {
            this.name = name;
            this.age = age;
            this.score = score;
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

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", score=" + score +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

}
