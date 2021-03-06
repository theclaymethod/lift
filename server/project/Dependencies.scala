import sbt._
import Keys._

object Dependencies {

  object akka {
    val version = "2.3.6"
    // Core Akka
    val actor                 = "com.typesafe.akka"      %% "akka-actor"                    % version
    val cluster               = "com.typesafe.akka"      %% "akka-cluster"                  % version
    val contrib               = "com.typesafe.akka"      %% "akka-contrib"                  % version intransitive()
    val persistence           = "com.typesafe.akka"      %% "akka-persistence-experimental" % version intransitive()
    val persistence_cassandra = "com.github.krasserm"    %% "akka-persistence-cassandra"    % "0.3.4" intransitive()

    val leveldb               = "org.iq80.leveldb"        % "leveldb"                       % "0.7"
    
    val testkit               = "com.typesafe.akka"      %% "akka-testkit"                  % version
  }

  object spray {
    val version = "1.3.2"

    val httpx   = "io.spray" %% "spray-httpx"   % version
    val can     = "io.spray" %% "spray-can"     % version
    val routing = "io.spray" %% "spray-routing" % version
    val client  = "io.spray" %% "spray-client"  % version

    val testkit = "io.spray" %% "spray-testkit" % version
  }

  object kafka {
    val version = "0.8.2-beta"
    val kafka = "org.apache.kafka" %% "kafka"  % version exclude("log4j", "log4j") exclude("org.slf4j","slf4j-log4j12")
  }

  object scalaz {
    val core = "org.scalaz" %% "scalaz-core"  % "7.1.0"
  }

  object json4s {
    val native = "org.json4s" %% "json4s-native" % "3.2.11"
    val jackson = "org.json4s" %% "json4s-jackson" % "3.2.11"
  }

  val scodec_bits  = "org.typelevel"    %% "scodec-bits"  % "1.0.4"
  
  // Apple push notifications
  val apns         = "com.notnoop.apns"  % "apns"         % "0.1.6"
  val slf4j_simple = "org.slf4j"         % "slf4j-simple" % "1.6.1"
 
  // Datastax Cassandra Client
  val cassandra_driver      = "com.datastax.cassandra"  % "cassandra-driver-core"         % "2.1.1"

  // Testing
  val scalatest    = "org.scalatest"    %% "scalatest"    % "2.2.1"
  val scalacheck   = "org.scalacheck"   %% "scalacheck"   % "1.11.6"

}
