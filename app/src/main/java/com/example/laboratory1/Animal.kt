package com.example.laboratory1

open class Animal(val name: String, val age: Int, val description: String, val imageResId: Int) {
    // Метод, який можна перевизначити в похідних класах
    open fun makeSound(): String {
        return "Some sound"
    }
}

// Похідний клас Dog
class Dog(name: String, age: Int, description: String, imageResId: Int) : Animal(name, age, description, imageResId) {
    override fun makeSound(): String {
        return "Woof! Woof!"
    }
}

// Похідний клас Cat
class Cat(name: String, age: Int, description: String, imageResId: Int) : Animal(name, age, description, imageResId) {
    override fun makeSound(): String {
        return "Meow! Meow!"
    }
}

// Похідний клас Bird
class Bird(name: String, age: Int, description: String, imageResId: Int) : Animal(name, age, description, imageResId) {
    override fun makeSound(): String {
        return "Tweet! Tweet!"
    }
}

// Похідний клас Fish
class Fish(name: String, age: Int, description: String, imageResId: Int) : Animal(name, age, description, imageResId) {
    override fun makeSound(): String {
        return "Blub! Blub!"
    }
}

// Похідний клас Duck
class Snake(name: String, age: Int, description: String, imageResId: Int) : Animal(name, age, description, imageResId) {
    override fun makeSound(): String {
        return "Quack! Quack!"
    }
}