
package com.ibm.service.form;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>formData complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="formData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costAllList" type="{http://ibm.com/form/service/}tFormCostAllocation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="head" type="{http://ibm.com/form/service/}tFormHead" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formData", propOrder = {
    "costAllList",
    "head"
})
public class FormData {

    @XmlElement(nillable = true)
    protected List<TFormCostAllocation> costAllList;
    protected TFormHead head;

    /**
     * Gets the value of the costAllList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costAllList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostAllList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TFormCostAllocation }
     * 
     * 
     */
    public List<TFormCostAllocation> getCostAllList() {
        if (costAllList == null) {
            costAllList = new ArrayList<TFormCostAllocation>();
        }
        return this.costAllList;
    }

    /**
     * ��ȡhead���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link TFormHead }
     *     
     */
    public TFormHead getHead() {
        return head;
    }

    /**
     * ����head���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link TFormHead }
     *     
     */
    public void setHead(TFormHead value) {
        this.head = value;
    }

}
