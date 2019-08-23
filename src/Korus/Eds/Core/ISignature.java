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

public interface ISignature {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getUuid();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getSignerCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Byte[] getContent(Class<?> returnArrayType);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setUuid(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setSignerCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContent(java.lang.Byte[] value);
}
