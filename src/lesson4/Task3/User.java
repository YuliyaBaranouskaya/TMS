package lesson4.Task3;

public class User {

    public String firstName;
    public String lastName;
    public int age;
    public Gender gender;
    public Address address;

    public void printInformation(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address.city + " " + address.country);
    }

    @Deprecated
    public void increaseAge(){
        age += 1;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public static class Address {
        public String city;
        public String country;

        public Address(String city, String country){
            this.city = city;
            this.country = country;
        }
    }
}
