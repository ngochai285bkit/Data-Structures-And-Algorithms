package _2_Sorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortInJava {
    static class Student implements Comparable<Student> {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " - " + age;
        }

        @Override
        public int compareTo(Student otherStudent) {
            if (this.age > otherStudent.age) {
                return 1;
            } else if (this.age == otherStudent.age) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        // ########## Using Arrays.sort ##########
        // #1. Sort an integer array
        int[] a = { 3, 2, 5, 7, 6, 8, 9, 1, 4 };
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        // #2. Sort an String array
        String[] stringArray = { "BBB", "C", "AA", "DDDDDD" };
        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        // #3. Sort a Student array with interface Comparable
        Student[] studentArray = { new Student("Hai", 20), new Student("Anh", 17), new Student("Binh", 21) };
        Arrays.sort(studentArray);
        System.out.println(Arrays.toString(studentArray));

        // #4. Sort a Student array with comparator
        Arrays.sort(studentArray, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(Arrays.toString(studentArray));
    }
}
