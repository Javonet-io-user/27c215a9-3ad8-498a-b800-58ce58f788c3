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
import jio.System.Collections.Generic.*;

public class CorrectionInvoiceRows {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRows(List<CorrectionInvoiceRow> value) {
    try {
      javonetHandle.set("Rows", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<CorrectionInvoiceRow> getRows() {
    try {
      Object res = javonetHandle.<NObject>get("Rows");
      if (res == null) return null;
      return new List<CorrectionInvoiceRow>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIncrease(CorrectionInvoiceRowTotals value) {
    try {
      javonetHandle.set("Increase", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CorrectionInvoiceRowTotals getIncrease() {
    try {
      Object res = javonetHandle.<NObject>get("Increase");
      if (res == null) return null;
      return new CorrectionInvoiceRowTotals((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDecrease(CorrectionInvoiceRowTotals value) {
    try {
      javonetHandle.set("Decrease", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CorrectionInvoiceRowTotals getDecrease() {
    try {
      Object res = javonetHandle.<NObject>get("Decrease");
      if (res == null) return null;
      return new CorrectionInvoiceRowTotals((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CorrectionInvoiceRows() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.CorrectionInvoiceRows");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CorrectionInvoiceRows(NObject handle) {
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
