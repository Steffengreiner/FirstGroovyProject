package FirstGroovyProject

5.times {println("Hello")}
println()

class Groovyexample {
    def fahren() {println("Auto fährt")}
    def stehen() {println( "Auto steht")}
    String s
    String i
    def a

}

Groovyexample newgroove = new Groovyexample();

newgroove.stehen()
newgroove.s = "Hello"
newgroove.i = "Wait"

waiter = newgroove.i
sitter = newgroove.s
Rander = newgroove.a = "Random"
println(waiter + sitter)
println(Rander)