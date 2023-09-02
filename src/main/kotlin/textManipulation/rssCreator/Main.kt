import dev.patbeagan.protocolrss.core.Item
import dev.patbeagan.protocolrss.core.Rss
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.net.URL

fun main() {
    val xml = Rss.create("Hello Rss!", "Rss, Hello!", URL("https://thynanami.com")) {
        items = listOf(
            Item(
                "Hello Rss!",
                "Hello from Rss!"
            )
        )
    }.serializeToXML().value

    embeddedServer(Netty, port = 8080) {
        routing {
            get("/") {
                call.respondText(xml)
            }
        }
    }.start(wait = true)
}
