package genericity;

public class Manager extends Employee {
    private int salaryPlus;

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
        Pair<Manager> managerPair = new Pair<>();
        Pair<? extends Employee> employeePair = managerPair;    //OK
        System.out.println("firstNumber:" + employeePair.getFirstNumber()); //null
//        employeePair.setFirstNumber(1);   //compile-time error
    }
}
