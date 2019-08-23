package Korus.Eds.Workflow.Xml;

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
import Korus.Eds.Workflow.Xml.*;
import jio.System.*;
import Sphere.Shared.Core.*;
import Sphere.Shared.Core.Xml.*;

public abstract class RoutedDocumentXmlFile<TDocument, TParticipantsInfo>
    extends DocumentXmlFile<TDocument>
    implements ISerializableObject, IDocumentXmlFile<TDocument>, IRoutedDocumentXmlFile {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "Method")
  public void setParticipants(TParticipantsInfo value) {
    try {
      javonetHandle.invoke("set_Participants", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "Method")
  public TParticipantsInfo getParticipants(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Participants");
      if (res == null) return null;
      return (TParticipantsInfo) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSenderCode() {
    try {
      java.lang.String res = javonetHandle.get("SenderCode");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public RoutedDocumentXmlFile(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void CreateNewId(Nullable<DateTime> date) {
    try {
      javonetHandle.invoke("CreateNewId", date);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** ExplicitSetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IParticipantsInfo getIRoutedDocumentXmlFile_Participants() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Workflow.Xml.IRoutedDocumentXmlFile")
              .invoke("get_Participants");
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
