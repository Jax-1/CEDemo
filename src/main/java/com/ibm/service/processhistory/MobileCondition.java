
package com.ibm.service.processhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mobileCondition complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="mobileCondition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ibm.com/queryHistory/}pagination">
 *       &lt;sequence>
 *         &lt;element name="approver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="procTypeInSQL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taskCreatedOnFrom" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *         &lt;element name="taskCreatedOnTo" type="{http://ibm.com/queryHistory/}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobileCondition", propOrder = {
    "approver",
    "procTypeInSQL",
    "taskCreatedOnFrom",
    "taskCreatedOnTo"
})
@XmlSeeAlso({
    ProcessHistorySearchCondition.class
})
public class MobileCondition
    extends Pagination
{

    protected String approver;
    protected String procTypeInSQL;
    protected Date taskCreatedOnFrom;
    protected Date taskCreatedOnTo;

    /**
     * ��ȡapprover���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprover() {
        return approver;
    }

    /**
     * ����approver���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprover(String value) {
        this.approver = value;
    }

    /**
     * ��ȡprocTypeInSQL���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcTypeInSQL() {
        return procTypeInSQL;
    }

    /**
     * ����procTypeInSQL���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcTypeInSQL(String value) {
        this.procTypeInSQL = value;
    }

    /**
     * ��ȡtaskCreatedOnFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getTaskCreatedOnFrom() {
        return taskCreatedOnFrom;
    }

    /**
     * ����taskCreatedOnFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setTaskCreatedOnFrom(Date value) {
        this.taskCreatedOnFrom = value;
    }

    /**
     * ��ȡtaskCreatedOnTo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getTaskCreatedOnTo() {
        return taskCreatedOnTo;
    }

    /**
     * ����taskCreatedOnTo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setTaskCreatedOnTo(Date value) {
        this.taskCreatedOnTo = value;
    }

}
