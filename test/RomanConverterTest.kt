import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RomanConverterTest {

    @Test
    fun `When pass 1 then return I`() {
        assertEquals("I", 1.toRoman())
    }

    @Test
    fun `When pass 2 then return II`() {
        assertEquals("II", 2.toRoman())
    }
    @Test
    fun `When pass 3 then return III`() {
        assertEquals("III", 3.toRoman())
    }

    @Test
    fun `When pass 5 then return V`() {
        assertEquals("V", 5.toRoman())
    }

    @Test
    fun `When pass 4 then return IV`() {
        assertEquals("IV", 4.toRoman())
    }

    @Test
    fun `When pass 6 then return VI`() {
        assertEquals("VI", 6.toRoman())
    }

    @Test
    fun `When pass 7 then return VII`() {
        assertEquals("VII", 7.toRoman())
    }

    @Test
    fun `When pass 8 then return VIII`() {
        assertEquals("VIII", 8.toRoman())
    }

    @Test
    fun `When pass 10 then return X`() {
        assertEquals("X", 10.toRoman())
    }

    @Test
    fun `When pass 9 then rerun IX`() {
        assertEquals("IX", 9.toRoman())
    }

    @Test
    fun `When pass 14 then rerun XIV`() {
        assertEquals("XIV", 14.toRoman())
    }

    @Test
    fun `When pass 18 then rerun XVIII`() {
        assertEquals("XVIII", 18.toRoman())
    }

    @Test
    fun `When pass 25 then rerun XXV`() {
        assertEquals("XXV", 25.toRoman())
    }

    @Test
    fun `When pass 34 then rerun XXXIV`() {
        assertEquals("XXXIV", 34.toRoman())
    }
}
