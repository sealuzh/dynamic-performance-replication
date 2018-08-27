/*
 * This file was automatically generated by EvoSuite
 * Sat Jul 07 01:29:27 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Calendar;
import javolution.util.FastComparator;
import javolution.util.FastMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.EvoSuiteRemoteAddress;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.javathena.core.data.Auth_data;
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
      login0.getOut();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login login0 = new Login();
      login0.getAuth_num();
      try { 
        MySQLConfig.sql_config_read("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login.display_title();
      byte[] byteArray0 = new byte[4];
      byteArray0[1] = (byte)82;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)26;
      Login.showTab(byteArray0);
      Login.getDbManagemtType();
      Login login0 = new Login();
      UserManagement.setAccountIdCount((byte)0);
      Login.mmo_auth_syncTXT();
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
  public void test03()  throws Throwable  {
      Login login0 = new Login();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login1 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_admin(3939, socket_data0, login1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
      
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
      assertEquals(2, login0.getPASSWORDENC());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Login.display_title();
      Login login0 = new Login();
      login0.getServer_fd();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("%Q%g79_0Rh)SOGz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Login login0 = new Login();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>(10);
      FastMap<Integer, Auth_data> fastMap1 = new FastMap<Integer, Auth_data>(fastMap0);
      FastComparator<Object> fastComparator0 = (FastComparator<Object>) mock(FastComparator.class, new ViolatedAssumptionAnswer());
      Integer integer0 = new Integer(2000000);
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      fastMap0.put(integer0, auth_data0);
      FastMap<Integer, Auth_data> fastMap2 = fastMap1.setValueComparator(fastComparator0);
      UserManagement.setAuth_dats(fastMap2);
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
      
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("NO");
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
  public void test08()  throws Throwable  {
      int int0 = Login.getPASSWORDENC();
      assertEquals(2, int0);
      
      Login login0 = new Login();
      login0.setAuth_max(0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Login.display_title();
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("sdf/*b,<n-t=nm");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Login.login_log("R*J6EHN");
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        Login.login_log("conf/subnet_athena.conf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login login0 = new Login();
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
  public void test12()  throws Throwable  {
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("NO");
      UserManagement.setAccountIdCount(10);
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
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
  public void test13()  throws Throwable  {
      Login login0 = new Login();
      login0.yesNoOnOffToBoolean("NO");
      Login.End login_End0 = login0.new End();
      ConfigurationManagement.setAccess_denynum((-1488));
      MySQLConfig.setLogin_server_id("7M|t#9\"");
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login0.getServer_fd();
      login0.do_initXML();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncTXT();
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
  public void test14()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addAccountIdCount();
      login0.save_config_in_log();
      ConfigurationManagement.setAccess_denynum(2);
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      Login.getPASSWORDENC();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login0.getServer_fd();
      login0.do_initXML();
      // Undeclared exception!
      try { 
        login0.yesNoOnOffToBoolean("%newid%");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // anw doit etre egale a yes/no/on/off
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Login login0 = new Login();
      login0.getServer_fd();
      FileSystemHandling.shouldAllThrowIOExceptions();
      Login.mmo_auth_syncTXT();
      Login.display_title();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Login login0 = new Login();
      login0.check_ipmask(129, "");
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromAdmin fromAdmin0 = new FromAdmin();
      mockSocket0.getLocalSocketAddress();
      // Undeclared exception!
      try { 
        mockSocket0.connect((SocketAddress) null, (-266));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // connect: The address can't be null
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login0 = new Login();
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
      Login login0 = new Login();
      login0.getServer_fd();
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)121;
      byteArray0[1] = (byte)78;
      byteArray0[2] = (byte) (-95);
      byteArray0[3] = (byte) (-105);
      byteArray0[4] = (byte)83;
      Login.showTab(byteArray0);
      assertArrayEquals(new byte[] {(byte)121, (byte)78, (byte) (-95), (byte) (-105), (byte)83}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login0 = new Login();
      login0.getAuth_max();
      // Undeclared exception!
      try { 
        Login.showTab((byte[]) null);
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
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "%Q%G79_0RH)SOGZ");
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      MySQLConfig.setLogin_server_port(100000000);
      login_ConnectionListener0.run();
      login_ConnectionListener0.close();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Login login0 = new Login();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/12_javathena/lang/en.xml");
      FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
      Login.mmo_auth_initTXT();
      MySQLConfig.setLogin_server_ip("#(l[17\"~)q~ZA");
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
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_port(2000000);
      Login.mmo_auth_syncTXT();
      ConfigurationManagement.setAccess_allow("YES");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "conf/subnet_athena.conf");
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.cancel();
      login_Timer_interval_check_auth_sync0.cancel();
      login_Timer_interval_check_auth_sync0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.auth_max;
      UserManagement.setAccountIdCount(2);
      Login.setPASSWORDENC((-249));
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
  public void test25()  throws Throwable  {
      Login.display_title();
      byte[] byteArray0 = new byte[4];
      Login.showTab(byteArray0);
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
      login0.getServer_fd();
      Login.mmo_auth_syncTXT();
      Login.mmo_auth_syncTXT();
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
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      Socket_data socket_data1 = new Socket_data(mockSocket0, fromClient0);
      Socket_data socket_data2 = new Socket_data(mockSocket0);
      Socket_data socket_data3 = new Socket_data(mockSocket0, fromClient0);
      login_ConnectionListener0.run();
      login0.setServer_fd((int[]) null);
      // Undeclared exception!
      try { 
        Login.codingKey(socket_data3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Login login0 = new Login();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login1 = new Login();
      login0.parse_admin(50, socket_data0, login1);
      login0.yesNoOnOffToBoolean("OFF");
      FileSystemHandling.shouldAllThrowIOExceptions();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      // Undeclared exception!
      try { 
        login0.do_initXML();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.Login", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Login login0 = new Login();
      int int0 = login0.auth_max;
      UserManagement.setAccountIdCount(2);
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      login0.do_initXML();
      Login.mmo_auth_syncTXT();
      FromChar fromChar0 = new FromChar();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)50;
      byteArray0[1] = (byte)109;
      byteArray0[2] = (byte)8;
      byteArray0[3] = (byte)8;
      byteArray0[5] = (byte) (-100);
      Socket_data socket_data1 = new Socket_data((Socket) null);
      fromChar0.parse(socket_data1, byteArray0);
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
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
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("conf/subnet_athena.conf");
      login0.setOut(mockPrintWriter0);
      MySQLConfig.setLogin_server_ip((String) null);
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      MySQLConfig.setDefault_codepage((String) null);
      MySQLConfig.setLogin_server_pw("conf/subnet_athena.conf");
      Login.End login_End0 = login0.new End();
      login0.getLog_fp();
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_ip("conf/subnet_athena.conf");
      ConfigurationManagement.setAccess_denynum(50);
      String string0 = "YES";
      MySQLConfig.setLogin_server_id("YES");
      Login.getPASSWORDENC();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login0.getServer_fd();
      login0.yesNoOnOffToBoolean("OFF");
      Login.ConnectionListener login_ConnectionListener1 = null;
      try {
        login_ConnectionListener1 = login0.new ConnectionListener();
        fail("Expecting exception: IOException");
      
      } catch(Throwable e) {
         //
         // Failed to open TCP port
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoSuiteSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.parse_console("fb'Ciq*");
      Proxy proxy0 = Proxy.NO_PROXY;
      FromClient fromClient0 = new FromClient();
      login0.getOut();
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      Login.mmo_auth_syncTXT();
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
  public void test32()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_db("conf/subnet_athena.conf");
      ConfigurationManagement.setAuth_before_save_file((-1832));
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "conf/subnet_athena.conf");
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("conf/subnet_athena.conf", 2);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      login0.getLog_fp();
      Random.setNextRandom(2000000);
      MockSocket mockSocket0 = new MockSocket();
      mockSocket0.getInetAddress();
      Socket_data socket_data0 = new Socket_data(mockSocket0);
      byte[] byteArray0 = Login.getMd5Data(socket_data0);
      NetworkHandling.sendDataOnTcp((EvoSuiteLocalAddress) null, byteArray0);
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
  public void test33()  throws Throwable  {
      Login login0 = new Login();
      UserManagement.addAccountIdCount();
      login0.save_config_in_log();
      ConfigurationManagement.setAccess_denynum(2);
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      MySQLConfig.setLogin_server_id("a");
      MySQLConfig.setLogin_server_id("d>X^9884=`pi*G");
      Login.getPASSWORDENC();
      EvoSuiteFile evoSuiteFile0 = null;
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, false, false);
      Login.mmo_auth_syncTXT();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      Login login1 = new Login();
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
  public void test34()  throws Throwable  {
      Login login0 = new Login();
      login0.do_initXML();
      login0.parse_console("Jd9pw<");
      Proxy proxy0 = Proxy.NO_PROXY;
      FromClient fromClient0 = new FromClient();
      MockInetAddress.anyLocalAddress();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login0.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.cancel();
      login_Timer_interval_check_auth_sync0.run();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync1 = login0.new Timer_interval_check_auth_sync();
      // Undeclared exception!
      Login.mmo_auth_initXML();
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      MySQLConfig.setLogin_server_ip("- WITH THE IP SECURITY ORDER: 'MUTUAL-FAILTURE' (ALLOW IF IN THE ALLOW LIST AND NOT IN THE DENY LIST).");
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      mockSocket0.close();
      FromClient fromClient0 = new FromClient();
      Socket_data socket_data0 = new Socket_data(mockSocket0, fromClient0);
      Login login1 = new Login();
      login1.parse_admin(2485, socket_data0, login0);
      login1.do_initXML();
      Login login2 = new Login();
      Login login3 = new Login();
      login0.yesNoOnOffToBoolean("YES");
      Login login4 = new Login();
      Login.Timer_interval_check_auth_sync login_Timer_interval_check_auth_sync0 = login2.new Timer_interval_check_auth_sync();
      login_Timer_interval_check_auth_sync0.run();
      Login login5 = new Login();
      Login login6 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login3.new ConnectionListener();
      Login login7 = new Login();
      // Undeclared exception!
      login1.do_init();
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Login login0 = new Login();
      FastMap<Integer, Auth_data> fastMap0 = FastMap.newInstance();
      FastComparator<Object> fastComparator0 = (FastComparator<Object>) mock(FastComparator.class, new ViolatedAssumptionAnswer());
      FastMap<Integer, Auth_data> fastMap1 = fastMap0.setValueComparator(fastComparator0);
      Integer integer0 = new Integer((-2963));
      Integer integer1 = Integer.getInteger("yG%sL>|\";S9$&$l", integer0);
      Auth_data auth_data0 = mock(Auth_data.class, new ViolatedAssumptionAnswer());
      doReturn(integer1, (Integer) null).when(auth_data0).getAccount_id();
      doReturn("conf/subnet_athena.conf").when(auth_data0).getUserid();
      fastMap1.put((Integer) 100000000, auth_data0);
      FastComparator<Object> fastComparator1 = (FastComparator<Object>) mock(FastComparator.class, new ViolatedAssumptionAnswer());
      FastMap<Integer, Auth_data> fastMap2 = fastMap1.setValueComparator(fastComparator1);
      FastComparator<Object> fastComparator2 = (FastComparator<Object>) mock(FastComparator.class, new ViolatedAssumptionAnswer());
      doReturn((-2963)).when(fastComparator2).hashCodeOf(any());
      FastMap<Integer, Auth_data> fastMap3 = fastMap2.setKeyComparator(fastComparator2);
      UserManagement.setAuth_dats(fastMap3);
      login0.do_initTXT();
      System.setCurrentTimeMillis(0L);
      Login.getPASSWORDENC();
      byte[] byteArray0 = new byte[8];
      Login.showTab(byteArray0);
  }
}
