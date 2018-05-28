
package com.ibm.service.processhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>processHistorySearchCondition complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取applicant属性的值。
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
     * 设置applicant属性的值。
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
     * 获取approveDay属性的值。
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
     * 设置approveDay属性的值。
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
     * 获取bukrs属性的值。
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
     * 设置bukrs属性的值。
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
     * 获取businessId属性的值。
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
     * 设置businessId属性的值。
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
     * 获取businessSubType属性的值。
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
     * 设置businessSubType属性的值。
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
     * 获取businessType属性的值。
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
     * 设置businessType属性的值。
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
     * 获取costCenter属性的值。
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
     * 设置costCenter属性的值。
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
     * 获取endDateFrom属性的值。
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
     * 设置endDateFrom属性的值。
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
     * 获取endDateTo属性的值。
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
     * 设置endDateTo属性的值。
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
     * 获取participant属性的值。
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
     * 设置participant属性的值。
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
     * 获取pdid属性的值。
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
     * 设置pdid属性的值。
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
     * 获取piid属性的值。
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
     * 设置piid属性的值。
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
     * 获取startDateFrom属性的值。
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
     * 设置startDateFrom属性的值。
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
     * 获取startDateTo属性的值。
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
     * 设置startDateTo属性的值。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取waitingDay属性的值。
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
     * 设置waitingDay属性的值。
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
