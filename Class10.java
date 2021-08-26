
class RadiusNegative extends Exception  // 定義自己的例外類別
{
}
class RadiusTooLarge extends Exception  // 定義自己的例外類別
{
}
class CCircle        // 定義類別CCircle
{
   private double radius;
   public void setRadius(double r) throws RadiusNegative,RadiusTooLarge
   {
      if(r<0)
      {
         throw new RadiusNegative();       // 拋出例外
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
	      catch(RadiusNegative e)    // 捕捉由setRadius()拋出的例外
	      {
	         System.out.println(e+" throwed");
	      }
	      catch(RadiusTooLarge e)    // 捕捉由setRadius()拋出的例外
	      {
	         System.out.println(e+" throwed");
	      }
	      cir.show();
	}

}
