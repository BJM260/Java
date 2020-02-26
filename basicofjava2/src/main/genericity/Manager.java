package main.genericity;

public class Manager extends Employee {
    private int salaryPlus;

    public Manager(){}
    public Manager(String name, int salary, int salaryPlus){
        this.name = name;
        this.salary = salary;
        this.salaryPlus = salaryPlus;
    }

    public void setSalaryPlus(int salaryPlus){
        this.salaryPlus = salaryPlus;
    }

    public int getSalaryPlus(){
        return salaryPlus;
    }

    public static void minmaxBouns(Manager[] a, Pair<? super Manager> res){
        if(a.length == 0)
            return;
        Manager min = a[0];
        Manager max = a[0];
        for(int i = 1; i < a.length; ++i){
            if(min.getSalaryPlus() > a[i].getSalaryPlus())
                min = a[i];
            if(max.getSalaryPlus() < a[i].getSalaryPlus())
                max = a[i];
        }
        res.setFirstNumber(min);
        res.setSecondNumber(max);
    }

    public static void main(String[] args){
//        Pair<Manager> managerPair = new Pair<>();
//        Pair<? extends Employee> employeePair = managerPair;    //OK
//        System.out.println("firstNumber:" + employeePair.getFirstNumber()); //null
//        employeePair.setFirstNumber(1);   //compile-time error

        /*
        通配符的超类限定：此时可以为方法提供参数，但不能使用方法返回值；请看以下例子：
         */
        Pair<Employee> employeePair = new Pair<>();
        Pair<? super Manager> managerPair = employeePair;

        //get方法的返回值不能保证返回对象的类型，只能把它赋给一个Object
        Object manager = managerPair.getFirstNumber();
//        Manager manager2 = managerPair.getFirstNumber();  //error
//        Employee manager3 = managerPair.getFirstNumber();
        System.out.println(managerPair.getFirstNumber());
        //编译器无法知道setFirst方法的具体类型，
        //因此调用这个方法时不能接受类型为Employee或Object的参数，
        //只能传递Manager类型对象，或它的某个子类型对象；
        managerPair.setFirstNumber(new Manager());
//        managerPair.setSecondNumber(new Employee());
    }
}
