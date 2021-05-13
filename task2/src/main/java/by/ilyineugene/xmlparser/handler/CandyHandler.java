package by.ilyineugene.xmlparser.handler;

import by.ilyineugene.xmlparser.entity.CandyEntity;
import by.ilyineugene.xmlparser.evidence.CandyXmlTag;
import org.xml.sax.Attributes;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class CandyHandler {

    private Set<CandyEntity> candies;
    private CandyEntity currentCandy;
    private CandyXmlTag candyXmlTag;
    private EnumSet<CandyXmlTag> withText; // что это за поле? для чего оно?
    private static final String ELEMENT_CANDY = "candy"; //  что это за поле? для чего оно?

    public CandyHandler() {
        candies = new HashSet<CandyEntity>();
        withText = EnumSet.range(CandyXmlTag.NAME, CandyXmlTag.PRODUCTION);
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (ELEMENT_CANDY.equals(qName)) {
            currentCandy = new CandyEntity();
        }
    }

}
