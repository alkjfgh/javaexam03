package exam03;

@SuppressWarnings("unused")
public class DataVO {
	private String id; 		//private
	String pw; 				//default
	protected String name;	//protected
	public String hobby;	//public
	public void setPw(String data) {
		this.pw = data;
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