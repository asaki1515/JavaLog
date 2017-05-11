package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*5.3*/
        // 整数型の変数をnumという名前で作成して、10を代入する
        int num = 10;
        Log.d("javatest", String.valueOf(num));  // String.valueOf(num):数値型などの変数を文字列型として返すStringクラスの関数
                                                 // Log.dメソッドの2つ目の引数には文字列型の値を渡す必要があるためString.valueOfで変換
        // numに50を代入する
        num = 50;
        Log.d("javatest", String.valueOf(num));


    }
}
