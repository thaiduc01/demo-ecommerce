package springmvc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "products")
public class ProductEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productID")
	private int productID;
	
	@Pattern(regexp = "[a-zA-Z][a-zA-Z ]+",message = "Tên Không được chứa kí tự đặc biệt")
	@NotBlank(message = "Phải nhập tên sản phẩm")
	@Column(name = "productName")
	private String productName;
	
	@Min(value = 10000,message = "Giá sản phẩm phải lớn hơn 10 ngàn")
	@Column(name = "productPrice")
	private float productPrice;
	
	@NotNull(message = "Phải chọn giới tính")
	@Column(name = "sex")
	private String sex;
	
	@NotBlank(message = "Phải mô tả sản phẩm")
	@Column(name = "productDescription")
	private String productDescription;

	@Transient
	private List<MultipartFile> multipartFile;
	
	//@NotEmpty(message = "Phải thêm ảnh cho sản phẩm")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "product_id")
	private List<ImageEntity> image;
	
	//@NotNull(message = "phone is required")
	@ManyToOne
	@JoinColumn(name = "supplierID")
	private SupplierEntity supplier;
	
	//@NotNull(message = "phone is required")
	@ManyToOne
	@JoinColumn(name = "categoryID")
	private CategoryEntity category;
	
	@OneToOne
	@JoinColumn(name = "orderdetail_id")
	private OrderDetailEntity order_details;
	
	public ProductEntity() {
		super();
	}

	public SupplierEntity getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierEntity supplier) {
		this.supplier = supplier;
	}

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public List<MultipartFile> getMultipartFile() {
		return multipartFile;
	}

	public void setMultipartFile(List<MultipartFile> multipartFile) {
		this.multipartFile = multipartFile;
	}

	public List<ImageEntity> getImage() {
		return image;
	}

	public void setImage(List<ImageEntity> image) {
		this.image = image;
	}

	public OrderDetailEntity getOrder_details() {
		return order_details;
	}

	public void setOrder_details(OrderDetailEntity order_details) {
		this.order_details = order_details;
	}
}