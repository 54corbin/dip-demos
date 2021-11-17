
java_binary(
  name = 'server',
  srcs = glob(
  [
    "src/main/java/com/chb/*.java",

  ]),
  main_class = "com.chb.Server",
  deps = [
    "@maven//:org_apache_thrift_libthrift",
    "@maven//:org_slf4j_slf4j_api",
    "@maven//:ch_qos_logback_logback_classic",
    "@maven//:javax_annotation_javax_annotation_api",
  ],
)

java_binary(
  name = 'client',
  srcs = glob(
  [
    "src/main/java/com/chb/*.java",

  ]),
  main_class = "com.chb.Client",
  deps = [
    "@maven//:org_apache_thrift_libthrift",
    "@maven//:org_slf4j_slf4j_api",
    "@maven//:ch_qos_logback_logback_classic",
    "@maven//:javax_annotation_javax_annotation_api",
  ],
)
