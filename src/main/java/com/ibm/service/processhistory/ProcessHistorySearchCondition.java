
package com.ibm.service.processhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>processHistorySearchCondition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="processHistorySearchCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ibm.com/queryHistory/}mobileCondition">
 *       &lt;sequence>
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bukrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endDateFrom" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *         &lt;element name="endDateTo" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *         &lt;element name="participant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pdid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="piid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDateFrom" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *         &lt;element name="startDateTo" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="waitingDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processHistorySearchCondition", propOrder = {
    "applicant",
    "approveDay",
    "bukrs",
    "businessId",
    "businessSubType",
    "businessType",
    "costCenter",
    "endDateFrom",
    "endDateTo",
    "participant",
    "pdid",
    "piid",
    "startDateFrom",
    "startDateTo",
    "status",
    "waitingDay"
})
public class ProcessHistorySearchCondition
    extends MobileCondition
{

    protected String applicant;
    protected Integer approveDay;
    protected String bukrs;
    protected String businessId;
    protected String businessSubType;
    protected String businessType;
    protected String costCenter;
    protected Date endDateFrom;
    protected Date endDateTo;
    protected String participant;
    protected String pdid;
    protected String piid;
    protected Date startDateFrom;
    protected Date startDateTo;
    protected String status;
    protected Integer waitingDay;

    /**
     * ��ȡapplicant���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * ����applicant���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicant(String value) {
        this.applicant = value;
    }

    /**
     * ��ȡapproveDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getApproveDay() {
        return approveDay;
    }

    /**
     * ����approveDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setApproveDay(Integer value) {
        this.approveDay = value;
    }

    /**
     * ��ȡbukrs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBukrs() {
        return bukrs;
    }

    /**
     * ����bukrs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBukrs(String value) {
        this.bukrs = value;
    }

    /**
     * ��ȡbusinessId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * ����businessId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessId(String value) {
        this.businessId = value;
    }

    /**
     * ��ȡbusinessSubType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSubType() {
        return businessSubType;
    }

    /**
     * ����businessSubType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSubType(String value) {
        this.businessSubType = value;
    }

    /**
     * ��ȡbusinessType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * ����businessType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType(String value) {
        this.businessType = value;
    }

    /**
     * ��ȡcostCenter���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * ����costCenter���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenter(String value) {
        this.costCenter = value;
    }

    /**
     * ��ȡendDateFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDateFrom() {
        return endDateFrom;
    }

    /**
     * ����endDateFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDateFrom(Date value) {
        this.endDateFrom = value;
    }

    /**
     * ��ȡendDateTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getEndDateTo() {
        return endDateTo;
    }

    /**
     * ����endDateTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setEndDateTo(Date value) {
        this.endDateTo = value;
    }

    /**
     * ��ȡparticipant���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipant() {
        return participant;
    }

    /**
     * ����participant���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipant(String value) {
        this.participant = value;
    }

    /**
     * ��ȡpdid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdid() {
        return pdid;
    }

    /**
     * ����pdid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdid(String value) {
        this.pdid = value;
    }

    /**
     * ��ȡpiid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPiid() {
        return piid;
    }

    /**
     * ����piid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPiid(String value) {
        this.piid = value;
    }

    /**
     * ��ȡstartDateFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDateFrom() {
        return startDateFrom;
    }

    /**
     * ����startDateFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDateFrom(Date value) {
        this.startDateFrom = value;
    }

    /**
     * ��ȡstartDateTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getStartDateTo() {
        return startDateTo;
    }

    /**
     * ����startDateTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setStartDateTo(Date value) {
        this.startDateTo = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡwaitingDay���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWaitingDay() {
        return waitingDay;
    }

    /**
     * ����waitingDay���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWaitingDay(Integer value) {
        this.waitingDay = value;
    }

}
