public class PasswordManager {

  /**
   * This method returns whether or not a password meets the following
   * traditional complexity requirements for string passwords:
   *
   * At least 8 characters long
   * Contains an upper case letter
   * Contains a lower case letter
   * Contains a digit
   * Contains a special character from the set `~!@#$%^&*()_- =+[]{}<>;:'",.?/\|
   *
   * @param pw A string representing the password to check
   * @return A boolean representing whether all of the requirements are met.
   */
  public static boolean checkComplexity (String pw)


  /**
   * Generates a random password that meets the complexity requirements
   */
  public static String generatePW()


  /**
   * Rough approximation of password strength based on information entropy.
   *
   * @param pw The password to be tested.
   * @return the password strength rerported as the number of bits of entropy.
   */
  public static double getPWStrength(String pw)
  
  /**
   * Uses the Vigenere cipher to encrypt a string (such as a password).
   *
   * @param key The encryption key
   * @param plainText The original text (eg. password) to be encrypted
   * @return The encrypted version of the original text (eg. password)
   */
public static String vigenere(String key, String password)

}
