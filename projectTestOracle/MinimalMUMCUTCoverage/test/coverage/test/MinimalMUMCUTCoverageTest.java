package coverage.test;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
public class MinimalMUMCUTCoverageTest {

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression logic Logic  FinalState0  */ 
    public void test0(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression graph Graph  FinalState0  */ 
    public void test1(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of graphMapping for the element graph ***/
        try {
        page = buttonGraphCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error dataFlow DataFlow  FinalState0  */ 
    public void test2(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
    /* The test for the path Initial0 initialize Initialized mUTPH Error logic Logic  FinalState0  */ 
    public void test3(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error graph Graph  FinalState0  */ 
    public void test4(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
    /* The test for the path Initial0 initialize Initialized enterExpressionAndWrongLiterals WrongLiterals enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test5(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test6(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test7(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test8(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test9(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test10(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test11(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test12(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test13(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM dataFlow DataFlow  FinalState0  */ 
    public void test14(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
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
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM logic Logic  FinalState0  */ 
    public void test15(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of logicMapping for the element logic ***/
        try {
        page = buttonLogicCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM graph Graph  FinalState0  */ 
    public void test16(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
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
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test17(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndWrongLiterals WrongLiterals enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test18(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test19(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test20(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test21(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized mUTPH Error enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test22(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterWrongExpression WrongExpression mUTPH Error newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test23(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndWrongLiterals WrongLiterals mUTPH Error newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test24(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test25(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test26(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test27(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger clearInteger LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test28(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of clearIntegerMapping for the element clearInteger ***/
        textInputMaxTestSetSize.setText("");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger clearInteger LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test29(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of clearIntegerMapping for the element clearInteger ***/
        textInputMaxTestSetSize.setText("");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test30(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger fDM Error newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test31(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test32(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test33(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test34(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterWrongInteger IncorrectInteger mUTPH Error newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test35(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of mUTPHMapping for the element mUTPH ***/
        try {
        page = buttonMUTPH.click();
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
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger enterWrongInteger IncorrectInteger newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test36(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of enterWrongIntegerMapping for the element enterWrongInteger ***/
        textInputMaxTestSetSize.setText("-1");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM  FinalState0  */ 
    public void test37(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

    @Test
    /* The test for the path Initial0 initialize Initialized enterExpressionAndLiterals Initial0  LiteralAndEmptyInterger enterInteger CorrectInteger fDM FDM enterExpressionAndWrongLiterals WrongLiterals newExpression Initialized enterWrongExpression WrongExpression dataFlow DataFlow  FinalState0  */ 
    public void test38(){
        /*** test code of initializeMapping for the element initialize ***/
        final WebClient webClient = new WebClient();
        WebRequest request = null;
        try {
        request = new WebRequest( new URL("http://localhost:8080/CoverageWebApplication/coverage/MinimalMUMCUTCoverage" ), HttpMethod.POST);
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
        
        HtmlForm form = page.getFormByName("minimalMUMCUTCoverageForm");
        
        final HtmlSubmitInput buttonMUTPH = form.getInputByValue("MUTP Heuristic");
        
        final HtmlSubmitInput buttonFDM = form.getInputByValue("Fault Detection Maximization");
        
        final HtmlSubmitInput buttonNewExpression = form.getInputByValue("New Expression");
        
        final HtmlSubmitInput buttonGraphCoverage = form.getInputByValue("Graph Coverage");
        final HtmlSubmitInput buttonDataFlowCoverage = form.getInputByValue("Data Flow Coverage");
        final HtmlSubmitInput buttonLogicCoverage = form.getInputByValue("Logic Coverage");
        
        final HtmlTextInput textInputExpression = form.getInputByName("expression");
        final HtmlTextInput textInputInfeasibleLiterals = form.getInputByName("infeasibleLiterals");
        final HtmlTextInput textInputMaxTestSetSize = form.getInputByName("maxTestSetSize");
        /*** test code of enterExpressionAndLiteralsMapping for the element enterExpressionAndLiterals ***/
        textInputExpression.setText("a | b"); textInputInfeasibleLiterals.setText("a=1,b=1");
        /*** test code of enterIntegerMapping for the element enterInteger ***/
        textInputMaxTestSetSize.setText("1");
        /*** test code of fDMMapping for the element fDM ***/
        try {
        page = buttonFDM.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterExpressionAndWrongLiteralsMapping for the element enterExpressionAndWrongLiterals ***/
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a = 0");
        /*** test code of newExpressionMapping for the element newExpression ***/
        try {
        page = buttonNewExpression.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        /*** test code of enterWrongExpressionMapping for the element enterWrongExpression ***/
        textInputExpression.setText("a && b");textInputInfeasibleLiterals.setText("");
        /*** test code of dataFlowMapping for the element dataFlow ***/
        try {
        page = buttonDataFlowCoverage.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
    }

}
