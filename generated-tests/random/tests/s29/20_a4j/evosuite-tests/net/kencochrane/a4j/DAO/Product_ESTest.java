/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 13:51:38 GMT 2019
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", (String) null, (String) null);
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", (String) null, "");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("60%", "3s", "aIu7;o}'_1E)~");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/_>P9_HEAVY_ J[(=NCJ].XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", ">P9", " j[(=NCJ]");
      assertNotNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "", "");
      assertNull(fullProduct0);
  }
}
