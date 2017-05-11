package jp.techacademy.minegishi.asaki.javalog;

import android.util.Log;

public class Cat extends Animal{


    // コンストラクタ：クラスからインスタンスが生成された時に呼び出される初期化のための関数
    public Cat(String name, int age) {
        this.name = name;   //メンバ変数と引数名が同じ名前の場合はthis.をつけて区別
        this.age = age;
    }

    // メソッド
    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ニャンニャン」");
    }
}
