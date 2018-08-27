/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 18 13:35:38 GMT 2018
 */

package org.apache.commons.imaging.formats.bmp;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class BmpImageParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.imaging.formats.bmp.BmpImageParser"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "ANSI_X3.4-1968"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "Europe/Luxembourg"); 
    java.lang.System.setProperty("sun.jnu.encoding", "ANSI_X3.4-1968"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BmpImageParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheReadingInputStream",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.palette.PaletteFactory",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale",
      "org.apache.commons.imaging.formats.bmp.BmpImageContents",
      "org.apache.commons.imaging.formats.pnm.PnmWriter",
      "org.apache.commons.imaging.formats.psd.datareaders.DataReader",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParser",
      "org.apache.commons.imaging.ImageParser",
      "org.apache.commons.imaging.formats.bmp.PixelParserRle",
      "org.apache.commons.imaging.formats.dcx.DcxImageParser",
      "org.apache.commons.imaging.formats.bmp.BmpImageParser",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserIndexed",
      "org.apache.commons.imaging.common.BufferedImageFactory",
      "org.apache.commons.imaging.formats.pnm.FileInfo",
      "org.apache.commons.imaging.formats.psd.PsdImageParser",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpace",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$IconData",
      "org.apache.commons.imaging.common.ImageMetadata$ImageMetadataItem",
      "org.apache.commons.imaging.formats.rgbe.RgbeImageParser",
      "org.apache.commons.imaging.palette.MedianCut",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette",
      "org.apache.commons.imaging.palette.Palette",
      "org.apache.commons.imaging.formats.bmp.PixelParserBitFields",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap",
      "org.apache.commons.imaging.formats.bmp.BmpWriterRgb",
      "org.apache.commons.imaging.ImageFormat",
      "org.apache.commons.imaging.formats.png.PngImageInfo",
      "org.apache.commons.imaging.formats.gif.GifImageParser",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$PNGIconData",
      "org.apache.commons.imaging.common.ImageMetadata",
      "org.apache.commons.imaging.formats.wbmp.WbmpImageParser",
      "org.apache.commons.imaging.formats.png.ScanExpediterInterlaced",
      "org.apache.commons.imaging.formats.bmp.PixelParserSimple",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor",
      "org.apache.commons.imaging.formats.png.ScanExpediter",
      "org.apache.commons.imaging.formats.bmp.BmpWriterPalette",
      "org.apache.commons.imaging.formats.bmp.BmpWriter",
      "org.apache.commons.imaging.formats.pnm.PnmImageParser",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpaceCoordinate",
      "org.apache.commons.imaging.formats.pnm.PamFileInfo",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk",
      "org.apache.commons.imaging.formats.png.PngImageParser",
      "org.apache.commons.imaging.formats.pnm.PgmFileInfo",
      "org.apache.commons.imaging.formats.pcx.PcxImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser",
      "org.apache.commons.imaging.formats.jpeg.JpegImageParser",
      "org.apache.commons.imaging.common.BinaryOutputStream",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$BitmapIconData",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb",
      "org.apache.commons.imaging.formats.pnm.PpmFileInfo",
      "org.apache.commons.imaging.formats.png.ScanExpediterSimple",
      "org.apache.commons.imaging.FormatCompliance",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb",
      "org.apache.commons.imaging.ImageFormats",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter",
      "org.apache.commons.imaging.formats.icns.IcnsType",
      "org.apache.commons.imaging.formats.pnm.PbmFileInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.formats.bmp.PixelParser",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.jpeg.JpegUtils$Visitor",
      "org.apache.commons.imaging.palette.SimplePalette",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser",
      "org.apache.commons.imaging.formats.tiff.TiffImageParser",
      "org.apache.commons.imaging.formats.bmp.PixelParserRgb",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.ImageInfo",
      "org.apache.commons.imaging.formats.ico.IcoImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BmpImageParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.formats.bmp.BmpImageParser",
      "org.apache.commons.imaging.ImageFormats",
      "org.apache.commons.imaging.ImageInfo$ColorType",
      "org.apache.commons.imaging.ImageInfo$CompressionAlgorithm",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.palette.PaletteFactory",
      "org.apache.commons.imaging.formats.dcx.DcxImageParser",
      "org.apache.commons.imaging.formats.gif.GifImageParser",
      "org.apache.commons.imaging.formats.icns.IcnsType",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser",
      "org.apache.commons.imaging.formats.ico.IcoImageParser",
      "org.apache.commons.imaging.formats.jpeg.JpegImageParser",
      "org.apache.commons.imaging.formats.pcx.PcxImageParser",
      "org.apache.commons.imaging.formats.png.PngImageParser",
      "org.apache.commons.imaging.formats.pnm.PnmImageParser",
      "org.apache.commons.imaging.formats.psd.PsdImageParser",
      "org.apache.commons.imaging.formats.tiff.TiffImageParser",
      "org.apache.commons.imaging.formats.wbmp.WbmpImageParser",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.PixelDensity"
    );
  }
}