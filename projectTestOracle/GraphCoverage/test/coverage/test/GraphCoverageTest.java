package coverage.test;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
public class GraphCoverageTest {

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage edgePairCoverage EdgePairCoverage edgeCoverage EdgeCoverage edgePairCoverage EdgePairCoverage nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage nodeCoverage NodeCoverage edgePairCoverage EdgePairCoverage nodeCoverage NodeCoverage edgePairCoverage EdgePairCoverage primePathCoverage PrimePathCoverage  FinalStateTP  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeCoverageMapping for the element edgeCoverage ***/
        try {
        page = buttonEdgeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage edgePairCoverage EdgePairCoverage primePathCoverage PrimePathCoverage edgePairCoverage EdgePairCoverage primePathCoverage PrimePathCoverage edgeCoverage EdgeCoverage primePathCoverage PrimePathCoverage edgeCoverage EdgeCoverage nodeCoverage NodeCoverage edgeCoverage EdgeCoverage nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairCoverageMapping for the element edgePairCoverage ***/
        try {
        page = buttonEdgePairCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeCoverageMapping for the element edgeCoverage ***/
        try {
        page = buttonEdgeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeCoverageMapping for the element edgeCoverage ***/
        try {
        page = buttonEdgeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeCoverageMapping for the element edgeCoverage ***/
        try {
        page = buttonEdgeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths edge Edges simplePath PrimePaths edgePair EdgePairs primePath PrimePaths simplePath SimplePaths edge Edges simplePath SimplePaths primePath PrimePaths simplePath SimplePaths node Nodes primePath PrimePaths  FinalStateTR  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of edgeMapping for the element edge ***/
        try {
        page = buttonEdges.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairMapping for the element edgePair ***/
        try {
        page = buttonEdgePairs.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeMapping for the element edge ***/
        try {
        page = buttonEdges.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths node Nodes edgePair EdgePairs edge Edges edgePair EdgePairs simplePath SimplePaths edgePair EdgePairs node Nodes simplePath SimplePaths primePath PrimePaths edge Edges node Nodes edge Edges simplePath PrimePaths  FinalStateTR  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairMapping for the element edgePair ***/
        try {
        page = buttonEdgePairs.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeMapping for the element edge ***/
        try {
        page = buttonEdges.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairMapping for the element edgePair ***/
        try {
        page = buttonEdgePairs.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgePairMapping for the element edgePair ***/
        try {
        page = buttonEdgePairs.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of edgeMapping for the element edge ***/
        try {
        page = buttonEdges.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of edgeMapping for the element edge ***/
        try {
        page = buttonEdges.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of simplePathMapping for the element simplePath ***/
        try {
        page = buttonSimplePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered minimalMUMCUT minimalMUMCUT newGraph Initialized dataFlow dataFlow  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP updateGraph GraphEntered logic logic newGraph Initialized dataFlow dataFlow  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of updateGraphMapping for the element updateGraph ***/
        textAreaEdges.setText("1 2\n1 3\n");
        textFieldEndNodes.setValueAttribute("2 3");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR updateGraph GraphEntered dataFlow dataFlow newGraph Initialized dataFlow dataFlow  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of updateGraphMapping for the element updateGraph ***/
        textAreaEdges.setText("1 2\n1 3\n");
        textFieldEndNodes.setValueAttribute("2 3");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP newGraph Initialized minimalMUMCUT minimalMUMCUT  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR newGraph Initialized logic logic  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered updateGraph GraphEntered newGraph Initialized dataFlow dataFlow  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of updateGraphMapping for the element updateGraph ***/
        textAreaEdges.setText("1 2\n1 3\n");
        textFieldEndNodes.setValueAttribute("2 3");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP dataFlow dataFlow  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP logic logic  FinalState0  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP minimalMUMCUT minimalMUMCUT  FinalState0  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  dataFlow  FinalState0  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  logic  FinalState0  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  minimalMUMCUT  FinalState0  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph GraphEntered  InitialTR node Nodes primePath PrimePaths  FinalStateTR  InitialTP nodeCoverage NodeCoverage primePathCoverage PrimePathCoverage  FinalStateTP  InitialTR node Nodes primePath PrimePaths  FinalStateTR  FinalState0  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/GraphCoverage"), HttpMethod.POST);
        } catch (MalformedURLException e) {
        e.printStackTrace();
        }
        
        HtmlPage page = null;
        try {
        page = webClient.getPage(request);
        } catch (FailingHttpStatusCodeException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        HtmlForm form = page.getFormByName("graphCoverageForm");
        
        final HtmlSubmitInput buttonNodes = form.getInputByValue("Nodes");
        
        final HtmlSubmitInput buttonEdges = form.getInputByValue("Edges");
        
        final HtmlSubmitInput buttonEdgePairs = form.getInputByValue("Edge-Pair");
        
        final HtmlSubmitInput buttonSimplePaths = form.getInputByValue("Simple Paths");
        
        final HtmlSubmitInput buttonPrimePaths = form.getInputByValue("Prime Paths");
        
        final HtmlSubmitInput buttonNodeCoverage = form.getInputByValue("Node Coverage");
        
        final HtmlSubmitInput buttonEdgeCoverage = form.getInputByValue("Edge Coverage");
        
        final HtmlSubmitInput buttonEdgePairCoverage = form.getInputByValue("Edge-Pair Coverage");
        
        final HtmlSubmitInput buttonPrimePathCoverage = form.getInputByValue("Prime Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        
        final HtmlTable table = null;
        /*** test code of enterGraphMapping for the element enterGraph ***/
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        /*** test code of nodeCoverageMapping for the element nodeCoverage ***/
        try {
        page = buttonNodeCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathCoverageMapping for the element primePathCoverage ***/
        try {
        page = buttonPrimePathCoverage.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of nodeMapping for the element node ***/
        try {
        page = buttonNodes.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of primePathMapping for the element primePath ***/
        try {
        page = buttonPrimePaths.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

}
