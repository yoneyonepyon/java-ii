
public class EngineerTest {

	public static void main(String[] args) {
		Engineer[] ens = new Engineer[2];
		ens[0] = new Engineer("青木", 100000, 2, 12);
		ens[1] = new Engineer("中村", 200000, 20, 25);
		System.out.println("各技術者情報出力");
		System.out.println("---------------------------------");
		for (Engineer engineer : ens) {
			engineer.show();
		}
	}

}
