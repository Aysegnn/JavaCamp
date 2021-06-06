package nLayaredDemo.dataAccess.concretes;

import java.util.List;

import nLayaredDemo.dataAccess.abstracts.ProductDao;
import nLayaredDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println(product.getName()+ " added!");
	}

	@Override
	public void delete(Product product) {
		System.out.println(product.getName() + " deleted!");
		
	}

	@Override
	public void update(Product product) {
		System.out.println(product.getName() + " updated!");
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
