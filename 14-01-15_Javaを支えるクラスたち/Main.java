
public class Main {
	public static void main(String[]args) {
		Hero h1 = new Hero();
		h1.name = "ヨシヒコ";
		h1.hp = 100;
		h1.money = 100;
		Hero h2 = new Hero();
		h2.name = "ダンジョー";
		h2.hp = 100;
		h2.money = 100;
		System.out.println(h1.hp);
		System.out.println("パーティの所持金は" + Hero.money);
		
		//moneyはパーティ共有のものとして設定しているから...
		h1.money = 300;
		//以下の表示でも決しておかしいわけじゃない（ゲームではパーティの共有財産して扱っている）
		System.out.println(h1.name + "の所持金は" + h1.money);
		System.out.println(h2.name + "の所持金は" + h2.money);
		System.out.println("パーティの所持金は" + Hero.money);
	}

}
