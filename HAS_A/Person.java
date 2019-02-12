
public class Person {

	String name; // 名前、苗字を除きます。
	int age; // 年齢

	public Person(String n, int a) {
		name = n;
		age = a;
	}

	public void displayPrint() {
		System.out.println("家族：name=" + name + ", age=" + age);
	}

}
