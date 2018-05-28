
package com.ibm.demotest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>taskInstanceResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="taskInstanceResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="approveTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bukrs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedAt" type="{http://ibm.com/demotest/}timestamp" minOccurs="0"/>
 *         &lt;element name="completedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://ibm.com/demotest/}timestamp" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdByTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatedAt" type="{http://ibm.com/demotest/}timestamp" minOccurs="0"/>
 *         &lt;element name="delegatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="delegatedTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procDisplayname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitRound" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="taskDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskInstanceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskNodeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskInstanceResult", propOrder = {
    "action",
    "approveComments",
    "approveResult",
    "approveTime",
    "bukrs",
    "completedAt",
    "completedBy",
    "completedTxt",
    "createdAt",
    "createdBy",
    "createdByTxt",
    "delegatedAt",
    "delegatedBy",
    "delegatedTxt",
    "procDisplayname",
    "procInstanceId",
    "procType",
    "procTypeName",
    "submitRound",
    "taskDisplayName",
    "taskInstanceId",
    "taskNodeId"
})
public class TaskInstanceResult {

    protected String action;
    protected String approveComments;
    protected String approveResult;
    protected String approveTime;
    protected String bukrs;
    protected Timestamp completedAt;
    protected String completedBy;
    protected String completedTxt;
    protected Timestamp createdAt;
    protected String createdBy;
    protected String createdByTxt;
    protected Timestamp delegatedAt;
    protected String delegatedBy;
    protected String delegatedTxt;
    protected String procDisplayname;
    protected String procInstanceId;
    protected String procType;
    protected String procTypeName;
    protected Integer submitRound;
    protected String taskDisplayName;
    protected String taskInstanceId;
    protected String taskNodeId;

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * 获取approveComments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveComments() {
        return approveComments;
    }

    /**
     * 设置approveComments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveComments(String value) {
        this.approveComments = value;
    }

    /**
     * 获取approveResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveResult() {
        return approveResult;
    }

    /**
     * 设置approveResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveResult(String value) {
        this.approveResult = value;
    }

    /**
     * 获取approveTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApproveTime() {
        return approveTime;
    }

    /**
     * 设置approveTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApproveTime(String value) {
        this.approveTime = value;
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
     * 获取completedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedBy() {
        return completedBy;
    }

    /**
     * 设置completedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedBy(String value) {
        this.completedBy = value;
    }

    /**
     * 获取completedTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedTxt() {
        return completedTxt;
    }

    /**
     * 设置completedTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedTxt(String value) {
        this.completedTxt = value;
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
     * 获取delegatedAt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getDelegatedAt() {
        return delegatedAt;
    }

    /**
     * 设置delegatedAt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setDelegatedAt(Timestamp value) {
        this.delegatedAt = value;
    }

    /**
     * 获取delegatedBy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedBy() {
        return delegatedBy;
    }

    /**
     * 设置delegatedBy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedBy(String value) {
        this.delegatedBy = value;
    }

    /**
     * 获取delegatedTxt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelegatedTxt() {
        return delegatedTxt;
    }

    /**
     * 设置delegatedTxt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelegatedTxt(String value) {
        this.delegatedTxt = value;
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
     * 获取procInstanceId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcInstanceId() {
        return procInstanceId;
    }

    /**
     * 设置procInstanceId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcInstanceId(String value) {
        this.procInstanceId = value;
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
     * 获取taskDisplayName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskDisplayName() {
        return taskDisplayName;
    }

    /**
     * 设置taskDisplayName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskDisplayName(String value) {
        this.taskDisplayName = value;
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
     * 获取taskNodeId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskNodeId() {
        return taskNodeId;
    }

    /**
     * 设置taskNodeId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskNodeId(String value) {
        this.taskNodeId = value;
    }

}
