package com.alibaba.exception_;

/**
 * 项目名：    chapter12
 * 文件名：    TryCatch
 * 创建时间：   2022/8/28 11:05
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class TryCatch01 {
    public static void main(String[] args) {
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字： " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息：" + e.getMessage());
        }finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续运行~");
    }
}
