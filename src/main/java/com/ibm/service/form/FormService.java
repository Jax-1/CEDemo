
package com.ibm.service.form;

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
@WebService(name = "FormService", targetNamespace = "http://ibm.com/form/service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FormService {


    /**
     * 
     * @param processId
     * @param businessId
     * @return
     *     returns com.ibm.service.form.FormData
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "initFormData", targetNamespace = "http://ibm.com/form/service/", className = "com.ibm.service.form.InitFormData")
    @ResponseWrapper(localName = "initFormDataResponse", targetNamespace = "http://ibm.com/form/service/", className = "com.ibm.service.form.InitFormDataResponse")
    public FormData initFormData(
        @WebParam(name = "businessId", targetNamespace = "")
        String businessId,
        @WebParam(name = "processId", targetNamespace = "")
        String processId);

    /**
     * 
     * @param businessId
     * @return
     *     returns java.util.List<com.ibm.service.form.TFormInfoAttach>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "initExternalFormAttach", targetNamespace = "http://ibm.com/form/service/", className = "com.ibm.service.form.InitExternalFormAttach")
    @ResponseWrapper(localName = "initExternalFormAttachResponse", targetNamespace = "http://ibm.com/form/service/", className = "com.ibm.service.form.InitExternalFormAttachResponse")
    public List<TFormInfoAttach> initExternalFormAttach(
        @WebParam(name = "businessId", targetNamespace = "")
        String businessId);

}
