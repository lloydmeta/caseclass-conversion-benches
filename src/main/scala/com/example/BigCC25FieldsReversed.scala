package com.example

import shapeless.LabelledGeneric

object BigCC25FieldsReversed {

  implicit val labelledGeneric = LabelledGeneric[BigCC25FieldsReversed]
}

final case class BigCC25FieldsReversed(
    y: String,
    x: Int,
    w: Float,
    v: Int,
    u: Int,
    t: String,
    s: Int,
    r: Float,
    q: Int,
    p: Int,
    o: String,
    n: Int,
    m: Float,
    l: Int,
    k: Int,
    j: String,
    i: Int,
    h: Float,
    g: Int,
    f: Int,
    e: String,
    d: Int,
    c: Float,
    b: Int,
    a: Int
)
