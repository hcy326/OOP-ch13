package Class12a;
class NotTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class EquilateralTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class NotEquilateralTriangle extends Exception  // �w�q�ۤv���ҥ~���O
{
}

public class Class12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		int b=3;
		int c=3;
		try {
			System.out.println("a="+a+" b="+b+" c="+c);	
			triangle(3, 3, 3);
		}
		catch(NotTriangle e){
			System.out.println("���c���T����");	
		}
		catch(EquilateralTriangle e){
			System.out.println("�o�O���T����");	
		}
		catch(NotEquilateralTriangle e){
			System.out.println("�o���O���T����");	
		}
	}
	public static void triangle(int a,int b,int c) throws NotTriangle,EquilateralTriangle,NotEquilateralTriangle {
		if ((a+b)<c || (a+c)<b ||(b+c)<a ) {
			throw new NotTriangle();
		}
		else if ((a==b) && (a==c) && (b==c) ) {
			throw new EquilateralTriangle();
		}
		else {
			throw new NotEquilateralTriangle();
		}
	}
}
