
package com.ibm.service.processhistory;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tBpmProcInstanceExtra complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tBpmProcInstanceExtra">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bukrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bukrsTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessSubTypeTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessTypeTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canceledAt" type="{http://ibm.com/queryHistory/}timestamp" minOccurs="0"/>
 *         &lt;element name="canceledBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedAt" type="{http://ibm.com/queryHistory/}timestamp" minOccurs="0"/>
 *         &lt;element name="costCenterTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://ibm.com/queryHistory/}timestamp" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procDefIdid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procDisplayname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procInstanceid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tBpmProcInstanceExtra", propOrder = {
    "amount",
    "applicant",
    "bukrs",
    "bukrsTxt",
    "businessId",
    "businessSubTypeTxt",
    "businessTypeTxt",
    "canceledAt",
    "canceledBy",
    "completedAt",
    "costCenterTxt",
    "createdAt",
    "createdBy",
    "createdByTxt",
    "description",
    "pcd",
    "procDefIdid",
    "procDisplayname",
    "procInstanceid",
    "procType",
    "procTypeName",
    "status",
    "submitRound",
    "taskInstanceId",
    "url"
})
public class TBpmProcInstanceExtra {

    protected BigDecimal amount;
    protected String applicant;
    protected String bukrs;
    protected String bukrsTxt;
    protected String businessId;
    protected String businessSubTypeTxt;
    protected String businessTypeTxt;
    protected Timestamp canceledAt;
    protected String canceledBy;
    protected Timestamp completedAt;
    protected String costCenterTxt;
    protected Timestamp createdAt;
    protected String createdBy;
    protected String createdByTxt;
    protected String description;
    protected String pcd;
    protected String procDefIdid;
    protected String procDisplayname;
    protected String procInstanceid;
    protected String procType;
    protected String procTypeName;
    protected String status;
    protected Integer submitRound;
    protected String taskInstanceId;
    protected String url;

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

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
     * 获取bukrsTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBukrsTxt() {
        return bukrsTxt;
    }

    /**
     * 设置bukrsTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBukrsTxt(String value) {
        this.bukrsTxt = value;
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
     * 获取businessSubTypeTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessSubTypeTxt() {
        return businessSubTypeTxt;
    }

    /**
     * 设置businessSubTypeTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessSubTypeTxt(String value) {
        this.businessSubTypeTxt = value;
    }

    /**
     * 获取businessTypeTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTypeTxt() {
        return businessTypeTxt;
    }

    /**
     * 设置businessTypeTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTypeTxt(String value) {
        this.businessTypeTxt = value;
    }

    /**
     * 获取canceledAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getCanceledAt() {
        return canceledAt;
    }

    /**
     * 设置canceledAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setCanceledAt(Timestamp value) {
        this.canceledAt = value;
    }

    /**
     * 获取canceledBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanceledBy() {
        return canceledBy;
    }

    /**
     * 设置canceledBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanceledBy(String value) {
        this.canceledBy = value;
    }

    /**
     * 获取completedAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getCompletedAt() {
        return completedAt;
    }

    /**
     * 设置completedAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setCompletedAt(Timestamp value) {
        this.completedAt = value;
    }

    /**
     * 获取costCenterTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterTxt() {
        return costCenterTxt;
    }

    /**
     * 设置costCenterTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterTxt(String value) {
        this.costCenterTxt = value;
    }

    /**
     * 获取createdAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置createdAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setCreatedAt(Timestamp value) {
        this.createdAt = value;
    }

    /**
     * 获取createdBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置createdBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * 获取createdByTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByTxt() {
        return createdByTxt;
    }

    /**
     * 设置createdByTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByTxt(String value) {
        this.createdByTxt = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取pcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcd() {
        return pcd;
    }

    /**
     * 设置pcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcd(String value) {
        this.pcd = value;
    }

    /**
     * 获取procDefIdid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcDefIdid() {
        return procDefIdid;
    }

    /**
     * 设置procDefIdid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcDefIdid(String value) {
        this.procDefIdid = value;
    }

    /**
     * 获取procDisplayname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcDisplayname() {
        return procDisplayname;
    }

    /**
     * 设置procDisplayname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcDisplayname(String value) {
        this.procDisplayname = value;
    }

    /**
     * 获取procInstanceid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcInstanceid() {
        return procInstanceid;
    }

    /**
     * 设置procInstanceid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcInstanceid(String value) {
        this.procInstanceid = value;
    }

    /**
     * 获取procType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcType() {
        return procType;
    }

    /**
     * 设置procType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcType(String value) {
        this.procType = value;
    }

    /**
     * 获取procTypeName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcTypeName() {
        return procTypeName;
    }

    /**
     * 设置procTypeName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcTypeName(String value) {
        this.procTypeName = value;
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
     * 获取submitRound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubmitRound() {
        return submitRound;
    }

    /**
     * 设置submitRound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubmitRound(Integer value) {
        this.submitRound = value;
    }

    /**
     * 获取taskInstanceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskInstanceId() {
        return taskInstanceId;
    }

    /**
     * 设置taskInstanceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskInstanceId(String value) {
        this.taskInstanceId = value;
    }

    /**
     * 获取url属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置url属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
