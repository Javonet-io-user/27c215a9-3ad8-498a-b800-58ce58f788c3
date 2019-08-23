package Sphere.Shared.Core;

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
import Sphere.Shared.Core.*;

public interface IAbonent {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInn();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setInn(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value);
}
