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
import jio.System.*;

public class VatSumType implements IXmlSerializable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSum(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("Sum", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getSum() {
    try {
      Object res = javonetHandle.<NObject>get("Sum");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setText(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getText() {
    try {
      java.lang.String res = javonetHandle.get("Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWithoutVat() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Workflow.Xml.Common.VatSumType").get("WithoutVat");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWithoutVat(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Workflow.Xml.Common.VatSumType").set("WithoutVat", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public VatSumType() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.VatSumType");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public VatSumType(java.lang.String text) {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.VatSumType", text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public VatSumType(Nullable<java.math.BigDecimal> sum) {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.VatSumType", sum);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public VatSumType(Nullable<java.math.BigDecimal> sum, java.lang.String nullText) {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.VatSumType", sum, nullText);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public VatSumType(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
