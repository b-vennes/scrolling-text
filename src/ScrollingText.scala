package scrollingtext

import cats.*
import cats.syntax.all.*
import cats.effect.*
import scala.concurrent.duration.FiniteDuration
import scala.concurrent.duration.*
import scala.sys.SystemProperties

object ScrollingText {
  def println[A](
    value: A,
    delay: FiniteDuration = 0.05.seconds,
    afterLine: FiniteDuration = 0.25.seconds
  )(using showA: Show[A]): IO[Unit] =
    value.show.split(System.lineSeparator()).toList.traverse_(line =>
      line.toList.traverse_(char => IO.print(char) *> IO.sleep(delay))
        *> IO.sleep(afterLine)
        *> IO.println("")
    ) *> IO.println("")
}
