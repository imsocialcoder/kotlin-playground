/*
This exercise checks whether requested protocol is in SUPPORTED or not.
*/
fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED 
    println("Support for $requested: $isSupported")
}
