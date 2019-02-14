/*
 * このプログラムは学習を目的としています 実在の人物および団体とは関係ありません
 */
public class Team {

	String name; // チーム名
	Player[] members; // 選手

	public static void main(String[] args) {
		Player[] players = new Player[] {
				new Player("稲葉　篤紀", 41, 40, 185, 94),
				new Player("中田 翔", 6, 24, 182, 95),
				new Player("大引　啓次", 7, 29, 178, 80),
				new Player("二岡 智宏", 23, 37, 180, 81),
				new Player("陽 岱鋼", 1, 26, 183, 87),
		};
		Team t1 = new Team("北海道日本ハムファイターズ", players);
		players = new Player[] {
				new Player("阿部　慎之助", 10, 34, 180, 97),
				new Player("Ｊ．ロペス", 5, 30, 183, 93),
				new Player("澤村　拓一", 15, 25, 183, 96),
				new Player("高橋　由伸", 24, 38, 180, 87),
		};
		Team t2 = new Team("読売巨人", players);
		System.out.println("[1]：チーム情報--------------------------------");
		t1.show();
		System.out.println("[2]：チーム情報--------------------------------");
		t2.show();
		System.out.println("[3]：２つのチームの選手の人数の比較--------------------------------");
		System.out.println(t1.name + " に所属する選手の人数は\n" +
				t2.name + " に所属する選手の人数と比べて、" +
				t1.compareMembers(t2));
		System.out.println("[4]：２つのチームの選手の平均年齢の比較--------------------------------");
		System.out.println(t1.name + " に所属する選手の平均年齢は\n" +
				t2.name + " に所属する選手の平均年齢と比べて、" +
				t1.compareAges(t2));
		System.out.println("[5]：２つのチームにおいて「指定された身長より高い選手の人数」の比較-----");
		System.out.println(t1.name + " に所属する選手の中で身長 182 より高い選手の人数は\n" +
				t2.name + " に所属する選手の中で身長 182 より高い選手の人数と比べて、" +
				t1.compareHeight(t2, 182));
		System.out.println("[6]：あるチームにおいて「指定された選手より高齢の選手の人数」を求める-----------");
		System.out.println(t1.name + " に所属する選手の中で\n" +
				t1.name + " の背番号 " +
				t2.members[0].uniformNumber + " の年齢より大きい（高齢）の選手の人数は " +
				t1.compareAges(t2.members[0]));
		System.out.println("[7]：２人の選手の年齢の比較--------------------------------");
		Player p1 = t1.members[0];
		Player p2 = t2.members[0];
		System.out.println(t1.name + " の背番号 " +
				p1.uniformNumber + " の年齢は\n" +
				t2.name + " の背番号 " +
				p2.uniformNumber + " の年齢と比べて、" +
				p1.compareAges(p2));
		System.out.println("[8]：２つのチームにおいて「指定された選手の体重よりも重い選手の人数」の比較-----------");
		p1 = t1.members[4];
		System.out.println(t1.name + " の背番号 " +
				p1.uniformNumber + " の体重より重い選手の人数をチームごとに調べると\n" +
				t1.name + " の人数は\n" +
				t2.name + " の人数と比べて、" +
				t1.compareWeights(t2, p1));
	}

	private String compareWeights(Team t, Player p) {
		int a = countWeighterThan(p);
		int b = t.countWeighterThan(p);

		if (a < b) {
			return "少ない";
		} else if (a == b) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	private int countWeighterThan(Player player) {
		int total = 0;
		for (Player member : members) {
			if (member.weight > player.weight)
				total++;
		}
		return total;
	}

	private int compareAges(Player player) {
		int total = 0;
		for (Player member : members) {
			if (member.age > player.age)
				total++;
		}
		return total;
	}

	private int countHigherThan(int h) {
		int total = 0;
		for (Player player : members) {
			if (player.higherThan(h))
				total++;
		}
		return total;
	}

	private String compareHeight(Team t, int h) {
		int a = countHigherThan(h);
		int b = t.countHigherThan(h);
		if (a < b) {
			return "少ない";
		} else if (a == b) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	private String compareAges(Team t) {
		double a = averageAge();
		double b = t.averageAge();
		if (a < b) {
			return "小さい（若い）";
		} else if (a == b) {
			return "等しい";
		} else {
			return "大きい（高齢）";
		}
	}

	private String compareMembers(Team t) {
		if (members.length < t.members.length) {
			return "少ない";
		} else if (members.length == t.members.length) {
			return "等しい";
		} else {
			return "多い";
		}
	}

	@Override
	public String toString() {
		return "チーム名=" + name +
				", 選手の人数=" + members.length +
				", 選手の平均年齢=" + averageAge();
	}

	private double averageAge() {
		int total = 0;
		for (Player player : members) {
			total += player.age;
		}
		return (double) total / members.length;
	}

	private void show() {
		System.out.println(this);
		for (Player player : members) {
			player.show();
		}
	}

	public Team(String name, Player[] members) {
		this.name = name;
		this.members = members;
	}

}
