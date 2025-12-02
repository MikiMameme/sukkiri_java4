import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;
}

public class Main{
	public static void main(String[]args) {
		Hero h = new Hero();
		h.name = "ヨシヒコ";
		List<Hero> list = new ArrayList<Hero>();
		list.add(h);
		h.name = "ダンジョー";
		System.out.println(list.get(0).name);
	}
}
