package com.ld.materialdesigningfruits;

/**
 * Created by Billta on 2018-06-28.
 */



//13.定义一个实体类
public class Fruit {

    private String name;
    private int imageId;

    public Fruit(String name,int imageId){//构造方法
        this.name=name;
        this.imageId=imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}