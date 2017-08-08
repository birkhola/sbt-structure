lazy val root = project in file(".") aggregate(core, apps)
lazy val core = project in file("core")
lazy val apps = (project in file("apps")).dependsOn(core)
