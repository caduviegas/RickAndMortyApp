package com.innaval.ui_characters.characterDetails

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.innaval.domain.usecases.GetCharacterDetailsUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterDetailsViewModel @Inject constructor(
    private val getCharacterDetailsUsecase: GetCharacterDetailsUsecase,
    private val getEpisodesUsecase: GetEpisodesUseCase,
    private val savedStateHandle: SavedStateHandle
): ViewModel(){
    private val _detailsState = mutableStateOf(CharacterDetailsState)
}