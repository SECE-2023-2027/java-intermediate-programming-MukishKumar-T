package StudentGradebook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.println("Enter No of Subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        System.out.println("Enter Marks: ");
        for(int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }

        Student s = new Student(name, marks);

        System.out.println(s.calculateAverage());
    }
}
