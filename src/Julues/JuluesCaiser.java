//package Julues;
//
//import sun.swing.BakedArrayList;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
//public class JuluesCaiser {
//
//    private List<String> alphabet;
//    private List<String> shift;
//
//    public JuluesCaiser() {
//        String alphabetEncr="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        String[] array=alphabetEncr.split("");
//        alphabet= Arrays.asList(array);
//        shift = new ArrayList<>(alphabet);
//    }
//
//    public static void main(String[] args) {
//
//        String[] array=alphabetDecr.split("");
//        List<String> alphabets1= Arrays.asList(array1);
//        for (String alphabet : alphabets) {
//           Boolean match= alphabet.matches();
//           alphabet=alphabetDecr.get(le)
//        }
//        int position = alphabets.indexOf(alphabetDecr);
//
//    }
//
//    public String encrypt(String plaintext, int key) {
//        List<String> encryptedLetters = new ArrayList<>();
//        Collections.rotate(shift, -key);
//        String[] split = plaintext.split("");
//        List<String> letters = Arrays.asList(split);
//        for (String letter : letters) {
//            letter = letter.toLowerCase();
//            if(!alphabet.contains(letter)){
//                encryptedLetters.add(letter);
//            } else {
//                int position = alphabet.indexOf(letter);
//                String encrypted = shift.get(position);
//                encryptedLetters.add(encrypted);
//            }
//        }
//        return String.join("", encryptedLetters);
//    }
//}
