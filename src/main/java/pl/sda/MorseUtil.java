package pl.sda;

public class MorseUtil {
    public static String encodeMorse(String text) {
        MorseEncoder encoder = new MorseEncoder();
        String result = encoder.encode(text);
        return result;
    }

    public static String decodeMorse(String text) {
        MorseDecoder decoder = new MorseDecoder();
        String result = decoder.decode(text);
        return result;
    }
}
