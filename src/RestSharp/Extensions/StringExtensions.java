package RestSharp.Extensions;

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
import RestSharp.Extensions.*;
import jio.System.Globalization.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class StringExtensions {
  protected NObject javonetHandle;

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlDecode(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions").invoke("UrlDecode", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String UrlEncode(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions").invoke("UrlEncode", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlDecode(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions").invoke("HtmlDecode", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlEncode(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions").invoke("HtmlEncode", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String HtmlAttributeEncode(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("HtmlAttributeEncode", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean HasValue(java.lang.String input) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RestSharp.Extensions.StringExtensions").invoke("HasValue", input);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String RemoveUnderscoresAndDashes(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("RemoveUnderscoresAndDashes", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static DateTime ParseJsonDate(java.lang.String input, CultureInfo culture) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("ParseJsonDate", input, culture);
      if (res == null) return null;
      return new DateTime((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String RemoveSurroundingQuotes(java.lang.String input) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("RemoveSurroundingQuotes", input);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean Matches(java.lang.String input, java.lang.String pattern) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("Matches", input, pattern);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToPascalCase(
      java.lang.String lowercaseAndUnderscoredWord, CultureInfo culture) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("ToPascalCase", lowercaseAndUnderscoredWord, culture);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToPascalCase(
      java.lang.String text, java.lang.Boolean removeUnderscores, CultureInfo culture) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("ToPascalCase", text, removeUnderscores, culture);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String ToCamelCase(
      java.lang.String lowercaseAndUnderscoredWord, CultureInfo culture) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("ToCamelCase", lowercaseAndUnderscoredWord, culture);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String MakeInitialLowerCase(java.lang.String word) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("MakeInitialLowerCase", word);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.Boolean IsUpperCase(java.lang.String inputString) {
    try {
      java.lang.Boolean res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("IsUpperCase", inputString);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddUnderscores(java.lang.String pascalCasedWord) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("AddUnderscores", pascalCasedWord);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddDashes(java.lang.String pascalCasedWord) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("AddDashes", pascalCasedWord);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddUnderscorePrefix(java.lang.String pascalCasedWord) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("AddUnderscorePrefix", pascalCasedWord);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static java.lang.String AddSpaces(java.lang.String pascalCasedWord) {
    try {
      java.lang.String res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("AddSpaces", pascalCasedWord);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  @MethodTypeAnnotation(type = "Method")
  public static IEnumerable<java.lang.String> GetNameVariants(
      java.lang.String name, CultureInfo culture) {
    try {
      Object res =
          Javonet.getType("RestSharp.Extensions.StringExtensions")
              .invoke("GetNameVariants", name, culture);
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
