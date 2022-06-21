package com.innaval.ui_characters.characterDetails

import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@Composable
fun CharacterDetailsScreen(
    navigateToAllEpisodes: () -> Unit,
    navigateToSpecificEpisodes: (Int) -> Unit,

    navigate: () -> Unit,

    viewModel: CharacterDetailsViewModel = hiltViewModel(),
){

}