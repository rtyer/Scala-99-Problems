import sbt._

class Scala99(info: ProjectInfo) extends DefaultProject(info) {

    // Dependencies
    val scalatest = "org.scalatest" % "scalatest" % "1.0"
	val junit = "junit" % "junit" % "4.7" % "test"

    // Additional Repositories
    val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"
  	val mavenLocal = "Local Maven Repository" at "file://" + Path.userHome + "/.m2/repository"

}