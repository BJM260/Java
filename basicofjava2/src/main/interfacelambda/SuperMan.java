package main.interfacelambda;

public class SuperMan implements Hero {
    private String name;

    public SuperMan(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

//    @Override
//    public boolean equals(Object object){
//        if(object == null)
//            return false;
//        if(this == object)
//            return true;
//        if(object instanceof SuperMan){
//            SuperMan superMan = (SuperMan) object;
//            return this.name == superMan.name;
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(Object object){
        if(object == null)
            return false;
        if(this == object)
            return true;
        if(object instanceof SuperMan)
            return this.name == (((SuperMan) object).name);
        return false;
    }

    public static void main(String[] args){
//        String name = "Hello~";
//        System.out.println(name.hashCode());
//        System.out.println(name.equals("World"));
//
//        SuperMan superMan = new SuperMan("FengShuYing");
//        SuperMan superMan2 = new SuperMan("FengShuYing");
//        System.out.println(superMan.equals(superMan2));

//        System.out.println("ab".hashCode() == "ab".hashCode());
//        System.out.println("ab".hashCode());
//        SuperMan superMan = new SuperMan("Mike");
//        System.out.println(superMan.getClass());

//        SuperMan superMan = new SuperMan("FengShuYing~");
//        System.out.println(superMan.name);
//        superMan.setName("FengFeng");
//        System.out.println(superMan.name);
    }

//    @Override
//    public boolean equals(SuperMan superMan) {
//        return false;
//    }
}
