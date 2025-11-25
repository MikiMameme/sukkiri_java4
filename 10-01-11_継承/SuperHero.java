//スーパー勇者クラス「SuperHero」
//テキストの記述だけでは全体が動作しないのクラスの記述を必要に応じて加えてそれっぽい動作をするようにした
public class SuperHero extends Hero {
	String name = "スーパーヨシヒコ";
	
	public void attack(Matango m) {
		super.attacksh(m);
		if(this.flying) {
			super.attacksh(m);
		}
	}
	
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "は飛び上がった！");
	}
	
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は着地した！");
	}
	
	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}
