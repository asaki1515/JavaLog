package jp.techacademy.minegishi.asaki.javalog;

interface Thinkable {
    public void think();
    //このインタフェースを実装するクラスは、必ず宣言されたpublic void thinkメソッドを実装しなければいけない
    // interface で定義したメソッドは暗黙でpublic abstractになるので
    // オーバーライドしたメソッドは必ずpublicをつける
}
