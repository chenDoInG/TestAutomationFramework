package coverage.test;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
public class LogicCoverageTest {

    @Test
    /* The test for the path Initial0 initialize Initialized minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized graph GraphCoverage  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered dataFlow DataFlowCoverage  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered dataFlow DataFlowCoverage  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered graph GraphCoverage  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered graph GraphCoverage  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC dataFlow DataFlowCoverage  FinalState0  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC dataFlow DataFlowCoverage  FinalState0  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC dataFlow DataFlowCoverage  FinalState0  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC dataFlow DataFlowCoverage  FinalState0  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC dataFlow DataFlowCoverage  FinalState0  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test19(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test20(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test21(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test22(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC minimalMUMCUT MininalMUMCUTCoverage  FinalState0  */ 
    public void test23(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of minimalMUMCUTMapping for the element minimalMUMCUT ***/
        try {
        page = buttonMinimalMUMCUTCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test24(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test25(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized trOrT Error enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test26(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC truthTable TruthTable  FinalState0  */ 
    public void test27(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC truthTable TruthTable  FinalState0  */ 
    public void test28(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC truthTable TruthTable  FinalState0  */ 
    public void test29(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC truthTable TruthTable  FinalState0  */ 
    public void test30(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC truthTable TruthTable  FinalState0  */ 
    public void test31(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable gacc GACC  FinalState0  */ 
    public void test32(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable cacc CACC  FinalState0  */ 
    public void test33(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable racc RACC  FinalState0  */ 
    public void test34(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable gicc GICC  FinalState0  */ 
    public void test35(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable ricc RICC  FinalState0  */ 
    public void test36(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC graph GraphCoverage  FinalState0  */ 
    public void test37(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC graph GraphCoverage  FinalState0  */ 
    public void test38(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC graph GraphCoverage  FinalState0  */ 
    public void test39(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC graph GraphCoverage  FinalState0  */ 
    public void test40(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC graph GraphCoverage  FinalState0  */ 
    public void test41(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test42(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test43(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test44(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test45(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test46(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test47(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test48(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test49(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test50(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test51(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test52(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC enterExpression ExpressionEntered truthTable TruthTable  FinalState0  */ 
    public void test53(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test54(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test55(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized trOrT Error enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test56(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpressionEntered trOrT Error enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test57(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered trOrT Error enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test58(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized trOrT Error trOrT Error enterExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test59(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of trOrTMapping for the element trOrT ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered truthTable TruthTable enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test60(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of truthTableMapping for the element truthTable ***/
        try {
        page = buttonTruthTable.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gacc GACC enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test61(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of gaccMapping for the element gacc ***/
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered cacc CACC enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test62(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of caccMapping for the element cacc ***/
        try {
        page = buttonCacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered racc RACC enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test63(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of raccMapping for the element racc ***/
        try {
        page = buttonRacc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered gicc GICC enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test64(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of giccMapping for the element gicc ***/
        try {
        page = buttonGicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpression ExpressionEntered ricc RICC enterWrongExpression WrongExpressionEntered newExpression Initialized dataFlow DataFlowCoverage  FinalState0  */ 
    public void test65(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/LogicCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("logicCoverageForm");
        assertEquals("logicCoverageForm", form.getNameAttribute());
        
        final HtmlSubmitInput buttonTruthTable = form.getInputByValue("Truth Table");
        assertEquals("action", buttonTruthTable.getNameAttribute());
        
        final HtmlSubmitInput buttonGacc = form.getInputByValue("GACC");
        
        final HtmlSubmitInput buttonCacc = form.getInputByValue("CACC");
        
        final HtmlSubmitInput buttonRacc = form.getInputByValue("RACC");
        
        final HtmlSubmitInput buttonGicc = form.getInputByValue("GICC");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonRicc = form.getInputByValue("RICC");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonMinimalMUMCUTCoverage = form.getInputByValue("Minimal-MUMCUT Coverage");
        /*** test code of enterExpressionMapping for the element enterExpression ***/
        textInputExpression.setText("a & b");
        /*** test code of riccMapping for the element ricc ***/
        try {
        page = buttonRicc.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

}
