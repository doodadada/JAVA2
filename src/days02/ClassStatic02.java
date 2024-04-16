package days02;

class Student {
	private int bunho;
	private String name;
	private int[] scores;
	private int total;
	private double avreage;

	static int cnt = 1;
	// 항상 클래스 관련 불변의 값을 갖고 필요할 때 불러쓸 값이 저장되기도 합니다.
	static final String academyname = "Himedia academy";

	public Student() {
		bunho = cnt;
		name = "아무개" + cnt;
		cnt++;
		scores = new int[3];
	}

}

public class ClassStatic02 {
	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();

		System.out.println("훈련기관명 : " + Student.academyname);
		System.out.println("현재 학생수 : " + (Student.cnt - 1));
		System.out.println("int형 자료의 가장 큰 값 : " + Integer.MAX_VALUE);
		System.out.println("int형 자료의 가장 작은 값 : " + Integer.MIN_VALUE);
	}
}
