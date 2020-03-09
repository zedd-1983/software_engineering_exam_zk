/*
    Employee class storing details of an employee
    Author: Zdenek Krousky
    g00267758

 */


package ie.gmit;

public class Employee {

    private String name;
    private String phone;
    private String id;
    private int age;

    public Employee() {
        throw new IllegalArgumentException("Must use all the parameters");
    }

    public Employee(String name, String phone, String id, int age) {
        if(name == "" || phone == "" || id == "" || age == 0) {
            throw new IllegalArgumentException("Must use all the parameters to create Employee");
        } else {
            this.name = name;
            this.phone = phone;
            this.id = id;
            this.age = age;
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() <= 3 || name.length() >= 25) {
            throw new StringIndexOutOfBoundsException("Name must be between 3 and 25 characters long");
        } else {
            this.name = name;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if(phone.length() != 8) {
            throw new IllegalArgumentException("Phone number must be 8 digits long");
        } else {
            this.phone = phone;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() != 5) {
            throw new IllegalArgumentException("Id must be 5 digits long");
        } else {
            this.id = id;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 16) {
            throw new IllegalArgumentException("Must be over 16");
        } else
        {
            this.age = age;
        }
    }
}
