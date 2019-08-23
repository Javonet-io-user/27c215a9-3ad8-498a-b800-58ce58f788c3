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
import jio.System.*;

public interface IClientDetails extends IClient, IPerson, IClientOperationProperties {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getParentId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getTaxAuthorityCode();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsExistsBranch();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getCountryCode();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setParentId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setTaxAuthorityCode(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsExistsBranch(java.lang.Boolean value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCountryCode(java.lang.String value);
}
