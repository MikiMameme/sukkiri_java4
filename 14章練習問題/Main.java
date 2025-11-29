public class Main {
    public static void main(String[] args) {

        Account a1 = new Account();
        a1.accountNumber = " 12345 ";
        a1.balance = 5000;

        Account a2 = new Account();
        a2.accountNumber = "12345"; // 空白なし
        a2.balance = 9999;

        Account a3 = new Account();
        a3.accountNumber = "67890";
        a3.balance = 8000;

        System.out.println("=== toString()の動作確認 ===");
        System.out.println(a1); 
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n=== equals()の比較 ===");
        System.out.println("a1 と a2 は同じ口座？ → " + a1.equals(a2)); // true
        System.out.println("a1 と a3 は同じ口座？ → " + a1.equals(a3)); // false
        System.out.println("a2 と a3 は同じ口座？ → " + a2.equals(a3)); // false

    }
}
