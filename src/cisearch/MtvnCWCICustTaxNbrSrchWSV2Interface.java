package cisearch;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * CICustTaxNbrSrchWSV2
 *
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-09T09:04:30.552-04:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "mtvnCICustTaxNbrSrchWSV2", name = "mtvnCWCICustTaxNbrSrchWSV2Interface")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MtvnCWCICustTaxNbrSrchWSV2Interface {

    @WebMethod(operationName = "CICustTaxNbrSrch", action = "CICustTaxNbrSrchWSV2:CICustTaxNbrSrchMtvnSvcReqMsg")
    @WebResult(name = "CICustTaxNbrSrchMtvnSvcRes", targetNamespace = "mtvnCWCICustTaxNbrSrchSvcRes", partName = "messagePart")
    public CICustTaxNbrSrchMtvnSvcRes ciCustTaxNbrSrch(
        @WebParam(partName = "messagePart", name = "CICustTaxNbrSrchMtvnSvcReq", targetNamespace = "mtvnCWCICustTaxNbrSrchSvcReq")
        CICustTaxNbrSrchMtvnSvcReq messagePart
    );
}