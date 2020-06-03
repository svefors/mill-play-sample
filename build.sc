import mill._
import $ivy.`com.lihaoyi::mill-contrib-playlib:$MILL_VERSION`,  mill.playlib._


object core extends PlayModule {
    //config
    override def scalaVersion= T{"2.12.10"}
    override def playVersion= T{"2.7.0"}
    override def twirlVersion= T{"1.5.0"}

    object test extends PlayTests{
	override def scalaVersion= T{"2.12.10"}

    }
}
