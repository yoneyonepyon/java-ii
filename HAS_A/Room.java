
public class Room {

	int yoko; // 部屋の横の長さ
	int tate; // 部屋の縦の長さ

	public Room(int i, int j) {
		yoko = i;
		tate = j;
	}

	public void displayPrint() {
		System.out.println("横=" + yoko + ", 縦=" + tate + ", 面積=" + this.getArea());
	}

	public int getArea() {
		return yoko * tate;
	}

	public static void main(String[] args) {
		Room room = new Room(20, 50);
		room.displayPrint();
	}

}
