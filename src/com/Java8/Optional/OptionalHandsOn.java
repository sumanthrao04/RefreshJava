package com.Java8.Optional;


import java.util.Optional;

class City{
    private final String name;
    City(String name){
        this.name=name;
    }

    String getname(){
        return name;
    }
}

class Address {

private final  City city;

    Address(City city) {
        this.city = city;
    }

    City getcity(){
        return city;
    }
}

class User{
    private final Address address;

    User(Address address) {
        this.address = address;
    }

    Address getAddress(){
        return address;
    }
}

class UserServicePreJava8{

    public static String getUserCityName(User user){

        if(user==null) return "Unknown";
        if(user.getAddress()==null) return "Unknown";
        if(user.getAddress().getcity()==null) return "Unknown";
        if(user.getAddress().getcity().getname()==null) return "Unknown";
        return user.getAddress().getcity().getname();
    }
}
class UserServiceWithOptional{

    public  static String getUserCityName(User user){

        return Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address ::getcity)
                .map(City::getname)
                .orElse("Unknown");
    }
}
public class OptionalHandsOn {

    public static void main(String[] args) {

        User user1 = new User(new Address(new City("London")));

        // Case 2: user with no address
        User user2 = new User(null);

        // Case 3: null user
        User user3 = null;

        System.out.println("=== Pre-Java 8 ===");
        System.out.println("User1 City: " + UserServicePreJava8.getUserCityName(user1));
        System.out.println("User2 City: " + UserServicePreJava8.getUserCityName(user2));
        System.out.println("User3 City: " + UserServicePreJava8.getUserCityName(user3));

        System.out.println("\n=== Java 8 Optional ===");
        System.out.println("User1 City: " + UserServiceWithOptional.getUserCityName(user1));
        System.out.println("User2 City: " + UserServiceWithOptional.getUserCityName(user2));
        System.out.println("User3 City: " + UserServiceWithOptional.getUserCityName(user3));

    }
}
