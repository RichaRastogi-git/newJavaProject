package com.coforge.githubJavaEx.beanClass;

public class Employee {
	private int empid;
	private String empname;
	private long phoneno;
	private String empemail;
	public Employee() {
	}
	public Employee(int empid, String empname, long phoneno, String empemail) {
		this.empid = empid;
		this.empname = empname;
		this.phoneno = phoneno;
		this.empemail = empemail;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmpemail() {
		return empemail;
	}
	public void setEmpemail(String empemail) {
		this.empemail = empemail;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empemail == null) ? 0 : empemail.hashCode());
		result = prime * result + empid;
		result = prime * result + ((empname == null) ? 0 : empname.hashCode());
		result = prime * result + (int) (phoneno ^ (phoneno >>> 32));
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
		Employee other = (Employee) obj;
		if (empemail == null) {
			if (other.empemail != null)
				return false;
		} else if (!empemail.equals(other.empemail))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (phoneno != other.phoneno)
			return false;
		return true;
	}
	
	
	

}
