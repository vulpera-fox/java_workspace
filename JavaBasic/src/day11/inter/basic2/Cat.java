package day11.inter.basic2;

public class Cat extends Animal implements IPet{

	public void eat() {
		System.out.println("고양이는 생선을 머거");
	}
	
	public void play() {
		System.out.println("고양이는 쥐를 잡아");
	}
	
}
