package com.newStart2019.day0419;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName XmlDemo
 * @Auther trappedBeast
 * @Date 2019/4/19 11:43
 * @Version 1.0
 * @Description TODO
 **/
public class XmlDemo {
    public static void main(String[] args) {
        File file = new File("d:" + File.separator + "download" +File.separator+ "demo02.xml");
        System.out.println(file.getName());
        if(file.exists()) {
            System.out.println(file.getName());
            SAXReader sax = new SAXReader();
            try {
                String flag="jcjg";
                Document document = sax.read(file);
                String xpath="//client[@type='"+flag+"']";
                Element element = (Element) document.selectNodes(xpath).get(0);
                List<Element> elements = element.elements();
                Map<String,String> map=new HashMap <>();
                for (Element element1 : elements) {
                    map.put(element1.getName(),element1.getText());
                }
                System.out.println(map.get("password"));
            } catch (DocumentException e) {
                System.err.println("xml解析失败！");
            }
        }
    }
}
    