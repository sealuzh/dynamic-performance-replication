/*
 * This file was automatically generated by EvoSuite
 * Sat Mar 23 02:09:02 GMT 2019
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
      FullProduct fullProduct0 = product0.getProduct((String) null, "", "");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct((String) null, "", (String) null);
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "", (String) null);
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/VVTMGEW+3:+Y(6T>_VVTMGEW+3:+Y(6T>_HEAVY_VVTMGEW+3:+Y(6T>.XML");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "VVTmGeW+3:+Y(6t>");
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("VVTmGeW+3:+Y(6t>", "VVTmGeW+3:+Y(6t>", "VVTmGeW+3:+Y(6t>");
      assertNotNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("VVTmGeW+3:+Y(6t>", (String) null, "VVTmGeW+3:+Y(6t>");
      assertNull(fullProduct0);
  }
}
