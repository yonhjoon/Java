package singleton;

public class Company {

	private static Company instance = new Company(); // 유일하게 생성한 인스턴스(매게변수)
	private Company() {}
	
	public static Company getInstance() { // 인스턴스를 외부에서 참조할 수 있도록 public get() 메서드 구현
		if(instance == null) {
			instance = new Company();
		}
		return instance; // 유일하게 생성한 인스턴스 반환
	}
}
