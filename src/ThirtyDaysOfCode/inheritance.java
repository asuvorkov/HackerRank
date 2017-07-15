package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 15.07.2017.
 */
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }
}

class Student extends Person{
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName,lastName,id);
        this.testScores=testScores;
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=id;
    }

    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate() {
        String grade = "";
        int averageScore = 0;
        int counter = 0;
        for (int i = 0; i < testScores.length; i++){
            averageScore += testScores[i];
            counter++;
        }
        averageScore /= counter;
        if (averageScore < 40){
            grade = "T";
        }
        if (averageScore < 55 && averageScore > 39){
            grade = "D";
        }
        if (averageScore < 70 && averageScore > 54){
            grade = "P";
        }
        if (averageScore < 80 && averageScore > 69){
            grade = "A";
        }
        if (averageScore < 90 && averageScore > 79){
            grade = "E";
        }
        if (averageScore < 100 && averageScore > 89){
            grade = "O";
        }
        return grade;
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
