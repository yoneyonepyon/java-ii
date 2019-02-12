
public class House {

	String name; // 住宅の所有者名
	Room room; // 住宅の部屋（1つの部屋）

	public House(String n, Room r) {
		name = n;
		room = r;
	}

	public void displayPrint() {
		System.out.println("住宅：name=" + name);
		room.displayPrint();
	}

	public static void main(String[] args) {
		Room room = new Room(20, 50);

		House tanaka = new House("田中", room);
		// 下文で、住宅 tanaka の住宅情報を出力します。その中に、
		// 住宅 tanaka の「部屋の面積などの部屋情報」も出力します。
		tanaka.displayPrint();
	}

}
