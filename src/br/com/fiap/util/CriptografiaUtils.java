package br.com.fiap.util;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CriptografiaUtils {
	

//		public static String criptografar(String senha) throws Exception {
//			// Obt�m a inst�ncia de um algoritmo
//			MessageDigest md = MessageDigest.getInstance("MD5");
//			// Passa os dados a serem criptografados e estipula enconding padr�o
//			md.update(senha.getBytes("ISO-8859-1"));
//			// Gera a chave criptografada em array de Bytes para posterior hashing
//			BigInteger hash = new BigInteger(1, md.digest());
//			// Retorna a senha criptografada
//			return hash.toString(16);
//		}
//
	
	public static String criptografar(String senha) throws Exception {
		// TODO Auto-generated method stub
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		// Passa os dados a serem criptografados e estipula enconding padr�o
		byte[] hashBytes = md.digest(senha.getBytes(StandardCharsets.UTF_8));

		// Gera a chave criptografada em array de Bytes para posterior hashing
		BigInteger hash = new BigInteger(1, md.digest());
		// Converte o array de bytes em uma representação hexadecimal
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
		return hash.toString(16);
	}
	}
