package springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "acc_id")
	private int acc_id;
	
	@Column(name = "acc_number")
	private long acc_number;
	
	@Column(name = "acc_name")
	private String acc_name;
	
	@Column(name = "acc_exp_month")
	private int acc_exp_month;
	
	@Column(name = "acc_exp_year")
	private int acc_exp_year;
	
	@Column(name = "acc_cvv")
	private int acc_cvv;

	public Account() {
		super();
	}

	public int getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}

	public long getAcc_number() {
		return acc_number;
	}

	public void setAcc_number(long acc_number) {
		this.acc_number = acc_number;
	}

	public String getAcc_name() {
		return acc_name;
	}

	public void setAcc_name(String acc_name) {
		this.acc_name = acc_name;
	}

	public int getAcc_cvv() {
		return acc_cvv;
	}

	public void setAcc_cvv(int acc_cvv) {
		this.acc_cvv = acc_cvv;
	}

	public int getAcc_exp_month() {
		return acc_exp_month;
	}

	public void setAcc_exp_month(int acc_exp_month) {
		this.acc_exp_month = acc_exp_month;
	}

	public int getAcc_exp_year() {
		return acc_exp_year;
	}

	public void setAcc_exp_year(int acc_exp_year) {
		this.acc_exp_year = acc_exp_year;
	}
}