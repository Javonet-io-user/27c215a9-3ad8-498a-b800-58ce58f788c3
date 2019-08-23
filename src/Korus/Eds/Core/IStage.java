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
import jio.System.*;

public interface IStage {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getGroupId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsMandatory();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getUserId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserLogin();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUserName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getPeriod();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCertificateEnd();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUserName(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCertificateEnd(Nullable<DateTime> value);
}
