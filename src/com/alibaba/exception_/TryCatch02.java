package com.alibaba.exception_;

/**
 * 项目名：    chapter12
 * 文件名：    TryCatch02
 * 创建时间：   2022/8/28 11:13
 *
 * @author crazy Chen
 * 描述：      TODO
 */
public class TryCatch02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getMame());//nullPointException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }

    }
}

class Person {
    private String mame = "jack";

    public String getMame() {
        return mame;
    }
}