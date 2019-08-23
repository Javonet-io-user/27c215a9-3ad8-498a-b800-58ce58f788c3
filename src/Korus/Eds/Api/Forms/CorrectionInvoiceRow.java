package Korus.Eds.Api.Forms;

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
import Korus.Eds.Api.Forms.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class CorrectionInvoiceRow {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value) {
    try {
      javonetHandle.set("Name", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName() {
    try {
      java.lang.String res = javonetHandle.get("Name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnitBefore(java.lang.String value) {
    try {
      javonetHandle.set("UnitBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUnitBefore() {
    try {
      java.lang.String res = javonetHandle.get("UnitBefore");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setUnitAfter(java.lang.String value) {
    try {
      javonetHandle.set("UnitAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUnitAfter() {
    try {
      java.lang.String res = javonetHandle.get("UnitAfter");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAmountBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("AmountBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getAmountBefore() {
    try {
      Object res = javonetHandle.<NObject>get("AmountBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setAmountAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("AmountAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getAmountAfter() {
    try {
      Object res = javonetHandle.<NObject>get("AmountAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPriceBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("PriceBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getPriceBefore() {
    try {
      Object res = javonetHandle.<NObject>get("PriceBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPriceAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("PriceAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getPriceAfter() {
    try {
      Object res = javonetHandle.<NObject>get("PriceAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNetSumBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("NetSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getNetSumBefore() {
    try {
      Object res = javonetHandle.<NObject>get("NetSumBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNetSumAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("NetSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getNetSumAfter() {
    try {
      Object res = javonetHandle.<NObject>get("NetSumAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNetSumIncrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("NetSumIncrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getNetSumIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("NetSumIncrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNetSumIncreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("NetSumIncreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNetSumDecrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("NetSumDecrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getNetSumDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("NetSumDecrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getNetSumDecreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("NetSumDecreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExciseSumBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("ExciseSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getExciseSumBefore() {
    try {
      Object res = javonetHandle.<NObject>get("ExciseSumBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExciseSumAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("ExciseSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getExciseSumAfter() {
    try {
      Object res = javonetHandle.<NObject>get("ExciseSumAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExciseSumIncrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("ExciseSumIncrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getExciseSumIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("ExciseSumIncrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getExciseSumIncreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("ExciseSumIncreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setExciseSumDecrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("ExciseSumDecrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getExciseSumDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("ExciseSumDecrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getExciseSumDecreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("ExciseSumDecreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatTypeBefore(java.lang.String value) {
    try {
      javonetHandle.set("VatTypeBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getVatTypeBefore() {
    try {
      java.lang.String res = javonetHandle.get("VatTypeBefore");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatTypeAfter(java.lang.String value) {
    try {
      javonetHandle.set("VatTypeAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getVatTypeAfter() {
    try {
      java.lang.String res = javonetHandle.get("VatTypeAfter");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatSumBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("VatSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getVatSumBefore() {
    try {
      Object res = javonetHandle.<NObject>get("VatSumBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatSumAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("VatSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getVatSumAfter() {
    try {
      Object res = javonetHandle.<NObject>get("VatSumAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatSumIncrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("VatSumIncrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getVatSumIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("VatSumIncrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getVatSumIncreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("VatSumIncreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setVatSumDecrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("VatSumDecrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getVatSumDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("VatSumDecrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getVatSumDecreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("VatSumDecreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalSumBefore(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("TotalSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getTotalSumBefore() {
    try {
      Object res = javonetHandle.<NObject>get("TotalSumBefore");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalSumAfter(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("TotalSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getTotalSumAfter() {
    try {
      Object res = javonetHandle.<NObject>get("TotalSumAfter");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalSumIncrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("TotalSumIncrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getTotalSumIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("TotalSumIncrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTotalSumIncreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("TotalSumIncreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotalSumDecrease(Nullable<java.math.BigDecimal> value) {
    try {
      javonetHandle.set("TotalSumDecrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.math.BigDecimal> getTotalSumDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("TotalSumDecrease");
      if (res == null) return null;
      return new Nullable<java.math.BigDecimal>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getTotalSumDecreaseSpecified() {
    try {
      java.lang.Boolean res = javonetHandle.get("TotalSumDecreaseSpecified");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInfo(java.lang.String value) {
    try {
      javonetHandle.set("Info", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInfo() {
    try {
      java.lang.String res = javonetHandle.get("Info");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTextInfo(List<IdValuePair> value) {
    try {
      javonetHandle.set("TextInfo", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<IdValuePair> getTextInfo() {
    try {
      Object res = javonetHandle.<NObject>get("TextInfo");
      if (res == null) return null;
      return new List<IdValuePair>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CorrectionInvoiceRow() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.Forms.CorrectionInvoiceRow");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CorrectionInvoiceRow(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetAmountBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetAmountBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetAmountBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetAmountBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetAmountAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetAmountAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetAmountAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetAmountAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetPriceBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetPriceBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPriceBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetPriceBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetPriceAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetPriceAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetPriceAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetPriceAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetNetSumBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetNetSumBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetNetSumBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetNetSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetNetSumAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetNetSumAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetNetSumAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetNetSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetExciseSumBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetExciseSumBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetExciseSumBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetExciseSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetExciseSumAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetExciseSumAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetExciseSumAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetExciseSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetVatSumBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetVatSumBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetVatSumBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetVatSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetVatSumAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetVatSumAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetVatSumAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetVatSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetTotalSumBefore() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetTotalSumBefore");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetTotalSumBefore(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetTotalSumBefore", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal GetTotalSumAfter() {
    try {
      java.math.BigDecimal res = javonetHandle.invoke("GetTotalSumAfter");
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void SetTotalSumAfter(java.math.BigDecimal value) {
    try {
      javonetHandle.invoke("SetTotalSumAfter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void AddInfo(java.lang.String key, java.lang.String value) {
    try {
      javonetHandle.invoke("AddInfo", key, value);
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
