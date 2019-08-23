package RestSharp.Deserializers;

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
import RestSharp.Deserializers.*;
import RestSharp.*;

public interface IDeserializer {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public <T> T Deserialize(IRestResponse response, Class<?> returnType);
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getRootElement();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getNamespace();
  /** Get property */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormat();
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setRootElement(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setNamespace(java.lang.String value);
  /** Set property */
  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormat(java.lang.String value);
}
