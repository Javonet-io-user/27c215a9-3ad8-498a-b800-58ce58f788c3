package Korus.Eds.Workflow.Xml.WayBill;

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
import Korus.Eds.Workflow.Xml.WayBill.*;
import Korus.Eds.Workflow.Xml.Common.*;
import Korus.Eds.Workflow.Xml.*;
import Sphere.Shared.Core.Xml.*;
import Sphere.Shared.Core.*;

public class Torg12BuyerTitle
    extends RoutedDocumentXmlFile<Torg12BuyerTitle, ParticipantsInfoInvoice>
    implements ISerializableObject,
        IDocumentXmlFile<Torg12BuyerTitle>,
        IRoutedDocumentXmlFile,
        IXmlFile {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocument(Torg12ForBuyerDocument value) {
    try {
      javonetHandle.set("Document", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Torg12ForBuyerDocument getDocument() {
    try {
      Object res = javonetHandle.<NObject>get("Document");
      if (res == null) return null;
      return new Torg12ForBuyerDocument((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSenderCodeAsTorg12BuyerTitle() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IXmlFile")
              .invoke("get_SenderCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ISigner getSignerAsTorg12BuyerTitle() {
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
          Javonet.getType("Korus.Eds.Workflow.Xml.WayBill.Torg12BuyerTitle").get("FormatCode");
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
      Javonet.getType("Korus.Eds.Workflow.Xml.WayBill.Torg12BuyerTitle").set("FormatCode", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Torg12BuyerTitle() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.WayBill.Torg12BuyerTitle");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Torg12BuyerTitle(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
