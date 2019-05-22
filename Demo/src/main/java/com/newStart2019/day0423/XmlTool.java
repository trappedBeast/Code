package com.newStart2019.day0423;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName XmlTool
 * @Auther trappedBeast
 * @Date 2019/4/23 11:17
 * @Version 1.0
 * @Description TODO
 **/
public class XmlTool {
    public static void main(String[] args) {
        //创建解析工厂
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        //指定DocumentBuilder
        try {
            DocumentBuilder builder = dbfactory.newDocumentBuilder();
            Document doc = builder.parse(new File("d:" + File.separator + "download" +File.separator+ "demo02.xml"));
            doc.getElementsByTagName("");


        } catch (ParserConfigurationException e) {
            System.out.println();
        }catch (IOException e){

        }catch (SAXException e){

        }



    }
}
    