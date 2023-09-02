package textManipulation.isPalindrome

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextLine()

    if (input == input.reversed()) {
        println(true)
    } else {
        println(false)
    }
}