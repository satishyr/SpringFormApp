package in.nit.beans;

import java.util.Date;

public class Student {

	private int sid;
	private String sname;
	private String saddr;
	private Course course;
	private Date dob;

	public Student(int sid, String sname, String saddr, Course course, Date dob) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddr = saddr;
		this.course = course;
		this.dob = dob;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", course=" + course + ", dob=" + dob
				+ "]";
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
