package com.myspace.kafala;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "request")
public class request implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(generator = "REQUEST_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.SequenceGenerator(name = "REQUEST_ID_GENERATOR", sequenceName = "REQUEST_ID_SEQ")
	private java.lang.Long id;

	private java.lang.String applicantName;

	private java.lang.String departmentName;

	private java.lang.String administrationName;

	private java.lang.String serviceName;

	private java.lang.String requestResource;

	private java.lang.String requestID;

	public request() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getApplicantName() {
		return this.applicantName;
	}

	public void setApplicantName(java.lang.String applicantName) {
		this.applicantName = applicantName;
	}

	public java.lang.String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(java.lang.String departmentName) {
		this.departmentName = departmentName;
	}

	public java.lang.String getAdministrationName() {
		return this.administrationName;
	}

	public void setAdministrationName(java.lang.String administrationName) {
		this.administrationName = administrationName;
	}

	public java.lang.String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(java.lang.String serviceName) {
		this.serviceName = serviceName;
	}

	public java.lang.String getRequestResource() {
		return this.requestResource;
	}

	public void setRequestResource(java.lang.String requestResource) {
		this.requestResource = requestResource;
	}

	public java.lang.String getRequestID() {
		return this.requestID;
	}

	public void setRequestID(java.lang.String requestID) {
		this.requestID = requestID;
	}

	public request(java.lang.Long id, java.lang.String applicantName,
			java.lang.String departmentName,
			java.lang.String administrationName, java.lang.String serviceName,
			java.lang.String requestResource, java.lang.String requestID) {
		this.id = id;
		this.applicantName = applicantName;
		this.departmentName = departmentName;
		this.administrationName = administrationName;
		this.serviceName = serviceName;
		this.requestResource = requestResource;
		this.requestID = requestID;
	}

}