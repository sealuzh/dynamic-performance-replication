/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 16 21:30:21 GMT 2018
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
      product0.getProduct("(m.Ud7DqO", "k[`4LX<b=F", "O!&Pw|]X/-(#");
      product0.getProduct((String) null, (String) null, "O!&Pw|]X/-(#");
      product0.getProduct("lHP}EEfvK", "(m.Ud7DqO", "(m.Ud7DqO");
      product0.getProduct((String) null, "Distributor - ", "3loI@z4b!IGD%UjP");
      product0.getProduct("O!&Pw|]X/-(#", "Distributor - ", "3loI@z4b!IGD%UjP");
      FullProduct fullProduct0 = product0.getProduct("O!&Pw|]X/-(#", "", "3loI@z4b!IGD%UjP");
      assertNull(fullProduct0);
  }
}