package com.innaval.domain.usecases

import com.innaval.domain.repositories.SingleEpisodeRepository
import javax.inject.Inject


class GetEpisodesUseCase @Inject constructor(private val episodeRepository: SingleEpisodeRepository) {
    suspend operator fun invoke(id: String) = episodeRepository.getEpisode(id)
}