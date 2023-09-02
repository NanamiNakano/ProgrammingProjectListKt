package textManipulation.countWords

fun main() {
    val input = getResourceAsText("/textManipulation/countWords/words.txt")!!
    val words = findWords(input)

    println(words)
    println(words.size.toString() + " words")
}

fun getResourceAsText(path: String): String? {
    return object {}.javaClass.getResource(path)?.readText()
}

fun findWords(text: String): List<String> {
    val regex = Regex("\\b\\w+\\b")
    return regex.findAll(text).map { it.value }.toList()
}
