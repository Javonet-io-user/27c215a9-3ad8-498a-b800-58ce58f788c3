package Korus.Eds.Workflow.Xml.CorrectionInvoice;

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
import Korus.Eds.Workflow.Xml.CorrectionInvoice.*;
import Sphere.Shared.Core.Xml.*;
import Korus.Eds.Workflow.Xml.Common.*;

public class CorrectionInvoiceDocument implements IXmlDocument {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setKnd(java.lang.String value) {
    try {
      javonetHandle.set("Knd", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getKnd() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.Xml.IXmlDocument").invoke("get_Knd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInfo(CorrectionInvoiceInfo value) {
    try {
      javonetHandle.set("Info", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CorrectionInvoiceInfo getInfo() {
    try {
      Object res = javonetHandle.<NObject>get("Info");
      if (res == null) return null;
      return new CorrectionInvoiceInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setRows(CorrectionInvoiceRows value) {
    try {
      javonetHandle.set("Rows", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CorrectionInvoiceRows getRows() {
    try {
      Object res = javonetHandle.<NObject>get("Rows");
      if (res == null) return null;
      return new CorrectionInvoiceRows((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSigner(SignerInfo value) {
    try {
      javonetHandle.set("Signer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SignerInfo getSigner() {
    try {
      Object res = javonetHandle.<NObject>get("Signer");
      if (res == null) return null;
      return new SignerInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CorrectionInvoiceDocument() {
    try {
      javonetHandle =
          Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.CorrectionInvoiceDocument");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CorrectionInvoiceDocument(NObject handle) {
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
