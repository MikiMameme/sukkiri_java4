//円周率に定数を利用する（エラー例）
public class Main {
	public static void main(String[]args) {

		final double PI=3.14; //finalで上書き防止

		int pie=5;

		System.out.println("半径"+pie+"cmのパイの面積は、");

		System.out.println("パイの半径を倍にします");

		PI=10; //コンパイルエラー、finalの変数は書き換えできない

		System.out.println("半径"+pie+"cmのパイの面積は、");

		System.out.println(pie*pie*PI);

	}
}
