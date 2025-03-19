package com.mycompany.aesutil;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import java.util.Scanner;

/*
 *   @author ChatGPT (3/19/25)
*/

/*------------------------------------------------------------------------------
*  This Java program provides AES-256 encryption and decryption for 
*  user-inputted messages. It generates a secure AES encryption key, displays it 
*  in Base64 format, and encrypts a user-provided message. The encrypted message 
*  is then displayed, and the user is prompted to enter the decryption key. If 
*  the correct key is provided, the program decrypts the message back to its 
*  original form; otherwise, it displays an error. The program also includes 
*  utility functions for key generation, encryption, decryption, and converting 
*  a Base64-encoded key back into a SecretKey.
*///----------------------------------------------------------------------------


public class AESUtil {
    public static void main(String[] args) throws Exception {
        SecretKey key = generateKey();

        String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("           Key: " + encodedKey);  // Print the key in Base64 format

        Scanner scanner = new Scanner(System.in);
        System.out.print("  Your Message: ");
        String originalText = scanner.nextLine();

        String encryptedText = encrypt(originalText, key);
        System.out.println("     Encrypted: " + encryptedText);

        System.out.print("Decryption Key: ");
        String userKeyBase64 = scanner.nextLine();  // User provides the key as Base64 string
        
        try {
            SecretKey userKey = convertBase64ToKey(userKeyBase64);  // Convert Base64 back to SecretKey
            String decryptedText = decrypt(encryptedText, userKey);
            System.out.println("     Decrypted: " + decryptedText);
        } catch (Exception e) {
            System.out.println("Error: Invalid key for decryption.");
        }
    }

    public static SecretKey generateKey() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256); // AES-256 encryption
        return keyGenerator.generateKey();
    }

    public static String encrypt(String plaintext, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = cipher.doFinal(plaintext.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
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
