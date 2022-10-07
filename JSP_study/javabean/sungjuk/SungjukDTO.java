package net.sungjuk;

public class SungjukDTO { // Data Transfer Object 전송객체
						  // Value Object
	
	// sungjuk 테이블의 칼럼명을 기준으로 field 멤버변수 선언
	private int sno;
	private String uname;
	private int kor;
	private int eng;
	private int mat;
	private int aver;
	private String addr;
	private String wdate;
	
	public SungjukDTO() {} // 기본생성자 default constructor
	 
	// getter, setter 함수
	public int getSno() {
		return sno;
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMat() {
		return mat;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int getAver() {
		return aver;
	}
	
	public void setAver(int aver) {
		this.aver = aver;
	}
	
	public String getAddr() {
		return addr;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getWdate() {
		return wdate;
	}
	
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "SungjukDTO [sno=" + sno + ", uname=" + uname + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat
				+ ", aver=" + aver + ", addr=" + addr + ", wdate=" + wdate + "]";
	}	

}//class end