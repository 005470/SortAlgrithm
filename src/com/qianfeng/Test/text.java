package com.qianfeng.Test;

public class text{
    public static void main(String[] args) {
       double[] myList={1.9,2.9,3.4,3.5};
       //打印
       for (int i=0;i<myList.length;i++){
          System.out.println(myList[i]+" ");
       }
       //求和
        double sum=0;
        for (int i=0;i<myList.length;i++){
             sum += myList[i];
        }
        System.out.println("sum is "+sum);
    }
}
