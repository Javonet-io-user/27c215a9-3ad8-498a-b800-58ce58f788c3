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
import jio.System.*;
import Korus.Eds.Core.*;
import jio.System.Collections.Generic.*;

public class StateOrderInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setOrderId(java.lang.String value) {
    try {
      javonetHandle.set("OrderId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOrderId() {
    try {
      java.lang.String res = javonetHandle.get("OrderId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerPersonalAcc(java.lang.String value) {
    try {
      javonetHandle.set("BuyerPersonalAcc", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerPersonalAcc() {
    try {
      java.lang.String res = javonetHandle.get("BuyerPersonalAcc");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFinAuthorityName(java.lang.String value) {
    try {
      javonetHandle.set("FinAuthorityName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFinAuthorityName() {
    try {
      java.lang.String res = javonetHandle.get("FinAuthorityName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerRegistryNumber(java.lang.String value) {
    try {
      javonetHandle.set("BuyerRegistryNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerRegistryNumber() {
    try {
      java.lang.String res = javonetHandle.get("BuyerRegistryNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerLiabilityNumber(java.lang.String value) {
    try {
      javonetHandle.set("BuyerLiabilityNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerLiabilityNumber() {
    try {
      java.lang.String res = javonetHandle.get("BuyerLiabilityNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalTerritorialTreasuryCode(java.lang.String value) {
    try {
      javonetHandle.set("TotalTerritorialTreasuryCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTotalTerritorialTreasuryCode() {
    try {
      java.lang.String res = javonetHandle.get("TotalTerritorialTreasuryCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalTerritorialTreasuryName(java.lang.String value) {
    try {
      javonetHandle.set("TotalTerritorialTreasuryName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTotalTerritorialTreasuryName() {
    try {
      java.lang.String res = javonetHandle.get("TotalTerritorialTreasuryName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerTotalTerritorialMunicipalityCode(java.lang.String value) {
    try {
      javonetHandle.set("BuyerTotalTerritorialMunicipalityCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerTotalTerritorialMunicipalityCode() {
    try {
      java.lang.String res = javonetHandle.get("BuyerTotalTerritorialMunicipalityCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDeliveryTotalTerritorialMunicipalityCode(java.lang.String value) {
    try {
      javonetHandle.set("DeliveryTotalTerritorialMunicipalityCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDeliveryTotalTerritorialMunicipalityCode() {
    try {
      java.lang.String res = javonetHandle.get("DeliveryTotalTerritorialMunicipalityCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFinalPaymentDate(Nullable<DateTime> value) {
    try {
      javonetHandle.set("FinalPaymentDate", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getFinalPaymentDate() {
    try {
      Object res = javonetHandle.<NObject>get("FinalPaymentDate");
      if (res == null) return null;
      return new Nullable<DateTime>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCashLiabilityNumber(java.lang.String value) {
    try {
      javonetHandle.set("CashLiabilityNumber", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCashLiabilityNumber() {
    try {
      java.lang.String res = javonetHandle.get("CashLiabilityNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPaymentOrder(java.lang.String value) {
    try {
      javonetHandle.set("PaymentOrder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getPaymentOrder() {
    try {
      java.lang.String res = javonetHandle.get("PaymentOrder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPaymentType(Nullable<StateOrderPaymentType> value) {
    try {
      javonetHandle.set("PaymentType", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<StateOrderPaymentType> getPaymentType() {
    try {
      Object res = javonetHandle.<NObject>get("PaymentType");
      if (res == null) return null;
      return new Nullable<StateOrderPaymentType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCashLiabilityInfo(List<CashLiabilityInfo> value) {
    try {
      javonetHandle.set("CashLiabilityInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<CashLiabilityInfo> getCashLiabilityInfo() {
    try {
      Object res = javonetHandle.<NObject>get("CashLiabilityInfo");
      if (res == null) return null;
      return new List<CashLiabilityInfo>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public StateOrderInfo() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.StateOrderInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StateOrderInfo(NObject handle) {
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
