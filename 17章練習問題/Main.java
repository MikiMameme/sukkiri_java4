//１７章練習問題
//try-catch文を用いて例外発生に備えよ
public class Main {
	public static void main(String[]args) {
		try {
			String s =null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("--スタックトレース（ここから）--");
			e.printStackTrace();
			System.out.println("--スタックトレース（ここまで）--");
		}
	}
}
