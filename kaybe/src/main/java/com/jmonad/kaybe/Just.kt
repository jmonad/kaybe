package com.jmonad.kaybe

import com.jmonad.kaybe.lambda.Function

class Just<A>(value : A) : IMaybe<A> {
  val value = value
  override fun <B> bind(fn: Function<B, A>): IMaybe<B> = Maybe().maybe(fn.call(value))
  override fun fromJust(): A = value
  override fun fromMaybe(def: A) = value
  override fun isJust() = true
  override fun isNothing() = false
  override fun <B> maybe(def: B, fn: Function<B, A>): B = fn.call(null)
}