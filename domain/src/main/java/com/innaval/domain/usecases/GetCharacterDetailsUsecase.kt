package com.innaval.domain.usecases

import android.util.Log
import com.innaval.domain.repositories.CharacterDetailsRepository
import javax.inject.Inject

class GetCharacterDetailsUsecase @Inject constructor(
    private val characterDetailsRepository: CharacterDetailsRepository
) {
    init{
        Log.d("usecase", "getCharacter")
    }
    suspend operator fun invoke(id : Int) = characterDetailsRepository.getCharacterDetails(id)
}