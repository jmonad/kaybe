package com.jmonad.kaybe

class Maybe {
  fun <T> maybe(value : IMaybe<T>) : IMaybe<T> = value
  fun <T> maybe(value : T) = if (value == null) Nothing<T>() else Just(value)
}