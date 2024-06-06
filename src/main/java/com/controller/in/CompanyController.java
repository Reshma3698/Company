package com.controller.in;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.in.CompanyRecordDTO;
import com.model.in.CompanyRecord;
import com.service.in.CompanyRecordService;

@RestController
@RequestMapping("/root/records")
public class CompanyController {
	
	@Autowired
	private CompanyRecordService  clientService;
	@GetMapping("/{id}")
	public CompanyRecord  getRecordById(@PathVariable Long id)
	{
		return clientService.getRecordById(id);
	}
	
	@GetMapping
	public List<CompanyRecord> getAllRecords()
	{
		return clientService.getAllRecords().stream().limit(10).toList();
	}
	
	@GetMapping("/title-id")
	public List<CompanyRecordDTO> getAllTitleAndId()
	{
		return clientService.findAllTitleIds();
	}
}
