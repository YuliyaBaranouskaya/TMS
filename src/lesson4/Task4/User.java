package lesson4.Task4;

import lesson4.Task3.Gender;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

    public User(String firstName, String lastName, int age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public User(String firstName, String lastName){
        this(firstName,lastName,0,Gender.MALE);
    }

    public static void main(String[] args) {
        User user1 = new User("Ivan", "Petrov");
        User user2 = new User("Kolya", "Ivanov", 30, Gender.MALE);
        System.out.println(user1.firstName);
        System.out.println(user2.firstName);
    }
}
