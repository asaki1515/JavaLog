package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*5.6*/
        for (int i = 1; i < 6; i++) {
            Log.d("javatest", "for文の " + String.valueOf(i) + "回目");
        }

        int num = 1;

        while (num < 6) {
            Log.d("javatest", "while文の " + String.valueOf(num) + "回目");
            num++;
        }

    }
}
