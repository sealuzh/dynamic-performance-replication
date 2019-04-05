/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 10:53:18 GMT 2019
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import wheel.json.JSONArray;
import wheel.json.JSONObject;
import wheel.json.JSONTokener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JSONObject_ESTest extends JSONObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      HashMap<Double, Byte> hashMap0 = new HashMap<Double, Byte>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      try { 
        jSONObject0.getInt("|QXopBf:k#/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"|QXopBf:k#/\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Float float0 = new Float(2620.4913567699);
      String[] stringArray0 = JSONObject.getNames((Object) float0);
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.put("*-NT*:Nh", true);
      jSONObject1.optString("*-NT*:Nh");
      assertEquals(9, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.put(": ", true);
      boolean boolean0 = jSONObject1.optBoolean(": ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      jSONObject0.put("J+:s&C7@Y~m0m", (Map) null);
      Object object0 = jSONObject0.opt("J+:s&C7@Y~m0m");
      assertFalse(object0.equals((Object)jSONObject0));
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      Double double0 = new Double((-47.9837717593311));
      hashMap0.put(double0, double0);
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      int int0 = jSONObject0.length();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      JSONObject jSONObject1 = jSONObject0.put("L{&t", (Map) null);
      String string0 = jSONObject1.getString("L{&t");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Short short0 = new Short((short) (-446));
      JSONObject jSONObject0 = new JSONObject(short0);
      jSONObject0.put("+ Nld:h,On", (Object) "+ Nld:h,On");
      jSONObject0.get("+ Nld:h,On");
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.toString((-2389), (-2389));
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = null;
      Object object0 = jSONObject0.remove(string0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.put("] is not a JSONArray.", object0);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("", (Object) null);
      assertEquals(0, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Double double0 = new Double(1162.09);
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.put("P][[M0-_AZcq", (-2872L));
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      JSONObject jSONObject1 = jSONObject0.put("getnotify", 32);
      assertEquals(1, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.put("] is not a JSONArray.", (-2053));
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("] not found.", 948.538);
      assertEquals(1, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.put("] is not a JSONArray.", (-215.8279046053));
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Byte byte0 = new Byte((byte)38);
      JSONObject jSONObject0 = new JSONObject(byte0);
      jSONObject0.optLong("toS", (long) (byte)38);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      Double double0 = new Double(1162.09);
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      long long0 = jSONObject0.optLong("P][[M0-_AZcq", (-2872L));
      assertEquals((-2872L), long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.optLong("");
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      int int0 = jSONObject0.optInt("sho", (-6121));
      assertEquals((-6121), int0);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      int int0 = jSONObject0.optInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      HashMap<Double, Byte> hashMap0 = new HashMap<Double, Byte>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      boolean boolean0 = jSONObject0.optBoolean((String) null, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      HashMap<JSONObject, Integer> hashMap0 = new HashMap<JSONObject, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      try { 
        jSONObject0.put((String) null, (Map) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      try { 
        jSONObject0.put((String) null, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.getLong("Expected a ',' or ']'");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"Expected a ',' or ']'\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((JSONTokener) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      String[] stringArray0 = new String[5];
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((Object) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      HashMap<String, JSONObject> hashMap0 = new HashMap<String, JSONObject>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.toString(0, 0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      String string0 = JSONObject.quote((String) null);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.put((String) null, (Object) jSONObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      double double0 = jSONObject0.optDouble("\"", 414.0157704);
      assertEquals(1, jSONObject0.length());
      assertEquals(414.0157704, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      Object object0 = jSONObject0.opt("J+:s&C7@Y~m0m");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      Double double0 = new Double(1162.09);
      String string0 = JSONObject.numberToString(double0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.accumulate(",sm@BhgD;[*i>", jSONObject0);
      try { 
        jSONObject1.getInt(",sm@BhgD;[*i>");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\",sm@BhgD;[*i>\"] is not a number.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.accumulate("", jSONObject0);
      try { 
        jSONObject0.getDouble("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] is not a number.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      int int0 = jSONObject0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      Byte byte0 = new Byte((byte)38);
      JSONObject jSONObject0 = new JSONObject(byte0);
      jSONObject0.keys();
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      LinkedList<Short> linkedList0 = new LinkedList<Short>();
      JSONObject jSONObject1 = jSONObject0.put("3,=y7(d", (Collection) linkedList0);
      StringWriter stringWriter0 = new StringWriter(2354);
      jSONObject1.write(stringWriter0);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      JSONObject jSONObject1 = jSONObject0.put("J+:s&C7@Y~m0m", (Map) null);
      StringWriter stringWriter0 = new StringWriter(2338);
      Writer writer0 = jSONObject1.write(stringWriter0);
      assertSame(stringWriter0, writer0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "~q<;fwY");
      // Undeclared exception!
      jSONObject0.toString(1422, 1422);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = JSONObject.valueToString(linkedList0, 382, 382);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      HashMap<String, JSONObject> hashMap0 = new HashMap<String, JSONObject>();
      String string0 = JSONObject.valueToString(hashMap0, 0, 0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("6.Ec5XXHq<DFD", (Collection) null);
      String string0 = jSONObject0.toString(8192, 34);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      JSONObject jSONObject1 = jSONObject0.put("2'&", true);
      JSONObject.valueToString(jSONObject1, 45, 48);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String string0 = JSONObject.valueToString(object0, 4, (-368));
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      String string0 = JSONObject.valueToString((Object) null, (-905), (-905));
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      HashMap<JSONObject, Integer> hashMap0 = new HashMap<JSONObject, Integer>();
      String string0 = JSONObject.valueToString(hashMap0);
      assertEquals("{}", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      jSONObject0.put(".", (Map) hashMap0);
      jSONObject0.toString();
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String string0 = JSONObject.valueToString(object0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      String string0 = JSONObject.valueToString((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      JSONObject jSONObject1 = jSONObject0.append("", "");
      jSONObject1.toString();
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Long long0 = new Long((-1L));
      linkedList0.add((Object) long0);
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONArray jSONArray1 = jSONObject0.toJSONArray(jSONArray0);
      assertNotNull(jSONArray1);
      assertEquals(1, jSONArray1.length());
      assertNotSame(jSONArray1, jSONArray0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      JSONArray jSONArray1 = jSONObject0.toJSONArray(jSONArray0);
      assertNull(jSONArray1);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Short short0 = new Short((short)2011);
      String[] stringArray0 = new String[1];
      JSONObject jSONObject0 = new JSONObject(short0, stringArray0);
      JSONArray jSONArray0 = jSONObject0.toJSONArray((JSONArray) null);
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Float float0 = new Float(2620.4913567699);
      String[] stringArray0 = JSONObject.getNames((Object) float0);
      assertNotNull(stringArray0);
      
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      jSONObject0.toString(546, 58);
      assertEquals(8, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Double double0 = new Double(Double.NaN);
      try { 
        JSONObject.numberToString(double0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSON does not allow non-finite numbers.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      JSONObject.testValidity((Object) null);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Short short0 = new Short((short) (-446));
      JSONObject jSONObject0 = new JSONObject(short0);
      try { 
        jSONObject0.getJSONArray("vG:M:1R</co");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"vG:M:1R<\\/co\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JSONObject jSONObject0 = new JSONObject("]):p<01", stringArray0);
      int int0 = jSONObject0.optInt("]):p<01", 8448);
      assertEquals(8448, int0);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      String string0 = JSONObject.quote("{\n                                               \"java.lang.String@0000000002\": java.lang.Long@0000000003,\n                                               \"java.lang.String@0000000009\": java.lang.Long@000000001,\n                                               \"java.lang.String@0000000004\": java.lang.Long@0000000005\n                                  }");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      String[] stringArray0 = new String[1];
      JSONObject jSONObject0 = new JSONObject("]):p<01", stringArray0);
      try { 
        jSONObject0.get((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Short short0 = new Short((short)5);
      JSONObject jSONObject0 = new JSONObject(short0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "Expected a ',' or ']'";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Boolean boolean0 = Boolean.valueOf("g59{#:=fVv9GU");
      try { 
        jSONObject0.accumulate((String) null, boolean0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Double double0 = new Double(1162.09);
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      jSONObject0.append("%BL~", "%BL~");
      String string0 = jSONObject0.optString("%BL~", "[IybDgcNL$Zb,3u:@");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      JSONObject jSONObject1 = jSONObject0.put(".", (Map) hashMap0);
      jSONObject1.optJSONObject(".");
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.optJSONObject("lJ_Ef; -GVy@[`\"i");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.optJSONArray("dec");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("O9ctHgt3=MG7-H@;Gz", 0.0);
      double double0 = jSONObject1.optDouble("O9ctHgt3=MG7-H@;Gz");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("par", 1L);
      Long long0 = new Long(1L);
      JSONObject jSONObject2 = jSONObject1.put("getmax", (Object) long0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = JSONObject.valueToString(linkedList0);
      JSONArray jSONArray0 = new JSONArray((Collection) linkedList0);
      jSONObject2.names();
      JSONObject jSONObject3 = jSONObject1.put("", 0L);
      String string1 = JSONObject.valueToString(jSONObject3, 13, 34);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("Missing value", 0L);
      String string0 = jSONObject0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      try { 
        JSONObject.numberToString((Number) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null pointer
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "\"java.lang.String@0000000001\"");
      StringWriter stringWriter0 = new StringWriter();
      jSONObject0.write(stringWriter0);
      assertEquals(3, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Double double0 = new Double(1162.09);
      String[] stringArray0 = new String[2];
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
      JSONArray jSONArray0 = jSONObject0.names();
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = JSONObject.getNames(object0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      String[] stringArray0 = JSONObject.getNames((Object) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSONArray jSONArray0 = new JSONArray();
      String[] stringArray0 = new String[6];
      JSONObject jSONObject0 = new JSONObject(jSONArray0, stringArray0);
      String[] stringArray1 = JSONObject.getNames(jSONObject0);
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("O9ctHgt3=MG7-H@;Gz", 0.0);
      long long0 = jSONObject1.optLong("O9ctHgt3=MG7-H@;Gz", (long) 0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      JSONObject jSONObject1 = jSONObject0.put("2'&", true);
      long long0 = jSONObject1.optLong("2'&");
      assertEquals(2, jSONObject0.length());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.accumulate("", jSONObject0);
      JSONObject jSONObject2 = jSONObject1.getJSONObject("");
      assertSame(jSONObject2, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Byte byte0 = new Byte((byte)38);
      JSONObject jSONObject0 = new JSONObject(byte0);
      JSONObject jSONObject1 = jSONObject0.put("{\"java.lang.String@0000000002\": \"java.lang.Class@0000000003\"}", (long) (byte)38);
      try { 
        jSONObject1.getJSONObject("{\"java.lang.String@0000000002\": \"java.lang.Class@0000000003\"}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"{\\\"java.lang.String@0000000002\\\": \\\"java.lang.Class@0000000003\\\"}\"] is not a JSONObject.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("true", (double) 0);
      try { 
        jSONObject0.getJSONArray("true");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"true\"] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("par", 1L);
      int int0 = jSONObject0.getInt("par");
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("par", 1L);
      Object object0 = jSONObject1.get("par");
      jSONObject1.put("getmax", object0);
      double double0 = jSONObject0.getDouble("getmax");
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("EFl@", true);
      boolean boolean0 = jSONObject0.optBoolean("EFl@", false);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.accumulate("sp", "sp");
      boolean boolean0 = jSONObject0.optBoolean("sp", false);
      assertEquals(1, jSONObject0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Byte byte0 = new Byte((byte)0);
      JSONObject jSONObject0 = new JSONObject(byte0);
      jSONObject0.accumulate("JSONArray[", byte0);
      try { 
        jSONObject0.getBoolean("JSONArray[");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"JSONArray[\"] is not a Boolean.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      HashMap<Boolean, Float> hashMap0 = new HashMap<Boolean, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.put("j6MGDhD(; qe'~", false);
      boolean boolean0 = jSONObject1.optBoolean("j6MGDhD(; qe'~");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      String string0 = JSONObject.doubleToString(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      String string0 = JSONObject.doubleToString(1457.28);
      assertEquals("1457.28", string0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      String string0 = JSONObject.doubleToString(Double.NaN);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      Integer integer0 = new Integer(110);
      JSONObject jSONObject1 = jSONObject0.append("sho", integer0);
      Double double0 = new Double((-6121));
      JSONObject jSONObject2 = jSONObject1.append("sho", double0);
      assertSame(jSONObject2, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Object object0 = new Object();
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.append("", "");
      jSONObject0.optJSONArray("");
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<Double, String> hashMap0 = new HashMap<Double, String>();
      jSONObject0.put("has", (Map) hashMap0);
      try { 
        jSONObject0.append("has", hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[has] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("6.Ec5XXHq<DFD", (Collection) null);
      JSONObject jSONObject2 = jSONObject1.accumulate("6.Ec5XXHq<DFD", "6.Ec5XXHq<DFD");
      assertSame(jSONObject2, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONArray jSONArray0 = new JSONArray((Collection) null);
      jSONObject0.accumulate("max", jSONArray0);
      assertEquals(1, jSONObject0.length());
      
      JSONArray jSONArray1 = jSONObject0.getJSONArray("max");
      assertEquals(1, jSONArray1.length());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      Short short0 = new Short((short)2011);
      String[] stringArray0 = new String[1];
      JSONObject jSONObject0 = new JSONObject(short0, stringArray0);
      jSONObject0.putOpt("getreverse", "getreverse");
      jSONObject0.accumulate("getreverse", short0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{n'`aYCf'6gq:St4|");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ',' or '}' at character 17 of {n'`aYCf'6gq:St4|
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{AF]~e ,kQyw)9EY=0>");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at character 4 of {AF]~e ,kQyw)9EY=0>
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{}");
      JSONObject jSONObject0 = new JSONObject(jSONTokener0);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("\n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of 
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      jSONObject0.accumulate(",sm@BhgD;[*i>", object0);
      boolean boolean0 = jSONObject0.isNull(",sm@BhgD;[*i>");
      assertEquals(1, jSONObject0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("EFl@", true);
      boolean boolean0 = jSONObject1.isNull("EFl@");
      assertEquals(1, jSONObject0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.toString(123);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.optInt("] is not a Boolean.");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      boolean boolean0 = jSONObject0.optBoolean("gTPpK3oQshu/'}5Zq");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Map) null);
      String string0 = jSONObject0.optString("<D3Cm<O8&CyMF*?~OX");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("{");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must end with '}' at character 1 of {
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("O9ctHgt3=MG7-H@;Gz", 0.0);
      String[] stringArray0 = JSONObject.getNames(jSONObject1);
      assertEquals(1, jSONObject0.length());
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      jSONObject0.remove("h1twwz`n7R5c N");
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf(false);
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(boolean0, stringArray0);
      try { 
        jSONObject0.getString("getdoubleToRawLongBits");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"getdoubleToRawLongBits\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      double double0 = jSONObject0.optDouble("");
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      HashMap<Double, Byte> hashMap0 = new HashMap<Double, Byte>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      boolean boolean0 = jSONObject0.has("YC2|;^mIS}'");
      assertFalse(boolean0);
  }
}