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
import jio.System.Collections.Generic.*;

public interface IDelayedDispatch {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getFrom();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public DateTime getTo();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsNeedSign();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public IEnumerable<IClientQuery> getIDelayedDispatch_Receivers();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFileName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTypeCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getMimeType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getContent(Class<?> returnArrayType);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setId(java.lang.Long value);
}
