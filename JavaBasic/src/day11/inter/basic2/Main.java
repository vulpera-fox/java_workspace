package day11.inter.basic2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] animals = {dog , cat , tiger};
		
		for ( Animal i : animals ) {
			i.eat();
		}

		// dog, cat은 인터페이스 타입으로 형변환이 된다.
		// dog, cat, goldfish를 저장하고, 반복문을 실
		IPet[] pets = new IPet[3];
		
		
		pets[0] = (Dog)dog;
		pets[1] = (Cat)cat;
		pets[2] = new GoldFish();
		
		for ( IPet i : pets ) {
			i.play();
		}
		
		PetHouse.carePet( pets[0] );
		PetHouse.carePet( pets[1] );
	}

}
