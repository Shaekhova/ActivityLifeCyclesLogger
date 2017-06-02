fun <T:Comparable<T>> insertSort(items:MutableList<T>):List<T>{
    if (items.isEmpty()){ // если пустой то ничего не сортируем
        return items
    }

    for (count in 1..items.count() - 1){
        // бежим по листу со второго элемента
        val item = items[count]// берем элемент текущий, далее ищем его позицию
        var i = count // его индекс
        while (i>0 && item < items[i - 1]){ // бежим налево с индекса count заменяя этим элементом пока меньше item < items[i - 1]
            items[i] = items[i - 1]//замена большим
            i -= 1// налево бежим
        }
        items[i] = item //заменяем меньшим
    }
    return items
}

fun main(args: Array<String>) {
    val list = mutableListOf(4, 3, 5, 6, 2, 1)
    list.forEach { i -> println(i) }
    insertSort(list)
    list.forEach { i -> println(i) }
}
