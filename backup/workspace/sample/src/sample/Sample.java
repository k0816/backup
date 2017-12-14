package sample;

public class Sample {
    public static void main(String[] args) {
        MyClass mc = new MyClass("遊");
        System.out.println(mc.label);   // 「遊」と出力

        MyClass mc2 = new MyClass(1);
        System.out.println(mc2.label);  // 「1」と出力

        MyClass mc3 = new MyClass();
        System.out.println(mc3.label);  // 「名前」と出力
    }
}
