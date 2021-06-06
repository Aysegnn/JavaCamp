package nLayaredDemo;

import nLayaredDemo.business.abstracts.ProductService;
import nLayaredDemo.business.concretes.ProductManager;
import nLayaredDemo.core.JLoggerManagerAdapter;
import nLayaredDemo.dataAccess.concretes.AbcProductDao;

import nLayaredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
     
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
        Product product=new Product(1,2,"Elma",12,50);
        productService.add(product);
        
        
	}

}
