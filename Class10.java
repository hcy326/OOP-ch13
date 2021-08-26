
class RadiusNegative extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class RadiusTooLarge extends Exception  // �w�q�ۤv���ҥ~���O
{
}
class CCircle        // �w�q���OCCircle
{
   private double radius;
   public void setRadius(double r) throws RadiusNegative,RadiusTooLarge
   {
      if(r<0)
      {
         throw new RadiusNegative();       // �ߥX�ҥ~
      }
      else if(r>100) {
    	  throw new RadiusTooLarge();
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}


public class Class10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CCircle cir=new CCircle();
	      try
	      {
	         cir.setRadius(150);
	      }
	      catch(RadiusNegative e)    // ������setRadius()�ߥX���ҥ~
	      {
	         System.out.println(e+" throwed");
	      }
	      catch(RadiusTooLarge e)    // ������setRadius()�ߥX���ҥ~
	      {
	         System.out.println(e+" throwed");
	      }
	      cir.show();
	}

}
