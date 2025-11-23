//第８章練習問題
//聖職者クラス「Cleric」を作成、「selfAid（セルフエイド）」という回復魔法を使いMPを5消費し自身のHPを全回復するメソッドを追加。
//聖職者クラスは「pray（祈る）」で自身のMPを回復する、回復量は祈った秒数＋ランダムで０〜２ポイントの追加補正があるが
//最大MPを超えて回復してはならない。

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		
		//理論上の回復量を乱数を用いて決定
		int recover = new Random().nextInt(3) + sec;
		
		//回復量を計算
		int recoverActual = Math.min(this.MAX_MP - this.mp,recover) ;
		
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
		
	}

}
