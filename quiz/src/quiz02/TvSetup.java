package quiz02;

public class TvSetup {
	
	public static void main(String[] args) {
		
		
		TV tv = new TV();
		System.out.println( tv.power ? "TV의 전원이 켜져 있습니다" : "TV의 전원이 꺼져 있습니다");
		tv.power();
		System.out.println( tv.power ? "TV의 전원이 켜져 있습니다" : "TV의 전원이 꺼져 있습니다");
		
		tv.changeChannel(32);
		tv.changeChannel(12);
		
	}

}
