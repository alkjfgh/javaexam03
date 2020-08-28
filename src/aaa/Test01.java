package aaa;

import exam03.DataVO;

public class Test01{
	public void test01() {
		DataVO vo = new DataVO();
		vo.setId("qwe");	//private이기 때문에 다른 패키지에서 직접 사용 불가
		vo.setPw("123");	//default이기 때문에 다른 패키지에서 직접 사용 불가
		vo.setName("유명재");	//protected이기 때문에 다른 패키지에서 직접 사용 불가
		vo.hobby = "음악";	//public
	}
}
