package com.jmonad.kaybe

interface IMaybe<A> {
  fun <B> bind(fn : (a : A) -> B) : IMaybe<B>
  fun fromJust() : A
  fun fromMaybe(def : A) : A
  fun isJust() : Boolean
  fun isNothing() : Boolean
  fun <B> maybe(def : B, fn : (a : A) -> B) : B
}