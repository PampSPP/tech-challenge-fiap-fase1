package com.pampspp.techchallengefiapfase1.repositories;

import com.pampspp.techchallengefiapfase1.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
