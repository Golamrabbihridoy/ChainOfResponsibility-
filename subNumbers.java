package chainpattern;

public class subNumbers implements chain {
     private chain nextInChain;
	@Override
	public void setNextChain(chain nextChain) {
  	  this.nextInChain=nextChain;
    }
	public double calculate(Numbers request) {
		if(request.getcalculationWanted()=="sub") {
			
		//System.out.println(request.getNumber1()+" -"+request.getNumber2()+"="+(request.getNumber1()-request.getNumber2()));
			return request.getNumber1()-request.getNumber2();
		}
		else {
			return nextInChain.calculate(request);
		}
		
	}

}

