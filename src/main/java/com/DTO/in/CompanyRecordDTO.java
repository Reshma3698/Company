package com.DTO.in;

public class CompanyRecordDTO {
	private Long id;
	private String title;
	
	public CompanyRecordDTO(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
