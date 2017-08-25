lazy val core = project
lazy val apps = project
lazy val root = project in file(".") aggregate(core, apps)
