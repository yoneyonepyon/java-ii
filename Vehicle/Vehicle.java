
public class Vehicle {

	int id; // 車両番号
	String name; // 車両名
	String manufacturerName; // メーカー名
	double fuels; // 燃費(km/L)

	public Vehicle(int id, String name, String manufacturerName, double fuels) {
		this.id = id;
		this.name = name;
		this.manufacturerName = manufacturerName;
		this.fuels = fuels;
	}

	public void show() {
		System.out.println("車両番号= " + id +
				", 車両名= " + name +
				", メーカー名= " + manufacturerName +
				", 燃費(km/L)= " + fuels);
	}

}
