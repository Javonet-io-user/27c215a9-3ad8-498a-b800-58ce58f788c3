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

public interface IDocumentRelation {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Long getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getParentId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<RelationType> getRelation();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDescription();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setId(java.lang.Long value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setParentId(Nullable<java.lang.Long> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRelation(Nullable<RelationType> value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDescription(java.lang.String value);
}
