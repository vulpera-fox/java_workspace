package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel h = new Hotel();
		
		Chef c = h.getChef();
		
		
		
		Chef chef = new Chef();
		h.setChef(chef);
		c.cooking();

	}

}
