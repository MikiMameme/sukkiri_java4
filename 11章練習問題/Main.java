//テキストでは定義のみで動かないのでMainを作り、それっぽく動くようにした
public class Main {
    public static void main(String[] args) {
        Book book = new Book(
            "スッキリわかるJava入門 第４版", 
            3200, 
            "white", 
            "978-4-295-01793-6"
        );

        Computer mac = new Computer(
            "MacBook Pro 2018 15インチ", 
            33000, 
            "silver", 
            "Apple"
        );

        System.out.println(book.getName() + " / ISBN: " + book.getIsbn());
        System.out.println(mac.getName() + " / Maker: " + mac.getMakerName());
    }
}