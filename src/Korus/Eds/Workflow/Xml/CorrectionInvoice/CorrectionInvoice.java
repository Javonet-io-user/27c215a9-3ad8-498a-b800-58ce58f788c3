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
import Korus.Eds.Workflow.Xml.Common.*;
import Korus.Eds.Workflow.Xml.*;
import Korus.Eds.Workflow.*;
import jio.System.Collections.Generic.*;
import Sphere.Shared.Core.*;
import Sphere.Shared.Core.Xml.*;

public class CorrectionInvoice extends RoutedDocumentXmlFile<CorrectionInvoice, ParticipantsInfo>
    implements ISerializableObject,
        IDocumentXmlFile<CorrectionInvoice>,
        IRoutedDocumentXmlFile,
        ICorrectionInvoice,
        IInvoice,
        IXmlFile {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocument(CorrectionInvoiceDocument value) {
    try {
      javonetHandle.set("Document", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CorrectionInvoiceDocument getDocument() {
    try {
      Object res = javonetHandle.<NObject>get("Document");
      if (res == null) return null;
      return new CorrectionInvoiceDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ISigner getSignerAsCorrectionInvoice() {
    try {
      Object res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.Xml.IXmlFile").invoke("get_Signer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFormatCode() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Workflow.Xml.CorrectionInvoice.CorrectionInvoice")
              .get("FormatCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFormatCode(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Workflow.Xml.CorrectionInvoice.CorrectionInvoice")
          .set("FormatCode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CorrectionInvoice() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.CorrectionInvoice.CorrectionInvoice");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CorrectionInvoice(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IInvoiceInfo GetInfo() {
    try {
      Object res = javonetHandle.explicitInterface("Korus.Eds.Workflow.IInvoice").invoke("GetInfo");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<IDocumentInfo> GetInvoiceRevisions() {
    try {
      Object res = javonetHandle.invoke("GetInvoiceRevisions");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public IList<ICorrectedInvoiceInfo> GetCorrectedInvoices() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Workflow.ICorrectionInvoice")
              .invoke("GetCorrectedInvoices");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IXmlDocument getIXmlFile_Document() {
    try {
      Object res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.Xml.IXmlFile").invoke("get_Document");
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
