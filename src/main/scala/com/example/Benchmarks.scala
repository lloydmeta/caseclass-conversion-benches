package com.example

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._
import org.openjdk.jmh.infra.Blackhole

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@OutputTimeUnit(TimeUnit.NANOSECONDS)
class Benchmarks {

  val cc24 = BigCC24Fields(
    a = 10,
    b = 100,
    c = 42f,
    d = 9001,
    e = "Hello World",
    f = 10,
    g = 100,
    h = 42f,
    i = 9001,
    j = "Hello World",
    k = 10,
    l = 100,
    m = 42f,
    n = 9001,
    o = "Hello World",
    p = 10,
    q = 100,
    r = 42f,
    s = 9001,
    t = "Hello World",
    u = 10,
    v = 100,
    w = 42f,
    x = 9001
  )

  val cc25 = BigCC25Fields(
    a = 10,
    b = 100,
    c = 42f,
    d = 9001,
    e = "Hello World",
    f = 10,
    g = 100,
    h = 42f,
    i = 9001,
    j = "Hello World",
    k = 10,
    l = 100,
    m = 42f,
    n = 9001,
    o = "Hello World",
    p = 10,
    q = 100,
    r = 42f,
    s = 9001,
    t = "Hello World",
    u = 10,
    v = 100,
    w = 42f,
    x = 9001,
    y = "Hello World"
  )

  @Benchmark
  def cc24FieldsReversedShapeless(bh: Blackhole): Unit = bh.consume {
    SameFieldsConverter[BigCC24FieldsReversed](cc24)
  }

  @Benchmark
  def cc24FieldsReversedManual(bh: Blackhole): Unit = bh.consume {
    ManualTransform.toReversed24(cc24)
  }

  @Benchmark
  def cc25FieldsReversedShapeless(bh: Blackhole): Unit = bh.consume {
    SameFieldsConverter[BigCC25FieldsReversed](cc25)
  }

  @Benchmark
  def cc25FieldsReversedManual(bh: Blackhole): Unit = bh.consume {
    ManualTransform.toReversed25(cc25)
  }

}
