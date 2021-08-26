
import java.util.*;
class IntegerTooSmall extends Exception{
	
}
class IntegerTooLarge extends Exception{
	
}

public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Input Int:");
			int num=sc.nextInt();
			if (num<10)
				throw new IntegerTooSmall();
			else if (num>70) 
				throw new IntegerTooLarge();
			else
				System.out.println("num ="+num);
		}
		catch(IntegerTooSmall e) {
			System.out.println("您輸入的整數的值太小");
		}
		catch(IntegerTooLarge e) {
			System.out.println("您輸入的整數的值太大");
		}
		catch(InputMismatchException e){
			System.out.println("您輸入的不是整數");
		}
	}

}
