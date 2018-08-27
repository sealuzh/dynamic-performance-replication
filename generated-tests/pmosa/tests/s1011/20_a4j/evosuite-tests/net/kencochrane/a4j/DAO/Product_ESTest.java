/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 17 21:10:13 GMT 2018
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
      product0.getProduct("", "# of Accessories = ", "+P'");
      product0.getProduct("", (String) null, "+P'");
      product0.getProduct("", "# of Accessories = ", "[Vkr'}hg;FCy3=%_B2");
      product0.getProduct("", (String) null, "xb0;2@z");
      product0.getProduct("d;IG /TW", "", "xb0;2@z");
      product0.getProduct("Q", "(+%urZ", "");
      product0.getProduct("7.$2 ;]1", "xb0;2@z", "_2W\"O^bIqZt,w| (@");
      product0.getProduct("", "1", "1");
      product0.getProduct("_2W\"O^bIqZt,w| (@", "7.$2 ;]1", "7.$2 ;]1");
      product0.getProduct("Q", "3k:\"L$Ecc_)3eSEDU{c", "");
      product0.getProduct("net.kencochrane.a4j.beans.Reviews", "1", "6z9&-ALR^(/^ciyO");
      product0.getProduct("Wr|el'h#ze}k", "UPC - ", "d;IG /TW");
      FullProduct fullProduct0 = product0.getProduct("aaHmv+", "d;IG /TW", "/images/stars-");
      assertNull(fullProduct0);
  }
}