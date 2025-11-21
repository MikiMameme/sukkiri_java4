//引数を1つだけ渡す
public class Main {
	public static void main(String[]args) {
		System.out.println("メソッドを呼び出します");
		hello("イタコ");
		hello("ずん子");
		hello("きりたん");
		System.out.println("メソッドの呼び出しが終わりました");
	}
	public static void hello(String name) {
		System.out.println(name+"さん、こんにちは");
	}

}
