package com.frankun.syntax;

import java.util.Scanner;

/**
 * 对用户传递的字符串参数中的汉字打印出Unicode编码
 * 若参数中含有非汉字的其他符号，则自动跳过
 * 2016/12/13
 * @author frankun
 */
public class DispUnicode {

    public static void main(String[] args) {
        System.out.print("请输入一串字符：");
        Scanner scanner = new Scanner(System.in);
        DispUnicode dispUnicode = new DispUnicode();
        dispUnicode.queryCoding(scanner.nextLine());
    }

    private void queryCoding(String str){
        for (int i = 0; i < str.length(); i++){
            int uni = (int)str.charAt(i);
            if (uni < 19968 || uni > 40869){
                continue;
            }
            System.out.print(str.charAt(i) + ":" + uni + "\t");
        }
    }
}
