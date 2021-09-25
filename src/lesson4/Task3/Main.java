package lesson4.Task3;

import static lesson4.Task3.Gender.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.firstName = "Key";
        user1.lastName = "Lock";
        user1.age = 34;
        user1.gender = MALE;
        User.Address address = new User.Address("London", "UK");
        user1.address = address;

        System.out.println(user1.getFullName());
        user1.printInformation();
        user1.increaseAge();
        user1.printInformation();

    }
}
