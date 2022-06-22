package com.innaval.domain.repositories

import androidx.paging.PagingData
import com.innaval.domain.model.Episode


interface EpisodesRepository {
   // suspend fun getAllEpisodes(): FLow<PagingData<Episode>>

}

interface SingleEpisodeRepository {
    suspend fun getEpisode(episodeId:String): Result<List<Episode>>
}