package textManipulation.genHTML

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import java.io.File

fun main() {
    val path = "/textManipulation/genHTML/Lorem ipsum.txt"
    val title = File(path).name
    val content = getResourceAsText(path)

    System.out.appendHTML().html {
        head {
            meta {
                charset="utf-8"
            }
            title(title)
        }
        body {
            h1(title)
            p(content)
        }
    }
}

fun getResourceAsText(path: String): String? {
    return object {}.javaClass.getResource(path)?.readText()
}
