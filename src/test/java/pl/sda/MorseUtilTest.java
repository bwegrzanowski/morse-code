package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class MorseUtilTest {

    @Test
    public void testEncodeMorse() {
        //given
        String textToEncode = "LITWO OJCZYZNO MOJA";
        String expectedResult = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        //when
        String result = MorseUtil.encodeMorse(textToEncode);
        //then
        Assert.assertEquals(result, expectedResult);
    }

    @Test
    public void testDecodeMorse() {
        //given
        String textToDecode = ".-.. .. - .-- --- / --- .--- -.-. --.. -.-- --.. -. --- / -- --- .--- .-";
        String expectedResult = "litwo ojczyzno moja";
        //when
        String result = MorseUtil.decodeMorse(textToDecode);
        //then
        Assert.assertEquals(expectedResult.toUpperCase(), result);
    }
}