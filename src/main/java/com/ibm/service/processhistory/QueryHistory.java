
package com.ibm.service.processhistory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>queryHistory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取condition属性的值。
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
     * 设置condition属性的值。
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
