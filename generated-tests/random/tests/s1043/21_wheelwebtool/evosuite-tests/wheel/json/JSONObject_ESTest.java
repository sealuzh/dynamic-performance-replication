/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 24 16:52:08 GMT 2019
 */

package wheel.json;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
      Float float0 = new Float((float) 2);
      JSONObject.testValidity(float0);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("null");
      jSONObject0.put("-19.4353620093266", (Collection) linkedList0);
      JSONArray jSONArray0 = jSONObject0.optJSONArray("-19.4353620093266");
      assertEquals(1, jSONArray0.length());
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("H3vz;v/JKa}", 227L);
      int int0 = jSONObject1.optInt("H3vz;v/JKa}");
      assertEquals(227, int0);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Integer integer0 = new Integer(21);
      JSONObject jSONObject0 = new JSONObject(integer0);
      int int0 = jSONObject0.length();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = new JSONObject();
      jSONObject0.putOpt("\r", jSONObject1);
      JSONObject jSONObject2 = jSONObject0.getJSONObject("\r");
      assertNotSame(jSONObject0, jSONObject2);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("getcompareTo", (-3343));
      int int0 = jSONObject0.getInt("getcompareTo");
      assertEquals((-3343), int0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      String string0 = JSONObject.valueToString("isparseFloat", 12, (-1877));
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Byte byte0 = new Byte((byte)62);
      String string0 = JSONObject.valueToString(byte0, (-1674), 0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.toString(0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      HashMap<Short, Float> hashMap0 = new HashMap<Short, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.toString((-3984));
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<Byte, Object> hashMap0 = new HashMap<Byte, Object>();
      Byte byte0 = new Byte((byte)101);
      hashMap0.put(byte0, "s`a");
      JSONObject jSONObject1 = jSONObject0.put("n2,H(s`b9b!hN", (Map) hashMap0);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      HashMap<Byte, JSONArray> hashMap0 = new HashMap<Byte, JSONArray>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject1 = jSONObject0.put("", object0);
      assertEquals(1, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "Mu~C;M~U'<");
      jSONObject0.put("\"\"", 0L);
      assertEquals(4, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("xKmn.", 0.0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      HashMap<JSONObject, Integer> hashMap0 = new HashMap<JSONObject, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.put("] is not a JSONObject.", (-3599.764257));
      assertEquals(1, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.optString("java.lang.Double@0000000005", "HuB~vmIcItr&\"");
      assertEquals("HuB~vmIcItr&\"", string0);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Float float0 = new Float(1694.0972F);
      JSONObject jSONObject0 = new JSONObject(float0);
      jSONObject0.optLong("vRt", 0L);
      assertEquals(3, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      long long0 = jSONObject0.optLong("to", 233L);
      assertEquals(233L, long0);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      HashMap<Byte, Float> hashMap0 = new HashMap<Byte, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      int int0 = jSONObject0.optInt((String) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      HashMap<Long, Float> hashMap0 = new HashMap<Long, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      double double0 = jSONObject0.optDouble("", (-2207.0));
      assertEquals((-2207.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      try { 
        jSONObject0.getString((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      try { 
        jSONObject0.get("H S1;rr]");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"H S1;rr]\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.get("");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      String string0 = JSONObject.doubleToString(0.0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      HashMap<Byte, String> hashMap0 = new HashMap<Byte, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.accumulate("uqRP\"\"4o;HPP", (Object) null);
      assertEquals(0, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Double double0 = new Double(Double.NaN);
      try { 
        JSONObject.valueToString(double0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSON does not allow non-finite numbers.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      // Undeclared exception!
      try { 
        JSONObject.getNames((JSONObject) null);
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
      Byte byte0 = new Byte((byte) (-95));
      String[] stringArray0 = new String[4];
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      try { 
        jSONObject0.getInt("G~~uY, g");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"G~~uY, g\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Float float0 = new Float(0.0);
      JSONObject jSONObject0 = new JSONObject(float0);
      try { 
        jSONObject0.getDouble("]26oT3H3+vh,C{^Lv8");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"]26oT3H3+vh,C{^Lv8\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.getBoolean((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      String[] stringArray0 = new String[9];
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
  public void test032()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<JSONObject, Object> hashMap0 = new HashMap<JSONObject, Object>();
      JSONObject jSONObject1 = jSONObject0.put("-twbH", (Map) hashMap0);
      String string0 = jSONObject1.toString(160, 20);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      HashMap<Short, Float> hashMap0 = new HashMap<Short, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.put("bUbj<22\"ss;0m&oMP", true);
      JSONObject jSONObject1 = jSONObject0.accumulate("'", "'");
      jSONObject1.toString((-3984), 19);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      Double double0 = new Double((-3093.841183));
      JSONObject jSONObject0 = new JSONObject(double0);
      // Undeclared exception!
      jSONObject0.toString(2956, 678);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      HashMap<Long, Float> hashMap0 = new HashMap<Long, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.toString(58, 2);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      String string0 = JSONObject.quote(")>mJl-:imQ&ql\"");
      assertEquals("\")>mJl-:imQ&ql\\\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      String string0 = JSONObject.quote((String) null);
      assertEquals("\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.putOpt((String) null, "java.lang.Long@0000000003");
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.putOpt("\"0\"", (Object) null);
      assertEquals(0, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      HashMap<Float, JSONObject> hashMap0 = new HashMap<Float, JSONObject>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.optString("eLp#;wjJY`/", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      HashMap<Byte, String> hashMap0 = new HashMap<Byte, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      jSONObject0.put("ishashCode", (-1837L));
      double double0 = jSONObject0.optDouble("ishashCode", (double) (-1837L));
      assertEquals((-1837.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      HashMap<Byte, String> hashMap0 = new HashMap<Byte, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      double double0 = jSONObject0.optDouble("] not found.", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      HashMap<Byte, String> hashMap0 = new HashMap<Byte, String>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      Object object0 = jSONObject0.opt("uqRP\"\"4o;HPP");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Double double0 = new Double(0.0);
      String string0 = JSONObject.numberToString(double0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      int int0 = jSONObject0.length();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.accumulate("ha", "ha");
      Float float0 = new Float(0.0F);
      JSONObject jSONObject1 = jSONObject0.accumulate("ha", float0);
      StringWriter stringWriter0 = new StringWriter(1300);
      jSONObject1.write(stringWriter0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      String string0 = JSONObject.valueToString(linkedList0, 13, 160);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      HashMap<Byte, Float> hashMap0 = new HashMap<Byte, Float>();
      String string0 = JSONObject.valueToString(hashMap0, 2324, 2003);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Integer integer0 = new Integer((-4800));
      JSONObject jSONObject0 = new JSONObject(integer0);
      jSONObject0.append("koW", "koW");
      JSONObject.valueToString(jSONObject0, 10, 12);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String string0 = JSONObject.valueToString(object0, 1900, 10);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      String string0 = JSONObject.valueToString((Object) null, 4, 4);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      String string0 = JSONObject.valueToString(linkedList0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      HashMap<Byte, Float> hashMap0 = new HashMap<Byte, Float>();
      String string0 = JSONObject.valueToString(hashMap0);
      assertNotNull(string0);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "\")>mJl-:imQ&ql\"\"");
      jSONObject0.append(")>mJl-:imQ&ql\"", ")>mJl-:imQ&ql\"");
      jSONObject0.toString();
      assertEquals(4, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = JSONObject.valueToString(jSONObject0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String string0 = JSONObject.valueToString(object0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      String string0 = JSONObject.valueToString((Object) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      Integer integer0 = new Integer((-4800));
      JSONObject jSONObject0 = new JSONObject(integer0);
      jSONObject0.put("java.lang.Float@0000000001.", 2028.1346);
      JSONObject.valueToString(jSONObject0, 10, 12);
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "i*UxNhxs");
      jSONObject0.toString((-311), (-1891));
      assertEquals(3, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONArray0.put(160, 160);
      JSONArray jSONArray2 = jSONObject0.toJSONArray(jSONArray0);
      assertEquals(161, jSONArray2.length());
      assertNotNull(jSONArray2);
      assertNotSame(jSONArray2, jSONArray1);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONArray jSONArray0 = new JSONArray();
      JSONArray jSONArray1 = jSONObject0.toJSONArray(jSONArray0);
      assertNull(jSONArray1);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Integer integer0 = new Integer((-4800));
      JSONObject jSONObject0 = new JSONObject(integer0);
      jSONObject0.toJSONArray((JSONArray) null);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Double double0 = new Double(0.0);
      String[] stringArray0 = JSONObject.getNames((Object) double0);
      JSONObject jSONObject0 = new JSONObject(double0, stringArray0);
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
  public void test064()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.append("issignum", (Object) null);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.getJSONObject("wZ>2*PM-:E&</3O");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"wZ>2*PM-:E&<\\/3O\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      String string0 = JSONObject.quote("\f");
      assertEquals("\"\\f\"", string0);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.getLong(",\n");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\",\\n\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "i*UxNhxs");
      boolean boolean0 = jSONObject0.optBoolean((String) null, false);
      assertFalse(boolean0);
      assertEquals(3, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject0 = new JSONObject(object0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = ".*Y]l|Z?|i";
      JSONObject jSONObject1 = new JSONObject(jSONObject0, stringArray0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      HashMap<Integer, Boolean> hashMap0 = new HashMap<Integer, Boolean>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONObject jSONObject1 = jSONObject0.put("G17Yjba;HO?77Sn^/6", (Object) null);
      assertEquals(0, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.put("NOv", 34);
      String string0 = jSONObject0.optString("NOv");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<Integer, Byte> hashMap0 = new HashMap<Integer, Byte>();
      JSONObject jSONObject1 = jSONObject0.put("getvalueOf", (Map) hashMap0);
      JSONObject jSONObject2 = jSONObject1.optJSONObject("getvalueOf");
      assertEquals(0, jSONObject2.length());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.optJSONObject("JSONArray[");
      assertNull(jSONObject1);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      jSONObject0.put("-19.4353620093266", (Collection) linkedList0);
      JSONArray jSONArray0 = jSONObject0.optJSONArray("-19.4353620093266");
      assertEquals(0, jSONArray0.length());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Float float0 = new Float(0.0);
      JSONObject jSONObject0 = new JSONObject(float0);
      jSONObject0.optJSONArray("]26oT3H3+vh,C{^Lv8");
      assertEquals(3, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Short short0 = new Short((short)2383);
      jSONObject0.accumulate("isnotify", short0);
      double double0 = jSONObject0.optDouble("isnotify");
      assertEquals(1, jSONObject0.length());
      assertEquals(2383.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
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
  public void test078()  throws Throwable  {
      Short short0 = new Short((short)58);
      String string0 = JSONObject.numberToString(short0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-53));
      String[] stringArray0 = new String[9];
      JSONObject jSONObject0 = new JSONObject(byte0, stringArray0);
      JSONArray jSONArray0 = jSONObject0.names();
      assertNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Float float0 = new Float(0.0);
      JSONObject jSONObject0 = new JSONObject(float0);
      JSONArray jSONArray0 = jSONObject0.names();
      assertEquals(3, jSONObject0.length());
      assertNotNull(jSONArray0);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Object object0 = JSONObject.NULL;
      String[] stringArray0 = JSONObject.getNames(object0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      String[] stringArray0 = JSONObject.getNames((Object) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "i*UxNhxs");
      String[] stringArray0 = JSONObject.getNames(jSONObject0);
      assertNotNull(stringArray0);
      assertEquals(3, jSONObject0.length());
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.putOpt("\r", jSONObject0);
      JSONObject jSONObject1 = jSONObject0.getJSONObject("\r");
      assertEquals(1, jSONObject1.length());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Float float0 = new Float(0.0);
      JSONObject jSONObject1 = jSONObject0.accumulate("H3vz;v/JKa}", float0);
      try { 
        jSONObject1.getJSONObject("H3vz;v/JKa}");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"H3vz;v/JKa}\"] is not a JSONObject.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("not", (Collection) null);
      JSONArray jSONArray0 = jSONObject1.getJSONArray("not");
      assertEquals(0, jSONArray0.length());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put(".", true);
      try { 
        jSONObject1.getJSONArray(".");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\".\"] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Integer integer0 = new Integer((-4800));
      JSONObject jSONObject0 = new JSONObject(integer0);
      JSONObject jSONObject1 = jSONObject0.put("java.lang.Float@0000000001.", 2028.1346);
      int int0 = jSONObject1.getInt("java.lang.Float@0000000001.");
      assertEquals(2, jSONObject0.length());
      assertEquals(2028, int0);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      jSONObject0.put("", (Collection) linkedList0);
      int int0 = jSONObject0.optInt("");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Long long0 = new Long(0L);
      jSONObject0.put("isparseFloat", (Object) long0);
      double double0 = jSONObject0.getDouble("isparseFloat");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("xKmn.", false);
      long long0 = jSONObject1.optLong("xKmn.", (-2955L));
      assertEquals((-2955L), long0);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Integer integer0 = new Integer(21);
      JSONObject jSONObject0 = new JSONObject(integer0);
      jSONObject0.put("false", true);
      boolean boolean0 = jSONObject0.optBoolean("false", false);
      assertEquals(2, jSONObject0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("G=8e8K", "G=8e8K");
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      boolean boolean0 = jSONObject0.optBoolean("G=8e8K");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("xKmn.", false);
      boolean boolean0 = jSONObject1.optBoolean("xKmn.", true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      String string0 = JSONObject.doubleToString((-19.4353620093266));
      assertEquals("-19.4353620093266", string0);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      String string0 = JSONObject.doubleToString(Double.NaN);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      String string0 = JSONObject.doubleToString(10);
      assertEquals("10", string0);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      HashMap<String, Byte> hashMap0 = new HashMap<String, Byte>();
      JSONObject jSONObject1 = jSONObject0.put("*8e(S,vLk7HsrC", (Map) hashMap0);
      Double double0 = new Double(380L);
      try { 
        jSONObject1.append("*8e(S,vLk7HsrC", double0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[*8e(S,vLk7HsrC] is not a JSONArray.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.append("no", "no");
      JSONObject jSONObject2 = jSONObject0.append("no", jSONObject1);
      assertSame(jSONObject1, jSONObject2);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      HashMap<Long, Float> hashMap0 = new HashMap<Long, Float>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      JSONArray jSONArray0 = new JSONArray();
      JSONObject jSONObject1 = jSONObject0.accumulate("", jSONArray0);
      assertSame(jSONObject1, jSONObject0);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      jSONObject0.accumulate("ha", "ha");
      Float float0 = new Float(0.0F);
      JSONObject jSONObject1 = jSONObject0.accumulate("ha", float0);
      Long long0 = new Long(872L);
      jSONObject1.accumulate("ha", long0);
      assertEquals(1, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      Float float0 = new Float(733.262087586259);
      String[] stringArray0 = JSONObject.getNames((Object) float0);
      assertNotNull(stringArray0);
      
      JSONObject jSONObject0 = new JSONObject(float0, stringArray0);
      assertEquals(8, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      Integer integer0 = new Integer((-1663));
      String[] stringArray0 = new String[0];
      JSONObject jSONObject0 = new JSONObject(integer0, stringArray0);
      int int0 = jSONObject0.optInt("", (-1663));
      assertEquals((-1663), int0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("JSONArray[", (Map) null);
      assertSame(jSONObject0, jSONObject1);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject("{\n\"java.lang.String@0000000002\": \"java.lang.String@0000000002\",\n\"java.lang.String@0000000005\": java.lang.Integer@0000000006\n}");
      assertEquals(2, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{e$;1`Q");
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject(jSONTokener0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a ':' after a key at character 4 of {e$;1`Q
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      JSONTokener jSONTokener0 = new JSONTokener("{}");
      JSONObject jSONObject0 = new JSONObject(jSONTokener0);
      assertEquals(0, jSONObject0.length());
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
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
  public void test110()  throws Throwable  {
      JSONObject jSONObject0 = null;
      try {
        jSONObject0 = new JSONObject("btb,/");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // A JSONObject text must begin with '{' at character 1 of btb,/
         //
         verifyException("wheel.json.JSONTokener", e);
      }
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = JSONObject.NULL;
      JSONObject jSONObject1 = jSONObject0.putOpt("6wg<&42q", object0);
      boolean boolean0 = jSONObject1.optBoolean("6wg<&42q");
      assertEquals(1, jSONObject0.length());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      String string0 = jSONObject0.toString(70);
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      int int0 = jSONObject0.optInt("s`a", 110);
      assertEquals(110, int0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      JSONObject jSONObject1 = jSONObject0.put("n2,H(s`b9b!hN", 110);
      jSONObject1.optBoolean("gettoString");
      jSONObject1.optInt("s`a", 110);
      HashMap<Byte, Object> hashMap0 = new HashMap<Byte, Object>();
      jSONObject0.optBoolean("s`a", false);
      jSONObject0.put("n2,H(s`b9b!hN", (Map) hashMap0);
      JSONObject jSONObject2 = jSONObject0.append("JSONArray[", "n2,H(s`b9b!hN");
      Long long0 = new Long(1L);
      jSONObject2.put("JSONArray[", (Object) long0);
      StringWriter stringWriter0 = new StringWriter((byte)101);
      Writer writer0 = jSONObject1.write(stringWriter0);
      assertSame(stringWriter0, writer0);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      Integer integer0 = new Integer(21);
      JSONObject jSONObject0 = new JSONObject(integer0);
      long long0 = jSONObject0.optLong("{\"java.lang.String@0000000002\": \"java.lang.Class@0000000003\"}");
      assertEquals(1, jSONObject0.length());
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      HashMap<JSONObject, Integer> hashMap0 = new HashMap<JSONObject, Integer>();
      JSONObject jSONObject0 = new JSONObject((Map) hashMap0);
      String string0 = jSONObject0.optString("[GRqI@VJiRXV");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "\")>mJl-:imQ&ql\"\"");
      boolean boolean0 = jSONObject0.isNull("null");
      assertEquals(3, jSONObject0.length());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Iterator iterator0 = jSONObject0.keys();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject((Object) "\")>mJl-:imQ&ql\"\"");
      JSONObject jSONObject1 = jSONObject0.put("\")>mJl-:imQ&ql\"\"", 1010.897368);
      long long0 = jSONObject1.getLong("\")>mJl-:imQ&ql\"\"");
      assertEquals(4, jSONObject0.length());
      assertEquals(1010L, long0);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      Object object0 = jSONObject0.remove("isnotify");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.put((String) null, (-849L));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Null key.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      try { 
        jSONObject0.getString("] not found.");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // JSONObject[\"] not found.\"] not found.
         //
         verifyException("wheel.json.JSONObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      JSONObject jSONObject0 = new JSONObject();
      boolean boolean0 = jSONObject0.has("|Qbgxhbu@");
      assertFalse(boolean0);
  }
}