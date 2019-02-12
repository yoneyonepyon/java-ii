
public class BlockArea {

	String name; // 名前 例：関東、関西、北海道
	Tower[] towers; // 本インスタンスに存在するタワー群

	public BlockArea(String n, Tower[] t) {
		name = n;
		towers = t;
	}

	public static void main(String[] args) {
		System.out.println("\nその４------------");
		Tower[] towers1 = new Tower[2];
		towers1[0] = new Tower("東京タワー", "東京都港区", 333, 1958);
		towers1[1] = new Tower("東京スカイツリー", "東京都墨田区", 634, 2012);
		BlockArea b11 = new BlockArea("関東", towers1);

		System.out.println("ブロック情報出力");
		System.out.println("---------------------------------");
		System.out.println("全タワーの高さの平均値：" +
				b11.getAverageHeight());
		b11.show();
		System.out.println("---------------------------------");
		Tower[] towers2 = new Tower[3];
		towers2[0] = new Tower("通天閣", "大阪市浪速区", 103, 1956);
		towers2[1] = new Tower("京都タワー", "京都市下京区", 131, 1964);
		towers2[2] = new Tower("神戸ポートタワー", "神戸市中央区", 108, 1963);
		BlockArea b2 = new BlockArea("関西", towers2);
		System.out.println("ブロック情報出力");
		System.out.println("---------------------------------");
		System.out.println("全タワーの高さの平均値：" +
				b2.getAverageHeight());
		b2.show();
		System.out.println("--２つのタワーの比較--------");
		System.out.println("東京タワーの高さは京都タワーの高さと比べ、" + towers1[0].compareHeight(towers2[1]));
		System.out.println("東京スカイツリーの竣工年は神戸ポートタワーの竣工年と比べ、" + towers1[1].compareCompletion(towers2[2]));
	}

	// 高さの平均値の取得
	double getAverageHeight() {
		int total = 0;
		for (Tower tower : towers) {
			total += tower.height;
		}
		return (double) total / towers.length;
	}

	public String toString() {
		return "ブロック名=" + name +
				", タワーの個数=" + towers.length +
				", タワーの高さの平均値=" + getAverageHeight();
	}

	public void show() {
		System.out.println(this.toString());
		for (Tower tower : towers) {
			tower.show();
		}
	}
}
