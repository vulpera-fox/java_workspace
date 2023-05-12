package quiz12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product r = new Radio();
		Product t = new Tv();
		Product c = new Computer();
		
		MyCart mc = new MyCart(2000);
		
		mc.buy(r);
		mc.buy(t);
		mc.buy(t);
		mc.buy(c);
		mc.buy(t);
		mc.buy(t);
		mc.buy(t);
		
	}

}
