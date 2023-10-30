package com.pampspp.techchallengefiapfase1.repositories;

import com.pampspp.techchallengefiapfase1.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {
}
