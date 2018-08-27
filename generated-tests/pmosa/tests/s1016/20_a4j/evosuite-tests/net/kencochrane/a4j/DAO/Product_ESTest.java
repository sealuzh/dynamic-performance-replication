/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 08:54:55 GMT 2018
 */

package net.kencochrane.a4j.DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import net.kencochrane.a4j.DAO.Product;
import net.kencochrane.a4j.beans.FullProduct;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Product_ESTest extends Product_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Product product0 = new Product();
      product0.getProduct("Used Price - ", (String) null, (String) null);
      product0.getProduct("", "", "");
      product0.getProduct("", "", "XD;Q#a[mQcRh");
      product0.getProduct("", (String) null, "%wWlduw;{fy[#n");
      product0.getProduct("4l}9", "t{", "heavy");
      product0.getProduct("", "3TDWYM%", "heavy");
      product0.getProduct("", "%wWlduw;{fy[#n", "");
      FullProduct fullProduct0 = product0.getProduct("x,|[P8M<y9#n1H,", "x,|[P8M<y9#n1H,", "");
      assertNull(fullProduct0);
  }
}