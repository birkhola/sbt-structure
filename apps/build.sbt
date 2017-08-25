name := "apps"

lazy val app1 = project
lazy val app2 = project.dependsOn(LocalProject("core"))

aggregateProjects(app1, app2)
