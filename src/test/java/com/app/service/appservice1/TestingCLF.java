package com.app.service.appservice1;

import com.app.service.appservice1.controller.TestC;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestingCLF {

    @Test
    public  void appendCRLF() throws IOException, IOException {
        String responseText = "\r\n" + "------=_Part_0_2033268925.1674405437070\r\n" + "Content-Type: text/xml; charset=UTF-8\r\n" + "Content-Transfer-Encoding: binary\r\n" + "Content-Id: <6D5BC2A7CD8BD329F1C5DFADF85EC196>\r\n" + "\r\n" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><import xmlns=\"\"><ns1:importArgs returnConflictDetails=\"false\" type=\"settings\" viaImport=\"true\" xmlns:ns1=\"http://tripwire.com/twservice/wsdl/1\"/><importContent href=\"cid:48707D31C1FF239D0C92C377AFD5FB2D\"/></import></soapenv:Body></soapenv:Envelope>\r\n" + "------=_Part_0_2033268925.1674405437070\r\n" + "Content-Type: text/xml\r\n" + "Content-Transfer-Encoding: binary\r\n" + "Content-Id: <48707D31C1FF239D0C92C377AFD5FB2D>\r\n" + "\r\n" + "ï»¿<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + "<Settings generatingVersion=\"9.1.0.bmaster.r20221221115614-1381ca6.b19218\">\r\n";
        String requestText = "\n" + "------=_Part_0_2033268925.1674405437070\n" + "Content-Type: text/xml; charset=UTF-8\n" + "Content-Transfer-Encoding: binary\n" + "Content-Id: <6D5BC2A7CD8BD329F1C5DFADF85EC196>\n" + "\n" + "<?xml version=\"1.0\" encoding=\"UTF-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><soapenv:Body><import xmlns=\"\"><ns1:importArgs returnConflictDetails=\"false\" type=\"settings\" viaImport=\"true\" xmlns:ns1=\"http://tripwire.com/twservice/wsdl/1\"/><importContent href=\"cid:48707D31C1FF239D0C92C377AFD5FB2D\"/></import></soapenv:Body></soapenv:Envelope>\n" + "------=_Part_0_2033268925.1674405437070\n" + "Content-Type: text/xml\n" + "Content-Transfer-Encoding: binary\n" + "Content-Id: <48707D31C1FF239D0C92C377AFD5FB2D>\n" + "\n" + "ï»¿<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + "<Settings generatingVersion=\"9.1.0.bmaster.r20221221115614-1381ca6.b19218\">\n";
        byte[] bytes = requestText.getBytes(StandardCharsets.UTF_8);
        InputStream afterLogging = TestC.appendCRLFToSupportJava11AndAbove(new ByteArrayInputStream(bytes));
        assertThat(IOUtils.toByteArray(afterLogging), is(responseText.getBytes(StandardCharsets.UTF_8)));
    }
}
