package Inheritance;

public class Aaa { // == public class Aaa extends Object
	@SuppressWarnings("unused")
	public static void main (String[] agr) {
		int data01 = 20; // 4byte
		Ccc data02 = new Ccc();
		Object data03;
		long data04 = 30; // 8byte
		data04 = data01; // 큰 타입은 작은 타입의 데이터를 받을 수 있다
		// data04의 저장된 실제 자료의 타입은 int
		data03 = data02; // ''
		// data03은 Object 타입이지만 실제 자료의 타입은 Ccc
	}
}
