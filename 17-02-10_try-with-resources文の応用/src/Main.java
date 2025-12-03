import java.io.FileWriter;

public class Main {
public static void main(String[]args){
	try (FileWriter fw = new FileWriter("data.txt");){
		fw.write("Hello!");
	}catch (Exception e) {
		System.out.println("何らかの例外が発生しました");
	}
}
}
