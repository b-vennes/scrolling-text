package scrollingtext

import scala.concurrent.duration.*
import cats.effect.IO
import cats.Show

extension [A](a: A)(using show: Show[A] = Show.fromToString)
  def scroll(delay: FiniteDuration = 0.05.seconds, afterLine: FiniteDuration = 0.25.seconds): IO[Unit] =
    ScrollingText.println(a, delay, afterLine)
