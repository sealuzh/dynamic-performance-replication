/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Jul 18 04:55:07 GMT 2018
 */

package accessories.plugins.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JDayChooser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "accessories.plugins.time.JDayChooser"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.jnu.encoding", "ANSI_X3.4-1968"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JDayChooser_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.fop.pdf.PDFGoToRemote",
      "org.apache.fop.pdf.PDFFactory",
      "accessories.plugins.time.JSpinField",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.log4j.or.RendererMap",
      "org.apache.fop.fonts.base14.ZapfDingbats",
      "org.apache.fop.pdf.PDFTTFStream",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.fop.pdf.PDFFontNonBase14",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.log4j.Level",
      "org.apache.fop.pdf.PDFICCStream",
      "org.apache.batik.util.SVGConstants",
      "org.apache.fop.fonts.base14.Symbol",
      "org.apache.avalon.framework.configuration.Configuration",
      "org.apache.fop.fonts.CodePointMapping",
      "accessories.plugins.time.JDayChooser",
      "org.hsqldb.jdbc.jdbcStatement",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.fop.pdf.PDFLink",
      "org.apache.fop.pdf.PDFGState",
      "org.apache.fop.util.CloseBlockerOutputStream",
      "org.apache.fop.pdf.StreamCache",
      "org.apache.fop.fonts.CustomFont",
      "org.apache.fop.pdf.PDFPages",
      "accessories.plugins.time.JYearChooser",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.apache.fop.fonts.MutableFont",
      "org.apache.fop.pdf.PDFFunction",
      "org.apache.log4j.CategoryKey",
      "org.apache.fop.fonts.base14.TimesItalic",
      "org.apache.batik.ext.awt.LinearGradientPaint",
      "org.apache.fop.fonts.base14.CourierOblique",
      "org.apache.fop.pdf.PDFOutline",
      "org.apache.fop.pdf.PDFAction",
      "org.apache.fop.fonts.FontDescriptor",
      "org.apache.fop.pdf.PDFState",
      "org.apache.fop.pdf.FlateFilter",
      "org.hsqldb.jdbc.jdbcConnection",
      "org.apache.fop.fonts.base14.HelveticaBold",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.fop.fonts.base14.CourierBold",
      "org.apache.fop.pdf.PDFInternalLink",
      "org.apache.fop.pdf.PDFFormXObject",
      "org.apache.fop.fonts.base14.TimesBoldItalic",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.fop.pdf.NullFilter",
      "accessories.plugins.time.JSpinField$1",
      "org.hsqldb.jdbc.jdbcPreparedStatement",
      "freemind.controller.filter.condition.IconNotContainedCondition",
      "org.hsqldb.types.JavaObject",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.commons.io.output.CountingOutputStream",
      "org.apache.batik.ext.awt.RadialGradientPaint",
      "org.apache.avalon.framework.activity.Initializable",
      "org.apache.fop.fonts.base14.HelveticaBoldOblique",
      "org.apache.fop.pdf.PDFCIDFontDescriptor",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.fop.pdf.PDFCIDFont",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.PDFStream",
      "freemind.main.XMLElement",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.fop.fonts.base14.Courier",
      "org.apache.fop.util.FlateEncodeOutputStream",
      "org.apache.batik.util.CSSConstants",
      "org.apache.fop.fonts.FontSetup",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.pdf.PDFArray",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.fop.pdf.PDFInfo",
      "freemind.controller.filter.condition.Condition",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.apache.fop.pdf.ASCII85Filter",
      "org.hsqldb.types.Binary",
      "freemind.controller.Controller",
      "org.apache.fop.fonts.base14.Helvetica",
      "org.apache.log4j.or.ObjectRenderer",
      "freemind.modes.MindMapNode",
      "org.hsqldb.lib.Iterator",
      "org.apache.fop.pdf.PDFFont",
      "org.apache.log4j.Logger",
      "org.apache.fop.fonts.base14.TimesBold",
      "org.apache.fop.pdf.InMemoryStreamCache",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "org.apache.fop.svg.PDFGraphics2D",
      "freemind.controller.filter.condition.JCondition",
      "org.apache.fop.pdf.PDFResources",
      "org.apache.avalon.framework.configuration.ConfigurationException",
      "org.apache.fop.pdf.PDFColor",
      "org.apache.fop.fonts.FontMetrics",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.fop.pdf.ASCIIHexFilter",
      "org.apache.fop.fonts.type1.PFBData",
      "org.apache.fop.pdf.PDFGoTo",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.fop.pdf.PDFPattern",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.output.ProxyOutputStream",
      "org.apache.fop.image.AbstractFopImage",
      "org.apache.avalon.framework.CascadingThrowable",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.apache.fop.pdf.PDFFilterException",
      "org.hsqldb.HsqlException",
      "org.apache.fop.pdf.PDFFilter",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.fop.fonts.truetype.FontFileReader",
      "org.apache.fop.image.JpegImage",
      "org.apache.fop.fonts.MultiByteFont",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.avalon.framework.CascadingRuntimeException",
      "org.hsqldb.Result",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.fop.fonts.base14.HelveticaOblique",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.fop.pdf.PDFPathPaint",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.fonts.type1.PFBParser",
      "org.apache.fop.pdf.PDFEncoding",
      "org.apache.batik.util.XMLConstants",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.ext.awt.MultipleGradientPaint",
      "org.apache.fop.pdf.PDFNumber",
      "org.apache.fop.image.FopImage",
      "org.apache.fop.fonts.base14.TimesRoman",
      "org.apache.fop.pdf.DCTFilter",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.fop.pdf.PDFImage",
      "org.apache.fop.pdf.PDFXObject",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFFileSpec",
      "org.hsqldb.jdbc.jdbcCallableStatement",
      "org.apache.fop.pdf.PDFFontDescriptor",
      "org.apache.log4j.Priority",
      "org.apache.avalon.framework.CascadingException",
      "org.apache.fop.fonts.Font",
      "org.apache.fop.pdf.PDFAnnotList",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.apache.avalon.framework.configuration.Configurable",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.fop.util.Finalizable",
      "org.apache.batik.svggen.SVGSyntax",
      "org.apache.fop.fonts.Typeface",
      "org.apache.fop.fonts.base14.CourierBoldOblique",
      "org.apache.fop.pdf.PDFShading",
      "org.apache.fop.pdf.PDFT1Stream",
      "org.apache.fop.fonts.CIDFont",
      "org.apache.fop.pdf.PDFUri"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.fop.image.AbstractFopImage",
      "org.apache.fop.fonts.FontSetup",
      "org.apache.fop.fonts.base14.Helvetica",
      "org.apache.fop.fonts.CodePointMapping",
      "org.apache.fop.fonts.base14.HelveticaOblique",
      "org.apache.fop.fonts.base14.HelveticaBold",
      "org.apache.fop.fonts.base14.HelveticaBoldOblique",
      "org.apache.fop.fonts.base14.TimesRoman",
      "org.apache.fop.fonts.base14.TimesItalic",
      "org.apache.fop.fonts.base14.TimesBold",
      "org.apache.fop.fonts.base14.TimesBoldItalic",
      "org.apache.fop.fonts.base14.Courier",
      "org.apache.fop.fonts.base14.CourierOblique",
      "org.apache.fop.fonts.base14.CourierBold",
      "org.apache.fop.fonts.base14.CourierBoldOblique",
      "org.apache.fop.fonts.base14.Symbol",
      "org.apache.fop.fonts.base14.ZapfDingbats",
      "org.apache.fop.pdf.PDFDocument",
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.FlateFilter",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "freemind.modes.schememode.SchemeMode",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.mindmapmode.MindMapController",
      "freemind.main.Resources",
      "freemind.main.FreeMindStarter",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "plugins.map.MapDialog",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "plugins.map.MapDialog$ResultTableModel",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
      "freemind.modes.browsemode.BrowseMode",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
      "org.apache.xpath.Expression",
      "org.apache.xpath.functions.Function",
      "org.apache.xpath.functions.FuncCurrent",
      "org.apache.xpath.functions.FuncLast",
      "org.apache.xpath.functions.FuncPosition",
      "org.apache.xpath.functions.FunctionOneArg",
      "org.apache.xpath.functions.FuncCount",
      "org.apache.xpath.functions.FuncId",
      "org.apache.xpath.functions.Function2Args",
      "org.apache.xalan.templates.FuncKey",
      "org.apache.xpath.functions.FunctionDef1Arg",
      "org.apache.xpath.functions.FuncLocalPart",
      "org.apache.xpath.functions.FuncNamespace",
      "org.apache.xpath.functions.FuncQname",
      "org.apache.xpath.functions.FuncGenerateId",
      "org.apache.xpath.functions.FuncNot",
      "org.apache.xpath.functions.FuncTrue",
      "org.apache.xpath.functions.FuncFalse",
      "org.apache.xpath.functions.FuncBoolean",
      "org.apache.xpath.functions.FuncLang",
      "org.apache.xpath.functions.FuncNumber",
      "org.apache.xpath.functions.FuncFloor",
      "org.apache.xpath.functions.FuncCeiling",
      "org.apache.xpath.functions.FuncRound",
      "org.apache.xpath.functions.FuncSum",
      "org.apache.xpath.functions.FuncString",
      "org.apache.xpath.functions.FuncStartsWith",
      "org.apache.xpath.functions.FuncContains",
      "org.apache.xpath.functions.FuncSubstringBefore",
      "org.apache.xpath.functions.FuncSubstringAfter",
      "org.apache.xpath.functions.FuncNormalizeSpace",
      "org.apache.xpath.functions.Function3Args",
      "org.apache.xpath.functions.FuncTranslate",
      "org.apache.xpath.functions.FunctionMultiArgs",
      "org.apache.xpath.functions.FuncConcat",
      "org.apache.xpath.functions.FuncSystemProperty",
      "org.apache.xpath.functions.FuncExtFunctionAvailable",
      "org.apache.xpath.functions.FuncExtElementAvailable",
      "org.apache.xpath.functions.FuncSubstring",
      "org.apache.xpath.functions.FuncStringLength",
      "org.apache.xpath.functions.FuncDoclocation",
      "org.apache.xpath.functions.FuncUnparsedEntityURI",
      "org.apache.xpath.compiler.FunctionTable",
      "org.apache.xpath.compiler.XPathParser",
      "org.apache.xpath.compiler.OpMap",
      "org.apache.xpath.compiler.Compiler",
      "org.apache.xpath.compiler.Lexer",
      "org.apache.xpath.compiler.Keywords",
      "org.apache.xpath.axes.WalkerFactory",
      "org.apache.xpath.objects.XObject",
      "org.apache.xpath.objects.XNumber",
      "org.apache.xpath.patterns.NodeTest",
      "org.apache.xpath.axes.PredicatedNodeTest",
      "org.apache.xpath.axes.LocPathIterator",
      "org.apache.xpath.axes.ChildIterator",
      "org.apache.xpath.axes.IteratorPool",
      "org.apache.xalan.templates.ElemTemplate",
      "org.apache.xpath.patterns.StepPattern",
      "org.apache.xalan.templates.ElemForEach",
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "freemind.modes.MindIcon",
      "freemind.extensions.PermanentNodeHookAdapter",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.hsqldb.lib.FileUtil",
      "plugins.collaboration.database.DatabaseBasics",
      "freemind.modes.filemode.FileMode",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorText",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.controller.Controller",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "org.apache.crimson.tree.XmlDocument",
      "org.apache.crimson.parser.XMLReaderImpl",
      "org.apache.crimson.tree.XmlDocumentBuilder",
      "org.apache.crimson.parser.Parser2$Catalog",
      "org.apache.crimson.parser.Parser2",
      "org.apache.crimson.parser.SimpleHashtable",
      "org.apache.crimson.parser.Resolver",
      "org.apache.crimson.parser.InputEntity",
      "accessories.plugins.ClonePlugin",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.templates.WhiteSpaceInfo",
      "org.apache.xalan.processor.WhitespaceInfoPaths",
      "org.apache.batik.ext.awt.color.NamedProfileCache",
      "org.apache.batik.ext.awt.color.ICCColorSpaceExt",
      "org.apache.fop.pdf.PDFGState",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.apps.svgbrowser.Resources",
      "org.apache.batik.apps.svgbrowser.SVGInputHandler",
      "org.apache.batik.apps.svgbrowser.JSVGViewerFrame",
      "freemind.controller.Controller$ColorTracker",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemCopy",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.batik.bridge.SVGPathElementBridge",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "org.apache.xalan.templates.ElemExtensionScript",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "freemind.view.mindmapview.MapView",
      "freemind.controller.StructuredMenuHolder",
      "org.apache.batik.css.parser.Parser",
      "org.apache.batik.css.parser.DefaultDocumentHandler",
      "org.apache.batik.css.parser.DefaultSelectorFactory",
      "org.apache.batik.css.parser.DefaultConditionFactory",
      "org.apache.batik.css.parser.DefaultErrorHandler",
      "org.apache.batik.css.parser.ScannerUtilities",
      "org.apache.batik.css.parser.ParseException",
      "org.openstreetmap.gui.jmapviewer.tilesources.ScanexTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.ScanexTileSource$ScanexLayer",
      "accessories.plugins.NodeNoteRegistration",
      "com.lightdev.app.shtm.SHTMLPanel",
      "com.lightdev.app.shtm.SHTMLPanelImpl",
      "com.lightdev.app.shtm.SHTMLPanelSingleDocImpl",
      "com.lightdev.app.shtm.DynamicResource",
      "com.lightdev.app.shtm.SplashScreen",
      "com.lightdev.app.shtm.Util",
      "freemind.main.Tools",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SetDefaultStyleRefAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$DocumentTitleAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$EditAnchorsAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SetTagAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$EditLinkAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$OpenLinkAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$PrevTableCellAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$NextTableCellAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$EditNamedStyleAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ClearFormatAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FormatParaAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FormatImageAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$InsertImageAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLEditPrefsAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ToggleListAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FormatListAction",
      "com.lightdev.app.shtm.ManagePluginsAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ShowElementTreeAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$GarbageCollectionAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$UndoAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$RedoAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLEditCutAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLEditCopyAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLEditPasteAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLEditSelectAllAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLHelpAppInfoAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FontAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FontFamilyAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FontSizeAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$InsertTableAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$InsertTableRowAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$InsertTableColAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$AppendTableColAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$AppendTableRowAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$DeleteTableRowAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$DeleteTableColAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$MoveTableRowUpAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$MoveTableRowDownAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$MoveTableColumnLeftAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$MoveTableColumnRightAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FormatTableAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ToggleTableHeaderCellAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$BoldAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ItalicAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$UnderlineAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$FontColorAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$ApplyCSSAttributeAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SHTMLTestAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$PrintAction",
      "com.lightdev.app.shtm.SHTMLEditorKitActions$SingleDocFindReplaceAction",
      "com.lightdev.app.shtm.SHTMLMenuBar",
      "com.lightdev.app.shtm.SplitPanel",
      "com.lightdev.app.shtm.SHTMLPanelImpl$1",
      "com.lightdev.app.shtm.SHTMLPanelImpl$2",
      "com.lightdev.app.shtm.DocumentPane",
      "com.lightdev.app.shtm.SHTMLEditorPane",
      "com.lightdev.app.shtm.SHTMLEditorPane$TabAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$ShiftTabAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$NewParagraphAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$InsertLineBreakAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$DeletePrevCharAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$DeleteNextCharAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$MoveUpAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$MoveDownAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$HomeAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$EndAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$ShiftHomeAction",
      "com.lightdev.app.shtm.SHTMLEditorPane$ShiftEndAction",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.CloudAction",
      "org.apache.batik.dom.ExtensibleDOMImplementation",
      "org.apache.batik.util.Service",
      "org.apache.batik.dom.util.DoublyIndexedTable",
      "org.apache.batik.dom.svg.SVGDOMImplementation",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation",
      "org.apache.xalan.templates.ElemIf",
      "org.jibx.runtime.Utility",
      "org.jibx.runtime.JiBXException",
      "org.apache.xalan.templates.ElemFallback",
      "freemind.modes.browsemode.BrowsePopupMenu",
      "freemind.main.XMLElement",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.xml.resolver.helpers.BootstrapResolver",
      "org.apache.xml.resolver.CatalogManager",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.dom.GenericElementNS",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.xalan.templates.NamespaceAlias",
      "freemind.controller.filter.condition.IconNotContainedCondition",
      "freemind.controller.filter.condition.JCondition",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.xalan.templates.ElemChoose",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xalan.templates.ElemParam",
      "org.apache.xalan.processor.ProcessorExsltFunction",
      "freemind.controller.filter.condition.CompareConditionAdapter",
      "freemind.controller.filter.condition.AttributeCompareCondition",
      "freemind.controller.filter.condition.NoFilteringCondition",
      "freemind.controller.filter.condition.ConditionNotSatisfiedDecorator",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.xml.serializer.EmptySerializer",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.crimson.parser.ElementValidator",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.modes.mindmapmode.JAutoScrollBarPane",
      "freemind.view.mindmapview.MultipleImage",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "org.openstreetmap.gui.jmapviewer.AttributionSupport",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher",
      "org.openstreetmap.gui.jmapviewer.OsmMercator",
      "org.openstreetmap.gui.jmapviewer.DefaultMapController",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xpath.axes.NodeSequence",
      "org.apache.xpath.objects.XNodeSet",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xpath.NodeSetDTM",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.hsqldb.rowio.RowInputBase",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemAttribute",
      "freemind.modes.mindmapmode.actions.RemoveIconAction",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.batik.gvt.GraphicsNode",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xalan.templates.ElemPI",
      "org.apache.fop.pdf.PDFCMap",
      "freemind.modes.ModesCreator",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.controller.Controller$HideAllAttributesAction",
      "org.apache.avalon.framework.configuration.DefaultConfiguration",
      "org.apache.xalan.templates.ElemMessage",
      "freemind.modes.mindmapmode.actions.CopyAction",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$CycleMap",
      "org.apache.crimson.parser.XmlReader",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.xalan.templates.ElemComment",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.xalan.processor.ProcessorImport",
      "org.apache.xalan.processor.ProcessorPreserveSpace",
      "org.apache.xalan.processor.ProcessorStripSpace",
      "org.apache.xalan.processor.ProcessorOutputElem",
      "org.apache.xalan.processor.ProcessorKey",
      "org.apache.xalan.processor.ProcessorDecimalFormat",
      "org.apache.xalan.processor.ProcessorAttributeSet",
      "org.apache.xalan.processor.ProcessorGlobalVariableDecl",
      "org.apache.xalan.processor.ProcessorGlobalParamDecl",
      "org.apache.xalan.processor.ProcessorTemplate",
      "org.apache.xalan.processor.ProcessorNamespaceAlias",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "freemind.modes.mindmapmode.actions.NodeColorAction",
      "freemind.controller.filter.condition.SelectedViewCondition",
      "freemind.controller.filter.condition.ConditionFactory",
      "freemind.modes.mindmapmode.actions.SelectBranchAction",
      "org.apache.xalan.templates.ElemVariablePsuedo",
      "org.apache.xalan.templates.DecimalFormatProperties",
      "org.apache.xpath.res.XPATHErrorResources",
      "plugins.collaboration.socket.TerminateableThread",
      "plugins.collaboration.socket.CommunicationBase",
      "org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource",
      "org.apache.html.dom.HTMLObjectElementImpl",
      "org.apache.batik.dom.svg.SAXSVGDocumentFactory",
      "org.apache.batik.util.XMLResourceDescriptor",
      "org.apache.batik.Version",
      "org.apache.batik.util.ParsedURL",
      "org.apache.batik.util.ParsedURLData",
      "org.apache.batik.util.MimeTypeConstants",
      "freemind.modes.LineAdapter",
      "freemind.modes.EdgeAdapter",
      "org.apache.xpath.XPathContext",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xpath.VariableStack",
      "freemind.modes.LinkRegistryAdapter",
      "org.apache.batik.dom.svg.AbstractElement",
      "org.apache.batik.dom.svg.SVGOMElement",
      "org.apache.batik.dom.svg.SVGStylableElement",
      "org.apache.batik.dom.svg.SVGOMSVGElement",
      "org.apache.xalan.templates.ElemEmpty",
      "freemind.modes.mindmapmode.actions.UndoAction",
      "freemind.modes.mindmapmode.actions.RedoAction",
      "freemind.controller.filter.condition.AttributeExistsCondition",
      "org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader",
      "org.openstreetmap.gui.jmapviewer.tilesources.TemplatedTMSTileSource",
      "org.apache.xalan.templates.ElemAttributeSet",
      "org.apache.batik.script.rhino.RhinoInterpreterFactory",
      "org.apache.batik.script.InterpreterPool",
      "org.apache.batik.bridge.BridgeContext",
      "org.apache.batik.bridge.CursorManager",
      "plugins.map.FreeMindMapController$TransportMap",
      "plugins.map.FreeMindMapController$MapQuestOpenMap",
      "plugins.map.FreeMindMapController",
      "plugins.map.FreeMindMapController$PlaceNodeAction",
      "org.apache.batik.dom.AbstractStylableDocument",
      "org.apache.batik.dom.svg.SVGOMDocument",
      "org.apache.batik.dom.AbstractElement$NamedNodeHashMap",
      "org.apache.batik.dom.AbstractAttr",
      "org.apache.batik.dom.GenericAttr",
      "org.apache.batik.dom.AbstractCharacterData",
      "org.apache.batik.dom.AbstractText",
      "org.apache.batik.dom.GenericText",
      "org.apache.batik.dom.AbstractElement$Entry",
      "org.apache.batik.util.CleanerThread",
      "freemind.controller.filter.condition.ConjunctConditions",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.xalan.templates.ElemExtensionCall",
      "freemind.modes.CloudAdapter",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.apache.crimson.tree.ElementNode2",
      "org.apache.crimson.util.XmlNames",
      "org.apache.batik.svggen.SVGTransform$1"
    );
  }
}