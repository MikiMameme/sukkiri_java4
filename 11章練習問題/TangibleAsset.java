//11章練習問題
//ある会社が資産管理プログラムを作ろうとしている、有形資産クラスを作り、その子クラスとして本とコンピュータのクラスを作成せよ
public abstract class TangibleAsset {
	String name;
	int price;
	String color;
	public TangibleAsset(String name,int price,String color) {
		this.name = name;
		this.price = price;
		this.color = color;
	}
	public String getName() {return this.name;}
	public int getPrice() {return this.price;}
	public String getcolor() {return this.color;}
}
