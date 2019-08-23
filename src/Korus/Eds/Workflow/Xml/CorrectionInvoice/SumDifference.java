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
import jio.System.*;

public class SumDifference {
  protected NObject javonetHandle;
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
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.math.BigDecimal getDifference() {
    try {
      java.math.BigDecimal res = javonetHandle.get("Difference");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIncreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("IncreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDecreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("DecreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public SumDifference() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.SumDifference");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SumDifference(
      Nullable<java.math.BigDecimal> before, Nullable<java.math.BigDecimal> after) {
    try {
      javonetHandle =
          Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.SumDifference", before, after);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SumDifference(java.math.BigDecimal difference) {
    try {
      javonetHandle =
          Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.SumDifference", difference);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public SumDifference(NObject handle) {
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
