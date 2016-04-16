package com.jmonad.kaybe

import org.junit.Test
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull

class MaybeTest {

  @Test fun testInvalidSample() {
     maybe(Model().invalidObject).bind {
       assertNull(it)
     }
  }

  @Test fun testValidSample() {
    maybe(Model().validObject).bind {
      assertNotNull(it)
    }
  }

}