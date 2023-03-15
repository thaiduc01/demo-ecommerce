package springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "credit_cards")
public class CreditCardEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "card_id")
	private int card_id;
	
	@Column(name = "card_number")
	private String card_number;
	
	@Column(name = "cardholder_name")
	private String cardholder_name;
	
	@Column(name = "exp_month")
	private String exp_month;
	
	@Column(name = "exp_year")
	private String exp_year;
	
	@Column(name = "cvv")
	private String cvv;
	
	@Column(name = "payment_date")
	private String payment_date;
	
	@OneToOne
	@JoinColumn(name = "order_id")
	private OrderEntity orders;

	public CreditCardEntity() {
		super();
	}

	public int getCard_id() {
		return card_id;
	}

	public void setCard_id(int card_id) {
		this.card_id = card_id;
	}

	public String getCardholder_name() {
		return cardholder_name;
	}

	public void setCardholder_name(String cardholder_name) {
		this.cardholder_name = cardholder_name;
	}

	public String getCard_number() {
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
	}

	public String getExp_month() {
		return exp_month;
	}

	public void setExp_month(String exp_month) {
		this.exp_month = exp_month;
	}

	public String getExp_year() {
		return exp_year;
	}

	public void setExp_year(String exp_year) {
		this.exp_year = exp_year;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	public OrderEntity getOrders() {
		return orders;
	}

	public void setOrders(OrderEntity orders) {
		this.orders = orders;
	}
}