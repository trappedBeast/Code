package com.demo2019.day0128;


import lombok.extern.log4j.Log4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.List;


/**
 * @ClassName XmlTool
 * @Auther trappedBeast
 * @Date 2019/1/28 18:36
 * @Version 1.0
 * @Description TODO
 **/
@Log4j
public class XmlTool {
    public static void main(String[] args) {
        HashMap <String, String> basicInfo = new HashMap <>();
        HashMap <String, String> queryPerson = new HashMap <>();
        HashMap <String, String> queryMains = new HashMap <>();
        File file = new File("d:" + File.separator + "download" +File.separator+ "Father.xml");
        if(file.exists()){
            System.out.println(file.getName());
            SAXReader sax=new SAXReader();
            try {
                Document document = sax.read(file);
                List<Element> composites = document.selectNodes("//BASICINFO");
                Element childElement=composites.get(0);
                basicInfo.put("QQDBS",childElement.attributeValue("QQDBS"));
                basicInfo.put("QQCSLX",childElement.attributeValue("QQCSLX"));
                basicInfo.put("SQJGDM",childElement.attributeValue("SQJGDM"));
                basicInfo.put("SQJGMC",childElement.attributeValue("SQJGMC"));
                basicInfo.put("MBJGDM",childElement.attributeValue("MBJGDM"));
                basicInfo.put("ZTLB",childElement.attributeValue("ZTLB"));
                basicInfo.put("AJLX",childElement.attributeValue("AJLX"));
                basicInfo.put("JJCD",childElement.attributeValue("JJCD"));
                basicInfo.put("BEIZ",childElement.attributeValue("BEIZ"));
                basicInfo.put("FSSJ",childElement.attributeValue("FSSJ"));
                basicInfo.put("FLWSH",childElement.attributeValue("FLWSH"));
                /*for (Element childElement : elements) {
                    if("BASICINFO".equalsIgnoreCase(childElement.getName())){
                        basicInfo.put("QQDBS",childElement.attributeValue("QQDBS"));
                        basicInfo.put("QQCSLX",childElement.attributeValue("QQCSLX"));
                        basicInfo.put("SQJGDM",childElement.attributeValue("SQJGDM"));
                        basicInfo.put("SQJGMC",childElement.attributeValue("SQJGMC"));
                        basicInfo.put("MBJGDM",childElement.attributeValue("MBJGDM"));
                        basicInfo.put("ZTLB",childElement.attributeValue("ZTLB"));
                        basicInfo.put("AJLX",childElement.attributeValue("AJLX"));
                        basicInfo.put("JJCD",childElement.attributeValue("JJCD"));
                        basicInfo.put("BEIZ",childElement.attributeValue("BEIZ"));
                        basicInfo.put("FSSJ",childElement.attributeValue("FSSJ"));
                        basicInfo.put("FLWSH",childElement.attributeValue("FLWSH"));
                    }
                    if("QUERYPERSON".equalsIgnoreCase(childElement.getName())){
                        queryPerson.put("QQRXM",childElement.attributeValue("QQRXM"));
                        queryPerson.put("QQRZJLX",childElement.attributeValue("QQRZJLX"));
                        queryPerson.put("QQRZJHM",childElement.attributeValue("QQRZJHM"));
                        queryPerson.put("QQRDWMC",childElement.attributeValue("QQRDWMC"));
                        queryPerson.put("QQRSJH",childElement.attributeValue("QQRSJH"));
                        queryPerson.put("XCRXM",childElement.attributeValue("XCRXM"));
                        queryPerson.put("XCRZJLX",childElement.attributeValue("XCRZJLX"));
                        queryPerson.put("XCRZJHM",childElement.attributeValue("XCRZJHM"));
                    }
                    if("QUERYMAINS".equalsIgnoreCase(childElement.getName())){
                        List<Element> elements1 = childElement.elements();
                        for(Element elementss:elements1){
                            if("QUERYMAIN".equalsIgnoreCase(elementss.getName())){
                                Map<String,String> map=new HashMap <>();
                                map.put("",elementss.attributeValue(""))
                            }
                        }

                    }                }*/
            } catch (DocumentException e) {
                System.err.println("111111111111111111111111111111111");
            }catch (NoClassDefFoundError e){
                log.error("缺少Jar包依赖",e);



            }

            System.out.println(basicInfo.toString()+".....................");


        }

    }
}
    