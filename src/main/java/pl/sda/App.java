package pl.sda;

public class App {
    public static void main(String[] args) {
        //encoding by new object
        MorseEncoder encoder = new MorseEncoder();
        System.out.println(encoder.encode("sos"));
        //decoding by using static method
        System.out.println(MorseUtil.decodeMorse("... --- ..."));
    }
}
