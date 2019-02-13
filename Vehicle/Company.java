
public class Company {

	String name; // 支社名
	Vehicle[] vehicles; // 所有車両情報

	public static void main(String[] args) {
		System.out.println("[1]：会社情報--------------------------------");
		Vehicle[] v = new Vehicle[] {
				new Vehicle(1, "A", "T社", 21.4),
				new Vehicle(2, "B", "H社", 21.52),
				new Vehicle(3, "C", "T社", 20.63),
		};
		Company c1 = new Company("北海道支社", v);
		c1.show();
		System.out.println("[2]：会社情報--------------------------------");
		v = new Vehicle[] {
				new Vehicle(10, "D", "S社", 19.42),
				new Vehicle(11, "E", "N社", 18.58),
				new Vehicle(12, "F", "T社", 20.25),
		};
		Company c2 = new Company("東北支社", v);
		c2.show();
		System.out.println("[3]：２つの会社の車両台数の比較--------------------------------");
		System.out.println(c1.name + " の所有する車両台数は\n" +
				c2.name + " の所有する車両台数と比べて、" +
				c1.compareVehicles(c2));
		System.out.println("[4]：２つの会社の車両の平均燃費の比較--------------------------------");
		System.out.println(c1.name + " の所有する車両の平均燃費は\n" +
				c2.name + " の所有する車両の平均燃費と比べて、" +
				c1.compareFuels(c2));
		System.out.println("[5]：２つの会社において「指定されたメーカーの車両台数」の比較--------");
		System.out.println(c1.name + " T社 の車両台数は\n" +
				c2.name + " T社 の車両台数と比べて、" +
				c1.compareVehicles(c2, "T社"));
		System.out.println("[6]：ある会社において「指定された車両より良い燃費の車両台数」を求める----");
		System.out.println(c1.name + " の所有する車両の中で\n" +
				c2.name + "の車両番号" + c2.vehicles[0].id + " の燃費より大きい（良い）車両台数は " +
				c1.compareFuelByVehicle(c2.vehicles[0]) + " です。");
		System.out.println("[7]：２つの車両の燃費の比較--------------------------------");
		System.out.println(c1.name + " の車両番号 " + c1.vehicles[0].id + " の燃費は\n" +
				c2.name + " の車両番号 " + c2.vehicles[0].id + " の燃費と比べて、" +
				compareFuels(c1.vehicles[0], c2.vehicles[0]));

	}

	private static String compareFuels(Vehicle vehicle, Vehicle vehicle2) {
		if (vehicle.fuels < vehicle2.fuels) {
			return "小さい（悪い）";
		} else if (vehicle.fuels < vehicle2.fuels) {
			return "等しい";
		} else {
			return "大きい（良い）";
		}
	}

	private int compareFuelByVehicle(Vehicle otherVehicle) {
		int total = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.fuels > otherVehicle.fuels) {
				total++;
			}
		}
		return total;
	}

	private String compareVehicles(Company other, String mn) {
		Vehicle[] a = findVehiclesByManufacturerName(mn);
		Vehicle[] b = other.findVehiclesByManufacturerName(mn);

		if (a.length < b.length) {
			return "少ない";
		} else if (a.length == b.length) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	private Vehicle[] findVehiclesByManufacturerName(String manufacturerName) {
		int len = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.manufacturerName == manufacturerName) {
				len++;
			}
		}
		Vehicle[] found = new Vehicle[len];
		int j = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i].manufacturerName == manufacturerName) {
				found[j] = vehicles[i];
				j++;
			}
		}
		return found;
	}

	private String compareVehicles(Company other) {
		int a = vehicles.length;
		int b = other.vehicles.length;
		if (a < b) {
			return "少ない";
		} else if (a == b) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	private String compareFuels(Company other) {
		double a = averageFuels();
		double b = other.averageFuels();
		if (a < b) {
			return "小さい（悪い）";
		} else if (a == b) {
			return "等しい";
		} else {
			return "大きい（良い）";
		}
	}

	private void show() {
		System.out.println("会社名= " + name +
				", 所有車両台数= " + vehicles.length +
				", 所有車両の平均燃費= " + this.averageFuels());
		for (Vehicle vehicle : vehicles) {
			vehicle.show();
		}

	}

	private double averageFuels() {
		double total = 0;
		for (Vehicle vehicle : vehicles) {
			total += vehicle.fuels;
		}
		return total / vehicles.length;
	}

	public Company(String name, Vehicle[] vehicles) {
		super();
		this.name = name;
		this.vehicles = vehicles;
	}

}
