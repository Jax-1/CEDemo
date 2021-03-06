
package com.ibm.demotest;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CeInterface", targetNamespace = "http://ibm.com/demotest/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CeInterface {


    /**
     * 
     * @param str1
     * @return
     *     returns java.util.List<com.ibm.demotest.TaskInstanceResult>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getData", targetNamespace = "http://ibm.com/demotest/", className = "com.ibm.demotest.GetData")
    @ResponseWrapper(localName = "getDataResponse", targetNamespace = "http://ibm.com/demotest/", className = "com.ibm.demotest.GetDataResponse")
    public List<TaskInstanceResult> getData(
        @WebParam(name = "str1", targetNamespace = "")
        String str1);

}
