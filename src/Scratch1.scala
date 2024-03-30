package scrollingtext

import cats.effect.IOApp
import cats.effect.IO
import scala.io.AnsiColor
import scala.concurrent.duration.*

object Scratch1 extends IOApp.Simple {
  def run: IO[Unit] =
    s"""a b c d
      |e f g h
      |i j k l
      |m n o p"""
      .stripMargin
      .scroll()
}
