package oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Address address =new Address("Dhaka","Bangladesh", 121);
        Employee employee=new Employee("Faiza", 12,address);
        employee.display();
    }
}
