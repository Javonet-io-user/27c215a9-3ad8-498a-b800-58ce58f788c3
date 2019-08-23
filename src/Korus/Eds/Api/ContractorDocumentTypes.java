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
import jio.System.Collections.Generic.*;

public class ContractorDocumentTypes {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRelationId(java.lang.Long value) {
    try {
      javonetHandle.set("RelationId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getRelationId() {
    try {
      java.lang.Long res = javonetHandle.get("RelationId");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setClientId(java.lang.Long value) {
    try {
      javonetHandle.set("ClientId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getClientId() {
    try {
      java.lang.Long res = javonetHandle.get("ClientId");
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setShortName(java.lang.String value) {
    try {
      javonetHandle.set("ShortName", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getShortName() {
    try {
      java.lang.String res = javonetHandle.get("ShortName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setKpp(java.lang.String value) {
    try {
      javonetHandle.set("Kpp", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getKpp() {
    try {
      java.lang.String res = javonetHandle.get("Kpp");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setInn(java.lang.String value) {
    try {
      javonetHandle.set("Inn", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInn() {
    try {
      java.lang.String res = javonetHandle.get("Inn");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSenderDocumentTypes(List<RelationDocumentType> value) {
    try {
      javonetHandle.set("SenderDocumentTypes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<RelationDocumentType> getSenderDocumentTypes() {
    try {
      Object res = javonetHandle.<NObject>get("SenderDocumentTypes");
      if (res == null) return null;
      return new List<RelationDocumentType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReceiverDocumentTypes(List<RelationDocumentType> value) {
    try {
      javonetHandle.set("ReceiverDocumentTypes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public List<RelationDocumentType> getReceiverDocumentTypes() {
    try {
      Object res = javonetHandle.<NObject>get("ReceiverDocumentTypes");
      if (res == null) return null;
      return new List<RelationDocumentType>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ContractorDocumentTypes() {
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.ContractorDocumentTypes");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ContractorDocumentTypes(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RelationDocumentType[] GetSenderDocumentTypes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetSenderDocumentTypes");
      if (res == null) return null;
      return (RelationDocumentType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public RelationDocumentType[] GetReceiverDocumentTypes(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("GetReceiverDocumentTypes");
      if (res == null) return null;
      return (RelationDocumentType[])
          JavonetHelper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
