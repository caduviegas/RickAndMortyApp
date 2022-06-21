package com.innaval.domain.repositories

import com.innaval.domain.model.CharacterDetails

interface CharacterDetailsRepository {
    suspend fun getCharacterDetails(id: Int): Result<CharacterDetails>
}