package chainpattern;

public class Numbers {
      private double number1,number2;
      private  String calculationWanted;
      
      public Numbers(double n1,double n2,String calw) {
    	  this.number1=n1;
    	  this.number2=n2;
    	  this.calculationWanted=calw;
      }
      public double getNumber1() {
    	  return number1;
      }
      public double getNumber2() {
    	  return number2;
      }
      public String getcalculationWanted() {
    	  return calculationWanted;
      }
      
}
