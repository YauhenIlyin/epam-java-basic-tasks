package by.ilyineugene.xmlparser.builder;

import by.ilyineugene.xmlparser.entity.CandyEntity;
import by.ilyineugene.xmlparser.handler.CandyErrorHandler;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.Set;

public class SAXCandyEntityBuilder {
    private Set<CandyEntity> candies;
    private
    public void main(String[] args) {
        try {



            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLReader xmlReader = saxParser.getXMLReader();
            xmlReader.setErrorHandler(new CandyErrorHandler());
            xmlReader.setContentHandler();
        } catch (SAXException | ParserConfigurationException | IOException e) {

        }
    }

}
