/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 06 22:12:52 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.swing.Action;
import javax.swing.JTree;
import javax.swing.text.AttributeSet;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.PlainDocument;
import javax.swing.text.StyleConstants;
import org.apache.commons.imaging.ImageParser;
import org.apache.commons.imaging.common.ImageMetadata;
import org.apache.commons.imaging.common.bytesource.ByteSource;
import org.apache.commons.imaging.common.bytesource.ByteSourceArray;
import org.apache.commons.imaging.common.bytesource.ByteSourceFile;
import org.apache.commons.imaging.common.bytesource.ByteSourceInputStream;
import org.apache.commons.imaging.formats.bmp.BmpImageParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BmpImageParser_ESTest extends BmpImageParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("n=`oQ]{N\":ObpVRK+", (byte[]) null);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = bmpImageParser0.getXmpXml(byteSourceArray0, hashMap0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[2];
      try { 
        bmpImageParser0.getFormatCompliance(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[0];
      bmpImageParser0.getICCProfileBytes(byteArray0);
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[14];
      byteArray0[4] = (byte)0;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.putIfAbsent("V{RBOSE", bmpImageParser0);
      try { 
        bmpImageParser0.getImageInfo(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: V{RBOSE
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      bmpImageParser0.getAcceptedTypes();
      String string0 = bmpImageParser0.getDefaultExtension();
      assertEquals(".bmp", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byte[] byteArray0 = new byte[6];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("^IU+x4", "^IU+x4");
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: ^IU+x4
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[9];
      byteArray0[4] = (byte)0;
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)0;
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      bmpImageParser0.getAcceptedTypes();
      hashMap0.putIfAbsent("VERBOSE", bmpImageParser0);
      try { 
        bmpImageParser0.getImageInfo(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)40;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte) (-72);
      byteArray0[3] = (byte)66;
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(".z4vT4k{2hucv~0yQ?", byteArray0);
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      hashtable0.put(".z4vT4k{2hucv~0yQ?", byteSourceArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: .z4vT4k{2hucv~0yQ?
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      byte[] byteArray0 = new byte[27];
      try { 
        bmpImageParser0.getImageSize(byteArray0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", byteArray0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("DF/;d`>yW6B]+|");
      // Undeclared exception!
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, (Map<String, Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.imaging.palette.PaletteFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      MockFile mockFile0 = new MockFile("BUFFERED_IMAGE_FACTORY", "BUFFERED_IMAGE_FACTORY");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      mockFile0.setReadOnly();
      mockFile0.deleteOnExit();
      hashtable0.put("BUFFERED_IMAGE_FACTORY", mockFile0);
      String string0 = "@)(j lox|_";
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream("@)(j lox|_");
      try { 
        bmpImageParser0.writeImage((BufferedImage) null, mockFileOutputStream0, hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown parameter: BUFFERED_IMAGE_FACTORY
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      byte[] byteArray0 = new byte[6];
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("VERBOSE", byteArray0);
      BmpImageParser bmpImageParser1 = new BmpImageParser();
      try { 
        bmpImageParser1.getImageSize(byteArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.ResolveAttribute;
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream("^4C~Bpkq9");
      mockPrintStream0.println();
      mockPrintStream0.println(1735289203);
      mockPrintStream0.println("^4C~Bpkq9");
      bmpImageParser0.getDefaultExtension();
      mockPrintStream0.println();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "PIXEL_DENSITY");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      BiConsumer<String, Object> biConsumer0 = (BiConsumer<String, Object>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      hashMap0.forEach(biConsumer0);
      byte[] byteArray0 = new byte[8];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("CfZ%", byteArray0);
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.ResolveAttribute;
      Object[] objectArray0 = new Object[5];
      objectArray0[0] = (Object) styleConstants0;
      objectArray0[2] = (Object) hashMap0;
      hashMap0.put("BUFFERED_IMAGE_FACTORY", "BUFFERED_IMAGE_FACTORY");
      ByteSourceArray byteSourceArray1 = new ByteSourceArray(byteArray0);
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceArray0, (Map<String, Object>) hashMap0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      Object object0 = Image.UndefinedProperty;
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      MockFile mockFile0 = new MockFile("^4C~BpkIq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream("^4C~BpkIq9");
      mockPrintStream0.print(false);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "^4C~BpkIq9");
      printStream0.println();
      mockPrintStream0.println(1735289203);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
      printStream0.println("^4C~BpkIq9");
      Object[] objectArray0 = new Object[1];
      mockPrintStream0.format("^4C~BpkIq9", objectArray0);
      mockPrintWriter0.print((Object) printStream0);
      bmpImageParser0.getDefaultExtension();
      mockPrintWriter0.format("^4C~BpkIq9", objectArray0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = Action.LARGE_ICON_KEY;
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream2 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = new byte[11];
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream2, hashtable0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray("^4C~Bpkq9", byteArray0);
      try { 
        bmpImageParser0.getImageSize((ByteSource) byteSourceArray0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      StyleConstants styleConstants0 = (StyleConstants)AttributeSet.ResolveAttribute;
      Object object0 = Image.UndefinedProperty;
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream("^4C~Bpkq9");
      mockPrintStream0.print(false);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "^4C~Bpkq9");
      printStream0.println();
      mockPrintStream0.println(1735289203);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
      printStream0.println("^4C~Bpkq9");
      Object[] objectArray0 = new Object[1];
      mockPrintStream0.format("Parsing XPM file failed, no '{' token", objectArray0);
      mockPrintWriter0.print((Object) printStream0);
      bmpImageParser0.getDefaultExtension();
      mockPrintWriter0.format("^4C~Bpkq9", objectArray0);
      mockPrintStream0.println();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "PIXEL_DENSITY");
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      bmpImageParser0.getImageSize((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashtable0);
      assertEquals(141L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      ImageParser[] imageParserArray0 = ImageParser.getAllImageParsers();
      Object object0 = Image.UndefinedProperty;
      MockFile mockFile0 = new MockFile("^4C~Bpkq9", "^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      PrintStream printStream0 = mockPrintStream0.append((CharSequence) "^4C~Bpkq9");
      printStream0.println();
      mockPrintStream0.println("2q23=@");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(printStream0, true);
      printStream0.println("^4C~Bpkq9");
      Locale locale0 = Locale.PRC;
      printStream0.format(locale0, "1ERBSE", (Object[]) imageParserArray0);
      mockPrintWriter0.print((Object) printStream0);
      PrintStream printStream1 = printStream0.printf("^4C~Bpkq9", (Object[]) imageParserArray0);
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)0;
      byteArray0[1] = (byte)0;
      mockPrintStream0.write(byteArray0);
      printStream1.format("BUFFERED_IMAGE_FACTORY", (Object[]) imageParserArray0);
      mockPrintWriter0.println();
      mockPrintStream0.println("BUFFERED_IMAGE_FACTORY");
      bmpImageParser0.getMetadata((byte[]) null);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String string0 = PlainDocument.lineLimitAttribute;
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(mockFile0);
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(mockFileInputStream0, "+gPL");
      byteSourceInputStream0.getAll();
      try { 
        bmpImageParser0.dumpImageFile((PrintWriter) mockPrintWriter0, (ByteSource) byteSourceInputStream0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // BMP: Unknown Compression: 1581601602
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      mockPrintStream1.print("^4C~Bpkq9");
      hashtable0.clear();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      mockFile0.toPath();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream1);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-69);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      byteSourceFile0.getInputStream();
      DataOutputStream dataOutputStream1 = new DataOutputStream(mockPrintStream0);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray((byte[]) null);
      ByteSourceFile byteSourceFile1 = new ByteSourceFile(mockFile0);
      byteSourceFile1.getInputStream();
      bmpImageParser0.getName();
      bmpImageParser0.getAllBufferedImages((ByteSource) byteSourceFile0);
      assertEquals(62L, mockFile0.length());
      
      bmpImageParser0.getAcceptedExtensions();
      assertEquals("Bmp-Custom", bmpImageParser0.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      hashtable0.clear();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte) (-76);
      byteArray0[2] = (byte) (-114);
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      ByteSourceFile byteSourceFile1 = new ByteSourceFile(mockFile0);
      InputStream inputStream0 = byteSourceFile1.getInputStream();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(inputStream0, "^4C~Bpkq9");
      Hashtable<String, Object> hashtable1 = new Hashtable<String, Object>();
      ByteSourceArray byteSourceArray1 = new ByteSourceArray(byteArray0);
      bmpImageParser0.getFormatCompliance((ByteSource) byteSourceFile0);
      assertEquals(62L, mockFile0.length());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      hashtable0.clear();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      mockFile0.getCanonicalPath();
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      InputStream inputStream0 = byteSourceFile0.getInputStream();
      ByteSourceInputStream byteSourceInputStream0 = new ByteSourceInputStream(inputStream0, (String) null);
      NetworkHandling.createRemoteTextFile((EvoSuiteURL) null, (String) null);
      BmpImageParser bmpImageParser1 = new BmpImageParser();
      bmpImageParser1.getImageInfo((ByteSource) byteSourceInputStream0, (Map<String, Object>) hashtable0);
      assertEquals(62L, mockFile0.length());
      
      bmpImageParser1.getAcceptedTypes();
      String string0 = bmpImageParser1.getName();
      assertEquals("Bmp-Custom", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream2 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = new byte[11];
      byteArray0[0] = (byte)90;
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream2, hashtable0);
      char[] charArray0 = new char[8];
      charArray0[0] = '<';
      charArray0[2] = '<';
      charArray0[3] = '<';
      charArray0[5] = '[';
      mockPrintStream1.print(charArray0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      mockFile0.toURL();
      byteSourceFile0.getInputStream();
      Locale locale0 = Locale.ENGLISH;
      String string0 = DefaultEditorKit.pageDownAction;
      bmpImageParser0.getName();
      bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) null);
      String string1 = DefaultEditorKit.copyAction;
      bmpImageParser0.getBufferedImage((File) mockFile0, (Map<String, Object>) hashtable0);
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      Locale.getISOCountries();
      byteSourceFile0.getInputStream();
      ByteSourceFile byteSourceFile1 = new ByteSourceFile(mockFile0);
      ImageMetadata imageMetadata0 = bmpImageParser0.getMetadata((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
      assertNull(imageMetadata0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = "^4C~Bpk\\q9";
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/mnt/gaiagpfs/users/homedirs/apanichella/Evosuite_performance/Dataset/gordon_script_sum/projects/8_image/^4C~Bpk\\q9");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream("^4C~Bpkq9");
      MockPrintStream mockPrintStream1 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      mockPrintStream0.close();
      mockPrintStream1.print("^4C~Bpkq9");
      hashtable0.clear();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      mockFile0.toPath();
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "^4C~Bpkq9");
      bufferedImage0.releaseWritableTile(1, 1);
      mockFile0.toPath();
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream1);
      dataOutputStream0.writeShort(3);
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream1, hashtable0);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      byteSourceFile0.getInputStream();
      try { 
        bmpImageParser0.getBufferedImage((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid/unsupported BMP file
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String string0 = "^4C~Bpk\\q9";
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      mockPrintStream1.print("^4C~Bpkq9");
      hashtable0.clear();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream0, hashtable0);
      DataOutputStream dataOutputStream0 = new DataOutputStream(mockPrintStream1);
      byte[] byteArray0 = new byte[1];
      ByteSourceArray byteSourceArray0 = new ByteSourceArray(byteArray0);
      dataOutputStream0.writeFloat(1);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      byteSourceFile0.getInputStream();
      bmpImageParser0.getName();
      try { 
        bmpImageParser0.getAllBufferedImages((ByteSource) byteSourceFile0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Not a Valid BMP File count: -1 read: 4 length: 70
         //
         verifyException("org.apache.commons.imaging.common.BinaryFunctions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("^4C~Bpkq9");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream1 = new MockPrintStream(mockFile0);
      MockPrintStream mockPrintStream2 = new MockPrintStream("^4C~Bpkq9");
      BmpImageParser bmpImageParser0 = new BmpImageParser();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      byte[] byteArray0 = new byte[11];
      FileSystemHandling.appendDataToFile((EvoSuiteFile) null, byteArray0);
      BufferedImage bufferedImage0 = new BufferedImage(1, 1, 1);
      mockPrintStream1.print((float) 1);
      bufferedImage0.flush();
      bmpImageParser0.writeImage(bufferedImage0, mockPrintStream2, hashtable0);
      char[] charArray0 = new char[8];
      charArray0[0] = '<';
      charArray0[3] = '<';
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "^4C~Bpkq9");
      mockPrintStream1.print(charArray0);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, false, true, false);
      ByteSourceFile byteSourceFile0 = new ByteSourceFile(mockFile0);
      ByteSourceFile byteSourceFile1 = new ByteSourceFile(mockFile0);
      byteSourceFile1.getDescription();
      byteSourceFile1.getInputStream();
      byteSourceFile0.getInputStream((long) 1);
      int int0 = Double.MIN_EXPONENT;
      ByteSourceFile byteSourceFile2 = new ByteSourceFile(mockFile0);
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      bmpImageParser0.getImageSize((ByteSource) byteSourceFile2, (Map<String, Object>) hashtable0);
      try { 
        bmpImageParser0.getImageInfo((ByteSource) byteSourceFile0, (Map<String, Object>) hashtable0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // BMP has invalid image data offset: 0 (expected: 58, paletteLength: 4, headerSize: 54)
         //
         verifyException("org.apache.commons.imaging.formats.bmp.BmpImageParser", e);
      }
  }
}