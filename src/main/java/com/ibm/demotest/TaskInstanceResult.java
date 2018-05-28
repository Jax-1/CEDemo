
package com.ibm.demotest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>taskInstanceResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡaction���Ե�ֵ��
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
     * ����action���Ե�ֵ��
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
     * ��ȡapproveComments���Ե�ֵ��
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
     * ����approveComments���Ե�ֵ��
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
     * ��ȡapproveResult���Ե�ֵ��
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
     * ����approveResult���Ե�ֵ��
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
     * ��ȡapproveTime���Ե�ֵ��
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
     * ����approveTime���Ե�ֵ��
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
     * ��ȡcompletedAt���Ե�ֵ��
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
     * ����completedAt���Ե�ֵ��
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
     * ��ȡcompletedBy���Ե�ֵ��
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
     * ����completedBy���Ե�ֵ��
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
     * ��ȡcompletedTxt���Ե�ֵ��
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
     * ����completedTxt���Ե�ֵ��
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
     * ��ȡcreatedAt���Ե�ֵ��
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
     * ����createdAt���Ե�ֵ��
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
     * ��ȡcreatedBy���Ե�ֵ��
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
     * ����createdBy���Ե�ֵ��
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
     * ��ȡcreatedByTxt���Ե�ֵ��
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
     * ����createdByTxt���Ե�ֵ��
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
     * ��ȡdelegatedAt���Ե�ֵ��
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
     * ����delegatedAt���Ե�ֵ��
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
     * ��ȡdelegatedBy���Ե�ֵ��
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
     * ����delegatedBy���Ե�ֵ��
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
     * ��ȡdelegatedTxt���Ե�ֵ��
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
     * ����delegatedTxt���Ե�ֵ��
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
     * ��ȡprocDisplayname���Ե�ֵ��
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
     * ����procDisplayname���Ե�ֵ��
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
     * ��ȡprocInstanceId���Ե�ֵ��
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
     * ����procInstanceId���Ե�ֵ��
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
     * ��ȡprocType���Ե�ֵ��
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
     * ����procType���Ե�ֵ��
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
     * ��ȡprocTypeName���Ե�ֵ��
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
     * ����procTypeName���Ե�ֵ��
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
     * ��ȡsubmitRound���Ե�ֵ��
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
     * ����submitRound���Ե�ֵ��
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
     * ��ȡtaskDisplayName���Ե�ֵ��
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
     * ����taskDisplayName���Ե�ֵ��
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
     * ��ȡtaskInstanceId���Ե�ֵ��
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
     * ����taskInstanceId���Ե�ֵ��
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
     * ��ȡtaskNodeId���Ե�ֵ��
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
     * ����taskNodeId���Ե�ֵ��
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
