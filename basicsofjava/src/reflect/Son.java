package reflect;

public class Son extends Father {
    private String name;
    protected int age;
    public String birthday;

    public void printSonMsg(){
        System.out.println("Son{" + " name:" + name + ", age:" + age);
    }

    private void setName(String name){
        this.name = name;
    }

    private String getName(){
        return name;
    }

    private void setAge(int age){
        this.age = age;
    }

    private int getAge(){
        return age;
    }

    private static void printFields(){
//        Class class = Son.class;
    }
}
