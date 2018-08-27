/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jul 06 21:10:38 GMT 2018
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

import static org.evosuite.shaded.org.mockito.Mockito.*;
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JDayChooser_ESTest_scaffolding.class.getClassLoader() ,
      "accessories.plugins.time.JSpinField",
      "freemind.modes.MapAdapter",
      "freemind.main.FreeMind",
      "freemind.modes.mindmapmode.attributeactors.AttributeManagerDialog",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "org.apache.crimson.tree.ElementNode2",
      "org.apache.log4j.Level",
      "freemind.main.FreeMindApplet",
      "org.apache.batik.util.SVGConstants",
      "freemind.modes.ModeController$NodeSelectionListener",
      "freemind.modes.common.plugins.NodeNoteBase",
      "org.apache.crimson.util.MessageCatalog",
      "freemind.controller.NodeDropListener",
      "org.apache.crimson.tree.DomEx",
      "freemind.modes.filemode.FileMode",
      "org.apache.crimson.tree.DataNode",
      "freemind.main.EditServer",
      "accessories.plugins.time.JDayChooser",
      "freemind.main.FreeMindMain",
      "org.apache.log4j.spi.RootCategory",
      "freemind.controller.NodeMouseMotionListener",
      "org.apache.crimson.tree.AttributeNode",
      "accessories.plugins.time.JYearChooser",
      "freemind.extensions.HookFactory",
      "org.apache.crimson.tree.XmlDocument$DocFragNode",
      "org.apache.crimson.tree.ElementFactory",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.log4j.CategoryKey",
      "freemind.modes.browsemode.BrowsePopupMenu",
      "freemind.controller.MapMouseMotionListener",
      "freemind.preferences.FreemindPropertyListener",
      "freemind.modes.browsemode.NodeNoteViewer",
      "org.apache.batik.svggen.SVGGeneratorContext$GraphicContextDefaults",
      "org.apache.batik.dom.events.DOMUIEvent",
      "freemind.main.FreeMindMain$VersionInformation",
      "org.apache.crimson.tree.NodeEx",
      "org.apache.crimson.tree.NodeBase",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "freemind.controller.LastOpenedList",
      "org.apache.log4j.helpers.Loader",
      "freemind.modes.NodeAdapter",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "freemind.main.FreeMindMain$StartupDoneListener",
      "freemind.modes.FreeMindJFileDialog",
      "freemind.view.mindmapview.MapView",
      "freemind.extensions.NodeHook",
      "freemind.controller.MapMouseMotionListener$MapMouseMotionReceiver",
      "accessories.plugins.time.JSpinField$1",
      "org.apache.batik.svggen.SVGIDGenerator",
      "freemind.controller.MapModuleManager$MapTitleChangeListener",
      "org.apache.batik.svggen.ErrorHandler",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "freemind.modes.FreeMindAwtFileDialog",
      "org.apache.batik.svggen.ErrorConstants",
      "org.apache.crimson.tree.DocumentEx",
      "freemind.main.XMLElement",
      "org.apache.log4j.spi.RendererSupport",
      "freemind.modes.FreeMindFileDialog",
      "org.apache.batik.util.CSSConstants",
      "freemind.modes.attributes.AttributeController",
      "org.apache.batik.svggen.GenericImageHandler",
      "freemind.controller.NodeDragListener",
      "org.apache.crimson.tree.XmlDocument$EntityRefNode",
      "org.apache.fop.pdf.PDFObject",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "freemind.modes.browsemode.BrowseToolBar",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.fop.pdf.PDFInfo",
      "freemind.controller.MapModuleManager$MapModuleChangeObserver",
      "org.apache.crimson.tree.XmlDocument",
      "freemind.modes.IconInformation",
      "freemind.controller.Controller",
      "freemind.controller.filter.FilterController",
      "org.apache.crimson.tree.XmlDocument$ExtWriteContext",
      "org.apache.batik.svggen.ExtensionHandler",
      "freemind.modes.ControllerAdapter",
      "org.apache.log4j.or.ObjectRenderer",
      "freemind.modes.ControllerAdapter$ControllerPopupMenuListener",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "freemind.modes.FreeMindFileDialog$DirectoryResultListener",
      "org.apache.crimson.tree.NamespacedNode",
      "freemind.modes.MindMapNode",
      "freemind.controller.MapMouseWheelListener",
      "freemind.main.IFreeMindSplash",
      "freemind.controller.FreeMindToolBar",
      "org.apache.log4j.Logger",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "freemind.modes.filemode.FileToolBar",
      "org.apache.crimson.tree.XmlWritable",
      "org.apache.crimson.tree.AttributeNode1",
      "org.apache.crimson.tree.ParentNode",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.apache.crimson.tree.CommentNode",
      "freemind.modes.XMLElementAdapter",
      "freemind.view.mindmapview.NodeView",
      "org.apache.crimson.tree.ElementEx",
      "freemind.controller.MapModuleManager$MapTitleContributor",
      "org.apache.batik.svggen.SVGGraphics2DIOException",
      "org.apache.crimson.tree.TextNode",
      "freemind.modes.common.CommonNodeKeyListener$EditHandler",
      "freemind.controller.MapModuleManager",
      "freemind.controller.MainToolBar",
      "freemind.main.LoggingOutputStream",
      "accessories.plugins.time.JMonthChooser",
      "org.apache.batik.dom.events.AbstractEvent",
      "org.apache.log4j.spi.RepositorySelector",
      "freemind.controller.NodeMotionListener",
      "freemind.modes.browsemode.BrowseXMLElement",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "freemind.controller.Controller$LocalLinkConverter",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.batik.svggen.StyleHandler",
      "accessories.plugins.time.JDayChooser$1",
      "freemind.controller.ZoomListener",
      "freemind.modes.browsemode.BrowseController",
      "freemind.view.MapModule",
      "org.apache.crimson.tree.XmlWriteContext",
      "org.apache.crimson.tree.CDataNode",
      "org.apache.batik.svggen.ImageHandler",
      "freemind.controller.MenuBar",
      "org.apache.log4j.PropertyConfigurator",
      "freemind.modes.MindIcon",
      "org.apache.crimson.tree.ElementNode",
      "org.apache.commons.logging.impl.Log4JLogger",
      "freemind.modes.Mode",
      "freemind.modes.ModeController$NodeLifetimeListener",
      "org.apache.batik.ext.awt.g2d.AbstractGraphics2D",
      "freemind.extensions.MindMapHook",
      "org.apache.batik.util.XMLConstants",
      "accessories.plugins.time.JMonthChooser$1",
      "freemind.controller.filter.FilterToolbar",
      "freemind.main.LogFileLogHandler",
      "org.apache.batik.svggen.SVGGraphics2D",
      "freemind.main.FreeMindSecurityManager",
      "freemind.main.XMLParseException",
      "freemind.view.mindmapview.MapView$ScrollPane",
      "org.apache.fop.pdf.PDFDocument",
      "freemind.main.StdFormatter",
      "freemind.modes.MindMap",
      "freemind.controller.NodeKeyListener",
      "org.apache.log4j.spi.AppenderAttachable",
      "freemind.controller.NodeMouseMotionListener$NodeMouseMotionObserver",
      "freemind.controller.StructuredMenuHolder",
      "freemind.modes.viewmodes.ViewControllerAdapter",
      "org.apache.crimson.tree.PINode",
      "freemind.main.FreeMindCommon",
      "freemind.common.TextTranslator",
      "org.apache.log4j.Priority",
      "freemind.modes.browsemode.BrowseMapModel",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.apache.batik.svggen.SVGSyntax",
      "freemind.modes.ModeController"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.beans.VetoableChangeListener", false, JDayChooser_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JDayChooser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "accessories.plugins.time.JDayChooser",
      "accessories.plugins.time.JDayChooser$DecoratorButton",
      "accessories.plugins.time.JDayChooser$1",
      "org.apache.xml.serializer.EmptySerializer",
      "freemind.main.FreeMind",
      "org.apache.crimson.tree.XmlDocument$Catalog",
      "org.apache.crimson.tree.XmlDocument",
      "freemind.modes.schememode.SchemeMode",
      "accessories.plugins.time.JSpinField",
      "accessories.plugins.time.JYearChooser",
      "accessories.plugins.time.JSpinField$1",
      "org.apache.batik.ext.awt.color.NamedProfileCache",
      "org.apache.batik.util.Service",
      "org.apache.batik.script.rhino.RhinoInterpreterFactory",
      "org.apache.batik.script.InterpreterPool",
      "org.apache.batik.bridge.BridgeContext",
      "org.apache.batik.dom.svg.SAXSVGDocumentFactory",
      "org.apache.batik.util.XMLResourceDescriptor",
      "org.apache.batik.dom.AbstractDOMImplementation",
      "org.apache.batik.dom.ExtensibleDOMImplementation",
      "org.apache.batik.dom.util.HashTable",
      "org.apache.batik.dom.util.HashTable$Entry",
      "org.apache.batik.i18n.LocaleGroup",
      "org.apache.batik.dom.util.DoublyIndexedTable",
      "org.apache.batik.dom.svg.SVGDOMImplementation",
      "org.apache.batik.bridge.CursorManager",
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
      "org.apache.batik.ext.awt.color.ICCColorSpaceExt",
      "freemind.modes.ControllerAdapter",
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
      "accessories.plugins.time.JMonthChooser",
      "accessories.plugins.time.JMonthChooser$1",
      "freemind.controller.Controller",
      "freemind.controller.Controller$ColorTracker",
      "freemind.main.FreeMindApplet",
      "org.hsqldb.persist.HsqlProperties",
      "org.hsqldb.lib.FileUtil",
      "org.hsqldb.DatabaseURL",
      "org.hsqldb.store.BaseHashMap",
      "org.hsqldb.lib.HsqlArrayList",
      "org.hsqldb.resources.BundleHandler",
      "org.hsqldb.Trace",
      "org.hsqldb.HsqlException",
      "freemind.extensions.PermanentNodeHookAdapter",
      "accessories.plugins.ClonePlugin",
      "freemind.main.Resources",
      "freemind.main.FreeMindStarter",
      "org.apache.batik.Version",
      "org.apache.batik.util.ParsedURL",
      "org.apache.batik.util.ParsedURLData",
      "org.apache.crimson.parser.XMLReaderImpl",
      "org.apache.crimson.tree.XmlDocumentBuilder",
      "org.apache.crimson.parser.Parser2$Catalog",
      "org.apache.crimson.parser.Parser2",
      "org.apache.crimson.parser.SimpleHashtable",
      "org.apache.crimson.parser.ElementValidator",
      "org.apache.crimson.parser.Resolver",
      "freemind.modes.browsemode.BrowseMode",
      "freemind.modes.mindmapmode.MindMapMode",
      "freemind.modes.mindmapmode.MindMapController",
      "org.apache.batik.dom.AbstractNode",
      "org.apache.batik.dom.AbstractChildNode",
      "org.apache.batik.dom.GenericDocumentType",
      "org.apache.batik.dom.AbstractParentNode",
      "org.apache.batik.dom.AbstractDocument",
      "org.apache.batik.dom.GenericDocument",
      "org.apache.batik.dom.AbstractParentNode$ChildNodes",
      "org.apache.batik.dom.AbstractParentChildNode",
      "org.apache.batik.dom.AbstractElement",
      "org.apache.batik.dom.svg.AbstractElement",
      "org.apache.batik.dom.svg.SVGOMElement",
      "org.apache.batik.dom.svg.SVGStylableElement",
      "org.apache.batik.dom.svg.SVGGraphicsElement",
      "org.apache.batik.dom.svg.SVGOMPolygonElement",
      "org.apache.batik.xml.XMLCharacters",
      "org.apache.crimson.parser.InputEntity",
      "freemind.modes.filemode.FileMode",
      "org.openstreetmap.gui.jmapviewer.JMapViewer",
      "org.openstreetmap.gui.jmapviewer.AttributionSupport",
      "org.openstreetmap.gui.jmapviewer.OsmTileLoader",
      "org.openstreetmap.gui.jmapviewer.JobDispatcher",
      "org.openstreetmap.gui.jmapviewer.OsmMercator",
      "plugins.collaboration.database.DatabaseBasics",
      "org.openstreetmap.gui.jmapviewer.Demo",
      "org.apache.crimson.util.XmlNames",
      "org.apache.crimson.tree.DomEx",
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
      "plugins.map.MapDialog",
      "freemind.controller.actions.generated.instance.JiBX_bindingFactory",
      "org.jibx.runtime.impl.UnmarshallingContext",
      "org.apache.batik.ext.awt.ColorSpaceHintKey",
      "org.apache.batik.apps.svgbrowser.Resources",
      "org.apache.batik.apps.svgbrowser.SVGInputHandler",
      "org.apache.batik.apps.svgbrowser.JSVGViewerFrame",
      "org.apache.batik.gvt.GraphicsNode",
      "org.apache.batik.bridge.SVGPathElementBridge",
      "freemind.controller.StructuredMenuHolder",
      "org.apache.log4j.AsyncAppender",
      "org.apache.xml.serializer.SerializerBase",
      "org.apache.xml.serializer.SecuritySupport",
      "org.apache.xml.serializer.ToStream",
      "org.apache.xml.serializer.ToHTMLStream$Trie",
      "org.apache.xml.serializer.ElemDesc",
      "org.apache.xml.serializer.utils.StringToIntTable",
      "org.apache.xml.serializer.ToHTMLStream",
      "org.apache.xml.serializer.AttributesImplSerializer",
      "org.apache.xml.serializer.CharInfo",
      "org.apache.xml.serializer.NamespaceMappings",
      "org.apache.crimson.tree.ElementNode2",
      "freemind.modes.MindIcon",
      "org.apache.batik.svggen.DefaultImageHandler",
      "org.apache.batik.svggen.AbstractImageHandlerEncoder",
      "org.apache.batik.svggen.SVGGraphics2DRuntimeException",
      "org.apache.crimson.tree.DataNode",
      "org.apache.batik.svggen.SVGGraphics2D",
      "org.apache.batik.svggen.SVGGeneratorContext",
      "org.apache.batik.svggen.SimpleImageHandler",
      "org.apache.batik.svggen.DefaultStyleHandler",
      "org.apache.batik.svggen.SVGLookupOp",
      "org.apache.batik.svggen.SVGCustomBufferedImageOp",
      "org.apache.batik.svggen.SVGGraphicContextConverter",
      "org.apache.batik.svggen.SVGTransform",
      "org.apache.batik.svggen.SVGColor",
      "org.apache.batik.svggen.SVGClip",
      "org.apache.batik.svggen.SVGFont",
      "org.apache.batik.svggen.SVGGraphicContext",
      "org.apache.batik.svggen.DOMGroupManager",
      "org.apache.xml.serializer.ToUnknownStream",
      "org.apache.xalan.templates.ElemTemplateElement",
      "org.apache.xalan.templates.ElemUse",
      "org.apache.batik.dom.events.DOMKeyEvent",
      "org.hsqldb.rowio.RowInputBase",
      "org.apache.batik.ext.awt.g2d.TransformType",
      "org.apache.html.dom.HTMLDocumentImpl",
      "org.apache.html.dom.HTMLElementImpl",
      "org.apache.html.dom.HTMLOptionElementImpl",
      "org.apache.html.dom.HTMLTableColElementImpl",
      "org.hsqldb.rowio.RowOutputBase",
      "org.hsqldb.rowio.RowOutputBinary",
      "org.apache.xalan.processor.XSLTElementProcessor",
      "org.apache.xalan.processor.ProcessorStylesheetElement",
      "org.apache.xml.res.XMLMessages",
      "org.apache.xpath.res.XPATHMessages",
      "org.apache.xalan.res.XSLMessages",
      "org.apache.xalan.res.XSLTErrorResources",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "freemind.modes.mindmapmode.actions.EdgeColorAction",
      "org.apache.xalan.templates.ElemForEach",
      "freemind.view.mindmapview.MultipleImage",
      "org.openstreetmap.gui.jmapviewer.MemoryTileCache",
      "org.openstreetmap.gui.jmapviewer.DefaultMapController",
      "freemind.main.Tools",
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
      "org.openstreetmap.gui.jmapviewer.tilesources.OsmTileSource$CycleMap",
      "freemind.view.mindmapview.NodeView",
      "org.apache.xpath.Expression",
      "org.apache.xpath.operations.Variable",
      "org.apache.xpath.operations.VariableSafeAbsRef",
      "org.apache.batik.gvt.AbstractGraphicsNode",
      "org.apache.batik.gvt.CompositeGraphicsNode",
      "freemind.view.mindmapview.MapView",
      "freemind.modes.MapAdapter",
      "freemind.modes.filemode.FileMapModel",
      "org.apache.batik.ext.awt.image.renderable.ColorMatrixRable8Bit",
      "freemind.modes.common.plugins.NodeNoteBase",
      "org.apache.xalan.processor.ProcessorCharacters",
      "org.apache.xalan.templates.ElemWhen",
      "accessories.plugins.NodeNoteRegistration",
      "com.lightdev.app.shtm.SHTMLPanel",
      "com.lightdev.app.shtm.SHTMLPanelImpl",
      "com.lightdev.app.shtm.SHTMLPanelSingleDocImpl",
      "com.lightdev.app.shtm.DynamicResource",
      "com.lightdev.app.shtm.SplashScreen",
      "com.lightdev.app.shtm.Util",
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
      "org.openstreetmap.gui.jmapviewer.Coordinate",
      "org.apache.batik.dom.GenericDOMImplementation",
      "org.apache.batik.dom.AbstractStylableDocument",
      "org.apache.batik.dom.svg.SVGOMDocument",
      "freemind.modes.ModesCreator",
      "freemind.controller.Controller$ShowAllAttributesAction",
      "freemind.controller.Controller$ShowSelectedAttributesAction",
      "freemind.controller.Controller$HideAllAttributesAction",
      "org.apache.xml.dtm.ref.CoroutineManager",
      "org.apache.xalan.templates.OutputProperties",
      "org.apache.xml.serializer.OutputPropertiesFactory",
      "org.apache.xml.serializer.OutputPropertiesFactory$1",
      "org.apache.xalan.templates.Stylesheet",
      "org.apache.xalan.templates.StylesheetComposed",
      "org.apache.xalan.templates.StylesheetRoot",
      "org.apache.xpath.XPath",
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
      "org.apache.xalan.templates.ElemCallTemplate",
      "org.apache.xalan.templates.ElemApplyTemplates",
      "org.apache.xpath.patterns.UnionPattern",
      "org.apache.xalan.templates.ElemValueOf",
      "org.apache.xpath.axes.SelfIteratorNoPredicate",
      "org.apache.xml.dtm.DTMManager",
      "org.apache.xpath.XPathContext",
      "org.apache.xpath.objects.XMLStringFactoryImpl",
      "org.apache.xml.dtm.ObjectFactory",
      "org.apache.xml.dtm.SecuritySupport",
      "org.apache.xml.dtm.ref.DTMManagerDefault",
      "org.apache.xml.dtm.ref.ExpandedNameTable",
      "org.apache.xml.utils.NodeVector",
      "org.apache.xpath.VariableStack",
      "org.apache.xalan.transformer.TransformerImpl",
      "org.apache.xml.utils.ObjectPool",
      "org.apache.xml.utils.XMLStringFactoryDefault",
      "org.apache.xml.dtm.ref.DTMDefaultBase",
      "org.apache.xml.dtm.ref.dom2dtm.DOM2DTM",
      "org.apache.xml.utils.SuballocatedIntVector",
      "org.apache.batik.gvt.TextNode",
      "org.apache.batik.gvt.renderer.BasicTextPainter",
      "org.apache.batik.gvt.renderer.StrokingTextPainter",
      "org.apache.xalan.templates.ElemElement",
      "org.apache.xalan.templates.ElemIf",
      "org.apache.xalan.templates.ElemOtherwise",
      "org.apache.crimson.tree.DOMImplementationImpl",
      "org.apache.commons.logging.impl.SimpleLog",
      "freemind.modes.common.plugins.MapNodePositionHolderBase",
      "freemind.modes.mindmapmode.actions.FreemindAction",
      "freemind.modes.mindmapmode.actions.xml.AbstractXmlAction",
      "freemind.modes.mindmapmode.actions.NodeGeneralAction",
      "freemind.modes.mindmapmode.actions.ItalicAction",
      "org.apache.batik.css.parser.Parser",
      "org.apache.batik.css.parser.DefaultDocumentHandler",
      "org.apache.batik.css.parser.DefaultSelectorFactory",
      "org.apache.batik.css.parser.DefaultConditionFactory",
      "org.apache.batik.css.parser.DefaultErrorHandler",
      "org.apache.xalan.templates.ElemTextLiteral",
      "org.apache.batik.gvt.UpdateTracker",
      "org.hsqldb.jdbc.jdbcResultSet",
      "org.openstreetmap.gui.jmapviewer.tilesources.ScanexTileSource",
      "org.openstreetmap.gui.jmapviewer.tilesources.ScanexTileSource$ScanexLayer",
      "org.apache.batik.dom.svg12.SVG12DOMImplementation",
      "org.apache.fop.svg.PDFGraphicsConfiguration"
    );
  }
}