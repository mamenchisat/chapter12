package com.alibaba.exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 项目名：    chapter12
 * 文件名：    Throws
 * 创建时间：   2022/8/29 10:09
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        f1();
    }

    public static void  f1() throws FileNotFoundException {
        //创建了一个文件流对象
        //异常处理，这里是一个编译时异常
        //二选一，try catch 或者throws，让调用f1的方法处理
        FileInputStream fileInputStream = new FileInputStream("d://aa.txt");
    }
}
