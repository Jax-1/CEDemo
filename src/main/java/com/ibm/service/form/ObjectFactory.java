
package com.ibm.service.form;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ibm.service.form package. 
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

    private final static QName _InitExternalFormAttach_QNAME = new QName("http://ibm.com/form/service/", "initExternalFormAttach");
    private final static QName _InitExternalFormAttachResponse_QNAME = new QName("http://ibm.com/form/service/", "initExternalFormAttachResponse");
    private final static QName _InitFormDataResponse_QNAME = new QName("http://ibm.com/form/service/", "initFormDataResponse");
    private final static QName _InitFormData_QNAME = new QName("http://ibm.com/form/service/", "initFormData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ibm.service.form
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InitExternalFormAttach }
     * 
     */
    public InitExternalFormAttach createInitExternalFormAttach() {
        return new InitExternalFormAttach();
    }

    /**
     * Create an instance of {@link InitExternalFormAttachResponse }
     * 
     */
    public InitExternalFormAttachResponse createInitExternalFormAttachResponse() {
        return new InitExternalFormAttachResponse();
    }

    /**
     * Create an instance of {@link InitFormDataResponse }
     * 
     */
    public InitFormDataResponse createInitFormDataResponse() {
        return new InitFormDataResponse();
    }

    /**
     * Create an instance of {@link InitFormData }
     * 
     */
    public InitFormData createInitFormData() {
        return new InitFormData();
    }

    /**
     * Create an instance of {@link FormData }
     * 
     */
    public FormData createFormData() {
        return new FormData();
    }

    /**
     * Create an instance of {@link TFormHead }
     * 
     */
    public TFormHead createTFormHead() {
        return new TFormHead();
    }

    /**
     * Create an instance of {@link TFormCostAllocation }
     * 
     */
    public TFormCostAllocation createTFormCostAllocation() {
        return new TFormCostAllocation();
    }

    /**
     * Create an instance of {@link TFormInfoAttach }
     * 
     */
    public TFormInfoAttach createTFormInfoAttach() {
        return new TFormInfoAttach();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitExternalFormAttach }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/form/service/", name = "initExternalFormAttach")
    public JAXBElement<InitExternalFormAttach> createInitExternalFormAttach(InitExternalFormAttach value) {
        return new JAXBElement<InitExternalFormAttach>(_InitExternalFormAttach_QNAME, InitExternalFormAttach.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitExternalFormAttachResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/form/service/", name = "initExternalFormAttachResponse")
    public JAXBElement<InitExternalFormAttachResponse> createInitExternalFormAttachResponse(InitExternalFormAttachResponse value) {
        return new JAXBElement<InitExternalFormAttachResponse>(_InitExternalFormAttachResponse_QNAME, InitExternalFormAttachResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitFormDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/form/service/", name = "initFormDataResponse")
    public JAXBElement<InitFormDataResponse> createInitFormDataResponse(InitFormDataResponse value) {
        return new JAXBElement<InitFormDataResponse>(_InitFormDataResponse_QNAME, InitFormDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitFormData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ibm.com/form/service/", name = "initFormData")
    public JAXBElement<InitFormData> createInitFormData(InitFormData value) {
        return new JAXBElement<InitFormData>(_InitFormData_QNAME, InitFormData.class, null, value);
    }

}
