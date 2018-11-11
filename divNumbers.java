package chainpattern;

public class divNumbers implements chain {
     private chain nextInChain;
	@Override
	public void setNextChain(chain nextChain) {
  	  this.nextInChain=nextChain;
    }
	public double calculate(Numbers request) {
		if(request.getcalculationWanted()=="div") {
			
		//System.out.println(request.getNumber1()+" /"+request.getNumber2()+"="+(request.getNumber1()/request.getNumber2()));
		return request.getNumber1()/request.getNumber2();
		}
		else {
			System.out.println("only,add,sub,mult,div accepted");
			return 0;
		}
		
	}

}

