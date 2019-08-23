package Newtonsoft.Json;

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
import jio.System.Collections.Generic.*;
import jio.System.Runtime.Serialization.Formatters.*;
import Newtonsoft.Json.Serialization.*;
import jio.System.Collections.*;
import jio.System.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Globalization.*;

public class JsonSerializerSettings {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setReferenceLoopHandling(ReferenceLoopHandling value) {
    try {
      javonetHandle.set("ReferenceLoopHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ReferenceLoopHandling getReferenceLoopHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ReferenceLoopHandling");
      if (res == null) return null;
      return ReferenceLoopHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMissingMemberHandling(MissingMemberHandling value) {
    try {
      javonetHandle.set("MissingMemberHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MissingMemberHandling getMissingMemberHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("MissingMemberHandling");
      if (res == null) return null;
      return MissingMemberHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setObjectCreationHandling(ObjectCreationHandling value) {
    try {
      javonetHandle.set("ObjectCreationHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ObjectCreationHandling getObjectCreationHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ObjectCreationHandling");
      if (res == null) return null;
      return ObjectCreationHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setNullValueHandling(NullValueHandling value) {
    try {
      javonetHandle.set("NullValueHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public NullValueHandling getNullValueHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("NullValueHandling");
      if (res == null) return null;
      return NullValueHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDefaultValueHandling(DefaultValueHandling value) {
    try {
      javonetHandle.set("DefaultValueHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DefaultValueHandling getDefaultValueHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DefaultValueHandling");
      if (res == null) return null;
      return DefaultValueHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConverters(jio.System.Collections.Generic.IList<JsonConverter> value) {
    try {
      javonetHandle.set("Converters", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.Generic.IList<JsonConverter> getConverters() {
    try {
      Object res = javonetHandle.<NObject>get("Converters");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setPreserveReferencesHandling(PreserveReferencesHandling value) {
    try {
      javonetHandle.set("PreserveReferencesHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public PreserveReferencesHandling getPreserveReferencesHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("PreserveReferencesHandling");
      if (res == null) return null;
      return PreserveReferencesHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeNameHandling(TypeNameHandling value) {
    try {
      javonetHandle.set("TypeNameHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TypeNameHandling getTypeNameHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("TypeNameHandling");
      if (res == null) return null;
      return TypeNameHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMetadataPropertyHandling(MetadataPropertyHandling value) {
    try {
      javonetHandle.set("MetadataPropertyHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public MetadataPropertyHandling getMetadataPropertyHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("MetadataPropertyHandling");
      if (res == null) return null;
      return MetadataPropertyHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeNameAssemblyFormat(FormatterAssemblyStyle value) {
    try {
      javonetHandle.set("TypeNameAssemblyFormat", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FormatterAssemblyStyle getTypeNameAssemblyFormat() {
    try {
      Object res = javonetHandle.<NEnum>get("TypeNameAssemblyFormat");
      if (res == null) return null;
      return FormatterAssemblyStyle.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTypeNameAssemblyFormatHandling(TypeNameAssemblyFormatHandling value) {
    try {
      javonetHandle.set("TypeNameAssemblyFormatHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public TypeNameAssemblyFormatHandling getTypeNameAssemblyFormatHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("TypeNameAssemblyFormatHandling");
      if (res == null) return null;
      return TypeNameAssemblyFormatHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setConstructorHandling(ConstructorHandling value) {
    try {
      javonetHandle.set("ConstructorHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ConstructorHandling getConstructorHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("ConstructorHandling");
      if (res == null) return null;
      return ConstructorHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContractResolver(IContractResolver value) {
    try {
      javonetHandle.set("ContractResolver", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IContractResolver getContractResolver() {
    try {
      Object res = javonetHandle.<NObject>get("ContractResolver");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setEqualityComparer(jio.System.Collections.IEqualityComparer value) {
    try {
      javonetHandle.set("EqualityComparer", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public jio.System.Collections.IEqualityComparer getEqualityComparer() {
    try {
      Object res = javonetHandle.<NObject>get("EqualityComparer");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReferenceResolver(IReferenceResolver value) {
    try {
      javonetHandle.set("ReferenceResolver", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public IReferenceResolver getReferenceResolver() {
    try {
      Object res = javonetHandle.<NObject>get("ReferenceResolver");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setReferenceResolverProvider(FuncTResult<IReferenceResolver> value) {
    try {
      javonetHandle.set("ReferenceResolverProvider", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FuncTResult<IReferenceResolver> getReferenceResolverProvider() {
    try {
      Object res = javonetHandle.<NObject>get("ReferenceResolverProvider");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setTraceWriter(ITraceWriter value) {
    try {
      javonetHandle.set("TraceWriter", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ITraceWriter getTraceWriter() {
    try {
      Object res = javonetHandle.<NObject>get("TraceWriter");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setBinder(SerializationBinder value) {
    try {
      javonetHandle.set("Binder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public SerializationBinder getBinder() {
    try {
      Object res = javonetHandle.<NObject>get("Binder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setSerializationBinder(ISerializationBinder value) {
    try {
      javonetHandle.set("SerializationBinder", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public ISerializationBinder getSerializationBinder() {
    try {
      Object res = javonetHandle.<NObject>get("SerializationBinder");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setError(EventHandler<ErrorEventArgs> value) {
    try {
      javonetHandle.set("Error", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public EventHandler<ErrorEventArgs> getError() {
    try {
      Object res = javonetHandle.<NObject>get("Error");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setContext(StreamingContext value) {
    try {
      javonetHandle.set("Context", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StreamingContext getContext() {
    try {
      Object res = javonetHandle.<NObject>get("Context");
      if (res == null) return null;
      return new StreamingContext((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormatString(java.lang.String value) {
    try {
      javonetHandle.set("DateFormatString", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.String getDateFormatString() {
    try {
      java.lang.String res = javonetHandle.get("DateFormatString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setMaxDepth(Nullable<java.lang.Integer> value) {
    try {
      javonetHandle.set("MaxDepth", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Integer> getMaxDepth() {
    try {
      Object res = javonetHandle.<NObject>get("MaxDepth");
      if (res == null) return null;
      return new Nullable<java.lang.Integer>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFormatting(Formatting value) {
    try {
      javonetHandle.set("Formatting", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Formatting getFormatting() {
    try {
      Object res = javonetHandle.<NEnum>get("Formatting");
      if (res == null) return null;
      return Formatting.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateFormatHandling(DateFormatHandling value) {
    try {
      javonetHandle.set("DateFormatHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateFormatHandling getDateFormatHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DateFormatHandling");
      if (res == null) return null;
      return DateFormatHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateTimeZoneHandling(DateTimeZoneHandling value) {
    try {
      javonetHandle.set("DateTimeZoneHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateTimeZoneHandling getDateTimeZoneHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DateTimeZoneHandling");
      if (res == null) return null;
      return DateTimeZoneHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setDateParseHandling(DateParseHandling value) {
    try {
      javonetHandle.set("DateParseHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public DateParseHandling getDateParseHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("DateParseHandling");
      if (res == null) return null;
      return DateParseHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFloatFormatHandling(FloatFormatHandling value) {
    try {
      javonetHandle.set("FloatFormatHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FloatFormatHandling getFloatFormatHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("FloatFormatHandling");
      if (res == null) return null;
      return FloatFormatHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setFloatParseHandling(FloatParseHandling value) {
    try {
      javonetHandle.set("FloatParseHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public FloatParseHandling getFloatParseHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("FloatParseHandling");
      if (res == null) return null;
      return FloatParseHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStringEscapeHandling(StringEscapeHandling value) {
    try {
      javonetHandle.set("StringEscapeHandling", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public StringEscapeHandling getStringEscapeHandling() {
    try {
      Object res = javonetHandle.<NEnum>get("StringEscapeHandling");
      if (res == null) return null;
      return StringEscapeHandling.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCulture(CultureInfo value) {
    try {
      javonetHandle.set("Culture", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public CultureInfo getCulture() {
    try {
      Object res = javonetHandle.<NObject>get("Culture");
      if (res == null) return null;
      return new CultureInfo((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setCheckAdditionalContent(java.lang.Boolean value) {
    try {
      javonetHandle.set("CheckAdditionalContent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public java.lang.Boolean getCheckAdditionalContent() {
    try {
      java.lang.Boolean res = javonetHandle.get("CheckAdditionalContent");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public JsonSerializerSettings() {
    try {
      javonetHandle = Javonet.New("Newtonsoft.Json.JsonSerializerSettings");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public JsonSerializerSettings(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
