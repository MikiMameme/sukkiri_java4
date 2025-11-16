//テキストブロックを用いた複数行の文字列
public class Main {
	public static void main(String[]args) {
		String prof1="名前：東北ずん子\n	（とうほくずんこ）";
		String prof2="""
				名前：東北イタコ
					（とうほくいたこ）
				""";
		System.out.println(prof1);
		System.out.println(prof2);
	}

}
