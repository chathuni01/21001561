object CaesarCipher {
  // Encryption function
  def caesarEncrypt(plaintext: String, shift: Int): String = {
    plaintext.map { char =>
      if (char.isLetter) {
        val isUpper = char.isUpper
        val shiftedChar = (char.toUpper.toInt + shift - 'A'.toInt) % 26 + 'A'.toInt
        if (isUpper) shiftedChar.toChar else shiftedChar.toChar.toLower
      } else {
        char
      }
    }.mkString
  }

  // Decryption function
  def caesarDecrypt(ciphertext: String, shift: Int): String = {
    caesarEncrypt(ciphertext, 26 - shift) // Decryption is equivalent to encryption with the reverse shift
  }

  // Cipher function
  def caesarCipher(text: String, shift: Int, action: String): String = {
    action.toLowerCase match {
      case "encrypt" => caesarEncrypt(text, shift)
      case "decrypt" => caesarDecrypt(text, shift)
      case _ => throw new IllegalArgumentException("Invalid action. Use 'encrypt' or 'decrypt'.")
    }
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shiftAmount = 3

    // Encryption
    val encryptedText = caesarCipher(plaintext, shiftAmount, "encrypt")
    println(s"Encrypted: $encryptedText")

    // Decryption
    val decryptedText = caesarCipher(encryptedText, shiftAmount, "decrypt")
    println(s"Decrypted: $decryptedText")
  }
}
