package com.mysql.OneToMany.repository;

import com.mysql.OneToMany.dto.OrderResponse;
import com.mysql.OneToMany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.mysql.OneToMany.dto.OrderResponse( c.name, p.productName ) FROM Customer c JOIN c.products p")
   public List<OrderResponse> getJoinInformation();
}
