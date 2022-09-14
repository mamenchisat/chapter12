package com.alibaba.exception_;

/**
 * 项目名：    chapter12
 * 文件名：    CustomException
 * 创建时间：   2022/8/29 10:37
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (age >=18 && age <=120){
            System.out.println("正常");
        }else {
            throw new AgeException("年龄需要在18-120岁之间");
        }
    }
}
//一般情况下继承RuntimeException，这样可以用默认的处理机制
class AgeException extends RuntimeException{
    public AgeException(String message) {//构造器
        super(message);
    }
}

