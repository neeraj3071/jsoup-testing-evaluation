/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Mar 09 00:42:20 GMT 2025
 */

package org.jsoup.nodes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Entities_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.nodes.Entities"; 
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
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.country", "IN"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Entities_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$52",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.parser.Parser",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState$63",
      "org.jsoup.parser.TokeniserState$64",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.TokeniserState$66",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.nodes.Document",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.Token$CData",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.nodes.BooleanAttribute",
      "org.jsoup.SerializationException",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.nodes.Comment",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.parser.TokeniserState$3",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.parser.TokeniserState$22",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.nodes.Node",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.TokeniserState$28",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.parser.TokeniserState$36",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.Evaluator",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.jsoup.helper.Validate",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.parser.TokeniserState$41",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$40",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.TokeniserState$49"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Entities_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.TokeniserState$1",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$3",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.TokeniserState$11",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.parser.TokeniserState$22",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState$28",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.jsoup.parser.TokeniserState$33",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.parser.TokeniserState$36",
      "org.jsoup.parser.TokeniserState$37",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.parser.TokeniserState$40",
      "org.jsoup.parser.TokeniserState$41",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.jsoup.parser.TokeniserState$47",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.parser.TokeniserState$49",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.jsoup.parser.TokeniserState$52",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.parser.TokeniserState$56",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$60",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.parser.TokeniserState$63",
      "org.jsoup.parser.TokeniserState$64",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.TokeniserState$66",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.helper.StringUtil"
    );
  }
}
