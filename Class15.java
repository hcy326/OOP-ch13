import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ArugmentOutOfBound extends Exception{
	
}

public class Class15 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader buf;
		String str;
		buf= new BufferedReader(new InputStreamReader (System.in));
		System.out.print("�п�J�j��0���Ʀr:");
		str=buf.readLine();
		int n=Integer.parseInt(str);
		mySqrt(n);
	}
	public static void mySqrt(int n) {
		try {
			if (n<0){
				throw new ArugmentOutOfBound();
			}
			else{
				System.out.println("Sqrt("+n+")="+Math.sqrt(n));
			}
		}
		catch(ArugmentOutOfBound e) {
			System.out.println(n+"�p��0");
		}
	}
}	

