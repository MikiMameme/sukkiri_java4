//１６章練習問題
//mainメソッドのみ
//
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
		Hero h1 = new Hero("ヨシヒコ");
		Hero h2 = new Hero("ダンジョー");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for(Hero h : heroes) {
			System.out.println(h.getName());
		}
	}
}