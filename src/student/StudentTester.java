/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author J's tablet
 */
public class StudentTester {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("bill");
        students[1] = new Student("bob");
        students[2] = new Student("jill");
        students[3] = new Student("joe");
        students[4] = new Student("mike");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName());
        }
    }
}
