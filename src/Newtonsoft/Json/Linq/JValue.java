package Newtonsoft.Json.Linq;

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
import Newtonsoft.Json.Linq.*;
import Newtonsoft.Json.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;
import jio.System.Dynamic.*;

public class JValue extends JToken
    implements IJEnumerable<JToken>,
        jio.System.Collections.Generic.IEnumerable<JToken>,
        jio.System.Collections.IEnumerable,
        IJsonLineInfo,
        ICloneable,
        IDynamicMetaObjectProvider,
        IEquatable<JValue>,
        IFormattable,
        IComparable,
        IComparableT<JValue>,
        IConvertible {
  protected NObject javonetHandle;
  /** GetProperty */
  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getHasValuesAsJValue() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasValues");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public JTokenType getTypeAsJValue() {
    try {
      Object res = javonetHandle.<NEnum>get("Type");
      if (res == null) return null;
      return JTokenType.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setValue(Object value) {
    try {
      javonetHandle.set("Value", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Object getValue() {
    try {
      Object res = javonetHandle.<NObject>get("Value");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public JValue(JValue other) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", other);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.Long value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.math.BigDecimal value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.Character value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.math.BigInteger value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.Double value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.Float value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(DateTime value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(DateTimeOffset value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.Boolean value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(java.lang.String value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(Guid value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(Uri value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(TimeSpan value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(Object value) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.Linq.JValue", value);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JValue(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JValue CreateComment(java.lang.String value) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JValue").invoke("CreateComment", value);
      if (res == null) return null;
      return new JValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JValue CreateString(java.lang.String value) {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JValue").invoke("CreateString", value);
      if (res == null) return null;
      return new JValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JValue CreateNull() {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JValue").invoke("CreateNull");
      if (res == null) return null;
      return new JValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static JValue CreateUndefined() {
    try {
      Object res = Javonet.getType("Newtonsoft.Json.Linq.JValue").invoke("CreateUndefined");
      if (res == null) return null;
      return new JValue((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public void WriteTo(JsonWriter writer, JsonConverter[] converters) {
    try {
      javonetHandle.invoke("WriteTo", writer, new Object[] {converters});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(JValue other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean Equals(Object obj) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", obj);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(java.lang.String format) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", format);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(IFormatProvider formatProvider) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.IConvertible")
              .invoke("ToString", formatProvider);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.String ToString(java.lang.String format, IFormatProvider formatProvider) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.IFormattable")
              .invoke("ToString", format, formatProvider);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CompareTo(JValue obj) {
    try {
      java.lang.Integer res = javonetHandle.invoke("CompareTo", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer CompareTo(Object obj) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IComparable").invoke("CompareTo", obj);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public TypeCode GetTypeCode() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.IConvertible").invoke("GetTypeCode");
      if (res == null) return null;
      return TypeCode.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Boolean ToBoolean(IFormatProvider provider) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToBoolean", provider);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Character ToChar(IFormatProvider provider) {
    try {
      java.lang.Character res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToChar", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte ToSByte(IFormatProvider provider) {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToSByte", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Byte ToByte(IFormatProvider provider) {
    try {
      java.lang.Byte res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToByte", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Short ToInt16(IFormatProvider provider) {
    try {
      java.lang.Short res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt16", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ToUInt16(IFormatProvider provider) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt16", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Integer ToInt32(IFormatProvider provider) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt32", provider);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ToUInt32(IFormatProvider provider) {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt32", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Long ToInt64(IFormatProvider provider) {
    try {
      java.lang.Long res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToInt64", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigInteger ToUInt64(IFormatProvider provider) {
    try {
      java.math.BigInteger res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToUInt64", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Float ToSingle(IFormatProvider provider) {
    try {
      java.lang.Float res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToSingle", provider);
      if (res == null) return null;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.lang.Double ToDouble(IFormatProvider provider) {
    try {
      java.lang.Double res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDouble", provider);
      if (res == null) return 0.0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0.0;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public java.math.BigDecimal ToDecimal(IFormatProvider provider) {
    try {
      java.math.BigDecimal res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDecimal", provider);
      if (res == null) return null;
      return (java.math.BigDecimal) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public DateTime ToDateTime(IFormatProvider provider) {
    try {
      Object res =
          javonetHandle.explicitInterface("jio.System.IConvertible").invoke("ToDateTime", provider);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public Object ToType(jio.System.Type conversionType, IFormatProvider provider) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.IConvertible")
              .invoke("ToType", conversionType, provider);
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
