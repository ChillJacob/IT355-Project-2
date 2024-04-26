import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;


/*
 * This method of encryption and decryption is incredibly easy to crack, this is the reason it is easier to use a standard method.
 * See Sin21Fixed.java for a better method. 
 */

// homemade crypt algorithm, for every letter in message, move backwards in ascii value by key%msg.charAtIndex()
    public static char[] encrypt(String msg, String key){
        char[] msgChar = msg.toCharArray();
        char[] keyChar = key.toCharArray();
        int index = 0;
        ArrayList<Character> encrypted = new ArrayList<Character>();
        for (char c: msgChar){
            int modDec = keyChar.length%msgChar[index];
            int ASCII = (int) c;
            ASCII -= modDec;
            encrypted.add((char) ASCII);
            index++;
        }
        char[] end = encrypted.toString().toCharArray();
        return end;
    }
// reverse decrypt
    private static char[] decrypt(String msg, String key){
        char[] msgChar = msg.toCharArray();
        char[] keyChar = key.toCharArray();
        int index = 0;
        ArrayList<Character> decrypted = new ArrayList<Character>();
        for (char c: msgChar){ 
            int modAsc = keyChar.length%msgChar[index];
            int ASCII = (int) c;
            ASCII += modAsc;
            decrypted.add((char) ASCII);
            index++;
        }
        char[] end = decrypted.toString().toCharArray();
        return end;
    }


  