package com.example.vic72.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);

        Human human = new Human("佐藤 聡亮", 22);

        Human human1 = new Human("Java");
        

        human.say();
        human1.think();

        dog.move(); //ログ出力
    }
}
