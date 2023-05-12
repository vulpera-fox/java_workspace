package quiz08;


public class MainClass {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(4000);
		
		mc.buy("tv");
		mc.buy("com");
		mc.buy("tv");
		mc.buy("com");
		mc.buy("radi");
		mc.buy("com");
		mc.buy("radio");
		mc.buy("com");
		mc.buy("radio");
		mc.buy("tv");
		mc.buy("radio");
	}

}
