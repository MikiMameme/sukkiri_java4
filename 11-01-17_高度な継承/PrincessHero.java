//テキストの内容では動作しないため、それっぽく動くようにした
//Heroクラスまでは作っていないため、テキストの「public class PrincessHero implements Hero,Princess,Character」は使用していない
class PrincessHero extends Character {
    public void attack(Matango m) {
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に５ポイントのダメージ");
        m.hp -= 5;
    }
}