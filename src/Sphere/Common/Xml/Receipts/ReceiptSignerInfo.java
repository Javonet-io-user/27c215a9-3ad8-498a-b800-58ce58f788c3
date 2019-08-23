package Sphere.Common.Xml.Receipts;

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
import Sphere.Common.Xml.Receipts.*;
import Sphere.Shared.Core.*;
import Sphere.Common.Xml.*;

public class ReceiptSignerInfo implements ISigner {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setTitle(java.lang.String value) {
    try {
      javonetHandle.set("Title", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTitle() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.ISigner").invoke("get_Title");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPerson(PersonName value) {
    try {
      javonetHandle.set("Person", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PersonName getPerson() {
    try {
      Object res = javonetHandle.<NObject>get("Person");
      if (res == null) return null;
      return new PersonName((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ReceiptSignerInfo() {
    try {
      javonetHandle = Javonet.New("Sphere.Common.Xml.Receipts.ReceiptSignerInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReceiptSignerInfo(java.lang.String title, PersonName person) {
    try {
      javonetHandle = Javonet.New("Sphere.Common.Xml.Receipts.ReceiptSignerInfo", title, person);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReceiptSignerInfo(ISigner signer) {
    try {
      javonetHandle = Javonet.New("Sphere.Common.Xml.Receipts.ReceiptSignerInfo", signer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ReceiptSignerInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IPerson getISigner_Person() {
    try {
      Object res =
          javonetHandle.explicitInterface("Sphere.Shared.Core.ISigner").invoke("get_Person");
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
