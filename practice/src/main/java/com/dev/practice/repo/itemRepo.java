package com.dev.practice.repo;

import com.dev.practice.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemRepo extends JpaRepository<Items, Integer> {
}
