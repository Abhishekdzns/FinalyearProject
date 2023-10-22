package com.example.puconnect.domain.use_cases.MessageUseCases

import com.example.puconnect.domain.repository.MessageRepository
import javax.inject.Inject

class GetMessagesByUserId @Inject constructor(
    val repository: MessageRepository
) {
    operator fun invoke(
        userId: String,
        receiverId: String
    ) = repository.getMessagesByUserId(userId, receiverId)
}