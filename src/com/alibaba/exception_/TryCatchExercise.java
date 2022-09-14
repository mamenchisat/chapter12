package com.alibaba.exception_;

import java.util.Scanner;

/**
 * 项目名：    chapter12
 * 文件名：    TryCatchExercise
 * 创建时间：   2022/8/28 11:27
 *
 * @author crazy Chen
 * 描述：
 * 如果用户输入的不是一个整数，反复提示，直到输入一个整数为止
 * TODO
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        //1.创建Scanner
        //2.使用无限循环
        //3.然后将该输入的值转成int
        //4.转换时抛出异常，说明输入的内容不是一个可以转成int的内容
        //5，如果没有抛出异常，break
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (true) {

            System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(scanner.next());
                System.out.println(num);
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            }

        }
    }
}
