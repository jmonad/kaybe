package com.jmonad.kaybe

class Nothing<A> : IMaybe<A> {
  override fun <B> bind(fn: (a : A) -> B): IMaybe<B> = Nothing()
  override fun fromJust(): A = throw RuntimeException("Cannot call fromJust() on Nothing")
  override fun fromMaybe(def: A) : A = def
  override fun isJust() = false
  override fun isNothing() = true
  override fun <B> maybe(def: B, fn: (a : A) -> B): B = def
}