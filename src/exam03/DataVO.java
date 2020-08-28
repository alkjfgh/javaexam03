package exam03;

@SuppressWarnings("unused")
public class DataVO {
	private String id; // private
	String pw; // default
	protected String name; // protected
	public String hobby; // public

	public DataVO() {
		super();
	}

	public DataVO(String id, String pw, String name, String hobby) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.hobby = hobby;
	}

	public DataVO(int i) {
		super();
		if (i == 0) {
			id = "0";
			pw = "0";
			name = "0";
			hobby = "0";
		}
	}

	public void setPw(String data) {
//		if(권한 체크) {
//		AOP를 이용해서 일괄적으로 권한을 체크하는 기술을 적용한다
//		모든 getter, setter 메소드에 자동으로 권한이 체크되도록 사용되는 관점에서 삽입한다 
		this.pw = data;
//		}
	}

	public String getPw() {
//		if(권한 체크) {
		return this.pw;
//		}else{
//			return null;
//		}
	}

	public void setId(String data) {
		this.id = data;
	}

	public void setName(String data) {
		this.name = data;
	}

	@Override
	public String toString() {
		return "DataVO [id=" + id + ", pw=" + pw + ", name=" + name + ", hobby=" + hobby + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataVO other = (DataVO) obj;
		if (hobby == null) {
			if (other.hobby != null)
				return false;
		} else if (!hobby.equals(other.hobby))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}

}

class DataVOtest {
}