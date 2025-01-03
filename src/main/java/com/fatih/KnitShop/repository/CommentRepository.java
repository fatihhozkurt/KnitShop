package com.fatih.KnitShop.repository;

import com.fatih.KnitShop.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, UUID> {
    Optional<CommentEntity> findByUser_IdAndPost_IdAndId(UUID ownerId, UUID postId, UUID commentId);
}
