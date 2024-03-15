package jp.ac.ohara.Nikityou.model;
import java.sql.Date;

//import org.apache.catalina.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="hiduke")
public class DayModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long dayid;
//	private Long userid;
	
	@Column(name="day",nullable = false)
	private Date day;
	
	
	public Long getDayid() {
		return dayid;
	}
	public void setDayid(Long dayid) {
		this.dayid = dayid;
	}
//	public Long getUserid() {
//		return userid;
//	}
//	public void setUserid(Long userid) {
//		this.userid = userid;
//	}
	
//	@ManyToOne
//	@JoinColumn(name="userid",insertable=false, updatable=false)
//	private User user;
	
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
}