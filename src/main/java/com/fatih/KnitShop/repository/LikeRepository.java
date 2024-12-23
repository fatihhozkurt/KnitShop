package com.fatih.KnitShop.repository;

import com.fatih.KnitShop.entity.LikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LikeRepository extends JpaRepository<LikeEntity, UUID> {
}
