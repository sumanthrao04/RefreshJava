package com.Java8.programs.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));


        //Real Time Queries On employeeList

        // 1.How many male and female employees are there in the organization?
        Map<String,Long> noOfMaleAndFemaleEmployee = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("male and female employees are there in the organization " + noOfMaleAndFemaleEmployee);
        System.out.println("----------------------------------------------------------------");

        //2 Print the name of all departments in the organization?
        System.out.println("departments in the organization");
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");

        //3 What is the average age of male and female employees?
        Map<String,Double> avarageAgeOfPeople = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println("average age of male and female employees : " +avarageAgeOfPeople);

        System.out.println("----------------------------------------------------------------");
        //4  Get the details of highest paid employee in the organization?
        Employee highestPaid = employeeList.stream().max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow(()-> new NoSuchElementException("No Employee Found"));
        System.out.println("Highest Paid Employee: " + highestPaid);
        System.out.println("----------------------------------------------------------------");

        //5 Get the names of all employees who have joined after 2015?
        System.out.println("names of all employees who have joined after 2015");
    employeeList.stream().filter(e-> e.getYearOfJoining()>2015)
                    .map(Employee::getName).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------");


        //6 Count the number of employees in each department?
        Map<String ,Long> employeeByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting() ));
        System.out.println("number of employees in each department: " + employeeByDepartment);

        employeeByDepartment.forEach((empName, dept)-> System.out.println(empName +" -> " +dept));

        System.out.println("----------------------------------------------------------------");

        //7 What is the average salary of each department?
        System.out.println("average salary of each department");
        Map<String, Double> averageSalaryByDepartment = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        averageSalaryByDepartment.forEach((dept,salary)-> System.out.println(dept +" -> " + salary));

        System.out.println("----------------------------------------------------------------");

        //8 count employees per department and calculate average salary per department together
        Map<String, DoubleSummaryStatistics> empCountWithDepartmentsal = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summarizingDouble(Employee::getSalary)));
        System.out.println("count employees per department and calculate average salary per department together" );
        empCountWithDepartmentsal.forEach((dept,status)-> System.out.println("The department : "+ dept+ "  "+ " and The Count :" + status.getCount()+ " and the salary Average : " + status.getAverage() ));

        System.out.println("----------------------------------------------------------------");

        //9 Get the details of youngest male employee in the product development department?
         Optional<Employee> youngest = employeeList.stream().filter(employee -> employee.getGender()=="Male" && employee.getDepartment()=="Product Development").min(Comparator.comparingInt(Employee::getAge));
        System.out.println("details of youngest male employee in the product development department" + youngest);
        System.out.println("----------------------------------------------------------------");

        //10 find the second highest salary,
        Employee secondHighestPaid = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst()
                .orElseThrow(()-> new NoSuchElementException("No Employee Found"));

        System.out.println(" second Highest Paid Employee: " + secondHighestPaid);
        System.out.println("----------------------------------------------------------------");

        //11 Who has the most working experience in the organization?
        Optional<Employee> mostWorkExperience = employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge).reversed()).findFirst();
        System.out.println(" the most working experience in the organization " + mostWorkExperience);

        System.out.println("----------------------------------------------------------------");

        //12 How many male and female employees are there in the sales and marketing team?
        Map<String,Long> salesMarketEmp = employeeList.stream().filter(employee -> employee.getDepartment()=="Sales And Marketing").collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("male and female employees are there in the sales and marketing team : " + salesMarketEmp );
        System.out.println("----------------------------------------------------------------");

        //13 What is the average salary of male and female employees?
        Map<String,Double> averageSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("the average salary of male and female employees" +averageSalary);
        System.out.println("----------------------------------------------------------------");

        //14 List down the names of all employees in each department?

        // Group employees by department -> list of names
        System.out.println("names of all employees in each department");
        Map<String, List<String>> namesByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.mapping(Employee::getName, Collectors.toList())
                ));

        // Print result
        namesByDept.forEach((dept, names) -> System.out.println(dept + " -> " + names));

        System.out.println("----------------------------------------------------------------");
    }





    }




