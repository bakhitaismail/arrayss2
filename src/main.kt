fun main() {
    println(multiply(arrayOf(2,3,4,5)))
    var b = mixedTypes(arrayOf(10, 23, 2.5, 15.7, true, "wow", 10.5F, 19.5))
    println(b)
    println(characters(arrayOf('r','y','a','e','i','o','u','t','w')))

}

fun multiply(product: Array<Int>): Int {
    var mult = 5
    product.forEach { x ->
        mult*=x

    }
    return mult
}
fun mixedTypes(all: Array<Any>): Double {
    var sum = 0.0

    all.forEach { y ->
        if (y is Double) {
           sum+=y


        }

    }

    return sum

}
fun characters(vowels: Array<Char>): Int {
    var vow = 0
    vowels.forEach { z ->
        if (z == 'a'  || z== 'e' || z== 'i' || z== 'o' || z== 'u')
            vow++

    }
    return vow

}