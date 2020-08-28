package exam03;

public class testVO01 {
	public void test01() {
		DataVO vo = new DataVO();
		vo.setId("qwe");	//private이기 때문에 다른 클래스에서 직접 사용 불가
		vo.pw = "123";		//default
		vo.name = "유명재";	//protected
		vo.hobby = "음악";	//public
	}
}