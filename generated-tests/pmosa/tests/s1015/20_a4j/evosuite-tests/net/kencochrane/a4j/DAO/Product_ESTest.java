/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 18 05:56:08 GMT 2018
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
      product0.getProduct("", "", (String) null);
      product0.getProduct((String) null, "1", "1");
      product0.getProduct("1", "ccV<4X6SSV(rA[jT]|", "iu*m8DF\"ZO,|19j");
      product0.getProduct("v", (String) null, (String) null);
      product0.getProduct("H", "R]_7", "");
      product0.getProduct("R]_7", "<.*?>", "heavy");
      product0.getProduct("", "s3gd", "1");
      product0.getProduct("]", "]", "]");
      product0.getProduct("7", "", "1");
      product0.getProduct((String) null, "9", "1");
      product0.getProduct("1", "v", "{$0$W6],pzW");
      FullProduct fullProduct0 = product0.getProduct("LP", "<.*?>", "artists is null or size 0 \n");
      assertNull(fullProduct0);
  }
}