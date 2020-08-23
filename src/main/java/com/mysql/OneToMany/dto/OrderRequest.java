package com.mysql.OneToMany.dto;

import com.mysql.OneToMany.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Customer customer;

}
