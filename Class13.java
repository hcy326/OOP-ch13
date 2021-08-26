import java.util.Scanner;
class Exception520 extends Exception  // 定義自己的例外類別
{
}

public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			System.out.print("請輸入字串: ");
			String a=sc.nextLine();
			if (a.equals("520")) {
				throw new Exception520();
			}
			else {
				System.out.println("str ="+a);
			}
		}
		catch(Exception520 e) {
			System.out.println("這是由字串520所引起的例外");
		}
	}

}
