package Korus.Eds.Workflow.Xml.Invoice;

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
import Korus.Eds.Workflow.Xml.Invoice.*;
import jio.System.Collections.Generic.*;
import Korus.Eds.Workflow.Xml.Common.*;

public class InvoiceRows {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRows(List<InvoiceRow> value) {
    try {
      javonetHandle.set("Rows", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<InvoiceRow> getRows() {
    try {
      Object res = javonetHandle.<NObject>get("Rows");
      if (res == null) return null;
      return new List<InvoiceRow>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTotals(RowTotals value) {
    try {
      javonetHandle.set("Totals", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RowTotals getTotals() {
    try {
      Object res = javonetHandle.<NObject>get("Totals");
      if (res == null) return null;
      return new RowTotals((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public InvoiceRows() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Invoice.InvoiceRows");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public InvoiceRows(NObject handle) {
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
