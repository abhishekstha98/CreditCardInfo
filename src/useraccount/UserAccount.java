package useraccount;

public class UserAccount {
	public String user_names;
	public String user_email;
	public String password;
	public String birthdate;
	public String cc_no;
	public String zip_code;
	/*
	 * 
	 */
	public String getUser_names() {
		return user_names;
	}
	public void setUser_names(String user_names) {
		
		this.user_names = user_names;
		System.out.println(this.user_names);
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {		
		this.user_email = user_email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getCc_no() {
		return cc_no;
	}
	public void setCc_no(String cc_no) {
		this.cc_no = cc_no;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
}
