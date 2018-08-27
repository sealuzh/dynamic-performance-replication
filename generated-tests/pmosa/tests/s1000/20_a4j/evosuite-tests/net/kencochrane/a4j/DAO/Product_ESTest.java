/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 15:24:48 GMT 2018
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
      product0.getProduct("heavy", (String) null, "7Kttk h'");
      product0.getProduct("", "", "");
      product0.getProduct("`O/vI`ewm7+GH\"[NE", "", "`O/vI`ewm7+GH\"[NE");
      product0.getProduct("", "", "");
      product0.getProduct("", "", "yOt,yo");
      product0.getProduct("heavy", "$XAEdF_I'7=$", "`O/vI`ewm7+GH\"[NE");
      product0.getProduct("yOt,yo", "$XAEdF_I'7=$", "yOt,yo");
      FullProduct fullProduct0 = product0.getProduct("xS2*X[QLO?kPFEUwD=", "Similar Products is null or size 0\n", "Similar Products is null or size 0\n");
      assertNull(fullProduct0);
  }
}