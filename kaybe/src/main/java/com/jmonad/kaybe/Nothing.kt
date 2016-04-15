package com.jmonad.kaybe

import com.jmonad.kaybe.lambda.Function

class Nothing<A> : IMaybe<A> {
  override fun <B> bind(fn: Function<B, A>): IMaybe<B> {
    throw UnsupportedOperationException()
  }
  override fun fromJust(): A = throw RuntimeException("Cannot call fromJust() on Nothing")
  override fun fromMaybe(def: A) : A = def
  override fun isJust() = false
  override fun isNothing() = true
  override fun <B> maybe(def: B, fn: Function<B, A>): B = def
}