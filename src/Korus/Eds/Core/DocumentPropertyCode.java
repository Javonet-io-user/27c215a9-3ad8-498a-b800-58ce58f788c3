package Korus.Eds.Core;

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
import Korus.Eds.Core.*;

public class DocumentPropertyCode {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAcceptExpireDate() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("AcceptExpireDate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAcceptExpireDate(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("AcceptExpireDate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAllowedReceiverSigner() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("AllowedReceiverSigner");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowedReceiverSigner(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("AllowedReceiverSigner", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDocumentTypeName() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("DocumentTypeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDocumentTypeName(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("DocumentTypeName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRequestLineNumber() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("RequestLineNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRequestLineNumber(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("RequestLineNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInvestAttributeName() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("InvestAttributeName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInvestAttributeName(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("InvestAttributeName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditTransactionNumber() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("CreditTransactionNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditTransactionNumber(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("CreditTransactionNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditManagerEmail() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("CreditManagerEmail");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditManagerEmail(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("CreditManagerEmail", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEcmFolder() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("EcmFolder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEcmFolder(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("EcmFolder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAutoReplyCreditRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("AutoReplyCreditRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAutoReplyCreditRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("AutoReplyCreditRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMainParticipant() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("MainParticipant");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMainParticipant(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("MainParticipant", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBusinessSegment() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("BusinessSegment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBusinessSegment(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("BusinessSegment", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAllowedReceiverThumbprint() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("AllowedReceiverThumbprint");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowedReceiverThumbprint(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode")
          .set("AllowedReceiverThumbprint", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBusinessProcess() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("BusinessProcess");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBusinessProcess(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("BusinessProcess", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCurrency() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("Currency");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCurrency(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("Currency", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getManagerEmail() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("ManagerEmail");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setManagerEmail(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("ManagerEmail", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPackageType() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("PackageType");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPackageType(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("PackageType", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAllowedReceiverSerialNumber() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("AllowedReceiverSerialNumber");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAllowedReceiverSerialNumber(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode")
          .set("AllowedReceiverSerialNumber", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCompanyCrmId() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("CompanyCrmId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCompanyCrmId(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("CompanyCrmId", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getEkcContractId() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("EkcContractId");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setEkcContractId(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("EkcContractId", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSignBlocking() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").get("SignBlocking");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSignBlocking(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Core.DocumentPropertyCode").set("SignBlocking", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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
