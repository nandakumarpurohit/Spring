package com.demo.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.demo.bean.ProductBean;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductBean product = (ProductBean) context.getBean("product");
		//Resource r = new ClassPathResource("applicationContext.xml");
		//BeanFactory factory = new XmlBeanFactory(r);
		//ProductBean product = (ProductBean) factory.getBean("product");
		System.out.println(product);
		product.changeQuantity();
		System.out.println(product);
		
	}

}
