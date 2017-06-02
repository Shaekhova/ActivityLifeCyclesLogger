fun <T:Comparable<T>> bubbleSort(items:MutableList<T>): List<T> {
    var swappedElements : Boolean; //есть замена
    do {
        swappedElements = false;
        for (i in 0..items.count() - 2){ //проходим по с первого по предпоследний элемент
            if (items[i] > items[i + 1]){ //сравниваем пары текущий и следующий справа
                val item = items[i]
                items[i] = items[i + 1]//меняем местами
                items[i + 1] = item
                swappedElements = true; // была замена
            }
        }
    } while (swappedElements); //делаем пока есть замены
    return items;
}

fun main(args: Array<String>) {
    val list = mutableListOf(4, 3, 5, 6, 2, 1)
    list.forEach { i -> print(i) }
    bubbleSort(list)
    print("\n")//перенос строки
    list.forEach { i -> print(i) }
}
