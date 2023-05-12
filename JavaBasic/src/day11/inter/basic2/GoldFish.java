package day11.inter.basic2;

public class GoldFish extends Fish implements IPet {
	
	public void swim() {
		System.out.println("금붕어는 어항에서 헤엄쳐");
	}
	
	public void play() {
		System.out.println("금붕어는 혼자 놀아");
	}

}
