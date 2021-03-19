abstract class ParentClass {
    fun execute() {
        method1()
        method2()
        method3()
    }

    abstract fun method2()

    private fun method1() = println("method1")
    private fun method3() = println("method3")
}

class SubClass1 : ParentClass() {
    override fun method2() = println("method2A")
}

class SubClass2 : ParentClass() {
    override fun method2() = println("method2B")
}

fun main() {
    SubClass1().execute()
    SubClass2().execute()
}