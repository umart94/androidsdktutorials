package com.umartariq;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    //XML Pull Parser
    private List<Country> countries= new ArrayList<Country>();
    private Country country;
    private String text;

    public List<Country> getCountries() {
        return countries;
    }

    public List<Country> parse(InputStream is) {
        try {
            XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            XmlPullParser parser = factory.newPullParser();

            parser.setInput(is, null);

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("item")) {
                            // create a new instance of country
                            String countryName=parser.getAttributeValue(0);
                            String english_name = parser.getAttributeValue(1);
                            String name_code=parser.getAttributeValue(2);
                            String phone_code=parser.getAttributeValue(3);
                            country = new Country(countryName,english_name,name_code,phone_code);
                        }
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("item")) {
                            // add country object to list
                            countries.add(country);
                        }else if (tagname.equalsIgnoreCase("english_name")) {
                            country.setCountryName(text);
                        }  /*else if (tagname.equalsIgnoreCase("iso2")) {
                            country.setIso2(text);
                        } else if (tagname.equalsIgnoreCase("iso3")) {
                            country.setIso3(text);
                        }*/
                        else if(tagname.equalsIgnoreCase("name_code")){

                        } else if(tagname.equalsIgnoreCase("phone_code")){

                        }
                        break;

                    default:
                        break;
                }
                eventType = parser.next();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();

        }
        catch (IOException e) {
            e.printStackTrace();}

        return countries;
    }
}
