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
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "supplier")
public class SupplierEntity {

	@NotNull(message = "phone is required")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "supplierID")
	private int supplierID;
	
	@NotBlank(message = "Không được bỏ trống")
	@Column(name = "supplierName")
	private String supplierName;
	
	@Length(min=10,max=10,message = "SĐT tối đa 10 chữ số")
	@Column(name = "supplierPhone")
	private String supplierPhone;
	
	@NotBlank(message = "Không được bỏ trống")
	@Column(name = "supplierAddress")
	private String supplierAddress;
	
	@NotBlank(message = "Không được bỏ trống")
	@Column(name = "supplierEmail")
	private String supplierEmail;
	
	@OneToMany(mappedBy = "supplier", fetch = FetchType.EAGER)
	private List<ProductEntity> products;

	public SupplierEntity() {
		super();
	}
 
	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierPhone() {
		return supplierPhone;
	}

	public void setSupplierPhone(String supplierPhone) {
		this.supplierPhone = supplierPhone;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	public String getSupplierEmail() {
		return supplierEmail;
	}

	public void setSupplierEmail(String supplierEmail) {
		this.supplierEmail = supplierEmail;
	}
}