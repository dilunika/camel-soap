package org.jkd.camel.example.registar;



public class Student {

	private String registrationNumber;
	
	private String name;
	
	private String dob;
	
	private String nic;

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getNic() {
		return nic;
	}

	public void setNic(String nic) {
		this.nic = nic;
	}

	@Override
	public String toString() {
		return "Student [registrationNumber=" + registrationNumber + ", name="
				+ name + ", dob=" + dob + ", nic=" + nic + "]";
	}
	
	
	
}
