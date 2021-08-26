class Ctest{
	public static void test(int num,int den) throws ArithmeticException{
		int ans=num/den;
		System.out.println("ans = "+ans);
	}
}
public class Class08 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Ctest.test(12,0);
		}
		catch(ArithmeticException e) {
			System.out.println("°£¼Æ¬°0");
		}
		finally {
			System.out.println("end of main()!!");
		}
	}

}
