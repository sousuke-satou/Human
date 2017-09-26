package com.example.vic72.javalog;

import android.util.Log;
/**
 * Created by vic72 on 2017/09/15.
 */

public class Human extends Animal implements Thinkable{

    private String hobby;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(String hobby) {
        this.hobby = hobby;
    }



    public void say() {
        Log.d("javatest", "私の名前は"+ this.name + "です。" + "年は" + this.age +"歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
}
