
package com.ibm.service.processhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryHistory complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="queryHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condition" type="{http://ibm.com/queryHistory/}processHistorySearchCondition" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "queryHistory", propOrder = {
    "condition"
})
public class QueryHistory {

    protected ProcessHistorySearchCondition condition;

    /**
     * ��ȡcondition���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProcessHistorySearchCondition }
     *     
     */
    public ProcessHistorySearchCondition getCondition() {
        return condition;
    }

    /**
     * ����condition���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessHistorySearchCondition }
     *     
     */
    public void setCondition(ProcessHistorySearchCondition value) {
        this.condition = value;
    }

}
