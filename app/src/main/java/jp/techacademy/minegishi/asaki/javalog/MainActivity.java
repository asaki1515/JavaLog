package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*課題*/
        Human human = new Human("アンドロイド", 5, "課題");     // 名前をアンドロイド、年齢5歳、課題を考える、でHumanのインスタンスを作る

        human.say();
        human.think();

        Human human2 = new Human("アイフォン", 7, "問題");     // 名前をアイフォン、年齢7歳、問題を考える、でHuman2のインスタンスを作る

        human2.say();
        human2.think();
    }
}
