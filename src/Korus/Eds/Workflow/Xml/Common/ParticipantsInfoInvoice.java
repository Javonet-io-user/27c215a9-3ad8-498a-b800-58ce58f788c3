package Korus.Eds.Workflow.Xml.Common;

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
import Korus.Eds.Workflow.Xml.Common.*;
import jio.System.Xml.Schema.*;
import jio.System.Xml.Serialization.*;
import jio.System.Xml.*;
import Sphere.Shared.Core.Xml.*;
import Korus.Eds.Workflow.Xml.*;
import Sphere.Shared.Core.*;

public class ParticipantsInfoInvoice implements IParticipantsInfo, IXmlSerializable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenderCode(java.lang.String value) {
    try {
      javonetHandle.set("SenderCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSenderCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_SenderCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerCode(java.lang.String value) {
    try {
      javonetHandle.set("BuyerCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_BuyerCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOperator(OperatorInfoInvoice value) {
    try {
      javonetHandle.set("Operator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OperatorInfoInvoice getOperator() {
    try {
      Object res = javonetHandle.<NObject>get("Operator");
      if (res == null) return null;
      return new OperatorInfoInvoice((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ParticipantsInfoInvoice() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.ParticipantsInfoInvoice");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParticipantsInfoInvoice(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public XmlSchema GetSchema() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
              .invoke("GetSchema");
      if (res == null) return null;
      return new XmlSchema((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void ReadXml(XmlReader reader) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("ReadXml", reader);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteXml(XmlWriter writer) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Xml.Serialization.IXmlSerializable")
          .invoke("WriteXml", writer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAbonent getIParticipantsInfo_Operator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_Operator");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
