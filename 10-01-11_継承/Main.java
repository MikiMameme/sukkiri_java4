//創造主クラス「Main」
//テキストの記述だけでは全体が動作しないのクラスの記述を必要に応じて加えてそれっぽい動作をするようにした
public class Main {
	public static void main(String[]args) {
		
		Hero h = new Hero();
		Matango m = new Matango();
		System.out.println(m.name + "があらわれた！");
		m.attack(h);
		
		
		System.out.println(h.name + "「オバケだ、逃げろー！」");
		h.slip();
		h.run();
		
		SuperHero sh = new SuperHero();
		System.out.println(sh.name + "「スーパーヒーロ参上！」");
		sh.fly();
		sh.attack(m);
		
		if (m.hp <= 0) {
			System.out.println(m.name + "を倒した！");
		}
		
		sh.land();
		sh.run();
	}

}
