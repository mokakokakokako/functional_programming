package Classes
class Message(val username: String)
{
    fun introduce()
    {
        println("Привет, меня зовут $username")
    }
}
fun main()
{
    val message = Message("name")
    message.introduce()
}