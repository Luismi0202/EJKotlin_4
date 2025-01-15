class Coche(var color:String,marca:String,modelo:String,caballos:Int,puertas:Int,matricula:String){
    var marca = marca
        private set

    var modelo = modelo
        private set
        get()= field.replaceFirstChar { field[0].uppercase() }

    var caballos = caballos
        private set

    var puertas = puertas
        private set

    var matricula = matricula
        private set

    override fun toString(): String {
        return "El coche es de la marca $marca MODELO: $modelo. ES DE COLOR $color. Tiene $caballos caballos, $puertas puertas y su matrículas es $matricula"
    }

    init{
        require(!this.marca.isNullOrEmpty()){"La marca no puede estar vacía o nula"}
        require(!this.modelo.isNullOrEmpty()){"El modelo no puede ser vacío o nulo"}
        require(this.puertas>0){"No pueden haber 0 puertas"}
        require(this.caballos>0){"El número de caballos no puede ser 0"}
        require(!this.matricula.isNullOrEmpty()) {"La matrícula no puede estar vacía o nula"}
        require(!color.isNullOrEmpty()){"El color no puede ser vacío o nulo"}
        require(caballos in 70..700){"El número de caballos debe estar entre 70 y 700"}
        require(puertas in 3..5){"El número de puertas va del rango 3 al 5"}
        require(matricula.length <= 7){"La matrícula no puede tener más de 7 caracteres"}

    }
}




fun main() {
    var coche1 = try{
        Coche("","","",0,0,"")
    }catch(e:Exception){
        println("Error ${e.message}")
        null
    }

    var coche2 = try{
        Coche("FDGD","GFDG","GFDG",701,4,"FDGD")
    }catch(e:Exception){
        println("Error ${e.message}")
        null
    }

    var coche3 = try{
        Coche("gdfgg","gfdg","gfdgf",0,6,"gfdgf")
    }catch(e:Exception){
        println("Error ${e.message}")
        null
    }

    var coche4 = try{
        Coche("FDGF","FDGF","GFDGG",71,4,"GFDJHFDJHDFHFD")
    }catch(e:Exception){
        println("Error ${e.message}")
        null
    }

    var coche5 = try{
        Coche("gfdgfd","gfdg","gdfg",71,4,"darfgd")
    }catch(e:Exception){
        println("Error ${e.message}")
        null
    }
    println(coche5)
}