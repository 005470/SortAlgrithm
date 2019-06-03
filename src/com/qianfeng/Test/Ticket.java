package com.qianfeng.Test;

public class Ticket implements Runnable{
    private int num;//票数量
    private boolean flag=true;//若为false则售票停止
    public Ticket(int num){
        this.num=num;
    }
    @Override
    public void run() {
        while(flag){
            ticket();
        }
    }
    private synchronized void ticket(){
        if(num<=0){
            flag=false;
            return;
        }
        try {
            Thread.sleep(20);//模拟延时操作
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //输出当前窗口号以及出票序列号
        System.out.println(Thread.currentThread().getName()+"售出票序列号："+num--);
    }
}
