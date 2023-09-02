package textManipulation.countVowels

import java.lang.Exception
import java.lang.NullPointerException
import java.util.Scanner

val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine().toCharArray()

    val count = input.fold(0) { acc, c ->
        if (c in vowels) {
            acc + 1
        } else {
            acc
        }
    }

    val vowelCounts = mutableMapOf('a' to 0, 'e' to 0, 'i' to 0, 'o' to 0,'u' to 0)

    input.forEach {
        when (it) {
            'a', 'A' -> {
                vowelCounts['a'] = vowelCounts['a']!!.plus(1)
            }
            'e', 'E' -> {
                vowelCounts['e'] = vowelCounts['e']!!.plus(1)
            }
            'i', 'I' -> {
                vowelCounts['i'] = vowelCounts['i']!!.plus(1)
            }
            'o', 'O' -> {
                vowelCounts['o'] = vowelCounts['o']!!.plus(1)
            }
            'u', 'U' -> {
                vowelCounts['u'] = vowelCounts['u']!!.plus(1)
            }
        }
    }
    println(count)
    vowelCounts.forEach {
        println(it.key + " is " + it.value)
    }
}

