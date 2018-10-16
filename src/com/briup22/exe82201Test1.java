package com.briup22;

import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class exe82201Test1 {
	public static void main(String[] args) throws Exception{
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=factory.newDocumentBuilder();
		
		File f=new File("D:/360Downloads/eclipse/wackspace/JB0527/src/com/briup22/exe82201.xml");
		Document document=builder.parse(f);
//		System.out.println(document);
		Element rootElement=document.getDocumentElement();
//		System.out.println(rootElement);
		
		NodeList nodeList=rootElement.getChildNodes();//ªÒ»° Ù–‘
		System.out.println(nodeList);
		
		for(int i=0;i<nodeList.getLength();i++){
			Node node=nodeList.item(i);
			if(node.getNodeType()==Node.ELEMENT_NODE){
				System.out.println(node);
			}
			NamedNodeMap maps=node.getAttributes();
//			Node nameNode=maps.getNamedItem("id");
//			String name=nameNode.getNodeValue();
//	 		System.out.println(name);
			
//===============================
			NodeList nodeList2=node.getChildNodes();
			for(int j=0;j<nodeList2.getLength();j++){
				Node node2=nodeList.item(j);
				if(node2.getNodeType()==Node.ELEMENT_NODE){
					System.out.println(node2);
				String info=node2.getNodeValue();
				System.out.println(info);
				}
				
			}
			
		}
		
		
	}
}
