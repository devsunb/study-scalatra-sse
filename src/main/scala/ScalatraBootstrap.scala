import me.jslee.sse._
import org.scalatra._
import javax.servlet.ServletContext
import _root_.akka.actor.{Props, ActorSystem}
import com.example.app._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {

  val system = ActorSystem()
  val myActor = system.actorOf(Props[MyActor])

  override def init(context: ServletContext) {
    context.mount(new TestSSE, "/*")
  }
}
