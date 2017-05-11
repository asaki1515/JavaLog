package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*8*/
        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスを作る

        dog.move();
    }
}
