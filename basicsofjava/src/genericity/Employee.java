package genericity;

public class Employee {
    public String name;
    public int salary;

    public Employee(){}

    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
