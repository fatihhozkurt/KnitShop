package com.fatih.KnitShop.dto.request.like;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record UnlikeCommentRequest(

        @NotNull
        UUID ownerId,

        @NotNull
        UUID postId,

        @NotNull
        UUID commentId,

        @NotNull
        UUID likeId,

        @NotNull
        UUID userId
) {
}