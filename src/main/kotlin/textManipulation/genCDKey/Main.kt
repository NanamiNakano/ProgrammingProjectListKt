package textManipulation.genCDKey

val keyChar = CharRange('0', '9').toMutableList().apply {
    addAll(CharRange('A', 'Z'))
}

fun main() {
    val key = buildString {
        for (i in 0..4) {
            for (j in 0..4) {
                append(keyChar[(0..35).random()])
            }
            append('-')
        }
        deleteCharAt(29)
    }
    println(key)
}
