package Newtonsoft.Json.Serialization;

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
import Newtonsoft.Json.Serialization.*;
import jio.System.*;

public interface IReferenceResolver {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public Object ResolveReference(Object context, java.lang.String reference);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String GetReference(Object context, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean IsReferenced(Object context, Object value);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void AddReference(Object context, java.lang.String reference, Object value);
}
