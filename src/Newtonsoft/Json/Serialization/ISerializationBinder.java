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

public interface ISerializationBinder {
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public jio.System.Type BindToType(java.lang.String assemblyName, java.lang.String typeName);
  /** Method */
  @MethodTypeAnnotation(type = "Method")
  public void BindToName(
      jio.System.Type serializedType,
      AtomicReference<java.lang.String> assemblyName,
      AtomicReference<java.lang.String> typeName);
}
