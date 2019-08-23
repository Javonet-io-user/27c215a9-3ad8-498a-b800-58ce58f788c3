package RestSharp;

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
import RestSharp.*;
import jio.System.*;
import jio.System.Threading.Tasks.*;

public class RestClientExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static RestResponseT<Object> ExecuteDynamic(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("ExecuteDynamic", client, request);
      if (res == null) return null;
      return new RestResponseT<Object>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> GetTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("GetTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> PostTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("PostTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> PutTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("PutTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> HeadTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("HeadTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> OptionsTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("OptionsTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> PatchTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("PatchTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> TaskTResult<T> DeleteTaskAsync(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("DeleteTaskAsync", client, request);
      if (res == null) return null;
      return new TaskTResult<T>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Get(IRestClient client, IRestRequest request) {
    try {
      Object res = Javonet.getType("RestSharp.RestClientExtensions").invoke("Get", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Post(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Post", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Put(IRestClient client, IRestRequest request) {
    try {
      Object res = Javonet.getType("RestSharp.RestClientExtensions").invoke("Put", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Head(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Head", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Options(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Options", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Patch(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Patch", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T> IRestResponseT<T> Delete(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Delete", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Get(IRestClient client, IRestRequest request) {
    try {
      Object res = Javonet.getType("RestSharp.RestClientExtensions").invoke("Get", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Post(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Post", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Put(IRestClient client, IRestRequest request) {
    try {
      Object res = Javonet.getType("RestSharp.RestClientExtensions").invoke("Put", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Head(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Head", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Options(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Options", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Patch(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Patch", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IRestResponse Delete(IRestClient client, IRestRequest request) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions").invoke("Delete", client, request);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultParameter(IRestClient restClient, Parameter p) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("AddDefaultParameter", restClient, p);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void RemoveDefaultParameter(IRestClient restClient, java.lang.String name) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("RemoveDefaultParameter", restClient, name);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultParameter(
      IRestClient restClient, java.lang.String name, Object value) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("AddDefaultParameter", restClient, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultParameter(
      IRestClient restClient, java.lang.String name, Object value, ParameterType type) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("AddDefaultParameter", restClient, name, value, NEnum.fromJavaEnum(type));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultHeader(
      IRestClient restClient, java.lang.String name, java.lang.String value) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("AddDefaultHeader", restClient, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static void AddDefaultUrlSegment(
      IRestClient restClient, java.lang.String name, java.lang.String value) {
    try {
      Javonet.getType("RestSharp.RestClientExtensions")
          .invoke("AddDefaultUrlSegment", restClient, name, value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <A> RestRequestAsyncHandle ExecuteAsync(
      IRestClient client, IRestRequest request, ActionT<A> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("ExecuteAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle GetAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("GetAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle PostAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("PostAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle PutAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("PutAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle HeadAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("HeadAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle OptionsAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("OptionsAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle PatchAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("PatchAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static <T, A, B> RestRequestAsyncHandle DeleteAsync(
      IRestClient client, IRestRequest request, ActionT1T2<A, B> callback) {
    try {
      Object res =
          Javonet.getType("RestSharp.RestClientExtensions")
              .invoke("DeleteAsync", client, request, callback);
      if (res == null) return null;
      return new RestRequestAsyncHandle((NObject) res);
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
