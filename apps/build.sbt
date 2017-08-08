lazy val apps = project in file(".") aggregate(app1,app2)
lazy val app1 = project in file("app1")
lazy val app2 = (project in file("app2")).dependsOn(core).aggregate(core)
lazy val core = RootProject(file("../core"))
