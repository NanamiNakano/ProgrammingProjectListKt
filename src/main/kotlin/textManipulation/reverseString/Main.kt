package textManipulation.reverseString

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var result = ""

    scanner.nextLine().toCharArray().forEach {
        result = it + result
    }

    println(result)
}
