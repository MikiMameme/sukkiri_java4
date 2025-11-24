//創造主のクラス「Main」
//テキストのコードを書き換えて他のクラスも動作するように改良した
public class Main {
	public static void main(String[]args) {
		
		//キャラクター
		Hero h1 = new Hero("ヨシヒコ");
		System.out.println(h1.name);
		System.out.println(h1.hp);

		//テキストの記述に習って追加した
		Hero h2 = new Hero("ダンジョー");
		System.out.println(h2.name);
		System.out.println(h2.hp);

		Wizard w = new Wizard("メレブ");
		System.out.println(w.name);
		System.out.println(w.hp);
		
		//武器
		Sword s =new Sword();
		s.name = "炎の剣";
		s.damege = 10;
		
		
		//テキストのコード
		//
		//Hero h1 = new Hero();
		//h1.name = "ヨシヒコ";
		//h1.hp = 100;
		//h1.sword = s;
		//
		//Hero h2 = new Hero();
		//h2.name = "ダンジョー";
		//h2.hp = 100;
		//
		//Wizard w = new Wizard();
		//w.name = "メレブ";
		//w.hp = 50;
		
		//テキストより
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
		//テキストの記述に習って追加した
		h1.attack();
		h2.attack();
	}
}
