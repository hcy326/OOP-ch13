import java.util.Scanner;
class Exception520 extends Exception  // �w�q�ۤv���ҥ~���O
{
}

public class Class13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		try {
			System.out.print("�п�J�r��: ");
			String a=sc.nextLine();
			if (a.equals("520")) {
				throw new Exception520();
			}
			else {
				System.out.println("str ="+a);
			}
		}
		catch(Exception520 e) {
			System.out.println("�o�O�Ѧr��520�Ҥް_���ҥ~");
		}
	}

}
