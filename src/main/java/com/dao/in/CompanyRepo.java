package com.dao.in;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.in.CompanyRecord;
@Repository
public interface CompanyRepo extends JpaRepository<CompanyRecord,Long>{

}
