/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 00:43:35 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.javathena.core.data.Auth_data;
import org.javathena.core.data.IParse;
import org.javathena.core.data.SessionType;
import org.javathena.core.data.Socket_data;
import org.javathena.core.utiles.ACO;
import org.javathena.login.Login;
import org.javathena.login.UserManagement;
import org.javathena.login.parse.FromAdmin;
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
      login0.getAuth_num();
      // Undeclared exception!
      try { 
        Login.login_log(")le{+n}/Hme@");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addAccountIdCount(100000000);
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      Login.mmo_auth_initTXT();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("conf/subnet_athena.conf", 100000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:100000000
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Login.mmo_auth_initXML();
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("gdRpvv/d\ttH");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
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
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      FromChar fromChar0 = new FromChar();
      login0.setAuth_max(10004);
      assertEquals(10004, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login.getPASSWORDENC();
      Login login0 = new Login();
      Login.setPASSWORDENC(10);
      login0.do_final();
      assertEquals(10, login0.getPASSWORDENC());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      System.setCurrentTimeMillis(0L);
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("l9Sh-zBJ)E*u9ey", 2);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3be46655
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("log/login.log", 1249);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      int int0 = Calendar.LONG_FORMAT;
      ConfigurationManagement.setAccess_allow("z}},<3+}");
      UserManagement.addUserTXT((String) null, "z}},<3+}", "g1*~0(", '_');
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
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
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      login0.save_config_in_log();
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
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
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      MySQLConfig.setLogin_server_db("conf/subnet_athena.conf");
      login0.getLog_fp();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromAdmin fromAdmin0 = new FromAdmin();
      mockSocket0.getSoTimeout();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromAdmin0);
      Login.getMd5Data(socket_data0);
      MockFile mockFile0 = new MockFile((File) null, "conf/subnet_athena.conf");
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("Gi#FgwM9G)azi-iRk");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login.display_title();
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)102;
      byteArray0[1] = (byte) (-17);
      byteArray0[2] = (byte) (-127);
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)102, (byte) (-17), (byte) (-127)}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Socket_data socket_data0 = null;
      Login.logUnknownPackets((Socket_data) null);
      byte[] byteArray0 = new byte[0];
      Login.showTab(byteArray0);
      Login login0 = new Login();
      Login.auth_num = 10;
      // Undeclared exception!
      try { 
        login0.parse_console("conf/subnet_athena.conf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      int int0 = (-2509);
      mockSocket0.setSoLinger(false, (-2509));
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      socket_data0.setMd5key("x mWsy!03");
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
  public void test14()  throws Throwable  {
      Login.display_title();
      Login login0 = new Login();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login.display_title();
      ConfigurationManagement.setAccess_denynum(83);
      // Undeclared exception!
      try { 
        Login.codingKey((Socket_data) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "H+]rva9tSWa:p}8-+OQ");
      Login.getDbManagemtType();
      try { 
        MockInetAddress.getByAddress("ORE", (byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
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
  public void test18()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "YES");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      ConfigurationManagement.setAccess_denynum(536);
      int int0 = login0.getAuth_max();
      Login.mmo_auth_syncXML();
      int int1 = login0.check_auth_sync();
      assertTrue(int1 == int0);
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login.login_log("OFF");
      Login login0 = new Login();
      int int0 = Calendar.YEAR;
      login0.yesNoOnOffToBoolean("OFF");
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 1760);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@17c53c80
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromChar0);
      socket_data0.cancel();
      // Undeclared exception!
      try { 
        login0.parse_admin(10024, socket_data0, (Login) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      login_ConnectionListener0.close();
      login0.getOut();
      int[] intArray0 = login0.getServer_fd();
      assertEquals(0, login0.getAuth_max());
      assertNotNull(intArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      FromChar fromChar0 = new FromChar();
      Login.mmo_auth_syncXML();
      int int0 = (-3701);
      // Undeclared exception!
      try { 
        Login.mmo_auth_initXML();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         //  : Content is not allowed in prolog.
         //
         verifyException("com.thoughtworks.xstream.io.xml.DomDriver", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      UserManagement.addUserTXT("conf/subnet_athena.conf", "", "conf/subnet_athena.conf", 'X');
      Login.mmo_auth_syncTXT();
      login0.check_ipmask((-289), "conf/subnet_athena.conf");
      ConfigurationManagement.setAccess_deny("value");
      ConfigurationManagement.setAccess_allow((String) null);
      // Undeclared exception!
      try { 
        Login.login_log("NO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      login0.setOut((PrintWriter) null);
      Auth_data auth_data0 = UserManagement.addUserTXT("conf/subnet_athena.conf", "", "conf/subnet_athena.conf", 'X');
      assertEquals(2000000, (int)auth_data0.getAccount_id());
      
      Login.mmo_auth_syncTXT();
      int int0 = login0.check_ipmask((-289), "conf/subnet_athena.conf");
      assertEquals(0, int0);
      
      ConfigurationManagement.setAccess_deny("value");
      boolean boolean0 = login0.yesNoOnOffToBoolean("YES");
      assertTrue(boolean0);
      
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      login_ConnectionListener0.close();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "Ec'BgW*{AFnC&");
      login0.parse_console("tqP");
      int int0 = login0.check_ipmask(10005, "oJ0rNfK[HV");
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1436);
      UserManagement.addUserTXT("conf/subnet_athena.conf", "reg_db", "reg_db", 'O');
      Login.mmo_auth_syncTXT();
      MySQLConfig.setLogin_server_ip("reg_db");
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      Login login1 = new Login();
      int[] intArray0 = new int[8];
      intArray0[0] = 2000000;
      intArray0[1] = 2;
      intArray0[2] = 2;
      intArray0[1] = 2000000;
      intArray0[4] = 30;
      intArray0[5] = 50;
      intArray0[6] = 30;
      intArray0[7] = 2000000;
      ConfigurationManagement.setSubnetmaski(intArray0);
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
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", 'X');
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/12_javathena/log/login.log");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "conf/subnet_athena.conf");
      Login.mmo_auth_syncTXT();
      int int0 = Calendar.NOVEMBER;
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      byte[] byteArray0 = new byte[1];
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[0] = (byte) (-53);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      Login.display_title();
      login0.getOut();
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
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      login0.save_config_in_log();
      login0.do_initXML();
      int int0 = Calendar.NOVEMBER;
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-30);
      UserManagement.addUserTXT("PORT.", "On.?npE", "Qz'su", 'q');
      Login login1 = new Login();
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
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      login0.check_ipmask(95, "conf/subnet_athena.conf");
      Login.mmo_auth_initXML();
      ConfigurationManagement.setAccess_allow("7HM");
      login0.do_initTXT();
      Login.login_log("conf/subnet_athena.conf");
      login0.parse_console("help");
      login0.parse_console("alive");
      MockSocket mockSocket0 = new MockSocket();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)9;
      try { 
        MockInetAddress.getByAddress("yY(0zA{~=c/w#1", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [9]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      login0.do_initTXT();
      Login.login_log("fX'1En^vFbPF");
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      ACO aCO0 = ACO.DENY_ALLOW;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      Login.login_log("#So");
      Login login1 = new Login();
      login0.parse_console("status");
      Login.login_log("conf/subnet_athena.conf");
      login1.parse_console("#So");
      Login.setPASSWORDENC(100000000);
      Login.mmo_auth_syncTXT();
      FromAdmin fromAdmin0 = new FromAdmin();
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("B W>sYlD3kY=s<C'v", 8);
      // Undeclared exception!
      try { 
        login1.do_init();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(10);
      login0.do_initXML();
      login0.check_ipmask(999, "OB~?HE3");
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum((-3552));
      Login login0 = new Login();
      login0.do_initXML();
      ConfigurationManagement.setSubnetmaski((int[]) null);
      Login.login_log("shutdown");
      int int0 = Calendar.MONDAY;
      MockSocket mockSocket1 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket1);
      // Undeclared exception!
      try { 
        login0.parse_console("shutdown");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_deny("conf/subnet_athena.conf");
      Login login1 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      ConfigurationManagement.setAccess_denynum((-3351));
      login1.do_initXML();
      Locale locale0 = Locale.ENGLISH;
      Locale.getISOCountries();
      login0.getLog_fp();
      login0.yesNoOnOffToBoolean("NO");
      try { 
        MockInetAddress.getByAddress("MHZUxJkbSp20,P", (byte[]) null);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1);
      Login.mmo_auth_initXML();
      Login.mmo_auth_syncXML();
      login0.do_initTXT();
      Login login1 = new Login();
      Login.login_log("exit");
      FileSystemHandling.shouldAllThrowIOExceptions();
      Login login2 = new Login();
      // Undeclared exception!
      try { 
        login1.parse_console("exit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[7];
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      ConfigurationManagement.setAccess_denynum((-1769));
      login0.do_initXML();
      Locale locale0 = Locale.ENGLISH;
      Locale.getISOCountries();
      login0.getLog_fp();
      Login login1 = new Login();
      login1.yesNoOnOffToBoolean("ON");
      try { 
        MockInetAddress.getByAddress("'e2gemLM", byteArray0);
        fail("Expecting exception: UnknownHostException");
      
      } catch(UnknownHostException e) {
         //
         // Not IPv4: [0, 0, 0, 0, 0, 0, 0]
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockInetAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(5197);
      login0.setAuth_max((-2022));
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      FileSystemHandling.shouldAllThrowIOExceptions();
      UserManagement.setAccountIdCount(9965);
      int int0 = Login.MAX_SERVERS;
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
  public void test39()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_allownum(2);
      login0.setAuth_max(11);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      FileSystemHandling.shouldAllThrowIOExceptions();
      UserManagement.setAccountIdCount(2809);
      int int0 = Login.MAX_SERVERS;
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
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1);
      ConfigurationManagement.setAccess_allownum(2000000);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      UserManagement.setAccountIdCount((-1628199461));
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "conf/subnet_athena.conf");
      Login.mmo_auth_syncTXT();
      FileSystemHandling.shouldAllThrowIOExceptions();
      UserManagement.setAccountIdCount(10);
      int int0 = FromClient.CONNECTION_OF_CHAR_SERVER;
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
  public void test41()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1);
      ConfigurationManagement.setAccess_allownum(2000000);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      UserManagement.setAccountIdCount((-2125));
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "conf/subnet_athena.conf");
      Login.mmo_auth_syncTXT();
      UserManagement.setAccountIdCount(9970);
      int int0 = FromClient.CONNECTION_OF_CHAR_SERVER;
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
  public void test42()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(10);
      ConfigurationManagement.setAccess_allownum(2000000);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initTXT();
      UserManagement.setAccountIdCount((-1628199461));
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "conf/subnet_athena.conf");
      Login.mmo_auth_syncTXT();
      UserManagement.setAccountIdCount(10);
      int int0 = FromClient.CONNECTION_OF_CHAR_SERVER;
      Login.getPASSWORDENC();
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
  public void test43()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(1);
      ConfigurationManagement.setAccess_allownum(2000000);
      byte[] byteArray0 = new byte[0];
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
      UserManagement.setAccountIdCount((-1502293784));
      int int0 = Calendar.NOVEMBER;
      UserManagement.addUserTXT("Invalid character 0x", "Invalid character 0x", "8~I{yt-y", 'W');
      Login.mmo_auth_syncTXT();
      login0.server_fd = null;
      MockSocket mockSocket0 = new MockSocket();
      // Undeclared exception!
      try { 
        login0.parse_console("pVXS5t7;%");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }
}