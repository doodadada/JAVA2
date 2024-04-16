package days02;

class MemberCall {
	int iv = 10; // 인스턴스 변수
	static int sv = 20; // 스태틱 변수
	int iv2 = sv; // 스태틱변수로 인스턴스 변수 값을 초기화 O
	// static int sv2 = iv; //인스턴스변수로 스태틱 변수 값을 초기화 X

	void instanceMethod1() { // 인스턴스 메서드
		System.out.println(iv); // 인스턴스 메서드에서는 인스턴스 변수 사용 가능 O
		System.out.println(sv); // 인스턴스 메서드에서는 스태틱 변수 사용 가능 O
		//instanceMethod2(); // 인스턴스 메서드에서는 인스턴스 메서드 호출 O
		staticMethod2(); // 인스턴스 메서드에서는 스태틱 메서드 호출 O
	}

	static void staticMethod1() { // 스태틱 메서드
		System.out.println(sv); // 스태틱 메서드에서는 스태틱 변수 사용 가능 O
		// System.out.println(iv); //스태틱 메서드에서는 인스턴스 변수 사용 가능 X
		//instanceMethod2(); // 스태틱 메서드에서는 인스턴스 메서드 호출 X
		staticMethod2(); // 스태틱 메서드에서는 스태틱 메서드 호출 O
	}

	void instanceMethod2() {
	}

	static void staticMethod2() {
	}

}

public class ClassStatic03 {
	public static void main(String[] args) {

		// 스태틱 멤버는 객체 생성없이 바로 사용이 가능
		MemberCall.sv = 300;
		MemberCall.staticMethod1();

		// 인스턴스 메서드는 객체생성 후에 사용이 가능
		MemberCall mc = new MemberCall();
		mc.iv = 30;
		mc.instanceMethod1();
		
		//Integer.parseInt(null);
		//System.out.println(Math.random());
		//Math.sqrt(Math.random());
		//Math.abs(MemberCall.sv);
	}
}
