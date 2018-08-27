/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 16:54:16 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.ObjectStreamConstants;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.Calendar;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
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
import org.javathena.core.utiles.MultilanguageManagement;
import org.javathena.data.IDBManagementLogin;
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
      Login.login_log("\n");
      Socket_data socket_data0 = null;
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
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)42;
      byteArray0[2] = (byte)68;
      byteArray0[3] = (byte)36;
      byteArray0[4] = (byte)68;
      login0.setAuth_max(31034);
      // Undeclared exception!
      try { 
        Login.login_log("}62bJEh't");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login.getPASSWORDENC();
      System.setCurrentTimeMillis((-301L));
      Login.setPASSWORDENC(2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte)107;
      byteArray0[2] = (byte)15;
      byteArray0[3] = (byte)11;
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte) (-2), (byte)107, (byte)15, (byte)11}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Login.mmo_auth_initXML();
      UserManagement.setAccountIdCount(0);
      Login login0 = new Login();
      login0.getLog_fp();
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
  public void test05()  throws Throwable  {
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin(30, socket_data0, login1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Login login0 = new Login();
      Login.End login_End0 = login0.new End();
      Login.mmo_auth_syncXML();
      login0.getAuth_num();
      login0.getAuth_max();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.logUnknownPackets(socket_data0);
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
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      login0.server_fd = null;
      Login.mmo_auth_syncXML();
      login0.auth_max = 2297;
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncXML();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      int int0 = login0.check_auth_sync();
      assertEquals(0, int0);
      
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login login0 = new Login();
      login0.getServer_fd();
      int int0 = 256;
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      UserManagement.addAccountIdCount();
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket(inetAddress0, 256, inetAddress0, 2000000);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:2000000
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.setAccountIdCount(5645);
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      MockSocket mockSocket1 = new MockSocket();
      mockSocket1.getLocalPort();
      Socket_data socket_data1 = new Socket_data(mockSocket1);
      UserManagement.addUserTXT("J", "exit", "CONF/SUBNET_ATHENA.CONF", ';');
      int int0 = login0.check_ipmask(5645, "FISH");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FromAdmin fromAdmin0 = new FromAdmin();
      FromClient fromClient0 = new FromClient();
      Login login0 = new Login();
      login0.getOut();
      int int0 = Login.auth_num;
      IDBManagementLogin iDBManagementLogin0 = Login.getDbManagemtType();
      assertNull(iDBManagementLogin0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("&rDy *Fn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = Calendar.TUESDAY;
      System.setCurrentTimeMillis((-346L));
      Login.setPASSWORDENC(3);
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(3, login0.getPASSWORDENC());
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)63;
      byteArray0[2] = (byte)4;
      Login login0 = new Login();
      MySQLConfig.setDefault_codepage("conf/subnet_athena.conf");
      ConfigurationManagement.setAccess_allownum((byte)63);
      ConfigurationManagement.setAccess_denynum((byte)4);
      login0.do_initXML();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket();
      // Undeclared exception!
      try { 
        MultilanguageManagement.init("sY#");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login.getDbManagemtType();
      Random.setNextRandom((-221));
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
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      Login.setPASSWORDENC(2);
      Socket_data socket_data0 = new Socket_data((Socket) null);
      // Undeclared exception!
      try { 
        Login.version(socket_data0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.getAuth_max();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      String string0 = "OFF";
      Login.getPASSWORDENC();
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("OFF");
      login0.do_initTXT();
      MockSocket mockSocket0 = new MockSocket();
      MockSocket mockSocket1 = new MockSocket();
      Login.display_title();
      ConfigurationManagement.setAccess_allow("login_log_9");
      login0.parse_console("md5key setup complete");
      ConfigurationManagement.setAccess_denynum(176);
      Socket_data socket_data0 = new Socket_data(mockSocket1);
      // Undeclared exception!
      try { 
        socket_data0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.setAccountIdCount(5645);
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      MockSocket mockSocket1 = new MockSocket();
      Socket_data socket_data1 = new Socket_data(mockSocket1);
      Auth_data auth_data0 = UserManagement.addUserTXT("CONF/SUBNET_ATHENA.CONF", "CONF/SUBNET_ATHENA.CONF", "CONF/SUBNET_ATHENA.CONF", '8');
      assertEquals("CONF/SUBNET_ATHENA.CONF", auth_data0.getUserid());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      Login.setPASSWORDENC(10);
      Login.mmo_auth_initXML();
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
  public void test21()  throws Throwable  {
      Login.getDbManagemtType();
      System.setCurrentTimeMillis(0L);
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      login0.check_ip(inetAddress0);
      Login.mmo_auth_syncXML();
      login0.getAuth_num();
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
  public void test22()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
      
      Login login0 = new Login();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      FromAdmin fromAdmin0 = new FromAdmin();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Login.mmo_auth_syncXML();
      MockSocket mockSocket1 = new MockSocket();
      mockSocket1.getLocalPort();
      Auth_data auth_data0 = UserManagement.addUserTXT("- with the IP security order: 'deny,allow' (allow if not deny). You refuse no IP.", "UD[M", "UD[M", '8');
      assertEquals(2000000, (int)auth_data0.getAccount_id());
      
      login0.check_auth_sync();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      login0.yesNoOnOffToBoolean("ON");
      Login.getPASSWORDENC();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("9  l<]qN `~eV");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "OFF";
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "OFF");
      Login.getPASSWORDENC();
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("OFF");
      MockSocket mockSocket0 = null;
      try {
        mockSocket0 = new MockSocket("OFF", 2);
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Remote address/port is not opened: org.evosuite.runtime.vnet.EndPointInfo@3bf741ce
         //
         verifyException("org.evosuite.runtime.vnet.VirtualNetwork", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("!?$>]PUY5M", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Login login0 = new Login();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      FromAdmin fromAdmin0 = new FromAdmin();
      MySQLConfig.setDefault_codepage("conf/subnet_athena.conf");
      login0.save_config_in_log();
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
  public void test26()  throws Throwable  {
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
      
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("java-class", 6900);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      int int1 = Login.getPASSWORDENC();
      assertEquals(2, int1);
      
      Login login0 = new Login();
      boolean boolean0 = login0.yesNoOnOffToBoolean("OFF");
      assertFalse(boolean0);
      
      UserManagement.setAccountIdCount((-2304));
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Login.mmo_auth_syncXML();
      MockSocket mockSocket1 = new MockSocket();
      mockSocket1.getLocalPort();
      UserManagement.addUserTXT(" field: ", (String) null, "conf/subnet_athena.conf", '8');
      int int2 = login0.check_auth_sync();
      assertTrue(int2 == int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      int int0 = 1083;
      int int1 = 11;
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("         _/ _/ _/ _/     _/ _/ _/ _/ _/ _/                         ", 11);
      Proxy proxy0 = Proxy.NO_PROXY;
      Login.mmo_auth_syncXML();
      Socket socket0 = null;
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login login1 = new Login();
      int[] intArray0 = new int[2];
      intArray0[0] = 2;
      intArray0[1] = 2;
      ConfigurationManagement.setSubneti(intArray0);
      UserManagement.addAccountIdCount();
      ConfigurationManagement.setAccess_allow("end");
      // Undeclared exception!
      try { 
        login1.parse_console("end");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      Login.auth_num = 30;
      login0.getOut();
      login0.setOut((PrintWriter) null);
      MySQLConfig.setLogin_server_port(2000000);
      login0.setAuth_max((-1728164942));
      login0.setOut((PrintWriter) null);
      assertEquals((-1728164942), login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.setAccountIdCount((-2813));
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.mmo_auth_syncXML();
      MockSocket mockSocket1 = new MockSocket();
      MockSocket mockSocket2 = new MockSocket();
      Login.display_title();
      login0.parse_console("entry");
      int int0 = Calendar.WEEK_OF_MONTH;
      Login.setPASSWORDENC(9);
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
  public void test30()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      ConfigurationManagement.setAccess_allownum((-2925));
      ConfigurationManagement.setAccess_denynum(2);
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      FromAdmin fromAdmin0 = new FromAdmin();
      login0.save_config_in_log();
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
  public void test31()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("!?$>]PUY5M", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Login login0 = new Login();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      MockSocket mockSocket0 = new MockSocket();
      login0.do_initTXT();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      int int0 = Calendar.LONG_FORMAT;
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncTXT();
      Login login1 = new Login();
      UserManagement.setAccountIdCount(1007);
      // Undeclared exception!
      try { 
        login1.do_initTXT();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      int int0 = Calendar.MINUTE;
      UserManagement.setAccountIdCount(12);
      Login login0 = new Login();
      login0.do_initTXT();
      Login.display_title();
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      MockSocket mockSocket1 = new MockSocket();
      Login login1 = new Login();
      Login.getMd5Data(socket_data0);
      MockSocket mockSocket2 = new MockSocket();
      Integer integer0 = new Integer((-1));
      Login login2 = new Login();
      login2.check_auth_sync();
      FromAdmin fromAdmin0 = new FromAdmin();
      Socket_data socket_data1 = new Socket_data(mockSocket1, fromAdmin0);
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
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.mmo_auth_syncXML();
      MockSocket mockSocket1 = new MockSocket();
      MockSocket mockSocket2 = new MockSocket();
      login0.parse_console("help");
      int int0 = Calendar.WEEK_OF_MONTH;
      // Undeclared exception!
      try { 
        UserManagement.addUserTXT("help", "x&k}9TH}1zT\"F", (String) null, '$');
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.utiles.Functions", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(50);
      login0.do_initXML();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "Qz*#G}.");
      Login.mmo_auth_syncXML();
      MockSocket mockSocket0 = new MockSocket();
      Login login1 = new Login();
      int[] intArray0 = new int[6];
      intArray0[0] = 30;
      MockSocket mockSocket1 = new MockSocket();
      Login.display_title();
      login1.parse_console("info_4");
      int int0 = Calendar.WEEK_OF_MONTH;
      FromChar fromChar0 = new FromChar();
      FromClient fromClient0 = new FromClient();
      FromChar fromChar1 = new FromChar();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromChar1);
      login0.check_auth_sync();
      Login login2 = new Login();
      int int1 = login1.getAuth_max();
      assertEquals(0, int1);
      
      login0.parse_console("status");
      Login login3 = new Login();
      ConfigurationManagement.setAccess_allow("8Gy*");
      int int2 = Calendar.AM_PM;
      Login login4 = new Login();
      assertEquals(0, login4.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.setAccountIdCount((-2813));
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getSendBufferSize();
      mockSocket0.getTrafficClass();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "conf/subnet_athena.conf", '$');
      login0.check_auth_sync();
      Login.mmo_auth_syncXML();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      MockSocket mockSocket1 = new MockSocket();
      Login.mmo_auth_syncXML();
      MockSocket mockSocket2 = new MockSocket();
      Login.display_title();
      ConfigurationManagement.setAccess_allow("conf/subnet_athena.conf");
      login0.parse_console("entry");
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
  public void test37()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      Login login0 = new Login();
      Random.setNextRandom(2000000);
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getTrafficClass();
      ConfigurationManagement.setAccess_allownum((-2968));
      ConfigurationManagement.setAccess_denynum(2);
      ConfigurationManagement.setAccess_allownum(2000000);
      ConfigurationManagement.setAccess_denynum(1);
      login0.do_initXML();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket1 = new MockSocket();
      // Undeclared exception!
      try { 
        mockSocket1.setTrafficClass((-2968));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // tc is not in range 0 -- 255
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      Login.getPASSWORDENC();
      Login login0 = new Login();
      Login login1 = new Login();
      login1.yesNoOnOffToBoolean("YES");
      Login login2 = new Login();
      ACO aCO0 = ACO.DENY_ALLOW;
      ConfigurationManagement.setAccess_order(aCO0);
      MockInetAddress.getLoopbackAddress();
      MySQLConfig.setDefault_codepage("  ______/ __/._\\__/    _ _ __\\ _ _ ____ _ _ __/._  ");
      login1.save_config_in_log();
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
  public void test39()  throws Throwable  {
      int int0 = ObjectStreamConstants.PROTOCOL_VERSION_1;
      Login login0 = new Login();
      Random.setNextRandom(2000000);
      MockSocket mockSocket0 = new MockSocket();
      ConfigurationManagement.setAccess_allownum((-2933));
      ConfigurationManagement.setAccess_denynum(2);
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("tree-set", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Login.mmo_auth_syncTXT();
      ConfigurationManagement.setAccess_allownum(2000000);
      ConfigurationManagement.setAccess_denynum(1);
      login0.do_initXML();
      Proxy proxy0 = Proxy.NO_PROXY;
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Socket_data socket_data1 = new Socket_data(mockSocket0);
      int int1 = Calendar.LONG_FORMAT;
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      FromAdmin fromAdmin0 = new FromAdmin();
      login0.save_config_in_log();
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
  public void test40()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initTXT();
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      Login.mmo_auth_syncXML();
      MockSocket mockSocket1 = new MockSocket();
      MockSocket mockSocket2 = new MockSocket();
      login0.parse_console("entry");
      int int0 = Calendar.WEEK_OF_MONTH;
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "- with the IP security order: 'deny,allow' (allow if not deny). You refuse ALL IP.", '$');
      int int1 = Calendar.DAY_OF_WEEK;
      Login login1 = new Login();
      login0.parse_console("x&k}9TH}1zT\"F");
      Login login2 = new Login();
      ConfigurationManagement.setAccess_allow("quit");
      Login login3 = new Login();
      // Undeclared exception!
      try { 
        login3.parse_console("quit");
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}