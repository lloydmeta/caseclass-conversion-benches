package com.example

import shapeless._, ops.hlist.Align

// Taken from https://stackoverflow.com/questions/29242873/shapeless-turn-a-case-class-into-another-with-fields-in-different-order
class SameFieldsConverter[T] {
  def apply[S, SR <: HList, TR <: HList](s: S)(implicit genS: LabelledGeneric.Aux[S, SR],
                                               genT: LabelledGeneric.Aux[T, TR],
                                               align: Align[SR, TR]) = genT.from(align(genS.to(s)))
}

object SameFieldsConverter {
  def apply[T] = new SameFieldsConverter[T]
}
