organization := "tv.cntt"
name         := "sclannotation"
version      := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"
crossScalaVersions := Seq("2.11.6", "2.10.6")

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

// Make sure Java 6 is supported
javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

libraryDependencies += "tv.cntt" %% "sclasner" % "1.6"

//------------------------------------------------------------------------------

// Skip API doc generation to speedup "publish-local" while developing.
// Comment out this line when publishing to Sonatype.
publishArtifact in (Compile, packageDoc) := false
