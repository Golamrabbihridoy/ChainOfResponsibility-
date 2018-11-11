package chainpattern;

import static org.junit.jupiter.api.Assertions.*;

class Test {

	@org.junit.jupiter.api.Test
		   void Test() {
		    	chain chaincalc1=new AddNumbers();
		   		chain chaincalc2=new subNumbers();
		   		chain chaincalc3=new multyNumbers();
		   		chain chaincalc4=new divNumbers();
		   		
		   		chaincalc1.setNextChain(chaincalc1);
		   		chaincalc2.setNextChain(chaincalc2);
		   		chaincalc3.setNextChain(chaincalc3);
		   		assertEquals("5.0",chaincalc1.calculate(new Numbers(3.0,2.0,"add")));
		   		assertEquals("2.0",chaincalc1.calculate(new Numbers(4.0,2.0,"sub")));
		   		assertEquals("8.0",chaincalc1.calculate(new Numbers(4.0,2.0,"mult")));
		   		assertEquals("3.0",chaincalc1.calculate(new Numbers(6.0,2.0,"div")));
		       }
		
	}


