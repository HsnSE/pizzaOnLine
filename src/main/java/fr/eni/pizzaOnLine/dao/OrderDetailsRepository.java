package fr.eni.pizzaOnLine.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import fr.eni.pizzaOnLine.entity.OrderDetail;

public interface OrderDetailsRepository extends JpaRepository<OrderDetail, Long> {

}
