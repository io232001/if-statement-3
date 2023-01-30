package it.develhope.ifstatement;
import java.util.Random;

public class Student {
    private String name;
    private int age;

    public Student(String studentName, int studentAge) {
        this.name = studentName;
        this.age = studentAge;
    }

    public void guessingAge() {
        Random random = new Random();
        int generatedNumber = random.nextInt(35);
        System.out.println("I generated the random number " + generatedNumber + " for student " + name);
        if (generatedNumber == age) {
            System.out.println("The generated number is equal to the student's age");
        } else if (generatedNumber > age) {
            System.out.println("The generated number is greater than the student's age");
        } else {
            System.out.println("The generated number is lower than the student's age");
        }
    }
}




