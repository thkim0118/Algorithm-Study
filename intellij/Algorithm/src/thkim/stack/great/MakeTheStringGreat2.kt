package thkim.stack.great

import kotlin.math.abs

class MakeTheStringGreat2 {
    fun makeGood(s: String): String {

        val sb = StringBuilder()

        s.forEach forEach@{
            if (sb.isNotEmpty() && abs(it - sb[sb.length - 1]) == 32) {
                sb.deleteCharAt(sb.length - 1)
                return@forEach
            }
            sb.append(it)
        }

        return sb.toString()
    }
}