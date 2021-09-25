package lesson4.Task6;

import lesson4.Task3.Gender;

public class User {

    public String firstName;
    public String lastName;
    public int age;
    public Gender gender;

    public void printInformation(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void increaseAge(){
        age += 1;
    }

    public void increaseAge(int n){
        age += n;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }
}
