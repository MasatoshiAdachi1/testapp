package jp.ac.ohara.Nikityou.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="nikkiinfor")
public class NikkiModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long nikkiid;
//	private Long dayid;
	
	@Column(name="title",length=32,nullable = false)
	private String title;
	
	@Column(name="infor",length=1024,nullable = false)
	private String infor;
	
	
	public Long getNikkiid() {
		return nikkiid;
	}
	public void setNikkiid(Long nikkiid) {
		this.nikkiid = nikkiid;
	}
//	public Long getDayid() {
//		return dayid;
//	}
//	public void setDayid(Long dayid) {
//		this.dayid = dayid;
//	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInfor() {
		return infor;
	}
	public void setInfor(String infor) {
		this.infor = infor;
	}
}