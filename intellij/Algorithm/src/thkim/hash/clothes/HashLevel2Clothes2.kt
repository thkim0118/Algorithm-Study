package thkim.hash.clothes

class HashLevel2Clothes2 {

    fun solution(clothes: Array<Array<String>>): Int {
        var answer = 1

        val hash = hashMapOf<String, Int>()

        clothes.forEach {
            hash[it[1]] = hash.getOrDefault(it[1], 0) + 1
        }

        hash.forEach { (_, value) ->
            answer *= (value + 1)
        }

        return answer - 1
    }

}