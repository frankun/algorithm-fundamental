package com.frankun.syntax;

/**
 * 打印3~100之间的素数，每行打印6个
 * 2016/12/13
 * @author frankun
 */
public class PrimePrint {

    public static void main(String[] args) {
        System.out.println("3到100之间的素数：");
        boolean isPrime;
        int count = 0;
        for (int i = 3; i <= 100; i++){
            isPrime = true;
            for (int j = 2; j <= i/2; j++){
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + "\t");
                count++;
                if (count % 6 == 0){
                    System.out.println();
                }
            }
        }
    }
}
