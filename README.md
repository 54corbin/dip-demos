# dip-demos
## Gson
```
cd gson
bazel run gson
```

## Guice
```
cd guice
bazel run Guice
```

## Thrift
cd thrift
```
thrift -r -out src/main/java --gen java ./echoService.thrift
bazel run server
bazel run client
```
## grpc
基于bazel 创建gRPC项目（难点在于bazel中配置proto编译插件：Protobuf and gRPC rules for Bazel  ）
WORKSPACE中通过 下列语句安装rules_proto_grpc插件


1http_archive(
2    name = "rules_proto_grpc",
3    sha256 = "28724736b7ff49a48cb4b2b8cfa373f89edfcb9e8e492a8d5ab60aa3459314c8",
4    strip_prefix = "rules_proto_grpc-4.0.1",
5    urls = ["https://github.com/rules-proto-grpc/rules_proto_grpc/archive/4.0.1.tar.gz"],
6)
7
❌按java_grpc_compile模式配置（能正常编译proto文件但是java源码无法自动识别）
（来日再战）尝试按java-grpc-library  配置（build报错：ERROR: error loading package '': cannot load '@maven//:compat.bzl': no such file）
