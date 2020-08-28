package aaa;

import exam03.DataVO;

public class Test01 {
	public static void main(String[] arg) {
		DataVO vo = new DataVO("qwe","123",null,"음악");
		DataVO voNew = new DataVO();
		DataVO voNull = new DataVO(0);
		
//		vo.setId("qwe"); private이기 때문에 다른 패키지에서 직접 사용 불가
//		vo.setPw("123"); default이기 때문에 다른 패키지에서 직접 사용 불가
		vo.setName("유명재"); // protected이기 때문에 다른 패키지에서 직접 사용 불가
//		vo.hobby = "음악"; public
		
		voNew.setId("qwe");
		voNew.setPw("123");
		voNew.setName("유명재");
		voNew.hobby = "음악";
		
		System.out.println(vo.getPw());
		System.out.println(vo.hobby);
		
		System.out.println(vo);
		System.out.println(voNew);
		System.out.println(voNull);
		
		if (vo == voNew) {// 서로 다른 객체이기 때문에 false
			System.out.println("eqaul");
		}
		if (vo.equals(voNew)) {// 서로 다른 객체이지만 안의 데이터가 같기 때문에 true
			System.out.println("eqauls");
		}
	}
}
