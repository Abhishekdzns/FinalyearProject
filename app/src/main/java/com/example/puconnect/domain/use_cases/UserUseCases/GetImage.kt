package com.example.puconnect.domain.use_cases.UserUseCases

import com.example.puconnect.domain.repository.UserRepository
import javax.inject.Inject

class GetImage @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(userId: String) = repository.getImage(userId)
}