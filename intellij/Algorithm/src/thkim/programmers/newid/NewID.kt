package thkim.programmers.newid

fun main() {
    var new_id = "=.="
    val answer = new_id
        .toLowerCase()
        .replace("""([^a-z0-9-_. ])""".toRegex(), "")
        .replace("""[.]+""".toRegex(), ".")
        .replace("""^[.]""".toRegex(), "")
        .replace("""^$""".toRegex(), "a")
        .replace("""(?<=.{15}).*$""".toRegex(), "")
        .replace("""[.]$""".toRegex(), "")
        .let { it.replace("""^.$""".toRegex(), it + it) }
        .let { it.replace("""^..$""".toRegex(), it + it[1]) }

    println("test -> $answer")
}

class NewID {
    fun solution(new_id: String): String {
        var answer = new_id
            .toLowerCase()
            .replace("[^a-z\\d\\-_.]*".toRegex(), "")
            .replace("\\.{2,}".toRegex(), ".")
            .replace("^[.]|[.]$".toRegex(), "")
            .ifEmpty { "a" }

        println("length -> ${answer.length}, $answer")

        if (answer.length >= 16) answer = answer.slice(0..14).replace("[.]$".toRegex(), "")
        if (answer.length <= 2) while (answer.length < 3) answer = answer.plus(answer.last())

        return answer
    }
}