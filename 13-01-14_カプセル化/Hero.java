
public class Hero {
	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {

		if (name == null) {
			throw new IllegalArgumentException("名前がnullです、処理を中断します");
		}

		if (name.length() <= 1) {
			throw new IllegalArgumentException("名前が短すぎます、処理を中断します");
		}
		
		if (name.length() >= 8) {
			throw new IllegalArgumentException("名前が長すぎます、処理を中断します");
		}

		this.name = name;
	}
}
