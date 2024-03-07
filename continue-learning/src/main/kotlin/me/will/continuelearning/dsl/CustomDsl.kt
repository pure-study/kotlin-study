package me.will.continuelearning.dsl

fun main() {
    block {
        println("In the first DSL block: $hey")
    }
    block {
        println("In the second DSL block: $hey")
    }
    anotherBlock {
        println("In the third DSL block: $hey")
    }
}

class Bob {
    val hey: String
        get() = "I'm Bob!"
}

class Alice {
    val hey: String
        get() = "I'm Alice!"
}

fun block(exec: Bob.() -> Unit) {
    val bob = Bob()
    bob.exec()
}

fun anotherBlock(exec: Alice.() -> Unit) {
    val alice = Alice()
    alice.exec()
}
