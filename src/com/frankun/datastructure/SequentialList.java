package com.frankun.datastructure;

/**
 * 2016/12/15
 * @author frankun
 */

class Data {
    String key;
    String name;
    int age;
}

class SequentialList {

    static final int MAXLEN = 100;
    Data[] ListData = new Data[MAXLEN + 1];  //保存顺序表的结构数组
    int listLen;                             //顺序表已存结点数量

    void init(SequentialList sl){            //初始化顺序表
        sl.listLen = 0;                      //初始化为空表
    }

    int quantity(SequentialList sl){
        return sl.listLen;                   //返回顺序表的元素数量
    }

    int insert(SequentialList sl, int n, Data data){
        int i;
        if (sl.listLen >= MAXLEN){
            System.out.println("顺序表已满，不能插入节点");
            return 0;
        }
    }

}
