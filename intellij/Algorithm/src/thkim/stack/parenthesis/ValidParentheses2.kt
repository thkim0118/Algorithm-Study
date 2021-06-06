package thkim.stack.parenthesis

import java.util.*

class ValidParentheses2 {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        fun removeChar(c: Char) {
            if (stack.isEmpty()) {
                stack.addFirst(c)
            } else {
                val f = stack.first

                if ((f == '(' && c == ')') ||
                    (f == '{' && c == '}') ||
                    (f == '[' && c == ']')
                ) {
                    stack.removeFirst()
                    if (stack.isNotEmpty()) removeChar(stack.removeFirst())
                } else {
                    stack.addFirst(c)
                }
            }
        }

        s.forEach {
            removeChar(it)
        }

        return stack.isEmpty()
    }
}