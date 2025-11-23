//main（創造主のクラス）
public class Main {
	public static void main(String[]args) {
		//勇者を生成
		Cleric c = new Cleric();
		//フィールドに初期値をセット
		c.name = "プレイヤー";
		
		//冒険の始まりだ！
		c.selfAid();
		c.pray(10);
	}

}
