package com.yash.ppmtool.domain;

import java.util.Date;

import com.yash.ppmtool.util.DateUtil;

public class Project {
	private Integer id;  /*id for project:PK */
	private String prj_identifier;  /*prj_identifier for project */
	private String name;  /*name for project */
	private String description;  /*description for project */
	private Date startdate;  /*startdate for project */
	private Date enddate;  /*enddate for project */
	private Date created_at;  /*created_at for project */
	private Date updated_at;  /*updated_at for project */

	public Project() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrj_identifier() {
		return prj_identifier;
	}

	public void setPrj_identifier(String prj_identifier) {
		this.prj_identifier = prj_identifier;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public Project(Integer id, String prj_identifier, String name, String description, Date startdate, Date enddate, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.prj_identifier = prj_identifier;
		this.name = name;
		this.description = description;
		this.startdate = startdate;
		this.enddate = enddate;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "Project [id=" + id + ", prj_identifier=" + prj_identifier + ", name=" + name + ", description="
				+ description + ", startdate=" + startdate + ", enddate=" + enddate +
				 ", created_at=" + DateUtil.dateToString(created_at) + ", updated_at=" + DateUtil.dateToString(updated_at) + "]";
	}

}
