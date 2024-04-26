  // methods for securely making an encryption and decryption program
    /*
     * This group of methods allows you to generate a standard secret key for cryptographic algorithms, generate an initialization vector, and use
     * both of these parameters in the encrypting and decrypting. 
     */
    public static SecretKeys generateKey(int n) throws NoSuchAlgorithmException{
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(n);
        SecretKey key = keyGen.generateKey();
        return key;
    }

    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextByte(iv);
        return new IvParameterSpec(iv);
    }

    public static String safeEnc(String alg, String msg, String key, IvParameterSpec iv) throws InvalidKeyException/*errors*/{
        Cipher cipher = Cipher.getInstance(alg);
        cipher.init(Cipher.ENCRYPT_MODE, key, iv);
        byte[] cipherMsg = cipher.doFinal(input.getBytes());
        return Base64.getEncoder().encodeToString(cipherText);
    }

    public static String safeDec(String alg, String cipherText, SecretKey key, IvParameterSpec iv) throws InvalidKeyException/*and errors*/{
        Cipher cipher = Cipher.getInstance(alg);
        cipher.init(Cipher.DECRYPT_MODE, key, iv);
        byte[] plainText = cipher.doFinal(Base64.getDecoder().decode(cipherText));
        return new String(plainText);
    }

    
}
