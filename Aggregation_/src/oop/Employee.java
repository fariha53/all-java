package oop;
public class Employee {
    String name;
    int id;
    Address address;
    Employee(String name,int id, Address address)
    {
        this.name=name;
        this.id=id;
        this.address=address;
    }

    void display()
    {
        System.out.println("Name of the Student: "+name);
        System.out.println("ID of the Student: "+id);
        System.out.println("House number : "+address.houseNo);
        System.out.println("City: "+address.city);
        System.out.println("Country: "+address.country);
    }
}
