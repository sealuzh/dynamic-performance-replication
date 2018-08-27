/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 17:43:34 GMT 2018
 */

package org.javathena.login;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.PipedOutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.Calendar;
import java.util.function.BiFunction;
import javolution.util.FastComparator;
import javolution.util.FastMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      int int0 = Login.mmo_auth_initXML();
      assertEquals(0, int0);
      
      Login login0 = new Login();
      int[] intArray0 = login0.getServer_fd();
      assertNotNull(intArray0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Login.login_log("");
      Login login0 = new Login();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Login.setPASSWORDENC(2634);
      Login login0 = new Login();
      MockSocket mockSocket0 = new MockSocket();
      FromClient fromClient0 = new FromClient();
      mockSocket0.setReuseAddress(false);
      mockSocket0.setKeepAlive(false);
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
  public void test03()  throws Throwable  {
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
  public void test04()  throws Throwable  {
      Random.setNextRandom((-1837));
      Login login0 = new Login();
      login0.getAuth_max();
      // Undeclared exception!
      try { 
        login0.parse_console("-zB7w8odasXP%lx]t~");
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
      System.setCurrentTimeMillis((-2254L));
      Login.setPASSWORDENC(3452);
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
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((byte)0);
      Socket_data socket_data0 = new Socket_data((Socket) null);
      socket_data0.setAccount_id(100000000);
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
  public void test07()  throws Throwable  {
      Login.getDbManagemtType();
      Login login0 = new Login();
      login0.auth_max = 2;
      int[] intArray0 = new int[7];
      intArray0[1] = 50;
      intArray0[2] = 2000000;
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
      Login login0 = new Login();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(pipedOutputStream0);
      login0.setOut(mockPrintWriter0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Login.showTab(byteArray0);
      Login login0 = new Login();
      int int0 = login0.check_ipmask((byte)0, "ON");
      assertEquals(0, int0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/12_javathena/log");
      FileSystemHandling.setPermissions(evoSuiteFile0, true, true, true);
      Login login0 = new Login();
      login0.save_config_in_log();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      login_ConnectionListener0.run();
      int[] intArray0 = login0.getServer_fd();
      assertNotNull(intArray0);
      
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      login0.check_ip(inetAddress0);
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.run();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Login.getPASSWORDENC();
      MySQLConfig.setLogin_server_pw("j8|<`/JoKFG]-`(");
      Login login0 = new Login();
      // Undeclared exception!
      try { 
        login0.parse_console("@S-RZF<KtgJ");
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
      Login.getPASSWORDENC();
      Login login0 = new Login();
      ACO aCO0 = ACO.STRSIZE;
      ConfigurationManagement.setAccess_order(aCO0);
      MySQLConfig.setLogin_server_port(30);
      login0.save_config_in_log();
      Login.mmo_auth_initTXT();
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
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Login.showTab(byteArray0);
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((byte)7);
      Login.mmo_auth_initTXT();
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
  public void test15()  throws Throwable  {
      NetworkHandling.sendMessageOnTcp((EvoSuiteLocalAddress) null, "- to create new accounts with a limited time: time of creation %d second(s).");
      Login login0 = new Login();
      login0.do_final();
      Login.mmo_auth_syncXML();
      MySQLConfig.setLogin_server_port((-1));
      login0.check_auth_sync();
      // Undeclared exception!
      try { 
        MySQLConfig.initConnection();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EvoSuiteRemoteAddress evoSuiteRemoteAddress0 = new EvoSuiteRemoteAddress("- to ALLOW new users (with _F/_M).", 12345);
      NetworkHandling.openRemoteTcpServer(evoSuiteRemoteAddress0);
      Login.mmo_auth_initXML();
      Login.display_title();
      Login.mmo_auth_initXML();
      Login login0 = new Login();
      login0.getOut();
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum(2);
      Socket_data socket_data0 = new Socket_data((Socket) null);
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      login0.do_initTXT();
      MySQLConfig.setLogin_server_id("conf/subnet_athena.conf");
      int int0 = login0.parse_console("lst");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Login login0 = new Login();
      login0.setAuth_max(31050);
      Login.mmo_auth_syncTXT();
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = FromClient.CONNECTION_OF_CHAR_SERVER;
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      UserManagement.setAccountIdCount(50);
      int int1 = Calendar.LONG;
      login0.do_final();
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
  public void test20()  throws Throwable  {
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>(2);
      FastComparator<Object> fastComparator0 = (FastComparator<Object>) mock(FastComparator.class, new ViolatedAssumptionAnswer());
      Login.mmo_auth_syncXML();
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
  public void test21()  throws Throwable  {
      int int0 = FromClient.CONNECTION_OF_CHAR_SERVER;
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      MySQLConfig.setLogin_server_pw("conf/subnet_athena.conf");
      MySQLConfig.setLogin_server_port(516);
      login0.save_config_in_log();
      int int1 = FromChar.ACCOUNT_TO_OFFLINE;
      Login.mmo_auth_initTXT();
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
  public void test22()  throws Throwable  {
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "- to create new accounts with a limited time: time of creation %d second(s).");
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "com.thoughtworks.xstream.converters.basic.DoubleConverter");
      Login.logUnknownPackets((Socket_data) null);
      Login login0 = new Login();
      Login.mmo_auth_syncXML();
      MySQLConfig.setLogin_server_pw("- to create new accounts with a limited time: time of creation %d second(s).");
      login0.getLog_fp();
      assertEquals(0, login0.getAuth_max());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Login login0 = new Login();
      Login.ConnectionListener login_ConnectionListener0 = login0.new ConnectionListener();
      login_ConnectionListener0.close();
      int int0 = login0.getAuth_num();
      assertEquals(0, login0.getAuth_max());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.lesslessAuth_before_save_file();
      login0.save_config_in_log();
      ConfigurationManagement.setAccess_denynum(2);
      Socket_data socket_data0 = new Socket_data((Socket) null);
      MockInetAddress.getByName("conf/subnet_athena.conf");
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      int[] intArray0 = new int[1];
      intArray0[0] = 30;
      ConfigurationManagement.setSubnetmaski(intArray0);
      login0.do_initXML();
      Login login1 = new Login();
      login0.do_initTXT();
      Login.login_log("conf/subnet_athena.conf");
      Random.setNextRandom((-665));
      Login login2 = new Login();
      login1.parse_console("status");
      Login login3 = new Login();
      login0.setServer_fd(intArray0);
      File file0 = login3.getLog_fp();
      assertNull(file0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Login login0 = new Login();
      login0.save_config_in_log();
      ConfigurationManagement.setAccess_denynum(898);
      Login.display_title();
      MockSocket mockSocket0 = new MockSocket();
      Socket_data socket_data0 = new Socket_data((Socket) null, (IParse) null);
      // Undeclared exception!
      try { 
        login0.parse_admin((-1214), socket_data0, login0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.core.data.Socket_data", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Login login0 = new Login();
      ConfigurationManagement.lesslessAuth_before_save_file();
      login0.save_config_in_log();
      ConfigurationManagement.setAccess_denynum(2);
      MockInetAddress.getByName("conf/subnet_athena.conf");
      ACO aCO0 = ACO.ALLOW_DENY;
      ConfigurationManagement.setAccess_order(aCO0);
      MySQLConfig.setLogin_server_pw("conf/subnet_athena.conf");
      int int0 = FromClient.VERSION;
      Login.mmo_auth_initTXT();
      login0.do_initTXT();
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
  public void test27()  throws Throwable  {
      Login.display_title();
      Login login0 = new Login();
      login0.save_config_in_log();
      int[] intArray0 = new int[1];
      intArray0[0] = 30;
      ConfigurationManagement.setSubnetmaski(intArray0);
      login0.do_initXML();
      Login login1 = new Login();
      login1.do_initTXT();
      FromAdmin fromAdmin0 = new FromAdmin();
      Random.setNextRandom(2);
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
  public void test28()  throws Throwable  {
      UserManagement.addUserTXT("qui,", "qui,", "qui,", 'S');
      ConfigurationManagement.setAccess_denynum('S');
      MockInetAddress.getByName("jdbc:mysql://");
      Login login0 = new Login();
      ConfigurationManagement.setAccess_denynum((-1656538835));
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
      ConfigurationManagement.setAccess_denynum((-64363543));
      UserManagement.addUserTXT("YnS9qB_Kykdw", "(", "getByName", 'm');
      ConfigurationManagement.setAccess_denynum((-306));
      MockInetAddress.getByName("- with a remote administration with the DEFAULT password.");
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
  public void test30()  throws Throwable  {
      Login login0 = new Login();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/12_javathena/conf/login_athena.conf");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "conf/subnet_athena.conf");
      int int0 = FromChar.CHANGE_AN_EMAIL;
      UserManagement.addUserTXT("conf/subnet_athena.conf", "conf/subnet_athena.conf", "*owSAN}yjDK.rNm0", '/');
      ConfigurationManagement.setAccess_denynum(86);
      Login.mmo_auth_syncTXT();
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
  public void test31()  throws Throwable  {
      Login login0 = new Login();
      MockInetAddress.getByName("NO");
      MySQLConfig.setLogin_server_db("NO");
      Login.mmo_auth_syncTXT();
      Login.setPASSWORDENC((-322));
      login0.yesNoOnOffToBoolean("NO");
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
  public void test32()  throws Throwable  {
      String string0 = "squi,";
      Login login0 = new Login();
      login0.do_final();
      ACO aCO0 = ACO.MUTUAL_FAILTURE;
      ConfigurationManagement.setAccess_order(aCO0);
      ConfigurationManagement.setAccess_denynum(1713);
      Login.setPASSWORDENC(30);
      MockSocket mockSocket0 = new MockSocket();
      FromChar fromChar0 = new FromChar();
      ConfigurationManagement.setAccess_denynum(10002);
      Login.mmo_auth_initTXT();
      login0.do_initTXT();
      Login.mmo_auth_syncTXT();
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
  public void test33()  throws Throwable  {
      Login.display_title();
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.getMd5Data(socket_data0);
      Login login0 = new Login();
      login0.check_ipmask(2118, (String) null);
      login0.do_initTXT();
      login0.parse_console("list");
      Login login1 = new Login();
      Login login2 = new Login();
      Login.getMd5Data(socket_data0);
      login1.check_ipmask((-1077887544), (String) null);
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress(50);
      Proxy.Type proxy_Type0 = Proxy.Type.SOCKS;
      Proxy proxy0 = new Proxy(proxy_Type0, mockInetSocketAddress0);
      MockSocket mockSocket0 = new MockSocket(proxy0);
      FromAdmin fromAdmin0 = new FromAdmin();
      Socket_data socket_data1 = new Socket_data(mockSocket0, fromAdmin0);
      login1.parse_admin(50, socket_data0, login0);
      Login.logUnknownPackets(socket_data0);
      Login login3 = new Login();
      login0.getLog_fp();
      login2.getLog_fp();
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
  public void test34()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.getMd5Data(socket_data0);
      Login login0 = new Login();
      int int0 = FromChar.NUMBER_OF_USER;
      login0.do_initTXT();
      ConfigurationManagement.setAccess_deny("conf/subnet_athena.conf");
      Auth_data auth_data0 = UserManagement.addUserTXT("- to create new accounts with an unlimited time.", (String) null, "  __     /'__`/   / /   __   /   _ `  /'__`/' _ `  /'__`     ", 'R');
      login0.parse_console("list");
      Login login1 = new Login();
      login1.check_ipmask((-1077887544), (String) null);
      Integer integer0 = new Integer(2000000);
      FastMap<Integer, Auth_data> fastMap0 = new FastMap<Integer, Auth_data>();
      Integer integer1 = new Integer(100000000);
      fastMap0.put(integer1, auth_data0);
      FastMap<Integer, Auth_data> fastMap1 = FastMap.newInstance();
      BiFunction<Integer, Object, Auth_data> biFunction0 = (BiFunction<Integer, Object, Auth_data>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(anyInt() , any());
      fastMap0.replaceAll(biFunction0);
      Integer integer2 = new Integer((-190));
      fastMap1.put(integer2, (Auth_data) null);
      // Undeclared exception!
      try { 
        UserManagement.setAuth_dats(fastMap1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.javathena.login.UserManagement", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Login login0 = new Login();
      byte[] byteArray0 = new byte[3];
      MySQLConfig.setLogin_server_ip("end");
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, true);
      byteArray0[0] = (byte)20;
      byteArray0[0] = (byte)0;
      byteArray0[2] = (byte)94;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      ConfigurationManagement.setAccess_denynum(2);
      login0.save_config_in_log();
      login0.yesNoOnOffToBoolean("OFF");
      login0.save_config_in_log();
      Login.mmo_auth_initTXT();
      int int0 = Calendar.LONG;
      Login login1 = new Login();
      login1.do_final();
      login0.do_initXML();
      login1.do_initTXT();
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
  public void test36()  throws Throwable  {
      Socket_data socket_data0 = new Socket_data((Socket) null);
      Login.getMd5Data(socket_data0);
      Login login0 = new Login();
      int int0 = FromChar.NUMBER_OF_USER;
      login0.do_initTXT();
      ConfigurationManagement.setAccess_deny("conf/subnet_athena.conf");
      UserManagement.addUserTXT("- to create new accounts with an unlimited time.", (String) null, "  __     /'__`/   / /   __   /   _ `  /'__`/' _ `  /'__`     ", 'R');
      login0.parse_console("help");
      Login login1 = new Login();
      login0.check_ipmask(30, "- to create new accounts with an unlimited time.");
      int int1 = Calendar.WEEK_OF_MONTH;
      socket_data0.getFunc_send();
      Integer integer0 = new Integer(31042);
      Integer.compare((-1087566099), 3374);
      login1.save_config_in_log();
      int int2 = FromChar.ACCOUNT_TO_OFFLINE;
      int int3 = Calendar.APRIL;
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
}