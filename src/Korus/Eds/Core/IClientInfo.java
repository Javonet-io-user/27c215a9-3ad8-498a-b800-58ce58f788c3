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
import Sphere.Shared.Core.*;
import Korus.Eds.Core.Data.*;
import jio.System.*;

public interface IClientInfo extends IClient, IPerson, ITotalsRow {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsArchiveAccess();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getCreated();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsArchiveAccess(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCreated(Nullable<DateTime> value);
}
