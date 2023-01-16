package com.yanghui;

/**
 * @author flywu
 * @date 2023/1/12 11:37
 */

import java.util.Scanner;

public class yanghui {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入杨辉三角的层数");
        int level = myscanner.nextInt();
        //给level(控制层数)开辟空间
        int arr[][] = new int[level][];
        //杨辉三角算法
        for (int i = 0; i < arr.length; i++) { //外层遍历行数
            arr[i] = new int[i + 1]; //给每一行数组开辟空间
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        //利用循环输出二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();  //每遍历一层输出到下一行
        }
    }
}