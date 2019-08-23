package Newtonsoft.Json.Bson;

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
import Newtonsoft.Json.*;
import Newtonsoft.Json.Bson.*;
import jio.System.*;
import jio.System.IO.*;

public class BsonReader extends JsonReader implements IDisposable {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setJsonNet35BinaryCompatibility(java.lang.Boolean value) {
    try {
      javonetHandle.set("JsonNet35BinaryCompatibility", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getJsonNet35BinaryCompatibility() {
    try {
      java.lang.Boolean res = javonetHandle.get("JsonNet35BinaryCompatibility");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReadRootValueAsArray(java.lang.Boolean value) {
    try {
      javonetHandle.set("ReadRootValueAsArray", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getReadRootValueAsArray() {
    try {
      java.lang.Boolean res = javonetHandle.get("ReadRootValueAsArray");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateTimeKindHandling(DateTimeKind value) {
    try {
      javonetHandle.set("DateTimeKindHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTimeKind getDateTimeKindHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DateTimeKindHandling");
      if (res == null) return null;
      return DateTimeKind.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public BsonReader(Stream stream) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Bson.BsonReader", stream);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BsonReader(BinaryReader reader) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Bson.BsonReader", reader);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BsonReader(
      Stream stream, java.lang.Boolean readRootValueAsArray, DateTimeKind dateTimeKindHandling) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Bson.BsonReader",
              stream,
              readRootValueAsArray,
              NEnum.fromJavaEnum(dateTimeKindHandling));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BsonReader(
      BinaryReader reader,
      java.lang.Boolean readRootValueAsArray,
      DateTimeKind dateTimeKindHandling) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Newtonsoft.Json.Bson.BsonReader",
              reader,
              readRootValueAsArray,
              NEnum.fromJavaEnum(dateTimeKindHandling));
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BsonReader(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Read() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Read");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Close() {
    try {
      javonetHandle.invoke("Close");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void Dispose() {
    try {
      javonetHandle.invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
