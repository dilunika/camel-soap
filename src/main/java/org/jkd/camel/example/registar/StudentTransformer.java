package org.jkd.camel.example.registar;

import java.util.Properties;

import org.apache.camel.Body;
import org.apache.camel.Handler;

public class StudentTransformer {

	@Handler
	public Student transform(@Body final Properties studentInfo){
		
		final Student student = new Student();
		student.setName(studentInfo.getProperty("name"));
		student.setDob(studentInfo.getProperty("dob"));
		student.setNic(studentInfo.getProperty("nic"));
		student.setRegistrationNumber(studentInfo.getProperty("registrationNumber"));
		
		return student;
	} 
}
