package springmvc.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int order_id;
	
	@Column(name = "order_date")
	private String order_date;
	
	@Column(name = "order_status")
	private String order_status;
	
	@Column(name = "payment_method")
	private String payment_method;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id")
	private List<OrderDetailEntity> order_details;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "customerID")
	private CustomerEntity customers;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "card_id")
	private CreditCardEntity credit_cards;
	
	public OrderEntity() {
		super();
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public List<OrderDetailEntity> getOrder_details() {
		return order_details;
	}

	public void setOrder_details(List<OrderDetailEntity> order_details) {
		this.order_details = order_details;
	}

	public String getOrder_status() {
		return order_status;
	}

	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	
	public void add (OrderDetailEntity orderDetail) {
		if (order_details == null) {
			order_details = new ArrayList<OrderDetailEntity>();
		}
		order_details.add(orderDetail);
		orderDetail.setOrders(this);
	}
	
	public CustomerEntity getCustomers() {
		return customers;
	}

	public void setCustomers(CustomerEntity customers) {
		this.customers = customers;
	}

	public CreditCardEntity getCredit_cards() {
		return credit_cards;
	}

	public void setCredit_cards(CreditCardEntity credit_cards) {
		this.credit_cards = credit_cards;
	}
}