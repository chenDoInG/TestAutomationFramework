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
        textInputExpression.setText("a | b");
        textInputInfeasibleLiterals.setText("a=1,b=1");
        textInputMaxTestSetSize.setText("");
        textInputMaxTestSetSize.setText("-1");
        try {
        page = buttonMUTPH.click();
        } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        }
        return (((HtmlTable) page.getHtmlElementById("tableResult")).getCellAt(0, 0).asText() != null);
    }
}
