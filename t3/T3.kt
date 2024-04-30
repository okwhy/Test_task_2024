package t3

import kotlin.math.PI

sealed class Shape3D {
    abstract fun volume(): Double
    abstract fun baseArea(): Double
}
class Sphere(private val radius: Double) : Shape3D() {
    override fun volume(): Double {
        return (4.0 / 3.0) * PI * radius * radius * radius
    }

    override fun baseArea(): Double {
        return PI * radius * radius
    }
}



class Cylinder(private val radius: Double, private val height: Double) : Shape3D() {
    override fun volume(): Double {
        return PI * radius * radius * height
    }

    override fun baseArea(): Double {
        return PI * radius * radius
    }
}
class Prism(private val baseArea: Double, private val height: Double) : Shape3D() {
    override fun volume(): Double {
        return baseArea * height
    }

    override fun baseArea(): Double {
        return baseArea
    }
}

class Pyramid(private val baseArea: Double, private val height: Double) : Shape3D() {
    override fun volume(): Double {
        return (1.0 / 3.0) * baseArea * height
    }

    override fun baseArea(): Double {
        return baseArea
    }
}


class Cone(private val radius: Double, private val height: Double) : Shape3D() {
    override fun volume(): Double {
        return (1.0 / 3.0) * PI * radius * radius * height
    }

    override fun baseArea(): Double {
        return PI * radius * radius
    }
}
class Parallelepiped(private val length: Double, private val width: Double, private val height: Double) : Shape3D() {
    override fun volume(): Double {
        return length * width * height
    }

    override fun baseArea(): Double {
        return length * width
    }
}
class Cube(private val sideLength: Double) : Shape3D() {
    override fun volume(): Double {
        return sideLength * sideLength * sideLength
    }

    override fun baseArea(): Double {
        return sideLength * sideLength
    }
}




