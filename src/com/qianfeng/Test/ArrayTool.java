package com.qianfeng.Test;

public class ArrayTool {
    //求最值
    public static int getMax(int[] arr)
    {
        int max=arr[0];
        for (int i=1;i<arr.length;i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    //查找
    public  static int halfSearch(int[] arr,int key)
    {
        int min = 0,max=arr.length-1,mid;
        while (min<=max)
        {
            mid=(min+max)>>>1;
            if (key>arr[mid])
                min=mid+1;
            else if(key<arr[mid])
                max=mid-1;
            else
                return mid;
        }
        return -1;
    }
}
