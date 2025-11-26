//テキストでは動かした例がないため、ChatGPTにこの定義を動かすMain例を出力してもらった

// 衣類クラスの簡単定義
class Shirt {
    String name;
    public Shirt(String name) { this.name = name; }
}

class Towl {
    String name;
    public Towl(String name) { this.name = name; }
}

class Coat {
    String name;
    public Coat(String name) { this.name = name; }
}

// Mainクラス
public class Main {
    public static void main(String[] args) {
        // クリーニング店を作る
        KyotoCleaningShop shop = new KyotoCleaningShop();
        shop.ownerName = "山田太郎";
        shop.adress = "京都市";
        shop.phone = "075-123-4567";

        // 衣類を作る
        Shirt s = new Shirt("ワイシャツ");
        Towl t = new Towl("バスタオル");
        Coat c = new Coat("コート");

        // 洗濯して返ってきたものを受け取る
        Shirt washedShirt = shop.washShirt(s);
        Towl washedTowl = shop.washTowl(t);
        Coat washedCoat = shop.washCoat(c);

        // 洗ったものを表示
        System.out.println("洗濯完了: " + washedShirt.name);
        System.out.println("洗濯完了: " + washedTowl.name);
        System.out.println("洗濯完了: " + washedCoat.name);
    }
}
