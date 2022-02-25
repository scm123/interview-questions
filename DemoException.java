package custom_exception;

public class DemoException {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		int i=9;
		if(i>5)
			 throw new MyException("i is greater the 5");
		else        System.out.println("welcome ");   
 
	}

}
