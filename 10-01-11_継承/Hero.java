//勇者クラス「Hero」
//テキストの記述だけでは全体が動作しないのクラスの記述を必要に応じて加えてそれっぽい動作をするようにした
public class Hero {
	String name = "ヨシヒコ";
	int hp = 100;
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		m.hp -= 5;
		System.out.println("５ポイントのダメージを与えた！");
	}
	
	public void attacksh(Matango m) {
		System.out.println("スーパー" + this.name + "の攻撃！");
		m.hp -= 25;
		System.out.println("25ポイントのダメージを与えた！");
	}
	
	public final void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は転んだ！");
		System.out.println("５のダメージ");
	}
	
	public void run() {
		System.out.println(this.name + "は逃げ出した！");
	}

}
