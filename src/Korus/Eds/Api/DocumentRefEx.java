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

public class DocumentRefEx extends DocumentRef implements IDocumentRefEx, IDocumentRef {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentTypeCode(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("Korus.Eds.Core.IDocumentRefEx")
          .invoke("set_DocumentTypeCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDocumentTypeCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IDocumentRefEx")
              .invoke("get_DocumentTypeCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReceiverCode(java.lang.String value) {
    try {
      javonetHandle
          .explicitInterface("Korus.Eds.Core.IDocumentRefEx")
          .invoke("set_ReceiverCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getReceiverCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IDocumentRefEx")
              .invoke("get_ReceiverCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public DocumentRefEx() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.DocumentRefEx");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DocumentRefEx(NObject handle) {
    super(handle);
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
