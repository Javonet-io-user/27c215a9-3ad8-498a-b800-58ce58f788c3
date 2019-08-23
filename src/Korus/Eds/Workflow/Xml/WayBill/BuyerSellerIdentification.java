package Korus.Eds.Workflow.Xml.WayBill;

import Common.Activation;
import static Common.JavonetHelper.Convert;
import static Common.JavonetHelper.getGetObjectName;
import static Common.JavonetHelper.getReturnObjectName;
import static Common.JavonetHelper.ConvertToConcreteInterfaceImplementation;
import Common.JavonetHelper;
import Common.MethodTypeAnnotation;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Korus.Eds.Workflow.Xml.WayBill.*;
import Korus.Eds.Workflow.Xml.*;

public class BuyerSellerIdentification {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setOrganization(WaybillOrganizationInfo value) {
    try {
      javonetHandle.set("Organization", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public WaybillOrganizationInfo getOrganization() {
    try {
      Object res = javonetHandle.<NObject>get("Organization");
      if (res == null) return null;
      return new WaybillOrganizationInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIndividual(IndividualInfo value) {
    try {
      javonetHandle.set("Individual", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IndividualInfo getIndividual() {
    try {
      Object res = javonetHandle.<NObject>get("Individual");
      if (res == null) return null;
      return new IndividualInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BuyerSellerIdentification() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.WayBill.BuyerSellerIdentification");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BuyerSellerIdentification(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
