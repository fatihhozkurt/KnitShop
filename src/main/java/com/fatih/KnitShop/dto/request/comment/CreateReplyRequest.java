package com.fatih.KnitShop.dto.request.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.UUID;

public record CreateReplyRequest(

        @NotNull
        UUID ownerId,

        @NotNull
        UUID postId,

        @NotNull
        UUID commentId,

        @NotNull
        @NotBlank
        @Size(min = 1, max = 2200)
        String content,

        @NotNull
        UUID requesterId
) {
}
