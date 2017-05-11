package jp.techacademy.minegishi.asaki.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable{

    //メンバ変数
    String hobby;

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    @Override  // クラス内でインタフェースのメソッドの中身を実装する時は@Overrideをつける
    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える。");
    }
    // interface で定義したメソッドは暗黙でpublic abstractになるので
    // オーバーライドしたメソッドは必ずpublicをつける

}
