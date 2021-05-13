package by.ilyineugene.xmlparser.handler;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class CandyContentHandler extends DefaultHandler {
    private static Logger logger = LogManager.getLogger("ConsoleLog");

    @Override
    public void startDocument() {
        logger.log(Level.INFO, "CandyContentHandler : start document...");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attrs) {

    }
}
