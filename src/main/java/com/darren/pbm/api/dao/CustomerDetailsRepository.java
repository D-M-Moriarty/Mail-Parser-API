package com.darren.pbm.api.dao;

import com.darren.pbm.api.model.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, String> {
    List<CustomerDetails> findAllByCustNo(String custNo);
    List<CustomerDetails> findAllByEmail(String email);
}
