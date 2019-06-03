package com.qianfeng.Test;

public class Demo8 {
    //设计模式之单例设计模式
    //设计模式：将前人的经验拿来使用，把这些经验称为设计模式
    //一共23种，常用的单例设计模式，工厂模式，代理模式，装饰设计模式，适配器设计模式，模板设计模式
    //作用：让开发者解决问题的时候更加简单方便
    //单例设计模式：一个类只允许创建一个对象，建立一个全局的访问点，提供给别人
    public static void main(String[] args) {


    }

}
//单例类
//懒汉式
class SingleInstance1{
    //2.私有化静态成员变量
    private static SingleInstance1 s = null;
    //1.私有化构造方法
    private SingleInstance1(){}
    //3。通过一个公共的方法将成员变量提供出去
    public static SingleInstance1 getInstance(){
        if (s==null)
        {
            synchronized (SingleInstance1.class){//线程安全控制
                s=new SingleInstance1();
            }

        }
        return s;
    }
    //功能区
    int age=5;
    public void show(){
        System.out.println("展示");
    }

}
