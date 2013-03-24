package coverage.test;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;

public class DataFlowCoverageTest {

    @Test
    /* The test for the path Initial0 initialize Initialized graphCoverage GraphCoverage  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of graphCoverageMapping for the element graphCoverage ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized minimalMUMCUTCoverage MinimalMUMCUTCoverage  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of minimalMUMCUTCoverageMapping for the element minimalMUMCUTCoverage ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered logicCoverage LogicCoverage  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered logicCoverage LogicCoverage  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage newGraph Initialized logicCoverage LogicCoverage  FinalState0  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newGraphMapping for the element newGraph ***/
        try {
        page = buttonNewGraph.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicCoverageMapping for the element logicCoverage ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered graphCoverage GraphCoverage  FinalState0  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of graphCoverageMapping for the element graphCoverage ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered graphCoverage GraphCoverage  FinalState0  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of graphCoverageMapping for the element graphCoverage ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered minimalMUMCUTCoverage MinimalMUMCUTCoverage  FinalState0  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of minimalMUMCUTCoverageMapping for the element minimalMUMCUTCoverage ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered minimalMUMCUTCoverage MinimalMUMCUTCoverage  FinalState0  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of minimalMUMCUTCoverageMapping for the element minimalMUMCUTCoverage ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered updateGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs  FinalState0  */ 
    public void test19(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of updateGraphMapping for the element updateGraph ***/
        
        textAreaEdges.setText("1 2\n1 3\n");
        textFieldEndNodes.setValueAttribute("2 3");
        textFieldInitialNodes.setValueAttribute("1");
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered updateDataFlow dataFlowEntered duPair DuPairs  FinalState0  */ 
    public void test20(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of updateDataFlowMapping for the element updateDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\nx 3\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs newDataFlow graphEntered enterDataFlow dataFlowEntered duPair DuPairs  FinalState0  */ 
    public void test21(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newDataFlowMapping for the element newDataFlow ***/
        try {
        page = buttonNewDuInfo.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths newDataFlow graphEntered enterDataFlow dataFlowEntered duPair DuPairs  FinalState0  */ 
    public void test22(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newDataFlowMapping for the element newDataFlow ***/
        try {
        page = buttonNewDuInfo.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths duPair DuPairs  FinalState0  */ 
    public void test23(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage duPair DuPairs  FinalState0  */ 
    public void test24(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage duPair DuPairs  FinalState0  */ 
    public void test25(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage duPair DuPairs  FinalState0  */ 
    public void test26(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs duPath DuPaths  FinalState0  */ 
    public void test27(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage duPath DuPaths  FinalState0  */ 
    public void test28(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage duPath DuPaths  FinalState0  */ 
    public void test29(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage duPath DuPaths  FinalState0  */ 
    public void test30(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs allDefCoverage AllDefCoverage  FinalState0  */ 
    public void test31(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths allDefCoverage AllDefCoverage  FinalState0  */ 
    public void test32(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage allDefCoverage AllDefCoverage  FinalState0  */ 
    public void test33(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage allDefCoverage AllDefCoverage  FinalState0  */ 
    public void test34(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs allDuPathCoverage AllDuPathCoverage  FinalState0  */ 
    public void test35(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths allDuPathCoverage AllDuPathCoverage  FinalState0  */ 
    public void test36(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage allDuPathCoverage AllDuPathCoverage  FinalState0  */ 
    public void test37(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allUseCoverage AllUseCoverage allDuPathCoverage AllDuPathCoverage  FinalState0  */ 
    public void test38(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPair DuPairs allUseCoverage AllUseCoverage  FinalState0  */ 
    public void test39(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPairMapping for the element duPair ***/
        try {
        page = buttonDuPairs.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered duPath DuPaths allUseCoverage AllUseCoverage  FinalState0  */ 
    public void test40(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of duPathMapping for the element duPath ***/
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDefCoverage AllDefCoverage allUseCoverage AllUseCoverage  FinalState0  */ 
    public void test41(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDefCoverageMapping for the element allDefCoverage ***/
        try {
        page = buttonAllDefCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterGraph graphEntered enterDataFlow dataFlowEntered allDuPathCoverage AllDuPathCoverage allUseCoverage AllUseCoverage  FinalState0  */ 
    public void test42(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/DFGraphCoverage" ), HttpMethod.POST);
        } catch (MalformedURLException e) {
        // TODO Auto-generated catch block
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
        
        HtmlForm form = page.getFormByName("dataFlowCoverageForm");
        
        final HtmlSubmitInput buttonDuPairs = form.getInputByValue("DU Pairs");
        
        final HtmlSubmitInput buttonDuPaths = form.getInputByValue("DU Paths");
        
        final HtmlSubmitInput buttonAllDefCoverage = form.getInputByValue("All Def Coverage");
        
        final HtmlSubmitInput buttonAllUseCoverage = form.getInputByValue("All Use Coverage");
        
        final HtmlSubmitInput buttonAllDuPathCoverage = form.getInputByValue("All DU Path Coverage");
        
        final HtmlSubmitInput buttonNewGraph = form.getInputByValue("New Graph");
        final HtmlSubmitInput buttonNewDuInfo = form.getInputByValue("New DU Info");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        final HtmlTextArea textAreaEdges = form.getTextAreaByName("edges");
        final HtmlTextInput textFieldEndNodes = form.getInputByName("endNode");
        final HtmlTextInput textFieldInitialNodes = form.getInputByName("initialNode");
        final HtmlTextArea textAreaDefs = form.getTextAreaByName("defs");
        final HtmlTextArea textAreaUses = form.getTextAreaByName("uses");
        
        /*** test code of enterGraphMapping for the element enterGraph ***/
        
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        
        /*** test code of enterDataFlowMapping for the element enterDataFlow ***/
        
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        /*** test code of allDuPathCoverageMapping for the element allDuPathCoverage ***/
        try {
        page = buttonAllDuPathCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of allUseCoverageMapping for the element allUseCoverage ***/
        try {
        page = buttonAllUseCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        assertEquals(true, (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null));
    }

}
