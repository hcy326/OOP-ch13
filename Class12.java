class NotTriangle extends Exception  // 定義自己的例外類別
{
}
class EquilateralTriangle extends Exception  // 定義自己的例外類別
{
}
class NotEquilateralTriangle extends Exception  // 定義自己的例外類別
{
}
class Triangle{
	
	public void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle {
		if ((a+b)<c || (a+c)<b ||(b+c)<a ) {
			System.out.println("不構成三角形");
		}
		else if ((a==b) && (a==c) && (b==c) ) {
			System.out.println("這是正三角形");
		}
		else {
			System.out.println("這不是正三角形");
		}
	}
}
public class Class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri=new Triangle();
		int a=3;
		int b=3;
		int c=3;
		try {
			System.out.println("a="+a+" b="+b+" c="+c);	
			tri.triangle(3, 3, 3);
		}
		catch(NotTriangle e){
			System.out.println(e+" throwed");	
		}
		catch(EquilateralTriangle e){
			System.out.println(e+" throwed");	
		}
		catch(NotEquilateralTriangle e){
			System.out.println(e+" throwed");	
		}
	}

}
