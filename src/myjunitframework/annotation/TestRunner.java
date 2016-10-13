package myjunitframework.annotation;

import java.lang.reflect.Method;

public class TestRunner {
 public static void executeUnitTests(String className) {
  try {
   Object testObject = Class.forName(className).newInstance();
   Method[] methods = testObject.getClass().getDeclaredMethods();
   for (Method amethod : methods) {
    UnitTest utAnnotation = amethod.getAnnotation(UnitTest.class);
    if (utAnnotation != null) {
     System.out.print(utAnnotation.value() + " : ");
     String result = invoke(amethod, testObject);
     System.out.println(result);
    }
   }
  } catch (Exception x) {
   x.printStackTrace();
  }
 }

 static String invoke(Method m, Object o) {
  String result = "passed";
  try {
   m.invoke(o);
  } catch (Exception x) {
   result = "failed";
  }
  return result;
 }

 public static void main(String[] args) {
  executeUnitTests("myjunitframework.annotation.Example");
 }
}