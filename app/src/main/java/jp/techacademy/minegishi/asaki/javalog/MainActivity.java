package jp.techacademy.minegishi.asaki.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {  // AppCompatActivityクラスのonCreateメソッドを上書きして置き換えて宣言
        super.onCreate(savedInstanceState);  // オーバーライドした関数内でAppCompatActivityクラスのonCreateメソッドを呼び出す。引数は上記onCreateメソッドで渡ってきた引数をそのまま渡す
        setContentView(R.layout.activity_main);  // MainActivityクラスがAppCompatActivityクラスからそのまま継承したメソッド

        /*5.5*/
        int num = 60;

        if (num >= 90) {
            Log.d("javatest", "優");
        } else if (num >= 75) {
            Log.d("javatest", "良");
        } else if (num >= 60) {
            Log.d("javatest", "可");
        } else {
            Log.d("javatest", "不可");
        }

        int drink = 1;

        switch (drink) {
            case 0:
                Log.d("javatest", "コーヒーを注文しました");
                break;
            case 1:
                Log.d("javatest", "紅茶を注文しました");
                break;
            case 2:
                Log.d("javatest", "ミルクを注文しました");
                break;
            default:
                Log.d("javatest", "オーダーミスです");
                break;
        }

    }
}
