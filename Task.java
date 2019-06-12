package com.yash.ppmtool.domain;
import java.util.Date;

public class Task {
	private Integer id;
	private Date created_at;
	private Integer priority;
	private String projectIdentifier;
	private String projectSequence;
	private String status;
	private String summary;
	private int projectid;
	private Date updated_at;
	private int backlog_id;
	private String acceptance_criteria;
	private Date due_date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getProjectIdentifier() {
		return projectIdentifier;
	}
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}
	public String getProjectSequence() {
		return projectSequence;
	}
	public void setProjectSequence(String projectSequence) {
		this.projectSequence = projectSequence;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public int getBacklog_id() {
		return backlog_id;
	}
	public void setBacklog_id(int backlog_id) {
		this.backlog_id = backlog_id;
	}
	public String getAcceptance_criteria() {
		return acceptance_criteria;
	}
	public void setAcceptance_criteria(String acceptance_criteria) {
		this.acceptance_criteria = acceptance_criteria;
	}
	public Date getDue_date() {
		return due_date;
	}
	public void setDue_date(Date due_date) {
		this.due_date = due_date;
	}
	public Task(Integer id, Date created_at, Integer priority, String projectIdentifier, String projectSequence,
			String status, String summary, int projectid, Date updated_at, int backlog_id, String acceptance_criteria,
			Date due_date) {
		super();
		this.id = id;
		this.created_at = created_at;
		this.priority = priority;
		this.projectIdentifier = projectIdentifier;
		this.projectSequence = projectSequence;
		this.status = status;
		this.summary = summary;
		this.projectid = projectid;
		this.updated_at = updated_at;
		this.backlog_id = backlog_id;
		this.acceptance_criteria = acceptance_criteria;
		this.due_date = due_date;
	}
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", created_at=" +created_at + ", priority=" + priority + ", projectIdentifier="
				+ projectIdentifier + ", projectSequence=" + projectSequence + ", status=" + status + ", summary="
				+ summary + ", projectid=" + projectid + ", updated_at=" + updated_at + ", backlog_id=" + backlog_id
				+ ", acceptance_criteria=" + acceptance_criteria + ", due_date=" + due_date + "]";
	}
	
}
