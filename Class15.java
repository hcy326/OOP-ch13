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
		System.out.print("請輸入大於0的數字:");
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
			System.out.println(n+"小於0");
		}
	}
}	

