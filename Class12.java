class NotTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class EquilateralTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class NotEquilateralTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class Triangle{
	
	public void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle {
		if ((a+b)<c || (a+c)<b ||(b+c)<a ) {
			System.out.println("���c���T����");
		}
		else if ((a==b) && (a==c) && (b==c) ) {
			System.out.println("�o�O���T����");
		}
		else {
			System.out.println("�o���O���T����");
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
