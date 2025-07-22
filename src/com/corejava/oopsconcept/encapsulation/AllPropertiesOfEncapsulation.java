package com.corejava.oopsconcept.encapsulation;

class Employee{

    private String name;
    private  int age;
    private double salary;

    // 2. Public getter and setter methods (controlled access)


    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    //setters


    public void setName(String name) {
        // 3. Validation logic in setter (modifiability)
        if(name == null || name.isEmpty()){
            System.out.println("Name cannot be empty.");
        }else {
            this.name = name;
        }

    }

    public void setAge(int age) {
        // Age validation
        if(age <18 || age> 65){
            System.out.println("Invalid age. Must be between 18 and 65.");
        }else {
            this.age = age;
        }
    }

    public void setSalary(double salary) {
        // Salary validation
        if(salary<10000){
            System.out.println("Salary must be at least 10,000.");
        }else {
            this.salary = salary;
        }

    }

    // 4. Additional method to show encapsulated data
    public void displayEmployeeInfo(){
        System.out.println("Employee Details:");
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Salary: " + salary);
    }
}



public class AllPropertiesOfEncapsulation {

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        // Set values via setters (encapsulation in action)
        emp1.setName("sumanth");
        emp1.setAge(25);
        emp1.setSalary(50000);

        // Try invalid inputs
        emp1.setAge(16);          // Invalid
        emp1.setSalary(9000);     // Invalid
        emp1.setName("");         // Invalid
        // Access data via getters (read-only access)
        System.out.println("\nAccess via Getters:");
        System.out.println("Name: " + emp1.getName());
        System.out.println("Age : " + emp1.getAge());
        System.out.println("Salary: " + emp1.getSalary());

        System.out.println("-------------------------");
        // Display all data
        emp1.displayEmployeeInfo();


    }

}
