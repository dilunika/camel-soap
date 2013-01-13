package org.jkd.camel.example.registar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IStudentAdministrationService {

	@WebMethod
	Student provideStudentDetails(@WebParam(name="nic") String nic);
	
	@WebMethod
	void register(@WebParam(name="student") Student student) throws ServiceException;
}
