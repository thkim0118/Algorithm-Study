package thkim.hash.marathon

class HashLevel1MarathonKt {

    fun solution(
        participant: Array<String>,
        completion: Array<String>
    ): String {
        val hash = hashMapOf<String, Int>()

        completion.forEach {
            hash[it] = hash.getOrDefault(it, 0) + 1
        }

        participant.forEach {
            val value = hash.getOrDefault(it, 0)

            if (value == 0) return it

            hash[it] = value - 1
        }

        return ""
    }


}