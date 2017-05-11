package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*7.3*/
        Dog dog = new Dog("ポチ", 3);     // 名前をポチ、年齢3歳で、Dogのインスタンスdogを作る

        dog.say();  // ポチが吠えます（ログ出力）
        Log.d("javatest", "犬の名前は" + dog.name + "です。"); // インスタンスdogのnameを呼び出し
        Log.d("javatest", "犬の年齢は" + dog.age + "歳です。");  // インスタンスdogのageを呼び出し

        Dog dog2 = new Dog("ハチ", 10);   // 名前をハチ、年齢10歳で、Dogインスタンスdog2を作る
        dog2.say();  // ハチが吠えます（ログ出力）
        Log.d("javatest", "犬の名前は" + dog2.name + "です。");
        Log.d("javatest", "犬の年齢は" + dog2.age + "歳です。");
        // Dogクラスの中の関数sayを使ってもいいし、変数nameとageを使ってもいい
    }
}
