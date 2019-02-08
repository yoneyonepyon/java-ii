
public class Calculate {

	int val; // 簡易計算機の表示部分の数値 単位 (円)

	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.setVal(10);
		c.dsp();
		c.add(20);
		c.dsp();
		c.sub(20);
		c.dsp();
		c.multi(20);
		c.dsp();
		c.div(20);
		c.dsp();
	}

	void setVal(int val) {
		this.val = val;
	}

	void dsp() {
		System.out.println("Calculate-ﾒｿｯﾄﾞ(dsp):" + val);
	}

	// 現在のフィールド val に 引数の値 a を足し算します。
	void add(int a) {
		val += a;
	}

	// 現在のフィールド val から 引数の値 a を引き算します。
	void sub(int a) {
		val -= a;
	}

	// 現在のフィールド val と 引数の値 a を掛け算します。
	void multi(int a) {
		val *= a;
	}

	// 現在のフィールド val と 引数の値 a を割り算します。
	void div(int a) {
		val /= a;
	}

}
