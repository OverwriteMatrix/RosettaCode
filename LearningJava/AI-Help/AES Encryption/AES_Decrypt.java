package com.mycompany.aes_decrypt;

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/*
 *   @author ChatGPT (3/19/25)
*/

/*------------------------------------------------------------------------------
*  This Java program performs AES-256 decryption on a user-provided encrypted 
*  message. The user inputs a Base64-encoded AES key and an encrypted text, 
*  which the program attempts to decrypt. If the correct key is provided, the 
*  program successfully decrypts and displays the original message. Otherwise, 
*  it outputs an error. The program includes utility functions for decryption 
*  and converting a Base64-encoded key back into a SecretKey.
*///----------------------------------------------------------------------------

public class AES_Decrypt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Decryption Key: ");
        String userKeyBase64 = scanner.nextLine();  // User provides the key as Base64 string
        System.out.print("Encrypted Text: ");
        String encryptedText = scanner.nextLine();  // User provides the encrypted text as
        
        try {
            SecretKey userKey = convertBase64ToKey(userKeyBase64);  // Convert Base64 back to SecretKey
            String decryptedText = decrypt(encryptedText, userKey);
            System.out.println("     Decrypted: " + decryptedText);
        } catch (Exception e) {
            System.out.println("Error: Invalid key for decryption.");
        }
    }
    public static String decrypt(String encryptedText, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(encryptedText));
        return new String(decryptedBytes);
    }

    // Converts a Base64 string back into a SecretKey
    public static SecretKey convertBase64ToKey(String base64Key) {
        byte[] decodedKey = Base64.getDecoder().decode(base64Key);
        return new SecretKeySpec(decodedKey, 0, decodedKey.length, "AES");
    }
}
