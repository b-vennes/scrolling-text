import mill._, scalalib._

object scrollingtext extends RootModule with ScalaModule {
  def scalaVersion = "3.3.3"
  def ivyDeps = Agg(
    ivy"org.typelevel::cats-effect:3.5.4"
  )
}
