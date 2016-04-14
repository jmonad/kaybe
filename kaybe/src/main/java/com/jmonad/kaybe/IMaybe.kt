package com.jmonad.kaybe

import com.jmonad.kaybe.lambda.Function;

interface IMaybe<A> {
  fun <B> bind(fn : Function<B, A>) : IMaybe<B>
  fun fromJust() : A
  fun fromMaybe(def : A) : A
  fun isJust() : Boolean
  fun isNothing() : Boolean
  fun <B> maybe(def : B, fn : Function<B, A>) : B
}