/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 09 00:29:54 GMT 2025
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = new Document("CJmW}`C<k5F");
      Element element0 = document0.createElement("xmlns:");
      element0.appendTo(document0);
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("xmlns:");
      document0.attr("xmlns:", true);
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(document0, (-575));
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      w3CDom_W3CBuilder0.tail((Node) null, (-382951770));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      DataNode dataNode0 = DataNode.createFromEncoded("b", "");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(dataNode0, (-1589));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      w3CDom_W3CBuilder0.head((Node) null, 176);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("wqFR[:WqX@334jMzU");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      Comment comment0 = new Comment("wqFR[:WqX@334jMzU", "");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(comment0, (-1091591328));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      CDataNode cDataNode0 = new CDataNode("");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(cDataNode0, (-43));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      String string0 = w3CDom0.asString((org.w3c.dom.Document) null);
      assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", string0);
  }
}
