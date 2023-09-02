package textManipulation.pigLatin

import java.util.Scanner

val vowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()
    val inputList = input.toMutableList()
    val firstConsonant = buildString {
        input.toCharArray().takeWhile { it !in vowels }.forEach {
            append(it)
            inputList.apply { remove(it) }
        }
    }

    println(buildString {
        inputList.forEach{
            append(it)
        }
    } + "-" + firstConsonant + "ay")
}
