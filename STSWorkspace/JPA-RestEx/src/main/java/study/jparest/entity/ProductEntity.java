package study.jparest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product2")
public class ProductEntity {

	@Id
	@Column(name = "product_id")
	private int id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_cost")
	private int cost;
	
	public ProductEntity() { }

	public ProductEntity(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
