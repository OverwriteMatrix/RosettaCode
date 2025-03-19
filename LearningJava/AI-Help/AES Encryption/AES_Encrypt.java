package com.mycompany.aes_encrypt;

import java.util.Base64;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/*
 *   @author ChatGPT (3/19/25)
*/

/*------------------------------------------------------------------------------
*  This Java program performs AES-256 encryption on a user-inputted message. 
*  It generates a secure AES encryption key, prints it in Base64 format, and 
*  then encrypts the provided message using the generated key. The encrypted 
*  message is displayed in Base64 format for easy storage or transmission.
*///----------------------------------------------------------------------------


public class AES_Encrypt {
    public static void main(String[] args) throws Exception {
        SecretKey key = generateKey();

        String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());
        System.out.println("           Key: " + encodedKey);  // Print the key in Base64 format

        Scanner scanner = new Scanner(System.in);
        System.out.print("  Your Message: ");
        String originalText = scanner.nextLine();

        String encryptedText = encrypt(originalText, key);
        System.out.println("     Encrypted: " + encryptedText);
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
}
