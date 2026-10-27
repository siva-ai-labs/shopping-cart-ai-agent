package com.sivaailabs.repository;

import com.sivaailabs.entity.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CartItemRepository extends MongoRepository<CartItem, String> {

    CartItem findByProductId(String productId);
    void deleteByProductId(String productId);
}
