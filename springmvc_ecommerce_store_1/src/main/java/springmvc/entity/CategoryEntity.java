package springmvc.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "category")
public class CategoryEntity {

	@NotNull(message = "phone is required")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoryID")
	private int categoryID;
	
	@NotBlank(message = "Không được bỏ trống")
	@Pattern(regexp = "[a-zA-Z][a-zA-Z ]+",message = "Tên không chứa kí tự đặc biệt")
	@Column(name = "categoryName")
	private String categoryName;

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private List<ProductEntity> products;
	
	public CategoryEntity() {
		super();
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}