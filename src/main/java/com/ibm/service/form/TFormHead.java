
package com.ibm.service.form;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tFormHead complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="tFormHead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicantLevelText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="assetCostCenterBelong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCostCenterBelongText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCostCenterIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCostCenterInText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCostCenterOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assetCostCenterOutText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="borrowAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="businessId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType1Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="businessType2Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCenterText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createByTxt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="days1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departmentText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ifPaymentVoucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="invoiceAmountNoTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoiceAmountTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="invoiceAmountTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="lockCashApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="procType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectEndAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectPrincipal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectPrincipalText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectStartFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referenceAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repaymentAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="repaymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suspenseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="verificationAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFormHead", propOrder = {
    "amount1",
    "applicant",
    "applicantId",
    "applicantLevel",
    "applicantLevelText",
    "applicationAmount",
    "assetCostCenterBelong",
    "assetCostCenterBelongText",
    "assetCostCenterIn",
    "assetCostCenterInText",
    "assetCostCenterOut",
    "assetCostCenterOutText",
    "borrowAmount",
    "businessId",
    "businessType1",
    "businessType1Text",
    "businessType2",
    "businessType2Text",
    "companyCode",
    "companyText",
    "costCenter",
    "costCenterText",
    "createAt",
    "createBy",
    "createByTxt",
    "currency",
    "currencyText",
    "days1",
    "department",
    "departmentText",
    "description",
    "endAt",
    "ifPaymentVoucher",
    "invoiceAmountNoTax",
    "invoiceAmountTax",
    "invoiceAmountTotal",
    "lockCashApplication",
    "paymentAmount",
    "procType",
    "processId",
    "projectCode",
    "projectEndAt",
    "projectName",
    "projectPrincipal",
    "projectPrincipalText",
    "projectStartFrom",
    "projectTel",
    "recordNumber",
    "referenceAmount",
    "repaymentAmount",
    "repaymentDate",
    "startFrom",
    "suspenseAmount",
    "verificationAmount"
})
public class TFormHead {

    protected BigDecimal amount1;
    protected String applicant;
    protected String applicantId;
    protected String applicantLevel;
    protected String applicantLevelText;
    protected BigDecimal applicationAmount;
    protected String assetCostCenterBelong;
    protected String assetCostCenterBelongText;
    protected String assetCostCenterIn;
    protected String assetCostCenterInText;
    protected String assetCostCenterOut;
    protected String assetCostCenterOutText;
    protected BigDecimal borrowAmount;
    protected String businessId;
    protected String businessType1;
    protected String businessType1Text;
    protected String businessType2;
    protected String businessType2Text;
    protected String companyCode;
    protected String companyText;
    protected String costCenter;
    protected String costCenterText;
    protected String createAt;
    protected String createBy;
    protected String createByTxt;
    protected String currency;
    protected String currencyText;
    protected BigDecimal days1;
    protected String department;
    protected String departmentText;
    protected String description;
    protected String endAt;
    protected String ifPaymentVoucher;
    protected BigDecimal invoiceAmountNoTax;
    protected BigDecimal invoiceAmountTax;
    protected BigDecimal invoiceAmountTotal;
    protected String lockCashApplication;
    protected BigDecimal paymentAmount;
    protected String procType;
    protected String processId;
    protected String projectCode;
    protected String projectEndAt;
    protected String projectName;
    protected String projectPrincipal;
    protected String projectPrincipalText;
    protected String projectStartFrom;
    protected String projectTel;
    protected String recordNumber;
    protected BigDecimal referenceAmount;
    protected BigDecimal repaymentAmount;
    protected String repaymentDate;
    protected String startFrom;
    protected BigDecimal suspenseAmount;
    protected BigDecimal verificationAmount;

    /**
     * ��ȡamount1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount1() {
        return amount1;
    }

    /**
     * ����amount1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount1(BigDecimal value) {
        this.amount1 = value;
    }

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
     * ��ȡapplicantId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantId() {
        return applicantId;
    }

    /**
     * ����applicantId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantId(String value) {
        this.applicantId = value;
    }

    /**
     * ��ȡapplicantLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantLevel() {
        return applicantLevel;
    }

    /**
     * ����applicantLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantLevel(String value) {
        this.applicantLevel = value;
    }

    /**
     * ��ȡapplicantLevelText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicantLevelText() {
        return applicantLevelText;
    }

    /**
     * ����applicantLevelText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicantLevelText(String value) {
        this.applicantLevelText = value;
    }

    /**
     * ��ȡapplicationAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getApplicationAmount() {
        return applicationAmount;
    }

    /**
     * ����applicationAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setApplicationAmount(BigDecimal value) {
        this.applicationAmount = value;
    }

    /**
     * ��ȡassetCostCenterBelong���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterBelong() {
        return assetCostCenterBelong;
    }

    /**
     * ����assetCostCenterBelong���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterBelong(String value) {
        this.assetCostCenterBelong = value;
    }

    /**
     * ��ȡassetCostCenterBelongText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterBelongText() {
        return assetCostCenterBelongText;
    }

    /**
     * ����assetCostCenterBelongText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterBelongText(String value) {
        this.assetCostCenterBelongText = value;
    }

    /**
     * ��ȡassetCostCenterIn���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterIn() {
        return assetCostCenterIn;
    }

    /**
     * ����assetCostCenterIn���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterIn(String value) {
        this.assetCostCenterIn = value;
    }

    /**
     * ��ȡassetCostCenterInText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterInText() {
        return assetCostCenterInText;
    }

    /**
     * ����assetCostCenterInText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterInText(String value) {
        this.assetCostCenterInText = value;
    }

    /**
     * ��ȡassetCostCenterOut���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterOut() {
        return assetCostCenterOut;
    }

    /**
     * ����assetCostCenterOut���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterOut(String value) {
        this.assetCostCenterOut = value;
    }

    /**
     * ��ȡassetCostCenterOutText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetCostCenterOutText() {
        return assetCostCenterOutText;
    }

    /**
     * ����assetCostCenterOutText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetCostCenterOutText(String value) {
        this.assetCostCenterOutText = value;
    }

    /**
     * ��ȡborrowAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBorrowAmount() {
        return borrowAmount;
    }

    /**
     * ����borrowAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBorrowAmount(BigDecimal value) {
        this.borrowAmount = value;
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
     * ��ȡbusinessType1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType1() {
        return businessType1;
    }

    /**
     * ����businessType1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType1(String value) {
        this.businessType1 = value;
    }

    /**
     * ��ȡbusinessType1Text���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType1Text() {
        return businessType1Text;
    }

    /**
     * ����businessType1Text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType1Text(String value) {
        this.businessType1Text = value;
    }

    /**
     * ��ȡbusinessType2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType2() {
        return businessType2;
    }

    /**
     * ����businessType2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType2(String value) {
        this.businessType2 = value;
    }

    /**
     * ��ȡbusinessType2Text���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessType2Text() {
        return businessType2Text;
    }

    /**
     * ����businessType2Text���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessType2Text(String value) {
        this.businessType2Text = value;
    }

    /**
     * ��ȡcompanyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * ����companyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * ��ȡcompanyText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyText() {
        return companyText;
    }

    /**
     * ����companyText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyText(String value) {
        this.companyText = value;
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
     * ��ȡcostCenterText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCenterText() {
        return costCenterText;
    }

    /**
     * ����costCenterText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCenterText(String value) {
        this.costCenterText = value;
    }

    /**
     * ��ȡcreateAt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateAt() {
        return createAt;
    }

    /**
     * ����createAt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateAt(String value) {
        this.createAt = value;
    }

    /**
     * ��ȡcreateBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * ����createBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateBy(String value) {
        this.createBy = value;
    }

    /**
     * ��ȡcreateByTxt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateByTxt() {
        return createByTxt;
    }

    /**
     * ����createByTxt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateByTxt(String value) {
        this.createByTxt = value;
    }

    /**
     * ��ȡcurrency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * ����currency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * ��ȡcurrencyText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyText() {
        return currencyText;
    }

    /**
     * ����currencyText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyText(String value) {
        this.currencyText = value;
    }

    /**
     * ��ȡdays1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDays1() {
        return days1;
    }

    /**
     * ����days1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDays1(BigDecimal value) {
        this.days1 = value;
    }

    /**
     * ��ȡdepartment���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * ����department���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * ��ȡdepartmentText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentText() {
        return departmentText;
    }

    /**
     * ����departmentText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentText(String value) {
        this.departmentText = value;
    }

    /**
     * ��ȡdescription���Ե�ֵ��
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
     * ����description���Ե�ֵ��
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
     * ��ȡendAt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndAt() {
        return endAt;
    }

    /**
     * ����endAt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndAt(String value) {
        this.endAt = value;
    }

    /**
     * ��ȡifPaymentVoucher���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIfPaymentVoucher() {
        return ifPaymentVoucher;
    }

    /**
     * ����ifPaymentVoucher���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIfPaymentVoucher(String value) {
        this.ifPaymentVoucher = value;
    }

    /**
     * ��ȡinvoiceAmountNoTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmountNoTax() {
        return invoiceAmountNoTax;
    }

    /**
     * ����invoiceAmountNoTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmountNoTax(BigDecimal value) {
        this.invoiceAmountNoTax = value;
    }

    /**
     * ��ȡinvoiceAmountTax���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmountTax() {
        return invoiceAmountTax;
    }

    /**
     * ����invoiceAmountTax���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmountTax(BigDecimal value) {
        this.invoiceAmountTax = value;
    }

    /**
     * ��ȡinvoiceAmountTotal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvoiceAmountTotal() {
        return invoiceAmountTotal;
    }

    /**
     * ����invoiceAmountTotal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvoiceAmountTotal(BigDecimal value) {
        this.invoiceAmountTotal = value;
    }

    /**
     * ��ȡlockCashApplication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLockCashApplication() {
        return lockCashApplication;
    }

    /**
     * ����lockCashApplication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLockCashApplication(String value) {
        this.lockCashApplication = value;
    }

    /**
     * ��ȡpaymentAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * ����paymentAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPaymentAmount(BigDecimal value) {
        this.paymentAmount = value;
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
     * ��ȡprocessId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * ����processId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * ��ȡprojectCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * ����projectCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCode(String value) {
        this.projectCode = value;
    }

    /**
     * ��ȡprojectEndAt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectEndAt() {
        return projectEndAt;
    }

    /**
     * ����projectEndAt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectEndAt(String value) {
        this.projectEndAt = value;
    }

    /**
     * ��ȡprojectName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * ����projectName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectName(String value) {
        this.projectName = value;
    }

    /**
     * ��ȡprojectPrincipal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPrincipal() {
        return projectPrincipal;
    }

    /**
     * ����projectPrincipal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPrincipal(String value) {
        this.projectPrincipal = value;
    }

    /**
     * ��ȡprojectPrincipalText���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectPrincipalText() {
        return projectPrincipalText;
    }

    /**
     * ����projectPrincipalText���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectPrincipalText(String value) {
        this.projectPrincipalText = value;
    }

    /**
     * ��ȡprojectStartFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectStartFrom() {
        return projectStartFrom;
    }

    /**
     * ����projectStartFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectStartFrom(String value) {
        this.projectStartFrom = value;
    }

    /**
     * ��ȡprojectTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectTel() {
        return projectTel;
    }

    /**
     * ����projectTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectTel(String value) {
        this.projectTel = value;
    }

    /**
     * ��ȡrecordNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordNumber() {
        return recordNumber;
    }

    /**
     * ����recordNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordNumber(String value) {
        this.recordNumber = value;
    }

    /**
     * ��ȡreferenceAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReferenceAmount() {
        return referenceAmount;
    }

    /**
     * ����referenceAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReferenceAmount(BigDecimal value) {
        this.referenceAmount = value;
    }

    /**
     * ��ȡrepaymentAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * ����repaymentAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepaymentAmount(BigDecimal value) {
        this.repaymentAmount = value;
    }

    /**
     * ��ȡrepaymentDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * ����repaymentDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepaymentDate(String value) {
        this.repaymentDate = value;
    }

    /**
     * ��ȡstartFrom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartFrom() {
        return startFrom;
    }

    /**
     * ����startFrom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartFrom(String value) {
        this.startFrom = value;
    }

    /**
     * ��ȡsuspenseAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuspenseAmount() {
        return suspenseAmount;
    }

    /**
     * ����suspenseAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuspenseAmount(BigDecimal value) {
        this.suspenseAmount = value;
    }

    /**
     * ��ȡverificationAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVerificationAmount() {
        return verificationAmount;
    }

    /**
     * ����verificationAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVerificationAmount(BigDecimal value) {
        this.verificationAmount = value;
    }

}
