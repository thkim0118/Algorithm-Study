package thkim.hash

class HashLevel3Genres {

    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        return genres.indices.groupBy { genres[it] }
            .toList()
            .sortedByDescending {
                it.second.sumBy { plays[it] }
            }
            .map { it.second.sortedByDescending { plays[it] }.take(2) }
            .flatten().toList()
            .toIntArray()
    }
}