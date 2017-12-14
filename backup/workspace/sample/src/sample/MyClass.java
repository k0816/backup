	package sample;

	public class MyClass {
	    // 公開フィールド（識別用名前）
	    public String label = "名前";

	    // コンストラクタ
	    public MyClass(String newLabel) {
	        label = newLabel;  // ラベルを設定
	    }

	    // コンストラクタ その2
	    public MyClass(int i) {
	        label = String.valueOf(i);  // 数値をラベルに
	    }

	    // コンストラクタ その3
	    public MyClass() {
	    }
	}