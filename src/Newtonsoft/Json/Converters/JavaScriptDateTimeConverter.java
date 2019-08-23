package Newtonsoft.Json.Converters;

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
import Newtonsoft.Json.Converters.*;
import Newtonsoft.Json.*;
import jio.System.*;

public class JavaScriptDateTimeConverter extends DateTimeConverterBase {
  protected NObject javonetHandle;

  public JavaScriptDateTimeConverter() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Converters.JavaScriptDateTimeConverter");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JavaScriptDateTimeConverter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteJson(JsonWriter writer, Object value, JsonSerializer serializer) {
    try {
      javonetHandle.invoke("WriteJson", writer, value, serializer);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ReadJson(
      JsonReader reader,
      jio.System.Type objectType,
      Object existingValue,
      JsonSerializer serializer) {
    try {
      Object res = javonetHandle.invoke("ReadJson", reader, objectType, existingValue, serializer);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
