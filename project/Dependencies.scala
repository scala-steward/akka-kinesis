import sbt._

object Dependencies {

  object Versions {
    val scala212Version            = "2.12.13"
    val scala213Version            = "2.13.5"
    val awsSdkVersion              = "1.11.999"
    val akkaVersion                = "2.6.13"
    val testcontainersScalaVersion = "0.39.3"
    val scalaTestVersion           = "3.2.6"
    val logbackVersion             = "1.2.3"
  }

  object typesafe {

    object akka {
      val slf4j         = "com.typesafe.akka" %% "akka-slf4j"          % Versions.akkaVersion
      val stream        = "com.typesafe.akka" %% "akka-stream"         % Versions.akkaVersion
      val testkit       = "com.typesafe.akka" %% "akka-testkit"        % Versions.akkaVersion
      val streamTestkit = "com.typesafe.akka" %% "akka-stream-testkit" % Versions.akkaVersion
    }
  }

  object amazonAws {
    val kinesis              = "com.amazonaws" % "aws-java-sdk-kinesis"             % Versions.awsSdkVersion
    val cloudwatch           = "com.amazonaws" % "aws-java-sdk-cloudwatch"          % Versions.awsSdkVersion
    val dynamodb             = "com.amazonaws" % "aws-java-sdk-dynamodb"            % Versions.awsSdkVersion
    val kinesisProducer      = "com.amazonaws" % "amazon-kinesis-producer"          % "0.14.6"
    val kinesisClient        = "com.amazonaws" % "amazon-kinesis-client"            % "1.14.2"
    val streamKinesisAdaptor = "com.amazonaws" % "dynamodb-streams-kinesis-adapter" % "1.5.1"
  }

  object iheart {
    val ficus = "com.iheart" %% "ficus" % "1.5.0"
  }

  object scalaLang {
    val scalaJava8Compat = "org.scala-lang.modules" %% "scala-java8-compat" % "0.9.1"
  }

  object dimafeng {

    val testcontainersScalatest =
      "com.dimafeng" %% "testcontainers-scala-scalatest" % Versions.testcontainersScalaVersion

    val testcontainersLocalstack =
      "com.dimafeng" %% "testcontainers-scala-localstack" % Versions.testcontainersScalaVersion
  }

  object scalatest {
    val scalatest = "org.scalatest" %% "scalatest" % Versions.scalaTestVersion
  }

  object logback {
    val classic = "ch.qos.logback" % "logback-classic" % Versions.logbackVersion

  }

}
