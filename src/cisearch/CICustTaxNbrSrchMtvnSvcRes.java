
package cisearch;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MtvnSvcVer"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1.0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MsgUUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Svc" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SvcParms"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ApplID"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="CI"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SvcID"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="CICustTaxNbrSrch"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SvcVer"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="2.0"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="RqstUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MsgData"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element name="DefaultResData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element ref="{mtvnCWCICustTaxNbrSrchResData}CICustTaxNbrSrchResData"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrCde"/&gt;
 *                   &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrMsg" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrCde"/&gt;
 *         &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrMsg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mtvnSvcVer",
    "msgUUID",
    "svc",
    "errCde",
    "errMsg"
})
@XmlRootElement(name = "CICustTaxNbrSrchMtvnSvcRes", namespace = "mtvnCWCICustTaxNbrSrchSvcRes")
public class CICustTaxNbrSrchMtvnSvcRes {

    @XmlElement(name = "MtvnSvcVer", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
    protected String mtvnSvcVer;
    @XmlElement(name = "MsgUUID", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
    protected String msgUUID;
    @XmlElement(name = "Svc", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
    protected List<CICustTaxNbrSrchMtvnSvcRes.Svc> svc;
    @XmlElement(name = "ErrCde", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
    protected String errCde;
    @XmlElement(name = "ErrMsg", namespace = "mtvnCWCICustTaxNbrSrchSvcRes")
    protected String errMsg;

    /**
     * Gets the value of the mtvnSvcVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtvnSvcVer() {
        return mtvnSvcVer;
    }

    /**
     * Sets the value of the mtvnSvcVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtvnSvcVer(String value) {
        this.mtvnSvcVer = value;
    }

    /**
     * Gets the value of the msgUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgUUID() {
        return msgUUID;
    }

    /**
     * Sets the value of the msgUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgUUID(String value) {
        this.msgUUID = value;
    }

    /**
     * Gets the value of the svc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CICustTaxNbrSrchMtvnSvcRes.Svc }
     * 
     * 
     */
    public List<CICustTaxNbrSrchMtvnSvcRes.Svc> getSvc() {
        if (svc == null) {
            svc = new ArrayList<CICustTaxNbrSrchMtvnSvcRes.Svc>();
        }
        return this.svc;
    }

    /**
     * Gets the value of the errCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCde() {
        return errCde;
    }

    /**
     * Sets the value of the errCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCde(String value) {
        this.errCde = value;
    }

    /**
     * Gets the value of the errMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrMsg() {
        return errMsg;
    }

    /**
     * Sets the value of the errMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrMsg(String value) {
        this.errMsg = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SvcParms"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ApplID"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="CI"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SvcID"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="CICustTaxNbrSrch"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SvcVer"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="2.0"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="RqstUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MsgData"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element name="DefaultResData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element ref="{mtvnCWCICustTaxNbrSrchResData}CICustTaxNbrSrchResData"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrCde"/&gt;
     *         &lt;element ref="{mtvnCWCICustTaxNbrSrchSvcRes}ErrMsg" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "svcParms",
        "msgData",
        "errCde",
        "errMsg"
    })
    public static class Svc {

        @XmlElement(name = "SvcParms", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
        protected CICustTaxNbrSrchMtvnSvcRes.Svc.SvcParms svcParms;
        @XmlElement(name = "MsgData", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
        protected CICustTaxNbrSrchMtvnSvcRes.Svc.MsgData msgData;
        @XmlElement(name = "ErrCde", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
        protected String errCde;
        @XmlElement(name = "ErrMsg", namespace = "mtvnCWCICustTaxNbrSrchSvcRes")
        protected String errMsg;

        /**
         * Gets the value of the svcParms property.
         * 
         * @return
         *     possible object is
         *     {@link CICustTaxNbrSrchMtvnSvcRes.Svc.SvcParms }
         *     
         */
        public CICustTaxNbrSrchMtvnSvcRes.Svc.SvcParms getSvcParms() {
            return svcParms;
        }

        /**
         * Sets the value of the svcParms property.
         * 
         * @param value
         *     allowed object is
         *     {@link CICustTaxNbrSrchMtvnSvcRes.Svc.SvcParms }
         *     
         */
        public void setSvcParms(CICustTaxNbrSrchMtvnSvcRes.Svc.SvcParms value) {
            this.svcParms = value;
        }

        /**
         * Gets the value of the msgData property.
         * 
         * @return
         *     possible object is
         *     {@link CICustTaxNbrSrchMtvnSvcRes.Svc.MsgData }
         *     
         */
        public CICustTaxNbrSrchMtvnSvcRes.Svc.MsgData getMsgData() {
            return msgData;
        }

        /**
         * Sets the value of the msgData property.
         * 
         * @param value
         *     allowed object is
         *     {@link CICustTaxNbrSrchMtvnSvcRes.Svc.MsgData }
         *     
         */
        public void setMsgData(CICustTaxNbrSrchMtvnSvcRes.Svc.MsgData value) {
            this.msgData = value;
        }

        /**
         * Gets the value of the errCde property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrCde() {
            return errCde;
        }

        /**
         * Sets the value of the errCde property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrCde(String value) {
            this.errCde = value;
        }

        /**
         * Gets the value of the errMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErrMsg() {
            return errMsg;
        }

        /**
         * Sets the value of the errMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErrMsg(String value) {
            this.errMsg = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element name="DefaultResData" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element ref="{mtvnCWCICustTaxNbrSrchResData}CICustTaxNbrSrchResData"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "defaultResData",
            "ciCustTaxNbrSrchResData"
        })
        public static class MsgData {

            @XmlElement(name = "DefaultResData", namespace = "mtvnCWCICustTaxNbrSrchSvcRes")
            protected String defaultResData;
            @XmlElement(name = "CICustTaxNbrSrchResData", namespace = "mtvnCWCICustTaxNbrSrchResData")
            protected CICustTaxNbrSrchResData ciCustTaxNbrSrchResData;

            /**
             * Gets the value of the defaultResData property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDefaultResData() {
                return defaultResData;
            }

            /**
             * Sets the value of the defaultResData property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDefaultResData(String value) {
                this.defaultResData = value;
            }

            /**
             * Gets the value of the ciCustTaxNbrSrchResData property.
             * 
             * @return
             *     possible object is
             *     {@link CICustTaxNbrSrchResData }
             *     
             */
            public CICustTaxNbrSrchResData getCICustTaxNbrSrchResData() {
                return ciCustTaxNbrSrchResData;
            }

            /**
             * Sets the value of the ciCustTaxNbrSrchResData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CICustTaxNbrSrchResData }
             *     
             */
            public void setCICustTaxNbrSrchResData(CICustTaxNbrSrchResData value) {
                this.ciCustTaxNbrSrchResData = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ApplID"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="CI"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SvcID"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="CICustTaxNbrSrch"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SvcVer"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="2.0"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="RqstUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applID",
            "svcID",
            "svcVer",
            "rqstUUID"
        })
        public static class SvcParms {

            @XmlElement(name = "ApplID", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
            protected String applID;
            @XmlElement(name = "SvcID", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
            protected String svcID;
            @XmlElement(name = "SvcVer", namespace = "mtvnCWCICustTaxNbrSrchSvcRes", required = true)
            protected String svcVer;
            @XmlElement(name = "RqstUUID", namespace = "mtvnCWCICustTaxNbrSrchSvcRes")
            protected String rqstUUID;

            /**
             * Gets the value of the applID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplID() {
                return applID;
            }

            /**
             * Sets the value of the applID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplID(String value) {
                this.applID = value;
            }

            /**
             * Gets the value of the svcID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSvcID() {
                return svcID;
            }

            /**
             * Sets the value of the svcID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSvcID(String value) {
                this.svcID = value;
            }

            /**
             * Gets the value of the svcVer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSvcVer() {
                return svcVer;
            }

            /**
             * Sets the value of the svcVer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSvcVer(String value) {
                this.svcVer = value;
            }

            /**
             * Gets the value of the rqstUUID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRqstUUID() {
                return rqstUUID;
            }

            /**
             * Sets the value of the rqstUUID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRqstUUID(String value) {
                this.rqstUUID = value;
            }

        }

    }

}
