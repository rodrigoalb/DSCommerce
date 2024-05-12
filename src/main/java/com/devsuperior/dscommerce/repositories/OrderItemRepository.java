package com.devsuperior.dscommerce.repositories;

import com.devsuperior.dscommerce.models.Order;
import com.devsuperior.dscommerce.models.OrderItem;
import com.devsuperior.dscommerce.models.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
