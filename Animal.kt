package Classes

open class Animal(var food: String, var location: String)
{
    open fun makeNoise()
    {
        println("Животное издает звук")
    }
    open fun eat()
    {
        println("Животное ест")
    }
    fun sleep()
    {
        println("Животное спит")
    }
}

class Dog(food: String, location: String, var group: String) : Animal(food, location)
{
    override fun makeNoise()
    {
        println("Собака лает")
    }
    override fun eat()
    {
        println("Собака ест")
    }
}

class Cat(food: String, location: String, var breed: String) : Animal(food, location)
{
    override fun makeNoise()
    {
        println("Кошка мяукает")
    }
    override fun eat()
    {
        println("Кошка ест")
    }
}

class Horse(food: String, location: String, var genus: String) : Animal(food, location)
{
    override fun makeNoise()
    {
        println("Лошадь ржет")
    }
    override fun eat() {
        println("Лошадь ест")
    }
}

class Vet
{
    fun treatAnimal(animal: Animal)
    {
        println("еда ${animal.food}, локация ${animal.location}")
    }
}

fun main()
{
    val animals = arrayOf(
        Dog("гречка", "конура", "одружейная"),
        Cat("корм", "домик", "абиссинская"),
        Horse("сено", "стойло", "мустанг"))
    val vet = Vet()
    for (animal in animals)
    {
        vet.treatAnimal(animal)
    }
}
