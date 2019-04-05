/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 13:33:28 GMT 2019
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import javolution.util.FastMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.javathena.core.data.Auth_data;
import org.javathena.core.data.IParse;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.data.IDBManagementLogin;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromChar;
import org.javathena.utiles.ConfigurationManagement;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      login0.setAuth_max((byte) (-57));
      assertEquals((-57), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = 1182;
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data0).getAccount_id();
      doReturn((String) null).when(auth_data0).getUserid();
      doReturn((String) null).when(auth_data0).toString();
      fastMap0.put((Integer) login0.START_ACCOUNT_NUM, auth_data0);
      Auth_data auth_data1 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data1).getAccount_id();
      doReturn((String) null).when(auth_data1).getUserid();
      doReturn((String) null).when(auth_data1).toString();
      fastMap0.put((Integer) login0.MAX_SERVERS, auth_data1);
      UserManagement.setAuth_dats(fastMap0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      mockSocket0.close();
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      assertEquals(0, login0.getAuth_max());
      
      login0.auth_max = 2000000;
      int int0 = login0.getAuth_max();
      assertEquals(2000000, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0, (IParse) null);
      // Undeclared exception!
      try { 
        Login.version(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login.setPASSWORDENC(0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.auth_num = 1182;
      // Undeclared exception!
      try { 
        login0.parse_admin((-1717), socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setMaintenance(10);
      // Undeclared exception!
      try { 
        login0.parse_admin((-1717), socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      // Undeclared exception!
      try { 
        login0.parse_admin(256, socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(0, "{");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("|(4]}ec}");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.mmo_auth_syncXML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      // Undeclared exception!
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.do_init();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      // Undeclared exception!
      try { 
        login0.do_final();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      login0.do_final();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.check_auth_sync();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        Login.login_log("conf/subnet_athena.conf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = new int[4];
      login0.setServer_fd(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertEquals(0, login0.getAuth_max());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("NO");
      assertFalse(boolean0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("X00FDV J%3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("ON");
      assertEquals(0, login0.getAuth_max());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertEquals(0, login0.getAuth_max());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_allownum(100000000);
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_allownum(2);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2000000);
      // Undeclared exception!
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((-2896));
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      // Undeclared exception!
      try { 
        login0.parse_console("quit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      int int0 = login0.parse_console("ON");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      int int0 = login0.parse_admin((-1717), socket_data0, login0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      mockSocket0.close();
      login0.parse_admin(0, socket_data0, login0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      Login.showTab(byteArray0);
      assertEquals(9, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Login login0 = new Login();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      Integer integer0 = new Integer((-1082438159));
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data0).getAccount_id();
      doReturn((String) null).when(auth_data0).getUserid();
      fastMap0.put(integer0, auth_data0);
      UserManagement.setAuth_dats(fastMap0);
      login0.do_initTXT();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "MOK2K<SV4UY%&2QBV", "conf/subnet_athena.conf", 'l');
      // Undeclared exception!
      try { 
        login0.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addUserTXT("- to create new accounts with an unlimited time.", "- to create new accounts with an unlimited time.", "conf/subnet_athena.conf", '.');
      Login.mmo_auth_syncTXT();
      // Undeclared exception!
      try { 
        Login.mmo_auth_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Login login0 = new Login();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("save/account.xml");
      FileSystemHandling.createFolder(evoSuiteFile0);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Login.login_log("qt");
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        Login.codingKeyAdministration(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Login.setPASSWORDENC(10);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.version((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      byte[] byteArray0 = new byte[5];
      int int0 = fromChar0.parse(socket_data0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(1948, "YES");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
      assertEquals(30, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_num();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }
}
