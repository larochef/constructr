libraryDependencies ++= Vector(
  Library.akkaHttp,
  Library.circeParser,
  Library.akkaTestkit % "test",
  Library.scalaTest   % "test"
)

initialCommands := """|import de.heikoseeberger.constructr.coordination.etcd._""".stripMargin
