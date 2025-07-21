package com.example.intface;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
@Endpoint(value = "com.example.SpringStudentInterfaces.implementations.SpringStudentInterfacesImpl")
public interface SpringIntefaces {
    @WebMethod
    Student getStudent(Student student);
}
