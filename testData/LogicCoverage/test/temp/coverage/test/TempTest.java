package coverage.test;

import java.io.*;
import org.junit.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;import com.gargoylesoftware.htmlunit.*;
import com.gargoylesoftware.htmlunit.html.*;

public class TempTest {

    public boolean test(){
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
        
        
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        
        try {
        page = buttonGacc.click();
        } catch (IOException e) {
        e.printStackTrace();
        }
        return (((HtmlTable) page.getHtmlElementById("tableException")).getCellAt(0, 0).asText() != null);
    }
}
