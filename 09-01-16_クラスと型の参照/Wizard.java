//魔法使いのクラス「Wizard」
public class Wizard {
	String name;
	int hp;
	
	public Wizard(String name) {
		this.hp = 50;
		this.name = name;
	}
		
	public void heal(Hero h) {
		h.hp += 10;
		//それっぽくなるように追加した
		System.out.println(this.name + "は魔法を唱えた！" + h.name + "のHPを10回復した");
	}

}
