/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caesarcipher;

import java.util.Scanner;

public class CaesarCipher {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your message: ");
        String message = scanner.nextLine();
        
        String newMessage = encryptCaesarCipher(message);
        System.out.println("Encryoted Message: " + newMessage);
        
        String decryptedMessage = decryptCaesarCipher(newMessage);
        System.out.println("Decrypted Message: " + decryptedMessage);
        
        
    }
    
    public static String encryptCaesarCipher(String message){
        char[] charArray = message.toCharArray(); // Convert message to character array

        for (int i = 0; i < charArray.length; i++) {
            char c = Character.toUpperCase(charArray[i]); // Convert to uppercase

            int index;
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';  // Convert letter to index (0-25)
                index = (index + 3) % 26;  // Shift forward by 3 with wrap-around
                charArray[i] = (char) ('A' + index);  // Convert back to character
            } else {
                switch (c) {
                    case ' ': index = 30; break;
                    case '?': index = 31; break;
                    case '/': index = 32; break;
                    case '.': index = 33; break;
                    case '!': index = 34; break;
                    case '~': index = 35; break;
                    default: index = 30; break; // Default to space for invalid characters
                }

                index = (index + 1) % 36;  // Increment with wrap-around

                switch (index) {
                    case 30: charArray[i] = ' '; break;
                    case 31: charArray[i] = '?'; break;
                    case 32: charArray[i] = '/'; break;
                    case 33: charArray[i] = '.'; break;
                    case 34: charArray[i] = '!'; break;
                    case 35: charArray[i] = '~'; break;
                    default: charArray[i] = ','; break;  // Fallback character
                }
            }
        }
        String newMessage = new String(charArray); // Convert char array back to string
        
        return newMessage;
    }
    
    public static String decryptCaesarCipher(String encryptedMessage) {
        char[] charArray = encryptedMessage.toCharArray(); // Convert message to character array

        for (int i = 0; i < charArray.length; i++) {
            char c = Character.toUpperCase(charArray[i]); // Convert to uppercase

            int index;
            if (c >= 'A' && c <= 'Z') {
                index = c - 'A';  // Convert letter to index (0-25)
                index = (index - 3 + 26) % 26;  // Shift backward by 3 with wrap-around
                charArray[i] = (char) ('A' + index);  // Convert back to character
            } else {
                switch (c) {
                    case ' ': index = 30; break;
                    case '?': index = 31; break;
                    case '/': index = 32; break;
                    case '.': index = 33; break;
                    case '!': index = 34; break;
                    case '~': index = 35; break;
                    default: index = 30; break; // Default to space for invalid characters
                }

                index = (index - 1 + 36) % 36;  // Decrement with wrap-around

                switch (index) {
                    case 30: charArray[i] = ' '; break;
                    case 31: charArray[i] = '?'; break;
                    case 32: charArray[i] = '/'; break;
                    case 33: charArray[i] = '.'; break;
                    case 34: charArray[i] = '!'; break;
                    case 35: charArray[i] = '~'; break;
                    default: charArray[i] = ','; break;  // Fallback character
                }
            }
        }
        return new String(charArray); // Convert char array back to string
    }
}
