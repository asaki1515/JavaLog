package jp.techacademy.minegishi.asaki.javalog;

abstract class Animal {
    // メンバ変数
    String name;  // 名前
    int age;    // 年齢

    abstract public void say();
    // Dogだけでなく、例えばCatなどのクラスを作成する際に、
    // say関数は、動物の名前と年齢、鳴き声を表示する関数なので、
    // それぞれのクラス（Dog,Cat）で別々の処理が必要となる。
    // しかし、それぞれのクラスでsay関数という同じ機能をもつ関数に適当な名前を使われると困るので
    // Animalという抽象クラスを定義し、sayという抽象関数を定義することで、
    // 親クラスで関数を用意することで、それを継承する子クラス（サブクラス）全体で
    // この関数名を使うように推奨することができる。

    // 抽象クラスを継承した子クラスでは、必ずこの抽象メソッドをオーバーライドして
    // 実際の中身を定義しなければならない。そのため、必ず同じ名前を使うことになる。
}