
public class Main {
	public static void main(String[]args) {
		
		Monster m = new Slime();
		
		Wizard w = new Wizard();
		w.name = "メレブ";
		w.hp = 50;
		w.mp = 30;
		w.attack(m);
		w.fireball(m);
		
		Hero h = new Hero();
		h.name = "ヨシヒコ";
		h.attack(m);
		
		m.run();
	}

}
