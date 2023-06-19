fun main(){
var stack=Stack()
 stack.push(45)
    stack.push(67)
    stack.push(90)
    println(stack.peek())
    stack.pop()
    stack.push(18)
    var x=stack.pop()
    var y=stack.pop()
    var z=x!!+y!!
    println(z)


    var mystack=Stackk()
    var string="adalab"
    for(c in string){
        mystack.push(c)
    }
    var result= mutableListOf<Char>()
    while(!mystack.isEmpty()){
        result.add(mystack.pop()!!)
    }
    println(result.joinToString (""))
}

class Stack{
    var data= mutableListOf<Int>()

    fun push(value:Int){
        data.add(value)
    }

    fun pop():Int?{
        if(data.isEmpty()){
            return null
        }
        var top=data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if(data.isEmpty()){
            return null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return data.isEmpty()
    }


}

class Stackk {
    var data = mutableListOf<Char>()

    fun push(value: Char) {
        data.add(value)
    }

    fun pop(): Char? {
        if (data.isEmpty()) {
            return null
        }
        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }

    fun peek(): Char? {
        if (data.isEmpty()) {
            return null
        }
        return data[data.lastIndex]
    }

    fun isEmpty(): Boolean {
        return data.isEmpty()
    }
}