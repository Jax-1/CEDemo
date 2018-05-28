
package com.ibm.service.processhistory;

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
@WebService(name = "ProcessHistoryService", targetNamespace = "http://ibm.com/queryHistory/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProcessHistoryService {


    /**
     * 
     * @param condition
     * @return
     *     returns java.util.List<com.ibm.service.processhistory.TBpmProcInstanceExtra>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryHistory", targetNamespace = "http://ibm.com/queryHistory/", className = "com.ibm.service.processhistory.QueryHistory")
    @ResponseWrapper(localName = "queryHistoryResponse", targetNamespace = "http://ibm.com/queryHistory/", className = "com.ibm.service.processhistory.QueryHistoryResponse")
    public List<TBpmProcInstanceExtra> queryHistory(
        @WebParam(name = "condition", targetNamespace = "")
        ProcessHistorySearchCondition condition);

    /**
     * 
     * @param piid
     * @return
     *     returns java.util.List<com.ibm.service.processhistory.TBpmTaskInstance>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "queryHistoryDetail", targetNamespace = "http://ibm.com/queryHistory/", className = "com.ibm.service.processhistory.QueryHistoryDetail")
    @ResponseWrapper(localName = "queryHistoryDetailResponse", targetNamespace = "http://ibm.com/queryHistory/", className = "com.ibm.service.processhistory.QueryHistoryDetailResponse")
    public List<TBpmTaskInstance> queryHistoryDetail(
        @WebParam(name = "piid", targetNamespace = "")
        String piid);

}