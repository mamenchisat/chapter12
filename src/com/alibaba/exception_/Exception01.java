package com.alibaba.exception_;

/**
 * 项目名：    chapter12
 * 文件名：    Exception01
 * 创建时间：   2022/8/27 17:06
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        // num1/num2 = 10/0
        //当执行到这里，程序会抛出异常ArithmetcException
        //当抛出异常后，程序会退出
        //不好，不应该出现了一个不算致命的错误，导致整个系统崩溃
        //java设计者提供了异常处理机制来解决
//        int res = num1/num2;
        //如果程序员任务一段代码可能会出现异常，可以使用try catch异常处理机制
        //引入了异常处理，程序可以继续运行
        try {
            int res = num1/num2;
        } catch (Exception e) {
            //捕获到异常，当异常发生是，系统将异常封装成exception对象，传给参数e
            //得到异常对象后，程序员自己处理
            //如果没有发生异常，catch不会执行
            e.printStackTrace();
        }finally {
            //不管是否有异常，代码块仍要执行
            //通常把资源的关闭放在这里执行
        }
        System.out.println("程序持续运行~~");

    }
}
