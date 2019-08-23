package Korus.Eds.Core.Data;

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
import Korus.Eds.Core.Data.*;
import Korus.Eds.Core.*;
import jio.System.*;

public interface IBaseDocumentFilter {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DocumentFolder getFolder();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getParticipantId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getStatusId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCreatedFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCreatedTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContractNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getContractDateFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getContractDateTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getSendDateFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getSendDateTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getReceiveDateFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getReceiveDateTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIsDocflowCompleted();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getIsMine();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer[] getUserId(Class<?> returnArrayType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer[] getGroupId(Class<?> returnArrayType);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContractNumber(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContractDateFrom(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContractDateTo(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSendDateFrom(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSendDateTo(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiveDateFrom(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setReceiveDateTo(Nullable<DateTime> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsDocflowCompleted(Nullable<java.lang.Boolean> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsMine(Nullable<java.lang.Boolean> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUserId(java.lang.Integer[] value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setGroupId(java.lang.Integer[] value);
}
