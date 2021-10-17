package dev.valvassori.kover.android.business

import org.junit.Assert
import org.junit.Test

class CalculatorTest {

    private val subject = Calculator()

    @Test
    fun `sum two numbers should return expected value`() {
        val testCases = listOf(
            TestCase(1, 1, 2),
            TestCase(3, 5, 8),
            TestCase(5, 5, 10),
            TestCase(98, 3, 101),
            TestCase(3, 7, 10),
            TestCase(12, 16, 28),
        )

        testCases.forEach { (a, b, expectedResult) ->
            val result = subject.sum(a, b)
            Assert.assertEquals(
                "($a + $b) should be $expectedResult",
                expectedResult,
                result
            )
        }
    }

    @Test
    fun `subtract two numbers should return expected value`() {
        val testCases = listOf(
            TestCase(1, 1, 0),
            TestCase(3, 5, -2),
            TestCase(15, 5, 10),
            TestCase(98, 3, 95),
            TestCase(3, 7, -4),
            TestCase(16, 12, 4),
        )

        testCases.forEach { (a, b, expectedResult) ->
            val result = subject.sub(a, b)
            Assert.assertEquals(
                "($a - $b) should be $expectedResult",
                expectedResult,
                result
            )
        }
    }

    private data class TestCase(
        val a: Int,
        val b: Int,
        val result: Int,
    )
}
