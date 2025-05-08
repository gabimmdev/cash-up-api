package com.cash.up.cash_up_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import com.cash.up.cash_up_api.model.Category;
import com.cash.up.cash_up_api.model.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{
    List<Category> findByUser(User user);
}
