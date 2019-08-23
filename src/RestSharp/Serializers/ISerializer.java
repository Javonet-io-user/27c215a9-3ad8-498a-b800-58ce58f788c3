package RestSharp.Serializers;

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
import RestSharp.Serializers.*;
import jio.System.*;

public interface ISerializer {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public java.lang.String Serialize(Object obj);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootElement();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNamespace();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormat();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getContentType();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setNamespace(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setContentType(java.lang.String value);
}
