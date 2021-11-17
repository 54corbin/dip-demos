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
