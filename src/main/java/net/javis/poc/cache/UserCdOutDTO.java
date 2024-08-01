package net.javis.poc.cache;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UserCdOutDTO complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="UserCdOutDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sysCdGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysCdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysCdNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sysCdDescSbst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otputOdrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efctStDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="efctFnsDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rfrnVal9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCdOutDTO", propOrder = {
    "sysCdGroupId",
    "sysCdId",
    "sysCdNm",
    "sysCdDescSbst",
    "otputOdrg",
    "efctStDate",
    "efctFnsDate",
    "rfrnVal1",
    "rfrnVal2",
    "rfrnVal3",
    "rfrnVal4",
    "rfrnVal5",
    "rfrnVal6",
    "rfrnVal7",
    "rfrnVal8",
    "rfrnVal9"
})
public class UserCdOutDTO {

    protected String sysCdGroupId;
    protected String sysCdId;
    protected String sysCdNm;
    protected String sysCdDescSbst;
    protected String otputOdrg;
    protected String efctStDate;
    protected String efctFnsDate;
    protected String rfrnVal1;
    protected String rfrnVal2;
    protected String rfrnVal3;
    protected String rfrnVal4;
    protected String rfrnVal5;
    protected String rfrnVal6;
    protected String rfrnVal7;
    protected String rfrnVal8;
    protected String rfrnVal9;

    /**
     * sysCdGroupId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCdGroupId() {
        return sysCdGroupId;
    }

    /**
     * sysCdGroupId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCdGroupId(String value) {
        this.sysCdGroupId = value;
    }

    /**
     * sysCdId 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCdId() {
        return sysCdId;
    }

    /**
     * sysCdId 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCdId(String value) {
        this.sysCdId = value;
    }

    /**
     * sysCdNm 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCdNm() {
        return sysCdNm;
    }

    /**
     * sysCdNm 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCdNm(String value) {
        this.sysCdNm = value;
    }

    /**
     * sysCdDescSbst 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCdDescSbst() {
        return sysCdDescSbst;
    }

    /**
     * sysCdDescSbst 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCdDescSbst(String value) {
        this.sysCdDescSbst = value;
    }

    /**
     * otputOdrg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtputOdrg() {
        return otputOdrg;
    }

    /**
     * otputOdrg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtputOdrg(String value) {
        this.otputOdrg = value;
    }

    /**
     * efctStDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctStDate() {
        return efctStDate;
    }

    /**
     * efctStDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctStDate(String value) {
        this.efctStDate = value;
    }

    /**
     * efctFnsDate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEfctFnsDate() {
        return efctFnsDate;
    }

    /**
     * efctFnsDate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEfctFnsDate(String value) {
        this.efctFnsDate = value;
    }

    /**
     * rfrnVal1 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal1() {
        return rfrnVal1;
    }

    /**
     * rfrnVal1 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal1(String value) {
        this.rfrnVal1 = value;
    }

    /**
     * rfrnVal2 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal2() {
        return rfrnVal2;
    }

    /**
     * rfrnVal2 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal2(String value) {
        this.rfrnVal2 = value;
    }

    /**
     * rfrnVal3 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal3() {
        return rfrnVal3;
    }

    /**
     * rfrnVal3 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal3(String value) {
        this.rfrnVal3 = value;
    }

    /**
     * rfrnVal4 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal4() {
        return rfrnVal4;
    }

    /**
     * rfrnVal4 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal4(String value) {
        this.rfrnVal4 = value;
    }

    /**
     * rfrnVal5 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal5() {
        return rfrnVal5;
    }

    /**
     * rfrnVal5 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal5(String value) {
        this.rfrnVal5 = value;
    }

    /**
     * rfrnVal6 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal6() {
        return rfrnVal6;
    }

    /**
     * rfrnVal6 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal6(String value) {
        this.rfrnVal6 = value;
    }

    /**
     * rfrnVal7 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal7() {
        return rfrnVal7;
    }

    /**
     * rfrnVal7 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal7(String value) {
        this.rfrnVal7 = value;
    }

    /**
     * rfrnVal8 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal8() {
        return rfrnVal8;
    }

    /**
     * rfrnVal8 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal8(String value) {
        this.rfrnVal8 = value;
    }

    /**
     * rfrnVal9 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRfrnVal9() {
        return rfrnVal9;
    }

    /**
     * rfrnVal9 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRfrnVal9(String value) {
        this.rfrnVal9 = value;
    }

}