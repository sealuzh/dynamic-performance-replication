/*
 * This file was automatically generated by EvoSuite
 * Fri Mar 22 21:15:20 GMT 2019
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
      FullProduct fullProduct0 = product0.getProduct((String) null, "", (String) null);
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("", "Actors is null or size 0\n", "");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("\"1", (String) null, "mDkTgbL");
      assertNull(fullProduct0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/RQPO;P)+YHJ#=6D6OX_NET.KENCOCHRANE.A4J.DAO.PRODUCT_HEAVY_RQPO;P)+YHJ#=6D6OX.XML");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "F4V&Rq");
      Product product0 = new Product();
      FullProduct fullProduct0 = product0.getProduct("rqPo;P)+yHj#=6D6OX", "net.kencochrane.a4j.DAO.Product", "rqPo;P)+yHj#=6D6OX");
      assertNotNull(fullProduct0);
  }
}
