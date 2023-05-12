package day08.encap.obj;

public class Hotel {

	private Chef chef;
	
	public Hotel(){
		this.chef = new Chef(); 
	}
	//chef 의 getter setter
	// 객체를 매개변수로 받는 모
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {

		
		
		return chef;
	}
}
