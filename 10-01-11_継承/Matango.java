//キノコおばけクラス「Matango」
//テキストの記述だけではこのクラスは存在せず、全体が動作しないのでこのクラス加えて動作するようにした
public class Matango {
	String name = "キノコおばけ";
	int hp = 50;

	public void attack(Hero h) {
		System.out.println(this.name + "の攻撃");
		System.out.println(h.name + "は１０ポイントのダメージを受けた");
		h.hp -= 10;
	}
	
}
