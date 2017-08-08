package practice13.common;

public class Employee extends Person{
	private String departmentNm;
	private int departmentCnt;
	
	public void setName(String departmentNm) {
		this.departmentNm = departmentNm;
	}
	public void setCount(int departmentCnt) {
		this.departmentCnt = departmentCnt;
	}
	
	public String getName() {
		return this.departmentNm;
	}
	public int getCount() {
		return this.departmentCnt;
	}

}
