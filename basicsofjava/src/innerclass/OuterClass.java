package innerclass;

public class OuterClass {
    private String name;
    private int age;
    private String str;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getStr(){
        return str;
    }

    public void setStr(String str){
        this.str = str;
    }

    public void display(){
        System.out.println("OuterClass...");
    }

    public void outerDisplay(){
        System.out.println("outerdisplay...");
    }

    /*
     推荐使用get***()获取成员内部类，尤其是该内部类的构造函数无参时
     */
    public InnerClassMember getInnerClass(){
        return new InnerClassMember();
    }

    public class InnerClassMember{
        public void innerDisplay(){
            //使用外围类的属性
            str = "chenssy...";
            System.out.println(str);
            //使用外围类的方法
            outerDisplay();
        }
    }

    class InnerClass{
        public InnerClass(){
            name = "wolf man";
            age = 23;
        }

        public void display(){
            System.out.println("name:" + getName() + "\nage:" + getAge());
        }

        public OuterClass getOuterClass(){
            return OuterClass.this;
        }
    }

    public InnerClass getInnerClass(final int num, String str2){
        return new InnerClass(){
            int number = num + 3;
            public int getNumber(){
                return number;
            }
        };  //注意：分号不能省略
    }

    public static void main(String[] args){
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();
        innerClass.getOuterClass().display();

        InnerClass inner = outerClass.getInnerClass(2, "wolf");
//        System.out.println(inner.getNumber());
    }
}

