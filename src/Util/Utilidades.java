/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author saulo.geovane
 */
public class Utilidades {
    
        public static String Str2MD5(String texto_padrao) {

        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(texto_padrao.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String texto_hash = bigInt.toString(16);
            while (texto_hash.length() < 32) {
                texto_hash = "0" + texto_hash;
            }
            return texto_hash;
        } catch (Exception e) {
            return null;
        }

    }

    
}

