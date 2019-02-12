
public class House2 {

	String name; // 住宅の所有者名
	Room room; // 住宅の部屋（1つの部屋）
	Room room2; // 住宅の部屋（追加★）

	public House2(String n, Room r, Room r2) {
		name = n;
		room = r;
		room2 = r2;
	}

	public void displayPrint() {
		System.out.println("住宅：name=" + name);
		System.out.println("	総面積 = " + this.getTotal());
		room.displayPrint();
		room2.displayPrint();
	}

	private int getTotal() {
		return room.getArea() + room2.getArea();
	}

	public static void main(String[] args) {
		Room room = new Room(20, 50);
		Room room2 = new Room(30, 60);

		House2 tanaka = new House2("田中", room, room2);
		// 下文で、住宅 tanaka の住宅情報を出力します。その中に、
		// 住宅 tanaka の「部屋の面積などの部屋情報」も出力します。
		tanaka.displayPrint();
	}

}
