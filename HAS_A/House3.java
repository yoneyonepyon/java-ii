
public class House3 {

	String name; // 住宅の所有者名
	Room[] rooms; // 変更の部屋（★複数部屋）

	public House3(String n, Room[] r) {
		name = n;
		rooms = r;
	}

	public void displayPrint() {
		System.out.println("住宅：name=" + name);
		System.out.println("	総面積 = " + this.getTotal());
		for (Room room : rooms) {
			room.displayPrint();
		}
	}

	private int getTotal() {
		int total = 0;
		for (Room room : rooms) {
			total += room.getArea();
		}
		return total;
	}

	public static void main(String[] args) {
		Room[] rooms = new Room[2];
		rooms[0] = new Room(20, 50);
		rooms[1] = new Room(30, 60);
		House3 tanaka = new House3("田中", rooms);
		tanaka.displayPrint();
	}

}
