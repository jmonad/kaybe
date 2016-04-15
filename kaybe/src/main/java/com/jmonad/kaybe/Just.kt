package com.jmonad.kaybe

class Just<A>(value : A) : IMaybe<A> {
  val value = value
  override fun <B> bind(fn: (a : A) -> B): IMaybe<B> = maybe(fn(value))
  override fun fromJust(): A = value
  override fun fromMaybe(def: A) = value
  override fun isJust() = true
  override fun isNothing() = false
  override fun <B> maybe(def: B, fn: (a : A) -> B): B = fn(this.value)
}