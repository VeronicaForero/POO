class Operaciones {

    var x1:Double = 0.0
    var y2:Double = 0.0

    constructor()
    constructor(x1: Double, y2: Double) {
        this.x1 = x1
        this.y2 = y2
    }


    fun suma(n1:Double, n2:Double):Double { //Con parametros y con retorno
        return n1+ n2
    }

    fun resta(): Double { // Sin parametros y con retorno
        this.x1 = 4.0
        this.y2 = 8.0

        return (x1 - y2)
    }

    fun multiplicacion(n1:Double, n2:Double) {//Con parametros y sin retorno
        this. x1=n1
        this. y2=n2

        println("El resultado es: $x1 * $y2 es: ${x1* y2}")

    }

    fun division() { // Sin parametros y sin retorno

        this.x1 = 2.0
        this.y2 = 6.0
        println("El resultado es: $x1 entre $y2 es: ${x1/y2}")
    }

    override fun toString(): String {
        return "Operaciones(x1=$x1, y2=$y2)"
    }


}
