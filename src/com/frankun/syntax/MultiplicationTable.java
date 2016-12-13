package com.frankun.syntax;

/**
 * for循环嵌套打印乘法表
 * 2016/12/13
 * @author frankun
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
