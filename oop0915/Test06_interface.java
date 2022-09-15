package oop0915;


interface Creature {
	// void disp() {} -> 에러, 일반 메소드는 사용 불가
	abstract void kind();	// 추상 메소드만 가능하다
	void breathe();			// abstract 생략 가능
} // interface end


// 클래스 입장에서 부모가 클래스		: extends 확장
// 클래스 입장에서 부모가 인터페이스	: implements 구현
class Tiger implements Creature {

	@Override
	public void kind() {
		System.out.println("포유류");
	}

	@Override
	public void breathe() {
		System.out.println("허파");
	}
	
} // class end

class Salmon implements Creature {

	@Override
	public void kind() {
		System.out.println("어류");
	}

	@Override
	public void breathe() {
		System.out.println("아가미");
	}
	
} // class end

public class Test06_interface {

	public static void main(String[] args) {
		// 인터페이스 Interface
		/*
			- 추상 메소드로만 구성되어 있다
			- 추상 클래스보다 더 추상화 되어있다
			- 상속 : extends 확장, implements 구현
		 */
		
		// 에러. 인터페이스는 new를 사용할 수 없다
		// Creature creature = new Creature();
		
		// 인터페이스에서의 다형성
		Creature creature = null; 
		
		creature = new Tiger();
		creature.kind();
		creature.breathe();
		
		creature = new Salmon();
		creature.kind();
		creature.breathe();
				
	} // main() end
} // class end
