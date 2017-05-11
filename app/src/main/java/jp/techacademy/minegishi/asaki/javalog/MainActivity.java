package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*5.4*/
        int num1 = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest", "10 + 5 - 2 * 4 / 2 = " + String.valueOf(num1));  //文字列同士は+演算子によって連結

        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest", "flag1 && flag2 = " + String.valueOf(flag1 && flag2));
        Log.d("javatest", "flag1 || flag2 = " + String.valueOf(flag1 || flag2));

        int num2 = 10;
        int num3 = 20;
        Log.d("javatest", "num2 < num3 = " + String.valueOf(num2 < num3));
        
    }
}
