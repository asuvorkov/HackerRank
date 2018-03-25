package ThirtyDaysOfCode;

import java.util.*;

/**
 * Created by Andrei on 09.07.2017.
 */
public class Persona {
    private int age;

    private Persona(int initialAge) {
        // Add some more code to run some checks on initialAge
        if (initialAge < 0){
            initialAge = 0;
        }
        this.age = initialAge;
    }

    private void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (age == 0){
            System.out.println("Age is not valid, setting age to 0.");
        }
        if (age < 13){
            System.out.println("You are young.");
        }
        if (age > 12 && age < 18){
            System.out.println("You are a teenager.");
        }
        if (age > 17){
            System.out.println("You are old.");
        }

    }

    private void yearPasses() {
        // Increment this person's age.
        age++;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Persona p = new Persona(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}