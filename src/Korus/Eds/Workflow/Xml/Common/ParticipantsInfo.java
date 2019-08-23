package Korus.Eds.Workflow.Xml.Common;

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
import Korus.Eds.Workflow.Xml.Common.*;
import Sphere.Shared.Core.Xml.*;
import Korus.Eds.Workflow.Xml.*;
import Sphere.Shared.Core.*;

public class ParticipantsInfo implements IParticipantsInfo {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setSenderCode(java.lang.String value) {
    try {
      javonetHandle.set("SenderCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSenderCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_SenderCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBuyerCode(java.lang.String value) {
    try {
      javonetHandle.set("BuyerCode", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getBuyerCode() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_BuyerCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setOperator(OperatorInfo value) {
    try {
      javonetHandle.set("Operator", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public OperatorInfo getOperator() {
    try {
      Object res = javonetHandle.<NObject>get("Operator");
      if (res == null) return null;
      return new OperatorInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ParticipantsInfo() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Workflow.Xml.Common.ParticipantsInfo");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParticipantsInfo(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IAbonent getIParticipantsInfo_Operator() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Sphere.Shared.Core.Xml.IParticipantsInfo")
              .invoke("get_Operator");
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
