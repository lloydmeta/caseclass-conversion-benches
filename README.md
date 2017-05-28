# Benchmarking Shapeless LabelledGeneric conversions

Testing manual vs Shapeless based conversion of 24 and 25 field case classes.

## How to run

`$ sbt jmh:run -i 10 -wi 10 -f3 -t 1`

## Results

```
[info] # Run complete. Total time: 00:04:11
[info] 
[info] Benchmark                               Mode  Cnt     Score     Error  Units
[info] Benchmarks.cc24FieldsReversedManual     avgt   30    33.626 ±   1.032  ns/op
[info] Benchmarks.cc24FieldsReversedShapeless  avgt   30  4443.018 ± 101.612  ns/op
[info] Benchmarks.cc25FieldsReversedManual     avgt   30    33.066 ±   0.650  ns/op
[info] Benchmarks.cc25FieldsReversedShapeless  avgt   30  4859.432 ± 104.763  ns/op
```