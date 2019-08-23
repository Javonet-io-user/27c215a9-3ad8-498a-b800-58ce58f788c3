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

public class DocumentTypeCode {
  protected NObject javonetHandle;
  /** GetFiled */
  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAct() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Act");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAct(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Act", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getActProd() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ActProd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActProd(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ActProd", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAcceptanceCertificate() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AcceptanceCertificate");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAcceptanceCertificate(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AcceptanceCertificate", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getReconciliationReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ReconciliationReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setReconciliationReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ReconciliationReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreement() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Agreement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreement(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Agreement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDocument() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Document");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDocument(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Document", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCorrectionInvoice() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CorrectionInvoice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCorrectionInvoice(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CorrectionInvoice", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPriceList() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("PriceList");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPriceList(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("PriceList", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPriceListReconciliation() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("PriceListReconciliation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPriceListReconciliation(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("PriceListReconciliation", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getActAdd() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ActAdd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActAdd(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ActAdd", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBill() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Bill");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBill(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Bill", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPlainBill() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("PlainBill");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPlainBill(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("PlainBill", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInvoice() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Invoice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInvoice(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Invoice", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTorg12() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Torg12");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTorg12(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Torg12", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNoticeDiscounts() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("NoticeDiscounts");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNoticeDiscounts(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("NoticeDiscounts", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getInfsoob() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Infsoob");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setInfsoob(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Infsoob", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAddAgreement() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AddAgreement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAddAgreement(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AddAgreement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDirectDebitContract() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("DirectDebitContract");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDirectDebitContract(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("DirectDebitContract", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDelivery() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Delivery");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDelivery(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Delivery", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRegistryUdt() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("RegistryUdt");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRegistryUdt(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("RegistryUdt", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRegistryPdt() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("RegistryPdt");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRegistryPdt(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("RegistryPdt", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOrders() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Orders");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOrders(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Orders", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getRecadv() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Recadv");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setRecadv(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Recadv", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDesadv() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Desadv");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDesadv(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Desadv", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditRequest() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditApplication() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditApplication");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditApplication(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditApplication", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditRequestReply() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditRequestReply");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditRequestReply(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditRequestReply", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditDocumentation() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditDocumentation");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditDocumentation(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditDocumentation", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditDocumentationConf() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditDocumentationConf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditDocumentationConf(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditDocumentationConf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getConfirmationDocument() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ConfirmationDocument");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setConfirmationDocument(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ConfirmationDocument", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFeesRegisterInvestment() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("FeesRegisterInvestment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFeesRegisterInvestment(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("FeesRegisterInvestment", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUpdInvoice() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UpdInvoice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUpdInvoice(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UpdInvoice", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUpdInfo() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UpdInfo");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUpdInfo(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UpdInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUpdInvoiceInfo() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UpdInvoiceInfo");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUpdInvoiceInfo(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UpdInvoiceInfo", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUcdInvoice() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UcdInvoice");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUcdInvoice(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UcdInvoice", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUcdDic() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UcdDic");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUcdDic(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UcdDic", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getUcdInvoiceDic() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("UcdInvoiceDic");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setUcdInvoiceDic(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("UcdInvoiceDic", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAdditionalFinancingRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AdditionalFinancingRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAdditionalFinancingRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AdditionalFinancingRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCancelFinancingRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CancelFinancingRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCancelFinancingRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CancelFinancingRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGoodsDeliveryReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("GoodsDeliveryReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGoodsDeliveryReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("GoodsDeliveryReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getWorksDeliveryReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("WorksDeliveryReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setWorksDeliveryReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("WorksDeliveryReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceKP() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceKP");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceKP(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceKP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceTask() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceTask");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceTask(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceTask", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceContract() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceContract");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceContract(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceContract", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceDocRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceDocRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceDocRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceDocRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getPaymentOrder() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("PaymentOrder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setPaymentOrder(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("PaymentOrder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceDocResponse() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceDocResponse");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceDocResponse(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceDocResponse", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceReportProject() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceReportProject");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceReportProject(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceReportProject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getServiceReport() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ServiceReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setServiceReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ServiceReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementFpg() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementFpg");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementFpg(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementFpg", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getReport() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Report");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Report", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDeliveryAgreement() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("DeliveryAgreement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDeliveryAgreement(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("DeliveryAgreement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFinancialMonitoringRequest() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("FinancialMonitoringRequest");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinancialMonitoringRequest(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("FinancialMonitoringRequest", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getFinancialMonitoringRequestReply() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("FinancialMonitoringRequestReply");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setFinancialMonitoringRequestReply(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode")
          .set("FinancialMonitoringRequestReply", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementFpgDop() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementFpgDop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementFpgDop(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementFpgDop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementFpgReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementFpgReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementFpgReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementFpgReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementFpgFinReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementFpgFinReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementFpgFinReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementFpgFinReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementFpgAReport() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementFpgAReport");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementFpgAReport(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementFpgAReport", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMgtsDetailmobf() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("MgtsDetailmobf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMgtsDetailmobf(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("MgtsDetailmobf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMgtsDetailmgmnf() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("MgtsDetailmgmnf");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMgtsDetailmgmnf(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("MgtsDetailmgmnf", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMgtsDecoding() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("MgtsDecoding");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMgtsDecoding(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("MgtsDecoding", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMgtsDetail009f() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("MgtsDetail009f");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMgtsDetail009f(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("MgtsDetail009f", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSoglVolga() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("SoglVolga");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSoglVolga(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("SoglVolga", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMgtsBill() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("MgtsBill");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMgtsBill(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("MgtsBill", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getMail() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Mail");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setMail(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Mail", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getNotification() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("Notification");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setNotification(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("Notification", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTN() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("TN");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTN(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("TN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDeletionAct() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("DeletionAct");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDeletionAct(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("DeletionAct", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSberbankNote() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("SberbankNote");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSberbankNote(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("SberbankNote", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBillUvhd() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("BillUvhd");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBillUvhd(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("BillUvhd", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGlobalMarketAct() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("GlobalMarketAct");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGlobalMarketAct(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("GlobalMarketAct", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGlobalMarketAgreement() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("GlobalMarketAgreement");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGlobalMarketAgreement(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("GlobalMarketAgreement", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGlobalMarketDop() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("GlobalMarketDop");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGlobalMarketDop(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("GlobalMarketDop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getGlobalMarketProject() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("GlobalMarketProject");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setGlobalMarketProject(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("GlobalMarketProject", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCreditPaymentOrder() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CreditPaymentOrder");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCreditPaymentOrder(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CreditPaymentOrder", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getTargetUse() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("TargetUse");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setTargetUse(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("TargetUse", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBankNotification() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("BankNotification");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBankNotification(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("BankNotification", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBankRequirements() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("BankRequirements");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBankRequirements(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("BankRequirements", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getApplicationBusinessCard() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ApplicationBusinessCard");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setApplicationBusinessCard(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ApplicationBusinessCard", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getApplicationPackageServices() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ApplicationPackageServices");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setApplicationPackageServices(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ApplicationPackageServices", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementControlAccept() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementControlAccept");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementControlAccept(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementControlAccept", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementIndividTariffs() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementIndividTariffs");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementIndividTariffs(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementIndividTariffs", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAgreementIndividService() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AgreementIndividService");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAgreementIndividService(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AgreementIndividService", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCashManagementOffer() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CashManagementOffer");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCashManagementOffer(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CashManagementOffer", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCashManagementContract() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CashManagementContract");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCashManagementContract(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CashManagementContract", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getCollectionContract() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("CollectionContract");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setCollectionContract(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("CollectionContract", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getSpecAccount() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("SpecAccount");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setSpecAccount(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("SpecAccount", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getOrderGuarantee() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("OrderGuarantee");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setOrderGuarantee(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("OrderGuarantee", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIkQualifyingSelection() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("IkQualifyingSelection");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIkQualifyingSelection(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("IkQualifyingSelection", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIkMonitoring() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("IkMonitoring");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIkMonitoring(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("IkMonitoring", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getIkReports() {
    try {
      java.lang.String res = Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("IkReports");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setIkReports(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("IkReports", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBankingAccompaniment() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("BankingAccompaniment");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBankingAccompaniment(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("BankingAccompaniment", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getDocumentsForReestr() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("DocumentsForReestr");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setDocumentsForReestr(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("DocumentsForReestr", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getBankingServicesDocuments() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("BankingServicesDocuments");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setBankingServicesDocuments(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("BankingServicesDocuments", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getActAwardTander() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("ActAwardTander");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setActAwardTander(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("ActAwardTander", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  @MethodTypeAnnotation(type = "GetField")
  public static java.lang.String getAcceptRealEstateFinansing() {
    try {
      java.lang.String res =
          Javonet.getType("Korus.Eds.Api.DocumentTypeCode").get("AcceptRealEstateFinansing");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  @MethodTypeAnnotation(type = "SetField")
  public static void setAcceptRealEstateFinansing(java.lang.String param) {
    try {
      Javonet.getType("Korus.Eds.Api.DocumentTypeCode").set("AcceptRealEstateFinansing", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DocumentTypeCode() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.DocumentTypeCode");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DocumentTypeCode(NObject handle) {
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
