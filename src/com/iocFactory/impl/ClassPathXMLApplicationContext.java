package com.iocFactory.impl;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

import com.iocFactory.ApplicationContext;

public class ClassPathXMLApplicationContext implements ApplicationContext{

	private File file;
	private Map map = new HashMap();
	
	
	public ClassPathXMLApplicationContext(String config_file){
		URL url = this.getClass().getClassLoader().getResource(config_file);
		
		try {
			file = new File(url.toURI());
			XMParsing();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void XMParsing() throws Exception{
		SAXBuilder bulider = new SAXBuilder();
		Document doc = bulider.build(file);
		
		XPath xpath = XPath.newInstance("//bean");
		List beans = xpath.selectNodes(doc);
		Iterator i = beans.iterator();
		while(i.hasNext()){
			Element bean = (Element) i.next();
			String id = bean.getAttributeValue("id");
			String cls = bean.getAttributeValue("class");
			Object obj = Class.forName(cls).newInstance();
			
			Method[] method = obj.getClass().getDeclaredMethods();
			List<Element> list = bean.getChildren("property");
			for(Element el:list){
				for(int n = 0;n < method.length;n++){
					String name = method[n].getName();
					String temp = null;
					if(name.startsWith("set")){
						temp = name.substring(3, name.length()).toLowerCase();
						if(el.getAttribute("name") != null){
							if(temp.equals(el.getAttribute("name").getValue())){
								method[n].invoke(obj, el.getAttribute("value").getValue());
							}
						}else{
							method[n].invoke(obj, map.get(el.getAttribute("ref").getValue()));
						}
					}
				}
			}
			map.put(id, obj);
			
		}
	}
	
	
	public Object getBean(String name){
		return map.get(name);
	}
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}
	
	
	
}
