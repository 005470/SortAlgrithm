package com.qianfeng.Test;

public class Demo7 {
    //静态代码块；随着类的加载而执行，只执行一次，优先于main函数
   //作用：适合做类的初始化abcd展示+33mian



    //构造代码块{}
    //随着对象的创建而执行，每次创建都会执行，执行顺序高于构造方法
    //静态代码块>构造代码块>构造方法




    //静态代码块
    static {
        System.out.println("a");
    }
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.setAge(33);
        pig.setName("冰冰");
        pig.show();

        System.out.println("main");

    }
    static {
        System.out.println("b");
    }
}
class Pig{
    static {  System.out.println("c");}
    int age;
    String name;
    {System.out.println("f");}
    public Pig(){ System.out.println("d");}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("展示+"+this.getAge());
    }
    {System.out.println("j");}

}