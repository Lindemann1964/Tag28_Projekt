class Car {
    var color: String
    var speed: Int

    constructor(color: String, speed: Int) {
        this.color = color
        this.speed = speed
    }

    fun paint(color: String) {
        this.color = color
    }

    fun tune() {
        speed = speed + 10
    }
}
     // Aufg. 1 Beschreibe in einem Text, was dieser Codeausschnitt macht.
     // erstellen eine Klasse Auto. Autofarbe und Geschw. werden ausgegeben und Geschw.und um +10 erhöt

var car: Car = Car("weiss", 150)

car.paint("schwarz")
car.tune()

println(car.color)
println(car.speed)


      // Aufg.1b Beschreibe in einem Text, was dieser Codeausschnitt macht.