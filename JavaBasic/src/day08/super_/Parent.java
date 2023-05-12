package day08.super_;

public class Parent {
	
	String mother;
	String father;
	
	
	// 아무것도 없으면 기본적으로 생성됨
//	Parent(){
//		super();
//	}
	
	Parent(String mother, String father){
		this.mother = mother;
		this.father = father;
	}
	
	String info(){
		return "name:" + mother  + ", name:" + father;
	}

}
