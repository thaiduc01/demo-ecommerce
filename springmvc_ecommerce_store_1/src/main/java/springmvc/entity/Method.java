package springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "methods")
public class Method {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "method_id")
	private int method_id;
	
	@Column(name = "method_way")
	private String method_way;

	public Method() {
		super();
	}

	public int getMethod_id() {
		return method_id;
	}

	public void setMethod_id(int method_id) {
		this.method_id = method_id;
	}

	public String getMethod_way() {
		return method_way;
	}

	public void setMethod_way(String method_way) {
		this.method_way = method_way;
	}
}