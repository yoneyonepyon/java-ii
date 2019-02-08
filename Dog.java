
public class Dog {

	String name;// 名前
	int weight;// 体重

	Dog(String n, int w) {
		name = n;
		weight = w;
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("ウメ", 20);
		d1.gainWeight(1);
		System.out.println(d1.name + "," + d1.weight);

		Dog d2 = new Dog("ぽち", 10);
		d2.reduceWeight(2);
		System.out.println(d2.name + "," + d2.weight);
	}

	// 引数で指定された体重が増えます。よって、体重が、 val 増えます。
	public void gainWeight(int val) {
		weight += val;
	}

	// 引数で指定された体重が減ります。よって、体重が、 val 減ります。
	public void reduceWeight(int val) {
		weight -= val;
	}

}
