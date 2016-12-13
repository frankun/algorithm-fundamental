package com.frankun.syntax;

/**
 * 知某学院毕业生300人左右（300左右浮动20），就业率83.23%，用for循环和枚举，求最可能的人数和就业人数
 * 2016/12/13
 * @author frankun
 */
public class GradEnum {

    public static void main(String[] args) {
        GradEnum gradEnum = new GradEnum();
        gradEnum.calcByEnum(300,20,0.8323f);
    }

    private void calcByEnum(int base, int off, float percent){
        float minDiff = 1.0f, tmp;
        int realGrad = 300;
        for (int i = base - off + 1; i < base + off; i++){
            tmp = Math.abs((float)Math.round(i * percent)/i - percent);
            if (tmp < minDiff){
                minDiff = tmp;
                realGrad = i;
            }
        }
        int employ = Math.round(realGrad * percent);
        System.out.println("枚举计算出学生总数：" + realGrad);
        System.out.println("已就业人数：" + employ);
        System.out.println("给定的就业率：" + percent * 100 + "%");
        System.out.println("计算结果对应就业率：" + ((float)employ/realGrad));
    }
}
