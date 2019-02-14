/*
 * このプログラムは学習を目的としています 実在の人物および団体とは関係ありません
 */
public class Group {

	String name; // グループ名
	Member[] members; // メンバー

	public static void main(String[] args) {
		Member[] m1 = new Member[] {
				new Member("高橋　みなみ", 22),
				new Member("松井　珠里奈", 16),
				new Member("大島　優子", 24)
		};
		Group g1 = new Group("AKB48", m1);
		System.out.println("AKB48グループのテスト------------");
		g1.show();
		System.out.println("SKE48グループのテスト------------");
		Member[] m2 = new Member[] {
				new Member("須田 亜香里", 22),
				new Member("松井 玲奈", 16),
				m1[1],
				m1[0] // 複数用テスト
		};
		Group g2 = new Group("SKE48", m2);
		g2.show();
		System.out.println("---------------------------------");
		System.out.println(g1.name + "の[1] と " + g2.name + " の[2]は 同一人物か？" +
				g1.members[1].equals(g2.members[2]));
		System.out.println(g1.name + "の[2] と " + g2.name + " の[2]は 同一人物か？" +
				g1.members[2].equals(g2.members[2]));
		System.out.println("---------------------------------");
		Member m3 = g1.getSameMember(g2);
		System.out.println(m3);
		System.out.println("---------------------------------");
		Member[] m4 = g1.getSameMembers(g2);
		for (Member member : m4) {
			System.out.println(member);
		}

	}

	private Member getSameMember(Group g) {
		System.out.println(name + " と " + g.name + "の両方に所属しているメンバー一覧");
		Member m = null;
		for (Member m1 : members) {
			for (Member m2 : g.members) {
				if (m1.areSame(m2))
					m = m1;
			}
		}
		return m;
	}

	private Member[] getSameMembers(Group g) {
		System.out.println(name + " と " + g.name + "の両方に所属しているメンバー一覧");
		int len = 0;
		for (Member m1 : members) {
			for (Member m2 : g.members) {
				if (m1.areSame(m2))
					len++;
			}
		}
		Member[] m = new Member[len];
		int i = 0;
		for (Member m1 : members) {
			for (Member m2 : g.members) {
				if (m1.areSame(m2))
					m[i++] = m1;
			}
		}
		return m;
	}

	private void show() {
		System.out.println(this);
		System.out.println("内訳");
		for (int i = 0; i < members.length; i++) {
			Member member = members[i];
			System.out.println((i + 1) + ". " + member);
		}
	}

	@Override
	public String toString() {
		return "グループ名=" + name +
				", 所属人数=" + members.length +
				", 平均年齢=" + averageAges();
	}

	private double averageAges() {
		int total = 0;
		for (Member member : members) {
			total += member.age;
		}
		return (double) total / members.length;
	}

	public Group(String name, Member[] members) {
		super();
		this.name = name;
		this.members = members;
	}

}
