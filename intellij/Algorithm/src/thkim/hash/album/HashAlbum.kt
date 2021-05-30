package thkim.hash.album

class HashAlbum {

    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val genrePlayCount = hashMapOf<String, Int>()
        val songs = arrayListOf<Song>()

        for (i in genres.indices) {
            // 장르별 총 playCount
            genrePlayCount[genres[i]] = genrePlayCount.getOrDefault(genres[i], 0) + plays[i]
            // 각 장르의 정보 추가.
            songs.add(Song(i, plays[i], genres[i]))
        }

        // 장르의 정보 정렬.
        songs.sortWith(Comparator { (index, playCount, genre), (index1, playCount1, genre1) ->
            if (genre == genre1) { // 장르가 같을 때.
                if (playCount == playCount1) { // play 횟수가 같으면 index가 낮은 순서로 정렬.
                    return@Comparator index - index1
                }
                // 장르가 같을 때, play 횟수가 큰 순서로 정렬.
                return@Comparator playCount1 - playCount
            }
            // 장르의 총 play 횟수 기준이 큰 순서로 정렬.
            genrePlayCount[genre1]!! - genrePlayCount[genre]!!
        })

        val genreCount = hashMapOf<String, Int>()
        val candidates = arrayListOf<Song>()

        for (song in songs) {
            val count = genreCount.getOrDefault(song.genre, 0)
            if (count < 2) {
                candidates.add(song)
                genreCount[song.genre] = count + 1
            }
        }

        val answers = IntArray(candidates.size)
        for (i in answers.indices) {
            answers[i] = candidates[i].index
        }

        return answers
    }

    data class Song(
        val index: Int,
        val playCount: Int,
        val genre: String
    )

}