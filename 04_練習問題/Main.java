//第4章練習問題
//次のコードを実行すると例外が発生、それぞれの発生する例外の名前を答えよ
public class Main {
	public static void main(String[]args) {
		int[] counts = null;
		float[] heights = {171.3F,175.0F};
		
		//ぬるぽ(NullPointerException)
		//countsがnullなので参照できない。
		System.out.println(counts[1]);
		
		//ArrayIndexOutOfBoundsException
		//heightsは0と1の2要素。2を指定すると配列の範囲外になる
		System.out.println(heights[2]);
	}
}
