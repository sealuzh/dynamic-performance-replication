/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 21:36:47 GMT 2018
 */

package accessories.plugins.time;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class JDayChooser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  protected static ExecutorService executor; 

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
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.avalon.framework.CascadingRuntimeException",
      "org.apache.fop.pdf.PDFState",
      "accessories.plugins.time.JSpinField",
      "org.apache.fop.svg.PDFDocumentGraphics2D",
      "org.apache.fop.pdf.PDFPathPaint",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "org.apache.fop.fonts.FontInfo",
      "org.apache.fop.pdf.PDFPage",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "org.apache.fop.svg.PDFGraphics2D",
      "accessories.plugins.time.JSpinField$1",
      "org.apache.batik.ext.awt.MultipleGradientPaint",
      "org.apache.avalon.framework.configuration.ConfigurationException",
      "org.apache.fop.pdf.PDFColor",
      "org.apache.fop.image.FopImage",
      "org.apache.fop.fonts.FontMetrics",
      "org.apache.batik.ext.awt.RadialGradientPaint",
      "org.apache.avalon.framework.configuration.Configuration",
      "org.apache.avalon.framework.activity.Initializable",
      "org.apache.fop.pdf.PDFDocument",
      "accessories.plugins.time.JDayChooser",
      "org.apache.fop.pdf.PDFImage",
      "org.apache.fop.pdf.PDFLink",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.fop.pdf.PDFPattern",
      "org.apache.batik.ext.awt.g2d.GraphicContext",
      "org.apache.fop.pdf.PDFStream",
      "accessories.plugins.time.JYearChooser",
      "org.apache.fop.image.AbstractFopImage",
      "org.apache.fop.svg.GraphicsConfiguration",
      "org.apache.avalon.framework.CascadingThrowable",
      "org.apache.avalon.framework.CascadingException",
      "org.apache.fop.pdf.PDFResourceContext",
      "org.apache.fop.fonts.Font",
      "org.apache.fop.pdf.PDFAnnotList",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "org.apache.avalon.framework.configuration.Configurable",
      "org.apache.batik.ext.awt.LinearGradientPaint",
      "org.apache.fop.pdf.AbstractPDFStream",
      "org.apache.fop.image.JpegImage"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.fop.pdf.PDFDocument",
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
      "org.apache.fop.pdf.PDFColorSpace",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.fop.pdf.PDFRoot",
      "org.apache.fop.pdf.StreamCacheFactory",
      "org.apache.xalan.templates.ElemTemplateElement",
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
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xpath.XPathContext",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xpath.VariableStack",
      "freemind.modes.ControllerAdapter",
      "freemind.modes.mindmapmode.MindMapController",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
      "org.apache.batik.ext.awt.color.NamedProfileCache",
      "org.apache.batik.ext.awt.color.ICCColorSpaceExt",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "freemind.main.FreeMind",
      "freemind.main.FreeMindApplet",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "freemind.modes.filemode.FileMode",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.i18n.LocaleGroup",
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "org.apache.fop.svg.PDFGraphicsConfiguration",
      "plugins.collaboration.database.DatabaseBasics",
      "freemind.main.Resources",
      "freemind.main.FreeMindStarter",
      "plugins.map.MapDialog",
      "org.apache.fop.pdf.PDFState$Data",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.dom.GenericDOMImplementation",
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
      "org.apache.fop.pdf.PDFFilterList",
      "org.apache.fop.pdf.FlateFilter",
      "org.apache.batik.apps.svgbrowser.Resources",
      "org.apache.batik.apps.svgbrowser.SVGInputHandler",
      "org.apache.batik.apps.svgbrowser.JSVGViewerFrame",
      "freemind.modes.schememode.SchemeMode",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.batik.util.Service",
      "org.apache.batik.script.rhino.RhinoInterpreterFactory",
      "org.apache.batik.script.InterpreterPool",
      "org.apache.batik.bridge.BridgeContext",
      "freemind.modes.browsemode.BrowseMode",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "org.apache.crimson.tree.XmlDocument",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.crimson.tree.ElementNode2",
      "org.apache.crimson.util.XmlNames",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "freemind.modes.browsemode.BrowsePopupMenu",
      "freemind.extensions.PermanentNodeHookAdapter",
      "accessories.plugins.ClonePlugin",
      "freemind.controller.FreeMindToolBar",
      "freemind.modes.mindmapmode.MindMapToolBar",
      "freemind.main.Tools",
      "freemind.modes.mindmapmode.JAutoScrollBarPane",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache",
      "org.openstreetmap.gui.jmapviewer.AttributionSupport",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher",
      "org.openstreetmap.gui.jmapviewer.OsmMercator",
      "org.openstreetmap.gui.jmapviewer.DefaultMapController",
      "freemind.modes.mindmapmode.MindMapMode",
      "org.apache.fop.image.AbstractFopImage",
      "org.jibx.runtime.Utility",
      "org.jibx.runtime.JiBXException",
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$CycleMap",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.crimson.parser.XMLReaderImpl",
      "org.apache.crimson.tree.XmlDocumentBuilder",
      "org.apache.crimson.parser.Parser2$Catalog",
      "org.apache.crimson.parser.Parser2",
      "org.apache.crimson.parser.SimpleHashtable",
      "org.apache.crimson.parser.Resolver",
      "org.apache.crimson.parser.InputEntity",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "freemind.modes.MapAdapter",
      "freemind.modes.filemode.FileMapModel",
      "org.apache.xalan.templates.ElemVariable",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "freemind.controller.Controller",
      "freemind.controller.Controller$ColorTracker",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractStylableDocument",
      "org.apache.batik.dom.svg.SVGOMDocument",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.xml.res.XMLErrorResources",
      "org.apache.crimson.tree.DOMImplementationImpl",
      "org.apache.crimson.tree.DomEx",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "org.apache.batik.svggen.DefaultCachedImageHandler",
      "freemind.view.mindmapview.MapView",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorInclude",
      "org.apache.fop.pdf.PDFCMap",
      "freemind.modes.mindmapmode.actions.ImportFolderStructureAction",
      "org.apache.xalan.processor.ProcessorTemplateElem",
      "org.apache.xalan.processor.ProcessorExsltFuncResult",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.batik.dom.svg.SAXSVGDocumentFactory",
      "org.apache.batik.util.XMLResourceDescriptor",
      "org.apache.batik.dom.ExtensibleDOMImplementation",
      "org.apache.batik.dom.util.DoublyIndexedTable",
      "org.apache.batik.dom.svg.SVGDOMImplementation",
      "org.apache.batik.bridge.CursorManager",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLFontElementImpl",
      "org.apache.html.dom.HTMLScriptElementImpl",
      "freemind.controller.StructuredMenuHolder",
      "org.apache.batik.gvt.GraphicsNode",
      "org.apache.xalan.templates.ElemPI",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "org.apache.batik.bridge.SVGPathElementBridge",
      "freemind.modes.attributes.NodeAttributeTableModel",
      "freemind.modes.NodeAdapter",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation",
      "org.apache.batik.css.parser.Parser",
      "org.apache.batik.css.parser.DefaultDocumentHandler",
      "org.apache.batik.css.parser.DefaultSelectorFactory",
      "org.apache.batik.css.parser.DefaultConditionFactory",
      "org.apache.batik.css.parser.DefaultErrorHandler",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.EdgeStyleAction",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemAttribute",
      "freemind.modes.mindmapmode.actions.NodeBackgroundColorAction$RemoveNodeBackgroundColorAction",
      "org.apache.xalan.templates.ElemExsltFuncResult",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.fop.fonts.FontType",
      "org.apache.fop.fonts.Font",
      "org.apache.xalan.templates.ElemLiteralResult",
      "org.apache.crimson.parser.ElementValidator",
      "org.apache.wml.dom.WMLElementImpl",
      "org.apache.wml.dom.WMLBElementImpl",
      "org.apache.wml.dom.WMLNoopElementImpl",
      "org.apache.wml.dom.WMLAElementImpl",
      "org.apache.wml.dom.WMLSetvarElementImpl",
      "org.apache.wml.dom.WMLAccessElementImpl",
      "org.apache.wml.dom.WMLStrongElementImpl",
      "org.apache.wml.dom.WMLPostfieldElementImpl",
      "org.apache.wml.dom.WMLDoElementImpl",
      "org.apache.wml.dom.WMLWmlElementImpl",
      "org.apache.wml.dom.WMLTrElementImpl",
      "org.apache.wml.dom.WMLGoElementImpl",
      "org.apache.wml.dom.WMLBigElementImpl",
      "org.apache.wml.dom.WMLAnchorElementImpl",
      "org.apache.wml.dom.WMLTimerElementImpl",
      "org.apache.wml.dom.WMLSmallElementImpl",
      "org.apache.wml.dom.WMLOptgroupElementImpl",
      "org.apache.wml.dom.WMLHeadElementImpl",
      "org.apache.wml.dom.WMLTdElementImpl",
      "org.apache.wml.dom.WMLFieldsetElementImpl",
      "org.apache.wml.dom.WMLImgElementImpl",
      "org.apache.wml.dom.WMLRefreshElementImpl",
      "org.apache.wml.dom.WMLOneventElementImpl",
      "org.apache.wml.dom.WMLInputElementImpl",
      "org.apache.wml.dom.WMLPrevElementImpl",
      "org.apache.wml.dom.WMLTableElementImpl",
      "org.apache.wml.dom.WMLMetaElementImpl",
      "org.apache.wml.dom.WMLTemplateElementImpl",
      "org.apache.wml.dom.WMLBrElementImpl",
      "org.apache.wml.dom.WMLOptionElementImpl",
      "org.apache.wml.dom.WMLUElementImpl",
      "org.apache.wml.dom.WMLPElementImpl",
      "org.apache.wml.dom.WMLSelectElementImpl",
      "org.apache.wml.dom.WMLEmElementImpl",
      "org.apache.wml.dom.WMLIElementImpl",
      "org.apache.wml.dom.WMLCardElementImpl",
      "org.apache.wml.dom.WMLDocumentImpl",
      "org.hsqldb.lib.ArrayUtil",
      "org.apache.xalan.templates.ElemIf",
      "freemind.controller.filter.condition.SelectedViewCondition",
      "freemind.controller.filter.condition.ConditionFactory",
      "freemind.controller.filter.condition.JCondition",
      "org.apache.xalan.templates.ElemExtensionScript",
      "freemind.modes.MindIcon",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "org.apache.batik.gvt.TextNode",
      "org.apache.batik.gvt.renderer.BasicTextPainter",
      "org.apache.batik.gvt.renderer.StrokingTextPainter",
      "org.apache.batik.gvt.text.GVTACIImpl",
      "freemind.modes.mindmapmode.actions.RemoveIconAction",
      "freemind.controller.filter.condition.DisjunctConditions",
      "org.apache.wml.dom.WMLDOMImplementationImpl",
      "org.apache.xalan.templates.ElemApplyImport",
      "org.apache.xalan.templates.ElemExtensionDecl",
      "org.apache.xml.utils.StringVector",
      "freemind.controller.filter.condition.CompareConditionAdapter",
      "freemind.controller.filter.condition.AttributeCompareCondition",
      "freemind.controller.filter.condition.ConditionNotSatisfiedDecorator",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.AbstractElementNS",
      "org.apache.batik.dom.GenericElementNS",
      "org.hsqldb.rowio.RowOutputTextLog",
      "org.apache.xalan.templates.TemplateList",
      "org.apache.xml.utils.QName",
      "org.apache.xalan.templates.ElemUnknown",
      "org.apache.xalan.templates.ElemChoose",
      "org.apache.batik.css.engine.CSSEngine",
      "org.apache.batik.css.engine.value.StringMap",
      "org.apache.batik.css.engine.value.FloatValue",
      "org.apache.batik.css.engine.value.InheritValue",
      "org.apache.batik.css.engine.value.ValueConstants",
      "org.apache.batik.css.engine.value.svg.SVGValueConstants",
      "org.apache.batik.css.engine.value.svg.AlignmentBaselineManager",
      "org.apache.batik.css.engine.value.LengthManager",
      "org.apache.batik.css.engine.value.svg.BaselineShiftManager",
      "org.apache.batik.css.engine.value.svg.ClipRuleManager",
      "org.apache.batik.css.engine.value.AbstractColorManager",
      "org.apache.batik.css.engine.value.svg.ColorManager",
      "org.apache.batik.css.engine.value.svg.ColorInterpolationManager",
      "org.apache.batik.css.engine.value.svg.ColorRenderingManager",
      "org.apache.batik.css.engine.value.css2.CursorManager",
      "org.apache.batik.css.engine.value.css2.DirectionManager",
      "org.apache.batik.css.engine.value.css2.DisplayManager",
      "org.apache.batik.css.engine.value.svg.DominantBaselineManager",
      "org.apache.batik.css.engine.value.svg.FillRuleManager",
      "org.apache.batik.css.engine.value.css2.FontFamilyManager",
      "org.apache.batik.css.engine.value.css2.FontSizeManager",
      "org.apache.batik.css.engine.value.css2.FontStretchManager",
      "org.apache.batik.css.engine.value.css2.FontStyleManager",
      "org.apache.batik.css.engine.value.css2.FontVariantManager",
      "org.apache.batik.css.engine.value.css2.FontWeightManager",
      "org.apache.batik.css.engine.value.svg.ImageRenderingManager",
      "org.apache.batik.css.engine.value.css2.OverflowManager",
      "org.apache.batik.css.engine.value.svg.PointerEventsManager",
      "org.apache.batik.css.engine.value.css2.SrcManager",
      "org.apache.batik.css.engine.value.svg.ShapeRenderingManager",
      "org.apache.batik.css.engine.value.svg.StrokeLinecapManager",
      "org.apache.batik.css.engine.value.svg.StrokeLinejoinManager",
      "org.apache.batik.css.engine.value.svg.TextAnchorManager",
      "org.apache.batik.css.engine.value.css2.TextDecorationManager",
      "org.apache.batik.css.engine.value.svg.TextRenderingManager",
      "org.apache.batik.css.engine.value.css2.UnicodeBidiManager",
      "org.apache.batik.css.engine.value.css2.VisibilityManager",
      "org.apache.batik.css.engine.value.svg.WritingModeManager",
      "org.apache.batik.css.parser.CSSLexicalUnit",
      "org.apache.batik.css.engine.value.css2.FontShorthandManager",
      "org.apache.batik.css.engine.SVGCSSEngine",
      "org.apache.batik.css.engine.value.svg12.SVG12ValueConstants",
      "org.apache.batik.css.engine.value.svg12.TextAlignManager",
      "org.apache.batik.css.engine.SVG12CSSEngine",
      "org.hsqldb.jdbc.jdbcResultSet",
      "org.apache.xalan.templates.ElemExtensionCall",
      "freemind.view.mindmapview.MultipleImage",
      "org.apache.xalan.processor.ProcessorText",
      "freemind.modes.mindmapmode.actions.FontFamilyAction",
      "org.apache.xalan.templates.ElemWhen",
      "org.apache.html.dom.HTMLOListElementImpl",
      "org.apache.commons.logging.impl.SimpleLog",
      "org.apache.html.dom.HTMLFrameElementImpl",
      "freemind.controller.filter.condition.ConjunctConditions",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "org.apache.xalan.templates.ElemComment",
      "org.openstreetmap.gui.jmapviewer.tilesources.BingAerialTileSource",
      "org.apache.xalan.templates.ElemExsltFunction",
      "org.apache.xalan.processor.TransformerFactoryImpl",
      "org.apache.xalan.processor.StylesheetHandler",
      "org.apache.xalan.processor.XSLTElementDef",
      "org.apache.xalan.processor.XSLTSchema",
      "org.apache.xalan.processor.XSLTAttributeDef",
      "org.apache.xml.utils.StringToIntTable",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.xalan.processor.ProcessorLRE",
      "org.apache.xalan.processor.ProcessorUnknown",
      "org.apache.xalan.templates.ElemCopyOf",
      "org.apache.xalan.templates.ElemNumber",
      "org.apache.xalan.templates.ElemSort",
      "org.apache.xalan.templates.ElemWithParam",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.xalan.templates.ElemParam",
      "org.apache.xalan.templates.ElemText",
      "org.apache.xalan.templates.ElemCopy",
      "org.apache.xalan.templates.ElemMessage",
      "org.apache.xalan.templates.ElemFallback",
      "org.apache.xalan.processor.ProcessorExsltFunction",
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
      "org.apache.xalan.processor.ProcessorStylesheetDoc",
      "org.apache.xalan.templates.FuncDocument",
      "org.apache.xalan.templates.FuncFormatNumb",
      "org.apache.xml.utils.NamespaceSupport2",
      "org.apache.xml.utils.Context2",
      "org.apache.crimson.parser.XmlReader",
      "freemind.modes.mindmapmode.actions.UseRichFormattingAction",
      "org.apache.fop.apps.FOPException"
    );
  }
}