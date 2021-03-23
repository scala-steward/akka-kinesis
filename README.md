# akka-kinesis

[![CircleCI](https://circleci.com/gh/j5ik2o/akka-kinesis/tree/master.svg?style=shield&circle-token=b2210c20c89219189c74380cc433a075d98cb1c9)](https://circleci.com/gh/j5ik2o/akka-kinesis/tree/master)

akka-kinesis supports Akka commponets for AWS Kinesis.

## Support features

- KPLFlow
- KCLSource

## Installation

Add the following to your sbt build (2.12.x, 2.13.x):

```scala
// if snapshot
resolvers += "Sonatype OSS Release Repository" at "https://oss.sonatype.org/content/repositories/releases/"

val version = "..."

libraryDependencies += Seq(
  "com.github.j5ik2o" %% "akka-kinesis-kcl" % version,
  "com.github.j5ik2o" %% "akka-kinesis-kpl" % version
)
```
