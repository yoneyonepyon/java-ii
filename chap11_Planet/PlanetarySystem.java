
public class PlanetarySystem {

	String name;
	Planet[] planets; // 星

	public PlanetarySystem(String name, Planet[] planets) {
		this.name = name;
		this.planets = planets;
	}

	public static void main(String[] args) {
		Planet[] p1 = new Planet[] {
				new Planet("水星", 4878),
				new Planet("金星", 12104),
				new Planet("地球", 12756),
				new Planet("火星", 6794),
				new Planet("木星", 142984),
				new Planet("土星", 120536),
				new Planet("天王星", 51118),
				new Planet("海王星", 49528),
				new Planet("冥王星", 2320),
		};
		PlanetarySystem ps1 = new PlanetarySystem("太陽系", p1);

		System.out.println(ps1.name + "のテスト------------");
		System.out.println(ps1.name + "に存在する全惑星の直径の平均値：" +
				ps1.averageDiameters());
		System.out.println("---------------------------------");
		ps1.show();
		Planet[] p2 = new Planet[] {
				new Planet("アンドロメダ１星", 1234567),
				new Planet("アンドロメダ２星", 8901234),
				new Planet("アンドロメダ３星", 5678901),
		};
		PlanetarySystem ps2 = new PlanetarySystem("アンドロメダ座ウプシロン星－惑星系", p2);
		System.out.println(ps2.name + "のテスト------------");
		System.out.println(ps2.name + "に存在する全惑星の直径の平均値：" +
				ps2.averageDiameters());
		System.out.println("---------------------------------");
		ps2.show();
		System.out.println("---------------------------------");
		// 地球の直径はアンドロメダ３星の直径と比べ、小さい
		System.out.println(p1[2].name + "の直径は" +
				p2[2].name + "の直径と比べ、" +
				p1[2].compareDiameter(p2[2]));
		System.out.println("---------------------------------");
		System.out.println(ps1.name + "の全惑星の平均直径は" +
				ps2.name + "の全惑星の平均直径と比べ、" +
				ps1.compareDiameter(ps2));
	}

	private String compareDiameter(PlanetarySystem ps2) {
		double ps1Diameter = averageDiameters();
		double ps2Diameter = ps2.averageDiameters();
		if (ps1Diameter < ps2Diameter) {
			return "小さい";
		} else if (ps1Diameter == ps2Diameter) {
			return "等しい";
		} else {
			return "大きい";
		}

	}

	private double averageDiameters() {
		int total = 0;
		for (Planet planet : planets) {
			total += planet.diameter;
		}
		return (double) total / planets.length;
	}

	private void show() {
		System.out.println("惑星系名=" + name +
				", 惑星の個数=" + planets.length +
				", 惑星の直径の平均値=" + averageDiameters());
		System.out.println("内訳");
		for (int i = 0; i < planets.length; i++) {
			Planet planet = planets[i];
			planet.show(i + 1);
		}
	}

}
