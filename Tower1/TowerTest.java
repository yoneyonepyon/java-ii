
public class TowerTest {

	public static void main(String[] args) {
		Tower[] tws = new Tower[2];
		tws[0] = new Tower("東京タワー", "東京都港区", 333, 1958);
		tws[1] = new Tower("東京スカイツリー", "東京都墨田区", 634, 2012);
		System.out.println("各タワー情報出力");
		System.out.println("---------------------------------");
		for (Tower tower : tws) {
			tower.show();
		}
		System.out.println("---------------------------------");
		System.out.println("全タワーの個数：" + tws.length);
	}

}
