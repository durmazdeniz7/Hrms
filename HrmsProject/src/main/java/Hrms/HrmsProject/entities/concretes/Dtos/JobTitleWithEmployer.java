package Hrms.HrmsProject.entities.concretes.Dtos;

import java.util.Date;

public class JobTitleWithEmployer {
	private int id;
	private String companyName;
	private int openPostion;
	private Date openDate;
	private Date lastDate;
	
	public JobTitleWithEmployer() {
		// TODO Auto-generated constructor stub
	}

	public JobTitleWithEmployer(int id, String companyName, int openPostion, Date openDate, Date lastDate) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.openPostion = openPostion;
		this.openDate = openDate;
		this.lastDate = lastDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return companyName;
	}

	public void setName(String companyName) {
		this.companyName = companyName;
	}

	public int getOpenPostion() {
		return openPostion;
	}

	public void setOpenPostion(int openPostion) {
		this.openPostion = openPostion;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	

}
