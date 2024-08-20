
fun main() {

    val Op = Operaciones(5.0, 8.0)
    var opcion: Int = 0
    var n1: Double
    var n2: Double



    while (opcion != 4) {

        println(
            """Operaciones basicas:
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            Digite su opcion: 
            
        """.trimMargin()
        )

        opcion = readln().toInt()

        if (opcion == 1) {

            println("Digite el primer numero:")
            n1 = readln().toDouble()

            println("Digite el segundo numero:")
            n2 = readln().toDouble()

            println("El resultado es: ${Op.suma(n1,n2)}")

        } else if (opcion == 2) {

            println("El resultado de la resta es: ${Op.resta()}")

        } else if (opcion == 3) {

            println("Digite el primer numero:")
            n1 = readln().toDouble()

            println("Digite el segundo numero:")
            n2 = readln().toDouble()

            Op.multiplicacion(n1, n2)

        } else if (opcion == 4) {

            Op.division()

        }
    }
}
