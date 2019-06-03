package com.qianfeng.Test;

import java.awt.*;

/**
 * 1.当一个文件中存在多个类，main函数在哪个类先执行哪个类，
 * 2.一个文件只有一个main
 * 3.当前文件的名字最好与main所在的类同名
 * 4.public被修饰的类只能有一个
 * 总结：类是一种引用类型
 */
public class Demo1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1, 1);
        Point point2 = new Point(2,2,2);
        double distance = point1.getDistance(point2);
       double distance1= Point.getDistance(point1,point2);

       System.out.println(distance+"  "+distance1);
    }
}
    class Point {
        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        private int x;
        private int y;
        private int z;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getZ() {
            return z;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void setZ(int z) {
            this.z = z;
        }


        public double getDistance(Point point) {
            int num = (this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y) + (this.z - point.z) * (this.z - point.z);
            return Math.sqrt(num);
        }
        public static double getDistance(Point point,Point point1) {
            int num = (point1.x - point.x) * (point1.x - point.x) + (point1.y - point.y) * (point1.y - point.y) + (point1.z - point.z) * (point1.z - point.z);
            return Math.sqrt(num);
        }
    }


