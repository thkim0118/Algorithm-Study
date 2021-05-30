package thkim.hash.phone

import java.util.*

class HashPhoneKt {

    fun solution(phone_book: Array<String>): Boolean {
        Arrays.sort(phone_book)

        val result = phone_book.filterIndexed { index, s ->
            if (index == phone_book.size - 1) return@filterIndexed false
            else phone_book[index + 1].startsWith(s)
        }

        result.forEach {
            println("result : $it")
        }

        return result.isEmpty()
    }

}