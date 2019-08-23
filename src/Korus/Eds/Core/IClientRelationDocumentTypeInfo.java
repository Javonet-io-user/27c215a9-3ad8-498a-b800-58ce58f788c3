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

public interface IClientRelationDocumentTypeInfo {
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Integer getId();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public Nullable<DocumentRelationType> getDocumentRelationType();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getEdiCode();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDocumentRelationType(Nullable<DocumentRelationType> value);
}
