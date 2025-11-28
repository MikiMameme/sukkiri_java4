//魔法使いクラス「Wizard」
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public void heal(Hero h) {
        int basePoint = 10;
        int recoverPoint = (int)(basePoint * this.wand.getPower());
        h.setHp(h.getHp() + recoverPoint);
        System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
    }

    public int getHp() { return hp; }
    public void setHp(int hp) { this.hp = Math.max(0, hp); }

    public int getMp() { return mp; }
    public void setMp(int mp) {
        if(mp < 0) throw new IllegalArgumentException("設定されようとしているMPが異常です");
        this.mp = mp;
    }

    public String getName() { return name; }
    public void setName(String name) {
        if(name == null || name.length() < 3)
            throw new IllegalArgumentException("魔法使いに設定されようとしている名前が異常です");
        this.name = name;
    }

    public Wand getWand() { return wand; }
    public void setWand(Wand wand) {
        if(wand == null) throw new IllegalArgumentException("設定されようとしている杖がnullです");
        this.wand = wand;
    }
}
