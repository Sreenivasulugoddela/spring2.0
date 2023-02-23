package com.techouts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.techouts.entity.ProductInformation;

public interface ProductInformationRepo extends JpaRepository<ProductInformation, Integer> 
{


}
