// テキスト(上)P251を一部変更
// 科目クラス：試験科目の科目名と点数を格納
public class Kamoku {
	String namae; // 科目名
	int tensuu; // 点数

	// コンストラクタ
	public Kamoku(String namae, int tensuu) {
		this.namae = namae;
		this.tensuu = tensuu;
	}

	// 自インスタンスの科目情報（科目名、点数）を出力します
	void displayPrint() {
		System.out.println("科目：namae=" + namae + ", tensuu=" + tensuu);
	}

	public static void main(String[] args) {
		Kamoku kokugo = new Kamoku("国語", 63);
		kokugo.displayPrint();
	}
}
/*
 * 科目：namae=国語, tensuu=63
 */
