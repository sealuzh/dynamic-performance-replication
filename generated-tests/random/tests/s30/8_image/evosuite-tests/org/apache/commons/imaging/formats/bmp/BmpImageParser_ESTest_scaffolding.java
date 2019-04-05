/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Mar 23 15:32:39 GMT 2019
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
    java.lang.System.setProperty("user.dir", "/home/apaniche/performance/Dataset/gordon_scripts/projects/8_image"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.home", "/home/apaniche"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BmpImageParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheReadingInputStream",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeDouble",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloats",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser$IcnsElement",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRationals",
      "org.apache.commons.imaging.palette.ColorSpaceSubset",
      "org.apache.commons.imaging.formats.tiff.datareaders.BitInputStream",
      "org.apache.commons.imaging.palette.PaletteFactory",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser$XbmParseResult",
      "org.apache.commons.imaging.formats.pnm.PamFileInfo$ColorTupleReader",
      "org.apache.commons.imaging.formats.gif.GifHeaderInfo",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserGrayscale",
      "org.apache.commons.imaging.formats.tiff.TiffField",
      "org.apache.commons.imaging.formats.bmp.BmpImageContents",
      "org.apache.commons.imaging.formats.pnm.PnmWriter",
      "org.apache.commons.imaging.formats.psd.datareaders.DataReader",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByte",
      "org.apache.commons.imaging.ImageParser",
      "org.apache.commons.imaging.formats.bmp.PixelParserRle",
      "org.apache.commons.imaging.formats.dcx.DcxImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrByte",
      "org.apache.commons.imaging.formats.bmp.BmpImageParser",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserIndexed",
      "org.apache.commons.imaging.common.BufferedImageFactory",
      "org.apache.commons.imaging.formats.tiff.TiffImageData",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpace",
      "org.apache.commons.imaging.formats.png.scanlinefilters.ScanlineFilter",
      "org.apache.commons.imaging.formats.jpeg.segments.GenericSegment",
      "org.apache.commons.imaging.common.ImageBuilder",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserLab",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDoubles",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterPalette",
      "org.apache.commons.imaging.formats.tiff.JpegImageData",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$ImageContents",
      "org.apache.commons.imaging.formats.psd.PsdImageContents",
      "org.apache.commons.imaging.palette.Palette",
      "org.apache.commons.imaging.formats.bmp.PixelParserBitFields",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserBitmap",
      "org.apache.commons.imaging.ImageFormat",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCmyk",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser$XpmHeader",
      "org.apache.commons.imaging.common.ImageMetadata",
      "org.apache.commons.imaging.formats.wbmp.WbmpImageParser",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSet",
      "org.apache.commons.imaging.formats.png.ScanExpediterInterlaced",
      "org.apache.commons.imaging.formats.bmp.PixelParserSimple",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeFloat",
      "org.apache.commons.imaging.formats.bmp.BmpWriter",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShorts",
      "org.apache.commons.imaging.formats.gif.GifImageContents",
      "org.apache.commons.imaging.ImageInfo$ColorType",
      "org.apache.commons.imaging.formats.pnm.PamFileInfo$TupleReader",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpaceCoordinate",
      "org.apache.commons.imaging.formats.pnm.PamFileInfo",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLongs",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeAscii",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterIndexedColor",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterLogLuv",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserCmyk",
      "org.apache.commons.imaging.formats.tiff.TiffImageMetadata$GPSInfo",
      "org.apache.commons.imaging.formats.pcx.PcxImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoUndefineds",
      "org.apache.commons.imaging.formats.jpeg.JpegImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterBiLevel",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterGrayscale",
      "org.apache.commons.imaging.formats.psd.PsdHeaderInfo",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterRgb",
      "org.apache.commons.imaging.formats.gif.GenericGifBlock",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser$IcnsContents",
      "org.apache.commons.imaging.formats.pnm.PpmFileInfo",
      "org.apache.commons.imaging.formats.png.ScanExpediterSimple",
      "org.apache.commons.imaging.FormatCompliance",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRationals",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParserRgb",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLong",
      "org.apache.commons.imaging.formats.pnm.WhiteSpaceReader",
      "org.apache.commons.imaging.palette.PaletteFactory$DivisionCandidate",
      "org.apache.commons.imaging.common.BasicCParser",
      "org.apache.commons.imaging.formats.icns.IcnsType",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLong",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory",
      "org.apache.commons.imaging.formats.pnm.PamFileInfo$GrayscaleTupleReader",
      "org.apache.commons.imaging.palette.SimplePalette",
      "org.apache.commons.imaging.ImageInfo$CompressionAlgorithm",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSByte",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser$XbmHeader",
      "org.apache.commons.imaging.formats.tiff.datareaders.ImageDataReader",
      "org.apache.commons.imaging.formats.tiff.TiffImageParser",
      "org.apache.commons.imaging.formats.bmp.PixelParserRgb",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.formats.png.chunks.PngChunk",
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeByte",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputItem$Value",
      "org.apache.commons.imaging.ImageInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoLongs",
      "org.apache.commons.imaging.formats.tiff.TiffElement$1",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoGpsText$TextEncoding",
      "org.apache.commons.imaging.formats.ico.IcoImageParser",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputSummary",
      "org.apache.commons.imaging.palette.ColorSpaceSubset$RgbComparator",
      "org.apache.commons.imaging.formats.jpeg.JpegPhotoshopMetadata",
      "org.apache.commons.imaging.common.RationalNumber",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAsciiOrRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoBytes",
      "org.apache.commons.imaging.formats.tiff.TiffDirectory$ImageDataElement",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeLong",
      "org.apache.commons.imaging.formats.png.PngColorType",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterYCbCr",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeShort",
      "org.apache.commons.imaging.formats.wbmp.WbmpImageParser$WbmpHeader",
      "org.apache.commons.imaging.common.GenericImageMetadata",
      "org.apache.commons.imaging.formats.psd.dataparsers.DataParser",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$IconInfo",
      "org.apache.commons.imaging.formats.pnm.FileInfo",
      "org.apache.commons.imaging.formats.psd.PsdImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoDouble",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$IconData",
      "org.apache.commons.imaging.common.ImageMetadata$ImageMetadataItem",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoByteOrShort",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputDirectory$1",
      "org.apache.commons.imaging.formats.rgbe.RgbeImageParser",
      "org.apache.commons.imaging.palette.MedianCut",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSShort",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.formats.tiff.TiffElement$DataElement",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.formats.png.ChunkType",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShortOrLongOrRational",
      "org.apache.commons.imaging.formats.png.PngImageInfo",
      "org.apache.commons.imaging.formats.gif.GifImageParser",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$PNGIconData",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSRational",
      "org.apache.commons.imaging.formats.png.FilterType",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilterTrueColor",
      "org.apache.commons.imaging.formats.png.ScanExpediter",
      "org.apache.commons.imaging.formats.jpeg.segments.Segment",
      "org.apache.commons.imaging.formats.pnm.PnmImageParser",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoAscii",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser$XpmParseResult",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSLong",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoXpString",
      "org.apache.commons.imaging.formats.png.PngImageParser",
      "org.apache.commons.imaging.formats.tiff.TiffElement",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoSBytes",
      "org.apache.commons.imaging.formats.png.PhysicalScale",
      "org.apache.commons.imaging.formats.pnm.PgmFileInfo",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoFloat",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$FileHeader",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser$IcnsHeader",
      "org.apache.commons.imaging.formats.dcx.DcxImageParser$DcxHeader",
      "org.apache.commons.imaging.formats.icns.IcnsImageParser",
      "org.apache.commons.imaging.common.BinaryOutputStream",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser$PaletteEntry",
      "org.apache.commons.imaging.formats.gif.GraphicControlExtension",
      "org.apache.commons.imaging.formats.ico.IcoImageParser$BitmapIconData",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo",
      "org.apache.commons.imaging.formats.tiff.write.TiffOutputField",
      "org.apache.commons.imaging.formats.png.BitParser",
      "org.apache.commons.imaging.formats.gif.GifBlock",
      "org.apache.commons.imaging.ImageFormats",
      "org.apache.commons.imaging.common.BinaryConstant",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShort",
      "org.apache.commons.imaging.formats.tiff.TiffImageMetadata",
      "org.apache.commons.imaging.formats.png.transparencyfilters.TransparencyFilter",
      "org.apache.commons.imaging.formats.pnm.PbmFileInfo",
      "org.apache.commons.imaging.formats.bmp.PixelParser",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheBlock",
      "org.apache.commons.imaging.formats.tiff.fieldtypes.FieldTypeRational",
      "org.apache.commons.imaging.formats.jpeg.JpegUtils$Visitor",
      "org.apache.commons.imaging.formats.tiff.write.ImageDataOffsets",
      "org.apache.commons.imaging.formats.gif.ImageDescriptor",
      "org.apache.commons.imaging.formats.tiff.TiffField$OversizeValueElement",
      "org.apache.commons.imaging.formats.pcx.PcxImageParser$PcxHeader",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoShorts",
      "org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreterCieLab",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfoRational",
      "org.apache.commons.imaging.formats.tiff.taginfos.TagInfo"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(BmpImageParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.imaging.common.BinaryFileParser",
      "org.apache.commons.imaging.ImageParser",
      "org.apache.commons.imaging.formats.bmp.BmpImageParser",
      "org.apache.commons.imaging.ImageFormats",
      "org.apache.commons.imaging.ImageInfo$ColorType",
      "org.apache.commons.imaging.ImageInfo$CompressionAlgorithm",
      "org.apache.commons.imaging.common.bytesource.ByteSource",
      "org.apache.commons.imaging.common.bytesource.ByteSourceFile",
      "org.apache.commons.imaging.common.bytesource.ByteSourceArray",
      "org.apache.commons.imaging.FormatCompliance",
      "org.apache.commons.imaging.common.BinaryFunctions",
      "org.apache.commons.imaging.palette.PaletteFactory",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheReadingInputStream",
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
      "org.apache.commons.imaging.formats.rgbe.RgbeImageParser",
      "org.apache.commons.imaging.formats.tiff.TiffImageParser",
      "org.apache.commons.imaging.formats.wbmp.WbmpImageParser",
      "org.apache.commons.imaging.formats.xbm.XbmImageParser",
      "org.apache.commons.imaging.formats.xpm.XpmImageParser",
      "org.apache.commons.imaging.ImagingException",
      "org.apache.commons.imaging.ImageReadException",
      "org.apache.commons.imaging.PixelDensity",
      "org.apache.commons.imaging.common.bytesource.ByteSourceInputStream$CacheBlock",
      "org.apache.commons.imaging.ImageWriteException",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpace",
      "org.apache.commons.imaging.formats.bmp.BmpHeaderInfo$ColorSpaceCoordinate"
    );
  }
}
