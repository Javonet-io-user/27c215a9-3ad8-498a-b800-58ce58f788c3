package Korus.Eds.Api;

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
import Korus.Eds.Api.*;
import Korus.Eds.Core.*;
import jio.System.*;

public class CreditTransaction implements ICreditTransaction, IBaseCreditTransaction {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSegment(java.lang.String value) {
    try {
      javonetHandle.set("Segment", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSegment() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.ICreditTransaction")
              .invoke("get_Segment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setClientName(java.lang.String value) {
    try {
      javonetHandle.set("ClientName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getClientName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.ICreditTransaction")
              .invoke("get_ClientName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setClientId(java.lang.String value) {
    try {
      javonetHandle.set("ClientId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getClientId() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.ICreditTransaction")
              .invoke("get_ClientId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInn(java.lang.String value) {
    try {
      javonetHandle.set("Inn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInn() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Korus.Eds.Core.ICreditTransaction").invoke("get_Inn");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setKpp(java.lang.String value) {
    try {
      javonetHandle.set("Kpp", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getKpp() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Korus.Eds.Core.ICreditTransaction").invoke("get_Kpp");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNumber(java.lang.String value) {
    try {
      javonetHandle.set("Number", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNumber() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IBaseCreditTransaction")
              .invoke("get_Number");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatus(CreditTransactionStatusType value) {
    try {
      javonetHandle.set("Status", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CreditTransactionStatusType getStatus() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IBaseCreditTransaction")
              .invoke("get_Status");
      if (res == null) return null;
      return CreditTransactionStatusType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDate(DateTime value) {
    try {
      javonetHandle.set("Date", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTime getDate() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IBaseCreditTransaction")
              .invoke("get_Date");
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAmount(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("Amount", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getAmount() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IBaseCreditTransaction")
              .invoke("get_Amount");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMetadata(java.lang.String value) {
    try {
      javonetHandle.set("Metadata", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMetadata() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IBaseCreditTransaction")
              .invoke("get_Metadata");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public CreditTransaction() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.CreditTransaction");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CreditTransaction(NObject handle) {
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
