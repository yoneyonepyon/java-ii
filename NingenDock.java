
public class NingenDock {

	String name; // 名前
	int height; // 身長（cm）
	int weight; // 体重（kg）
	double bmi; // BMI（Body Mass Index）
	String bmi_message; // BMIの判定区分：「やせ」、「ふつう」、「肥満」

	NingenDock(String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
		calc_Bmi();
		calc_Bmi_message();
	}

	// 体重（kg）÷(身長(m）* 身長(m）)
	public void calc_Bmi() {
		double h = height * 0.01;
		bmi = weight / (h * h);
	}

	// 18.5未満 やせ
	// 18.5以上 25.0未満 ふつう
	// 25.0以上 肥満
	public void calc_Bmi_message() {
		if (bmi < 18.5) {
			bmi_message = "やせ";
		} else if (bmi >= 18.5 && bmi < 25.0) {
			bmi_message = "ふつう";
		} else {
			bmi_message = "肥満";
		}
	}

	public void show() {
		System.out.println("名前：" + name);
		System.out.println("身長：" + height);
		System.out.println("体重：" + weight);
		System.out.println("BMI：" + bmi);
		System.out.println("BMI評価：" + bmi_message);
	}

	public static void main(String[] args) {
		NingenDock p1 = new NingenDock("今西", 163, 52);
		p1.show();
		System.out.println("----------");
		NingenDock p2 = new NingenDock("浜島", 152, 41);
		p2.show();
		System.out.println("----------");
		NingenDock p3 = new NingenDock("早川", 164, 70);
		p3.show();
	}

}
