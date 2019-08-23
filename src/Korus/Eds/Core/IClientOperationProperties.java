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

public interface IClientOperationProperties {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsRestrictedAccess();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getDirectRecall();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Boolean> getAutoSendMessage();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsArchiveAccess();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getBlockWriteAccess();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsRestrictedAccess(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDirectRecall(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setAutoSendMessage(Nullable<java.lang.Boolean> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsArchiveAccess(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setBlockWriteAccess(java.lang.Boolean value);
}
