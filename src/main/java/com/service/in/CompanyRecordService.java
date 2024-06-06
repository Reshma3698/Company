package com.service.in;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.DTO.in.CompanyRecordDTO;
import com.model.in.CompanyRecord;

@Service
public class CompanyRecordService {
	private static final String BASE_URL="http://localhost:8080/api/records";
	private static final String ALLRECORDS_URL="https://jsonplaceholder.typicode.com/users";
	private static final String SECOND_URL="https://jsonplaceholder.typicode.com/posts";
	@Autowired
	private RestTemplate restTemplate;
	public CompanyRecord getRecordById(Long id)
	{
		String url=BASE_URL+"/"+id;
		return restTemplate.getForObject(url, CompanyRecord.class);
	}
	
	public List<CompanyRecord> getAllRecords()
	{
		return Arrays.asList(restTemplate.getForObject(ALLRECORDS_URL, CompanyRecord[].class));
	}
	 
	public List<CompanyRecordDTO > findAllTitleIds()
	{
		return Arrays.asList(restTemplate.getForObject(SECOND_URL,CompanyRecordDTO.class));
	}
}
