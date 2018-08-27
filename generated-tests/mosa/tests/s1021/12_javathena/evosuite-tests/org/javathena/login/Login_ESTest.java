/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 12:24:16 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Calendar;
import javolution.util.FastMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.javathena.core.data.Auth_data;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromChar;
import org.javathena.login.parse.FromClient;
import org.javathena.utiles.ConfigurationManagement;
import org.javathena.utiles.sql.MySQLConfig;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Login_ESTest extends Login_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Login login0 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      // Undeclared exception!
      try { 
        login_Timer_interval_check_auth_sync0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertNotNull(intArray0);
      
      Login.getDbManagemtType();
      login0.save_config_in_log();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("conf/subnet_athena.conf");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Calendar.ERA;
      Login login1 = new Login();
      int int1 = login1.getAuth_num();
      assertEquals(0, int1);
      assertEquals(0, login1.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAuth_before_save_file(10);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Login.showTab(byteArray0);
      Login.display_title();
      Login login0 = new Login();
      Login.setPASSWORDENC((-2013467477));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      int int0 = Login.mmo_auth_initTXT();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
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
  public void test10()  throws Throwable  {
      Login.login_log("notice");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin(10000, socket_data0, login1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAuth_before_save_file(10);
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      login0.setOut((PrintWriter) null);
      assertEquals(0, login0.getAuth_max());
      
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.check_ipmask(10024, "0ONGy<^L>*m");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        Login.do_initSQL();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.utiles.ConfigurationManagement", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
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
  public void test18()  throws Throwable  {
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, (byte[]) null);
      Login.setPASSWORDENC((-2013467639));
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      MySQLConfig.setLogin_server_pw("conf/subnet_athena.conf");
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
      assertEquals((-2013467639), login0.getPASSWORDENC());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max((-1090035946));
      assertEquals((-1090035946), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)54;
      byteArray0[1] = (byte)84;
      Login.showTab(byteArray0);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      Login login1 = new Login();
      login0.do_initTXT();
      FromChar fromChar0 = new FromChar();
      int int0 = login0.parse_console("conf/subnet_athena.conf");
      assertEquals(0, int0);
      
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromChar0);
      Login.logUnknownPackets(socket_data0);
      login1.do_initTXT();
      assertEquals(0, login1.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      login0.check_auth_sync();
      // Undeclared exception!
      try { 
        login0.do_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(30);
      login0.do_initXML();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
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
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(10);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      Login login1 = new Login();
      login1.do_initTXT();
      login1.parse_admin(31060, socket_data0, login1);
      login0.check_auth_sync();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, ",Ep]p`H0TC@Q~bCV3");
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "          __    __   __ _   ,_  ___      __    ___      __       ");
      login0.setAuth_max(100000000);
      Login login1 = new Login();
      login1.do_initTXT();
      Login login2 = new Login();
      login1.parse_admin(31060, socket_data0, login2);
      UserManagement.addAccountIdCount(2470);
      login2.parse_admin(30, socket_data0, login0);
      login0.getAuth_max();
      Login.codingKey(socket_data0);
      login1.getServer_fd();
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(30);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(1);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("NO");
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      FromChar fromChar0 = new FromChar();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "ON");
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      InetSocketAddress inetSocketAddress0 = MockInetSocketAddress.createUnresolved("ON", 10005);
      Proxy proxy0 = new Proxy(proxy_Type0, inetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.getIpTab();
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("ON");
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      FastMap<Integer, Auth_data> fastMap1 = fastMap0.setShared(false);
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data0).getAccount_id();
      doReturn((String) null).when(auth_data0).getUserid();
      doReturn((String) null).when(auth_data0).toString();
      fastMap1.put((Integer) 10, auth_data0);
      UserManagement.setAuth_dats(fastMap1);
      Login.mmo_auth_syncTXT();
      Login.getDbManagemtType();
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      Login login1 = new Login();
      ConfigurationManagement.setAccess_allownum(1);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login1.do_initXML();
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      fastMap0.setShared(true);
      Integer integer0 = new Integer((-1396));
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn((Integer) null, (Integer) null).when(auth_data0).getAccount_id();
      doReturn((String) null).when(auth_data0).getUserid();
      fastMap0.put(integer0, auth_data0);
      UserManagement.setAuth_dats(fastMap0);
      Login.mmo_auth_syncTXT();
      Login.getDbManagemtType();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      login0.getOut();
      login0.do_initTXT();
      login0.parse_console("status");
      login0.do_initTXT();
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      MockInetAddress.anyLocalAddress();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("time_allowed", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      FromClient fromClient0 = new FromClient();
      Login login1 = new Login();
      login0.do_initTXT();
      FromChar fromChar0 = new FromChar();
      // Undeclared exception!
      try { 
        login0.parse_console("exit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      UserManagement.addUserTXT("1Qr", "C|a", "1Qr", '~');
      Proxy proxy0 = Proxy.NO_PROXY;
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
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.getMd5Data(socket_data0);
      Login login1 = new Login();
      Login.mmo_auth_initTXT();
      login1.do_initTXT();
      Login login2 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getByName("conf/subnet_athena.conf");
      login2.check_ip(inetAddress0);
      login1.parse_admin(31060, socket_data0, login2);
      login0.parse_console("alive");
      Login.mmo_auth_syncTXT();
  }
}