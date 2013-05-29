package coverage.test;
import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;
public class TempTest {

    public boolean test(){
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
        textAreaEdges.setText("1 2\n");
        textFieldEndNodes.setValueAttribute("2");
        textFieldInitialNodes.setValueAttribute("1");
        textAreaDefs.setText("x 1\n");
        textAreaUses.setText("x 2\n");
        try {
        page = buttonDuPaths.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        return (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null);
    }
}
