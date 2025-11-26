// テキストでは定義のみで動かないためMainクラスを作った
public class Main {
    public static void main(String[] args) {
        Matango m = new Matango();
        m.name = "おばけキノコ";

        Dancer d = new Dancer();
        d.name = "ダンサー";
        d.hp = 50;

        Fool f = new Fool();
        f.name = "バカ";
        
        PrincessHero p = new PrincessHero();
        p.name = "お姫様";
        d.hp = 50;

        System.out.println(m.name + "があらわれた！");
        d.attack(m);
        f.attack(m);
        p.attack(m);

        d.run();
        f.run();
        d.dance();
    }
}
