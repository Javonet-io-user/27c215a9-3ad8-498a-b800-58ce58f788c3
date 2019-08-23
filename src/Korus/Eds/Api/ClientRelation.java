package Korus.Eds.Api;

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
import Korus.Eds.Api.*;
import jio.System.*;
import Korus.Eds.Core.*;
import Korus.Eds.Core.Data.*;
import Sphere.Shared.Core.*;

public class ClientRelation extends AbonentName implements IAbonentName, IAbonent, IClientRelation {
  protected NObject javonetHandle;
  /** SetProperty */
  @MethodTypeAnnotation(type = "SetField")
  public void setRelationId(Nullable<java.lang.Long> value) {
    try {
      javonetHandle
          .explicitInterface("Korus.Eds.Core.IClientRelation")
          .invoke("set_RelationId", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public Nullable<java.lang.Long> getRelationId() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Korus.Eds.Core.IClientRelation")
              .invoke("get_RelationId");
      if (res == null) return null;
      return new Nullable<java.lang.Long>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  @MethodTypeAnnotation(type = "SetField")
  public void setStatus(RequestRelationStatus value) {
    try {
      javonetHandle
          .explicitInterface("Korus.Eds.Core.IClientRelation")
          .invoke("set_Status", NEnum.fromJavaEnum(value));
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  @MethodTypeAnnotation(type = "GetField")
  public RequestRelationStatus getStatus() {
    try {
      Object res =
          javonetHandle.explicitInterface("Korus.Eds.Core.IClientRelation").invoke("get_Status");
      if (res == null) return null;
      return RequestRelationStatus.valueOf(((NEnum) res).getValueName());
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ClientRelation() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Korus.Eds.Api.ClientRelation");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClientRelation(NObject handle) {
    super(handle);
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
