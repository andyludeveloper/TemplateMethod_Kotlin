class Class1 {
    fun execute() {
        method1()
        method2A()
        method3()
    }

    private fun method1() = println("method1")
    private fun method2A() = println("method2A")
    private fun method3() = println("method3")
}

class Class2 {
    fun execute() {
        method1()
        method2B()
        method3()
    }

    private fun method1() = println("method1")
    private fun method2B() = println("method2B")
    private fun method3() = println("method3")
}