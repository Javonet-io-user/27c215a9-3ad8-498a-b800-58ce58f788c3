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
import Sphere.Shared.Core.*;
import Korus.Eds.Core.*;

public interface IClient extends IPerson {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public CompanyType getCompanyType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getFullName();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getInn();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getKpp();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRegistryNumber();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRegistrationRequisites();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Directories getDirectories();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getIsLocal();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setCompanyType(CompanyType value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setName(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setFullName(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setInn(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setKpp(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRegistryNumber(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRegistrationRequisites(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDirectories(Directories value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setIsLocal(java.lang.Boolean value);
}
