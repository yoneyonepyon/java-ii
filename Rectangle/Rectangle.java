
public class Rectangle {

	int height = 1; // ・幅 int 型 height
	int width = 1; // ・高さ int 型 width
	int x = 1; // ・x座表値 int型 x
	int y = 1; // ・y座表値 int型 y

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(); // の後、println(r1) を実行し、
		System.out.println(r1);
		r1.move(10);
		System.out.println(r1);
		System.out.println("----------");
		Rectangle r2 = new Rectangle(1, 2);
		System.out.println(r2);
		r2.move(6, 4);
		System.out.println(r2);
		System.out.println("----------");
		Rectangle r3 = new Rectangle(1, 2, 3, 4);
		System.out.println(r3);
		r3.move(6);
		System.out.println(r3);
		System.out.println("----------");
		System.out.println("r1とr2の面積は" + (r1.equals(r2) ? "同じ" : "異なる"));
		System.out.println("r2とr3の面積は" + (r2.equals(r3) ? "同じ" : "異なる"));
		System.out.println("----------");
	}

	public Rectangle() {
	}

	public Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Rectangle(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		width = w;
		height = h;
	}

	private double getArea() {
		return (double) (width * height);
	}

	private void move(int i) {
		x += i;
		y += i;
	}

	private void move(int i, int j) {
		x += i;
		y += j;
	}

	@Override
	public String toString() {
		return "(x座標=" + x +
				", y座標=" + y +
				", 幅=" + width +
				", 高さ=" + height +
				", 面積=" + getArea() + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) getArea();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		if (getArea() != other.getArea())
			return false;
		return true;
	}

}
