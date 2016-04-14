package com.jmonad.kaybe.lambda

interface Function<Ret, Arg> {
  fun call(arg : Arg?) : Ret
}