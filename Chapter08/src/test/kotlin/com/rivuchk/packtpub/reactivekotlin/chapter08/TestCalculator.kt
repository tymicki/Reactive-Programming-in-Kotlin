package com.rivuchk.packtpub.reactivekotlin.chapter08

//(1)

import com.rivuchk.packtpub.reactivekotlin.chapter8.add
import com.rivuchk.packtpub.reactivekotlin.chapter8.divide
import com.rivuchk.packtpub.reactivekotlin.chapter8.mult
import com.rivuchk.packtpub.reactivekotlin.chapter8.substract
import org.junit.Test
import kotlin.test.assertEquals

class TestCalculator {
    @Test
    fun `addition test`() {//(2)
        assertEquals(1 + 2, add(1, 2))
    }

    @Test
    fun `substraction test`() {//(3)
        assertEquals(8 - 5, substract(8, 5))
    }

    @Test
    fun `multiplication test`() {//(4)
        assertEquals(4 * 2, mult(4, 2))
    }

    @Test
    fun `division test`() {//(5)
        assertEquals(8 / 2, divide(8, 2))
    }
}