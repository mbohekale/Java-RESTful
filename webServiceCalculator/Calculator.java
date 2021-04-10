package com.unique;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Student288
 */
@WebService(serviceName = "Calculator")
public class Calculator {
    
    
    @WebMethod(operationName = "getNumber")
    public int getNumber(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        int sum=num1 + num2;
        return sum;
    }

    @WebMethod(operationName = "getNumDivision")
    public int getNumDivision(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
          return num1 / num2;
    }

   @WebMethod(operationName = "getNumSubstraction")
    public int getNumSubstraction(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        
        return num1 - num2;
    }

   @WebMethod(operationName = "getNumMultiplication")
    public int getNumMultiplication(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
       
        return num1*num2;
    }



}
