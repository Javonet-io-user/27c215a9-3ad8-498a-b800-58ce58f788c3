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
import jio.System.Xml.Schema.*;
import jio.System.Xml.Serialization.*;
import jio.System.Xml.*;
import jio.System.*;

public class SumType implements IXmlSerializable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.set("Before", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.math.BigDecimal getBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.get("Before");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("After", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getAfter() {
    try {
      Object res = javonetHandle.<NObject>get("After");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("Increase", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("Increase");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDecrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("Decrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("Decrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public SumType() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.SumType");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SumType(java.math.BigDecimal before, java.math.BigDecimal after) {
    try {
      javonetHandle =
          Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.SumType", before, after);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SumType(NObject handle) {
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
