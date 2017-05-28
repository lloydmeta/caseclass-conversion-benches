package com.example

import shapeless.LabelledGeneric

object BigCC24Fields {

  implicit val labelledGeneric = LabelledGeneric[BigCC24Fields]
}

final case class BigCC24Fields(
    a: Int,
    b: Int,
    c: Float,
    d: Int,
    e: String,
    f: Int,
    g: Int,
    h: Float,
    i: Int,
    j: String,
    k: Int,
    l: Int,
    m: Float,
    n: Int,
    o: String,
    p: Int,
    q: Int,
    r: Float,
    s: Int,
    t: String,
    u: Int,
    v: Int,
    w: Float,
    x: Int
)
