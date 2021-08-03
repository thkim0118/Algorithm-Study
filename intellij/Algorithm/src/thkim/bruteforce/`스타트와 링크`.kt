package thkim.bruteforce

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val N = readLine().toInt()

    val abilityArr = Array(N) { IntArray(N) }
        .map {
            readLine()
                .replace(" ", "")
                .map { Character.getNumericValue(it) }
                .toIntArray()
        }

    val prevTime = System.currentTimeMillis()

    val indexArr = IntArray(N).mapIndexed { index, _ -> index }.toIntArray()

    val findVisitedFlag = BooleanArray(N)
    val abilityVisitedFlag = BooleanArray(N)

    val teamStart = IntArray(N / 2)
    var teamLink = IntArray(N / 2)

    val tempArr = IntArray(N / 2)

    var startAbility = 0
    var linkAbility = 0

    var minAbility = Int.MAX_VALUE

    fun getStartAbility(depth: Int = 0) {
        if (depth == 2) {
            startAbility += abilityArr[tempArr[0]][tempArr[1]]
            return
        }

        loop@ for (i in teamStart.indices) {
            if (abilityVisitedFlag[i]) continue@loop
            tempArr[depth] = teamStart[i]
            abilityVisitedFlag[i] = true
            getStartAbility(depth + 1)
            abilityVisitedFlag[i] = false
        }
    }

    fun getLinkAbility(depth: Int = 0) {
        if (depth == 2) {
            linkAbility += abilityArr[tempArr[0]][tempArr[1]]
        }

        loop@ for (i in teamLink.indices) {
            if (abilityVisitedFlag[i]) continue@loop
            tempArr[depth] = teamLink[i]
            abilityVisitedFlag[i] = true
            getLinkAbility(depth + 1)
            abilityVisitedFlag[i] = false
        }
    }

    fun findMinimum(depth: Int = 0) {
        if (depth == N / 2) {
            startAbility = 0
            linkAbility = 0
            teamLink = indexArr.subtract(teamStart.asIterable()).toIntArray()

            getStartAbility()
            getLinkAbility()

            minAbility = min(minAbility, abs(startAbility - linkAbility))

            return
        }

        loop@ for (i in 0 until N) {
            if (findVisitedFlag[i]) continue@loop
            teamStart[depth] = i
            findVisitedFlag[i] = true
            findMinimum(depth + 1)
            findVisitedFlag[i] = false
        }
    }

    findMinimum()

    println(minAbility)
    println("${(System.currentTimeMillis() - prevTime)} ms")
}