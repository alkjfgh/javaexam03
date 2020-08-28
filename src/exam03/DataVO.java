package exam03;

@SuppressWarnings("unused")
public class DataVO {
	private String id; 		//private
	String pw; 				//default
	protected String name;	//protected
	public String hobby;	//public
	public void setPw(String data) {
		//if(권한 체크) {
		//AOP를 이용해서 일괄적으로 권한을 체크하는 기술을 적용한다
		//모든 getter, setter 메소드에 자동으로 권한이 체크되도록 사용되는 관점에서 삽입한다 
			this.pw = data;
		//}
	}
	public String getPw() {
		//if(권한 체크) {
			return this.pw;
		//}else{
		//	return null;
		//}
	}
	public void setId(String data) {
		this.id = data;
	}
	public void setName(String data) {
		this.name = data;
	}
}

class DataVOtest{
}