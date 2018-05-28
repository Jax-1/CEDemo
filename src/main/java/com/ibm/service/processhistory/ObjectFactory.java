
package com.ibm.service.processhistory;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ibm.service.processhistory package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryHistoryDetailResponse_QNAME = new QName("http://ibm.com/queryHistory/", "queryHistoryDetailResponse");
    private final static QName _QueryHistoryResponse_QNAME = new QName("http://ibm.com/queryHistory/", "queryHistoryResponse");
    private final static QName _QueryHistory_QNAME = new QName("http://ibm.com/queryHistory/", "queryHistory");
    private final static QName _QueryHistoryDetail_QNAME = new QName("http://ibm.com/queryHistory/", "queryHistoryDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.service.processhistory
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryHistory }
     * 
     */
    public QueryHistory createQueryHistory() {
        return new QueryHistory();
    }

    /**
     * Create an instance of {@link QueryHistoryDetail }
     * 
     */
    public QueryHistoryDetail createQueryHistoryDetail() {
        return new QueryHistoryDetail();
    }

    /**
     * Create an instance of {@link QueryHistoryDetailResponse }
     * 
     */
    public QueryHistoryDetailResponse createQueryHistoryDetailResponse() {
        return new QueryHistoryDetailResponse();
    }

    /**
     * Create an instance of {@link QueryHistoryResponse }
     * 
     */
    public QueryHistoryResponse createQueryHistoryResponse() {
        return new QueryHistoryResponse();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link TBpmTaskInstance }
     * 
     */
    public TBpmTaskInstance createTBpmTaskInstance() {
        return new TBpmTaskInstance();
    }

    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }

    /**
     * Create an instance of {@link TBpmProcInstanceExtra }
     * 
     */
    public TBpmProcInstanceExtra createTBpmProcInstanceExtra() {
        return new TBpmProcInstanceExtra();
    }

    /**
     * Create an instance of {@link MobileCondition }
     * 
     */
    public MobileCondition createMobileCondition() {
        return new MobileCondition();
    }

    /**
     * Create an instance of {@link ProcessHistorySearchCondition }
     * 
     */
    public ProcessHistorySearchCondition createProcessHistorySearchCondition() {
        return new ProcessHistorySearchCondition();
    }

    /**
     * Create an instance of {@link Timestamp }
     * 
     */
    public Timestamp createTimestamp() {
        return new Timestamp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/queryHistory/", name = "queryHistoryDetailResponse")
    public JAXBElement<QueryHistoryDetailResponse> createQueryHistoryDetailResponse(QueryHistoryDetailResponse value) {
        return new JAXBElement<QueryHistoryDetailResponse>(_QueryHistoryDetailResponse_QNAME, QueryHistoryDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/queryHistory/", name = "queryHistoryResponse")
    public JAXBElement<QueryHistoryResponse> createQueryHistoryResponse(QueryHistoryResponse value) {
        return new JAXBElement<QueryHistoryResponse>(_QueryHistoryResponse_QNAME, QueryHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/queryHistory/", name = "queryHistory")
    public JAXBElement<QueryHistory> createQueryHistory(QueryHistory value) {
        return new JAXBElement<QueryHistory>(_QueryHistory_QNAME, QueryHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryHistoryDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/queryHistory/", name = "queryHistoryDetail")
    public JAXBElement<QueryHistoryDetail> createQueryHistoryDetail(QueryHistoryDetail value) {
        return new JAXBElement<QueryHistoryDetail>(_QueryHistoryDetail_QNAME, QueryHistoryDetail.class, null, value);
    }

}
