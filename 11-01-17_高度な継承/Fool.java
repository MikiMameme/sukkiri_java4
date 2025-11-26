//テキストままではそれっぽい動作が期待できないため、テキスト追加をした
class Fool extends Character implements Human {
    public void attack(Matango m) {
        System.out.println(this.name + "は戦わず遊んでいる！");
    }
    public void talk() { System.out.println(this.name + "は話した！"); }
    public void watch() { System.out.println(this.name + "は観察した！"); }
    public void hear() { System.out.println(this.name + "は聞いた！"); }
    @Override
    public void run() { System.out.println(this.name + "は逃げ回った！"); }
}