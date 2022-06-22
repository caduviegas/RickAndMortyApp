package com.innaval.ui_characters.characterDetails

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.palette.graphics.Palette
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlin.math.min


@ExperimentalMaterialApi
@ExperimentalCoroutinesApi
@Composable
fun CharacterDetailsScreen(
    navigateToAllEpisodes: () -> Unit,
    navigateToSpecificEpisodes: (Int) -> Unit,

    navigate: () -> Unit,

    viewModel: CharacterDetailsViewModel = hiltViewModel(),
) {
    val systemInDarkMode = isSystemInDarkTheme()
    val lazyListState = rememberLazyListState()
    val scrollOffset = min(
        1f.coerceAtMost(1f),
        (1 - (lazyListState.firstVisibleItemScrollOffset / 2000f + lazyListState.firstVisibleItemIndex)).coerceAtLeast(
            0f
        )
    )

    val imageSize by animateFloatAsState(
        targetValue = 0.4f * scrollOffset,
        animationSpec = tween(
            durationMillis = 300,
            delayMillis = 50,
            easing = FastOutSlowInEasing
        )
    )

    val systemUiController = rememberSystemUiController()

    var colorPalette by remember {
        mutableStateOf<Palette?>(null)
    }

    val vibrantColor = when (systemInDarkMode) {

        true -> colorPalette?.darkVibrantSwatch?.rgb
        false -> colorPalette?.lightVibrantSwatch?.rgb
    } ?: 0
    val mutedColor = when (systemInDarkMode) {
        true -> colorPalette?.darkMutedSwatch?.rgb
        false -> colorPalette?.lightVibrantSwatch?.rgb
    } ?: 0

    val gradient = Brush.verticalGradient(
        listOf(
            Color(vibrantColor),
            Color(mutedColor)
        )
    )

    val episodesList =
        viewModel.episodesList.collectAsState()

}