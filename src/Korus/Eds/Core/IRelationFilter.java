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
import Korus.Eds.Core.Data.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public interface IRelationFilter extends IClientRelationFilter, IDataFilter, IPageable {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getDocumentTypeId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DocumentRelationType> getDocumentRelationType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getStartDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DateTime> getEndDate();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public List<java.lang.Long> getClientGroupIds();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setClientGroupIds(List<java.lang.Long> value);
}
