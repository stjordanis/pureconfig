addSbtPlugin("com.47deg"         % "sbt-microsites"  % "1.2.1")
addSbtPlugin("com.github.gseitz" % "sbt-release"     % "1.0.13")
addSbtPlugin("com.jsuereth"      % "sbt-pgp"         % "2.0.1")
addSbtPlugin("com.typesafe.sbt"  % "sbt-osgi"        % "0.9.5")
addSbtPlugin("io.spray"          % "sbt-boilerplate" % "0.6.1")
addSbtPlugin("net.ruippeixotog"  % "sbt-coveralls"   % "1.3.0")  // fork with scoverage/sbt-coveralls#128 merged in
addSbtPlugin("org.scalameta"     % "sbt-mdoc"        % "2.2.4")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"    % "2.4.2")
addSbtPlugin("org.scoverage"     % "sbt-scoverage"   % "1.6.1")
addSbtPlugin("org.tpolecat"      % "tut-plugin"      % "0.6.13")
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype"    % "3.9.4")

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.30"
