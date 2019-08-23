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

public class ClientEdiCode extends EdiCode implements IEdiCode, IClientEdiCode {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setOperatorName(java.lang.String value) {
    try {
      javonetHandle.set("OperatorName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getOperatorName() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IClientEdiCode")
              .invoke("get_OperatorName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsCurrent(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsCurrent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsCurrent() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Korus.Eds.Core.IClientEdiCode").invoke("get_IsCurrent");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsActive(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsActive", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsActive() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Korus.Eds.Core.IClientEdiCode").invoke("get_IsActive");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setIsDefault(java.lang.Boolean value) {
    try {
      javonetHandle.set("IsDefault", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsDefault() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Korus.Eds.Core.IClientEdiCode").invoke("get_IsDefault");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public ClientEdiCode() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.ClientEdiCode");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClientEdiCode(NObject handle) {
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
