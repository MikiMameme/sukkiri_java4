//創造主クラス「Main」
//テキストにはこれがないため動作しないので、それっぽい動きをするようにMainを作成した
public class Main {
    public static void main(String[] args) {

        Hero h = new Hero();
        h.setName("ヨシヒコ");
        h.setHp(50);

        Wand wand = new Wand();
        wand.setName("光の杖");
        wand.setPower(1.5); 

        Wizard w = new Wizard();
        w.setName("メレブ");
        w.setWand(wand);

        System.out.println(h.getName() + "の現在HP: " + h.getHp());

        w.heal(h);

        System.out.println(h.getName() + "の現在HP: " + h.getHp());
    }
}
