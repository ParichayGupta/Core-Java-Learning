package DesignPatterns.Builder;

public class Employee {
    /*
    * Builder pattern is used to create complex objects with many attributes.
    * It is used when we have many attributes in a class and we want to create an object with only a few attributes.
    * We can create an object with only required attributes and ignore the rest.
    * We can also make the object immutable by making the constructor private and providing a public static method to create the object.
    * We can also make the object thread safe by making the constructor synchronized.
    * We can also make the object singleton by making the constructor private and providing a public static method to create the object.
    * */

    private String name;
    private String id;
    private String department;
    private String designation;
    private String salary;
    private String address;
    private String phone;
    private String email;

    public Employee(EmployeeBuilder builder){
        this.name = builder.name;
        this.id = builder.id;
        this.department = builder.department;
        this.designation = builder.designation;
        this.salary = builder.salary;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public static class EmployeeBuilder{
        private String name;
        private String id;
        private String department;
        private String designation;
        private String salary;
        private String address;
        private String phone;
        private String email;

        public EmployeeBuilder(String name, String id){
            this.name = name;
            this.id = id;
        }

        public EmployeeBuilder department(String department){
            this.department = department;
            return this;
        }

        public EmployeeBuilder designation(String designation){
            this.designation = designation;
            return this;
        }

        public EmployeeBuilder salary(String salary){
            this.salary = salary;
            return this;
        }

        public EmployeeBuilder address(String address){
            this.address = address;
            return this;
        }

        public EmployeeBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder email(String email){
            this.email = email;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Department: " + department + "\n" +
                "Designation: " + designation + "\n" +
                "Salary: " + salary + "\n" +
                "Address: " + address + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n";
    }

    public static void main(String[] args) {
        Employee employee = new EmployeeBuilder("John", "123")
                .department("IT")
                .address("123 Main St")
                .phone("123-456-7890").build();
    }
}
