import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;


public class Lesson8_Sort {
    static class Student {
        int rollno;
        String name, address;

        // Constructor
        public Student(int rollno, String name, String address)
        {
            // This keyword refers to current object itself
            this.rollno = rollno;
            this.name = name;
            this.address = address;
        }

        // Used to print student details in main()
        public String toString()
        {
            return this.rollno + " " + this.name + " "
                    + this.address;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("Mang goc");
        for(int num: arr) {
            System.out.print(num + " ");
        }

        Arrays.sort(arr);
        System.out.println("\nMang sau sap xep");
        for(int num: arr) {
            System.out.print(num + " ");
        }

        int[] arr1 = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("\nMang sap xep theo doan");
        Arrays.sort(arr1, 2, 6);
        for(int num: arr1) {
            System.out.print(num + " ");
        }


        Integer[] arr2 = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("\nMang sap xep giam");
        Arrays.sort(arr2, Collections.reverseOrder());
        for(int num: arr2) {
            System.out.print(num + " ");
        }

        Student[] students  = {
                new Student(111, "bbbb", "london"),
                new Student(131, "aaaa", "nyc"),
                new Student(121, "cccc", "jaipur")
        };

        //Sắp xếp danh sách student theo rollno
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.rollno - o1.rollno;
            }
        });


        System.out.println("Sắp xếp mảng sinh viên");
        for(Student student: students) {
            System.out.println(student.toString());
        }
    }
}
// thuat toan ss
// swap
// compare