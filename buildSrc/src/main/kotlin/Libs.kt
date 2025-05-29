object Libs {
  const val kotlinVersion = "1.9.22"

  object KotlinUtils {
    private const val group = "in.porter.kotlinutils"
    private const val version = "0.80.0"

    const val serdeJackson = "$group:serde-jackson:$version"
    const val commons = "$group:commons:$version"
    const val exposed = "$group:exposed:$version"
    const val testing = "$group:testing:$version"
    const val openTracing = "$group:opentracing:$version"
    const val sentryKtorFeature = "$group:sentry-ktor-feature:$version"
    const val ktorWebServer = "$group:webserver-ktor:$version"
    const val ktorWebClient = "$group:webclient-ktor-features:$version"
    const val awsSqs = "$group:aws-sqs:$version"
    const val awsS3 = "$group:aws-s3:$version"
    const val awsSns = "$group:aws-sns:$version"
    const val awsCloudWatch = "$group:aws-cloudwatch:$version"
    const val geos = "$group:geos:$version"

    const val distributedlocksApi = "$group:distributedlocks-api:$version"
    const val distributedlocksRedisson =
      "$group:distributedlocks-redisson:$version"
  }

  object Dagger {
    private const val group = "com.google.dagger"
    private const val version = "2.51"

    const val dagger = "$group:dagger:$version"
    const val compiler = "$group:dagger-compiler:$version"
  }

  object Ktor {
    private const val version = "2.3.7"
    private const val utilsVersion = "1.6.8"
    private const val group = "io.ktor"

    const val clientCore = "$group:ktor-client-core:$version"
    const val clientCio = "$group:ktor-client-cio:$version"
    const val clientJson = "$group:ktor-client-json:$version"
    const val clientJackson = "$group:ktor-serialization-jackson:$version"
    const val clientLogging = "$group:ktor-client-logging:$version"
    const val contentNegotiation =
      "$group:ktor-client-content-negotiation:$version"

    const val serverCore = "$group:ktor-server-core:$version"
    const val serverJetty = "$group:ktor-server-jetty:$version"
    const val serverJackson = "$group:ktor-serialization-jackson:$version"
    const val ktorHtml = "$group:ktor-html-builder:$utilsVersion"
    const val doubleReceive = "$group:ktor-server-double-receive:$version"
    const val forwardedHeaders = "$group:ktor-server-forwarded-header:$version"
    const val statusPages = "$group:ktor-server-status-pages:$version"
    const val serverContentNegotiation =
      "$group:ktor-server-content-negotiation:$version"
    const val cors = "$group:ktor-server-cors:$version"
    const val micrometer = "$group:ktor-metrics-micrometer:$utilsVersion"
    const val ktorServerTest = "$group:ktor-server-tests:$version"
  }

  object Log4j {
    private const val version = "2.22.1"
    private const val group = "org.apache.logging.log4j"

    const val core = "$group:log4j-core:$version"
    const val slf4jImpl = "$group:log4j-slf4j-impl:$version"
  }

  object Testing {
    private const val testContainersGroup = "org.testcontainers"
    private const val testContainersVersion = "1.17.5"
    const val testContainers =
      "$testContainersGroup:testcontainers:$testContainersVersion"
    const val testContainersPostgresql =
      "$testContainersGroup:postgresql:$testContainersVersion"
    const val testContainersJuniper =
      "$testContainersGroup:junit-jupiter:$testContainersVersion"
  }

  object Cucumber {
    private const val group = "io.cucumber"
    private const val version = "7.13.0"

    val java = "$group:cucumber-java:$version"
    val junit = "$group:cucumber-junit:$version"
    val junitVintage = "org.junit.vintage:junit-vintage-engine:5.7.2"
    val expressions = "$group:cucumber-expressions:$version"
  }

  const val caffeine = "com.github.ben-manes.caffeine:caffeine:2.8.0"
  const val hikariCP = "com.zaxxer:HikariCP:3.4.1"
  const val sentry = "io.sentry:sentry:1.7.27"
  const val postgresql = "org.postgresql:postgresql:42.2.8"
  const val elasticEcs = "co.elastic.logging:log4j2-ecs-layout:0.5.0"

  object Micrometer {
    private const val group = "io.micrometer"
    private const val version = "1.5.3"

    const val core = "$group:micrometer-core:$version"
    const val cloudwatch = "$group:micrometer-registry-cloudwatch2:$version"
  }

  object Muneemji {
    private const val group = "in.porter.muneemji"
    private const val version = "1.0.8-test1"

    const val client = "$group:ktor-client:$version"
    const val bankCollectionApiModels =
      "$group:bank-collection-api-models:$version"
    const val mobilePaymentsApiModels = "$group:mobile-payments-api-models:$version"
  }

  object Daakiya {
    private const val group = "in.porter.daakiya"
    private const val version = "3.2.10-dynamic-staging-test"

    //    const val sqsClient = "$group:sqs-client:$version"
    const val client = "$group:daakiya-client:$version"
  }

  object Prism {
    private const val group = "in.porter.prism"
    private const val version = "2.3.0-flash"

    const val client = "$group:client:$version"
  }

  object CMS {
    private const val group = "in.porter.cms"
    private const val version = "2.3.6"

    const val client = "$group:cms-client:$version"
  }


  object Apache {
    private const val group = "org.apache.poi"
    private const val version = "5.2.2"

    const val poi = "$group:poi:$version"
    const val ooxml = "$group:poi-ooxml:$version"
  }

  object Redisson {
    const val client = "org.redisson:redisson:3.30.0"
  }

  object Atlas {
    private const val group = "in.porter.atlas"
    private const val version = "2.2.13"

    const val client = "$group:atlas-client:$version"

  }

  object Auth0 {
    private const val version = "4.1.0"
    const val javaJwt = "com.auth0:java-jwt:$version"
  }

  object Detekt {
    const val version = "2.0.8"
    private const val group = "in.porter.detekt-custom-rules"
    const val detektService = "$group:detekt-custom-rules:$version"
  }

  object EventEntities {
    private const val group = "in.porter"
    private const val version = "0.16.1"

    const val eventEntities = "$group:event-entities:$version"
  }

  object KafkaProtobufSerializer {
    private const val group = "io.confluent"
    private const val version = "7.0.0"

    const val kafkaProtobufSerializer = "$group:kafka-protobuf-serializer:$version"
  }

  object Kafka {
    private const val group = "org.apache.kafka"
    private const val version = "3.6.0"

    const val kafka = "$group:kafka-clients:$version"
  }

  object PorterKafka {
    private const val group = "in.porter"
    private const val version = "3.3.0-RC"

    const val kafkaClient = "$group:kafka-client:$version"
  }
}
