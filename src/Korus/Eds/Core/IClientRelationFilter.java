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

public interface IClientRelationFilter extends IDataFilter, IPageable {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getClientId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getQuery();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getParticipantId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<RelationRequestStatus> getStatus();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<RelationRequestSide> getSide();
}
