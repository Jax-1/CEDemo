
package com.ibm.service.form;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tFormHead complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取amount1属性的值。
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
     * 设置amount1属性的值。
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
     * 获取applicantId属性的值。
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
     * 设置applicantId属性的值。
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
     * 获取applicantLevel属性的值。
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
     * 设置applicantLevel属性的值。
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
     * 获取applicantLevelText属性的值。
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
     * 设置applicantLevelText属性的值。
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
     * 获取applicationAmount属性的值。
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
     * 设置applicationAmount属性的值。
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
     * 获取assetCostCenterBelong属性的值。
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
     * 设置assetCostCenterBelong属性的值。
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
     * 获取assetCostCenterBelongText属性的值。
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
     * 设置assetCostCenterBelongText属性的值。
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
     * 获取assetCostCenterIn属性的值。
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
     * 设置assetCostCenterIn属性的值。
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
     * 获取assetCostCenterInText属性的值。
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
     * 设置assetCostCenterInText属性的值。
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
     * 获取assetCostCenterOut属性的值。
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
     * 设置assetCostCenterOut属性的值。
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
     * 获取assetCostCenterOutText属性的值。
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
     * 设置assetCostCenterOutText属性的值。
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
     * 获取borrowAmount属性的值。
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
     * 设置borrowAmount属性的值。
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
     * 获取businessType1属性的值。
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
     * 设置businessType1属性的值。
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
     * 获取businessType1Text属性的值。
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
     * 设置businessType1Text属性的值。
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
     * 获取businessType2属性的值。
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
     * 设置businessType2属性的值。
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
     * 获取businessType2Text属性的值。
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
     * 设置businessType2Text属性的值。
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
     * 获取companyCode属性的值。
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
     * 设置companyCode属性的值。
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
     * 获取companyText属性的值。
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
     * 设置companyText属性的值。
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
     * 获取costCenterText属性的值。
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
     * 设置costCenterText属性的值。
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
     * 获取createAt属性的值。
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
     * 设置createAt属性的值。
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
     * 获取createBy属性的值。
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
     * 设置createBy属性的值。
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
     * 获取createByTxt属性的值。
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
     * 设置createByTxt属性的值。
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
     * 获取currency属性的值。
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
     * 设置currency属性的值。
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
     * 获取currencyText属性的值。
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
     * 设置currencyText属性的值。
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
     * 获取days1属性的值。
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
     * 设置days1属性的值。
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
     * 获取department属性的值。
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
     * 设置department属性的值。
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
     * 获取departmentText属性的值。
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
     * 设置departmentText属性的值。
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
     * 获取endAt属性的值。
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
     * 设置endAt属性的值。
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
     * 获取ifPaymentVoucher属性的值。
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
     * 设置ifPaymentVoucher属性的值。
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
     * 获取invoiceAmountNoTax属性的值。
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
     * 设置invoiceAmountNoTax属性的值。
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
     * 获取invoiceAmountTax属性的值。
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
     * 设置invoiceAmountTax属性的值。
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
     * 获取invoiceAmountTotal属性的值。
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
     * 设置invoiceAmountTotal属性的值。
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
     * 获取lockCashApplication属性的值。
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
     * 设置lockCashApplication属性的值。
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
     * 获取paymentAmount属性的值。
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
     * 设置paymentAmount属性的值。
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
     * 获取processId属性的值。
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
     * 设置processId属性的值。
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
     * 获取projectCode属性的值。
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
     * 设置projectCode属性的值。
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
     * 获取projectEndAt属性的值。
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
     * 设置projectEndAt属性的值。
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
     * 获取projectName属性的值。
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
     * 设置projectName属性的值。
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
     * 获取projectPrincipal属性的值。
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
     * 设置projectPrincipal属性的值。
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
     * 获取projectPrincipalText属性的值。
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
     * 设置projectPrincipalText属性的值。
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
     * 获取projectStartFrom属性的值。
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
     * 设置projectStartFrom属性的值。
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
     * 获取projectTel属性的值。
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
     * 设置projectTel属性的值。
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
     * 获取recordNumber属性的值。
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
     * 设置recordNumber属性的值。
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
     * 获取referenceAmount属性的值。
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
     * 设置referenceAmount属性的值。
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
     * 获取repaymentAmount属性的值。
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
     * 设置repaymentAmount属性的值。
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
     * 获取repaymentDate属性的值。
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
     * 设置repaymentDate属性的值。
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
     * 获取startFrom属性的值。
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
     * 设置startFrom属性的值。
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
     * 获取suspenseAmount属性的值。
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
     * 设置suspenseAmount属性的值。
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
     * 获取verificationAmount属性的值。
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
     * 设置verificationAmount属性的值。
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
