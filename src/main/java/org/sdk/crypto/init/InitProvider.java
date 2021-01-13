package org.sdk.crypto.init;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class InitProvider {

  public static final String BC_PROVIDER = "BC";

  static final Object PROVIDER_INSTRUCTION = new Object();

  static {
    synchronized (PROVIDER_INSTRUCTION) {
      Provider bc = Security.getProvider(BC_PROVIDER);
      if (bc == null) {
        Security.addProvider(new BouncyCastleProvider());
      }
    }
  }

}