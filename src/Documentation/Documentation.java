package Documentation;

public class Documentation {
        /**
         * Содержимое пакета LessonOne - решение первого домашнего задаиня.
         *
         * 1. Добавить класс Team, который будет содержать:
         * название команды;
         * массив из четырех участников;
         * метод для вывода информации о членах команды, прошедших припятствия;
         * метод вывода информации обо всех членах команды.
         *
         * 2. Добавить класс Course (полоса препятствий), в котором будут находиться:
         * массив препятствий;
         * метод, который будет просить команду пройти всю полосу.
         */

        /**
         * Содержимое пакета LessonTwo - решение второго домашнего задаиня.
         *
         * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
         * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
         *
         * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
         * Если в каком-то элементе массива преобразование не удалось
         * (например, в ячейке лежит символ или текст вместо числа),
         * должно быть брошено исключение MyArrayDataException с детализацией,
         * в какой именно ячейке лежат неверные данные.
         *
         * 3. В методе main() вызвать полученный метод,
         * обработать возможные исключения MyArraySizeException и
         * MyArrayDataException и вывести результат расчета.
         */

    /**
     * Содержимое пакета LessonThree - решение третьего домашнего задаиня.
     * 1. Написать метод, который меняет два элемента массива местами
     * (массив может быть любого ссылочного типа);
     * 2. Задача:
     * Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     * Класс Box, в который можно складывать фрукты.
     * Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     * Для хранения фруктов внутри коробки можно использовать ArrayList;
     * Сделать метод getWeight(), который высчитывает вес коробки,
     * зная вес одного фрукта и их количество:
     * вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
     * которую подадут в compare() в качестве параметра.
     * true – если их массы равны, false в противоположном случае.
     * Можно сравнивать коробки с яблоками и апельсинами;
     * Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     * Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     * Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     * Не забываем про метод добавления фрукта в коробку.
     */

    /**
     * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     * Посчитать, сколько раз встречается каждое слово.
     * 2. Написать простой класс «Телефонный Справочник»,
     * который хранит в себе список фамилий и телефонных номеров.
     * В этот телефонный справочник с помощью метода add() можно добавлять записи,
     * а с помощью метода get() искать номер телефона по фамилии.
     * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны.
     */
    /**
     * 1. Реализовать сохранение данных в csv файл;
     * 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
     * Структура csv файла:
     * | Строка заголовок с набором столбцов |
     * | Набор строк с целочисленными значениями |
     * | * Разделитель между столбцами - символ точка с запятой (;) |
     *
     * Пример:
     * Value 1;Value 2;Value 3
     * 100;200;123
     * 300,400,500
     * Для хранения данных использовать класс вида:
     * public class AppData {
     *   private String[] header;
     *   private int[][] data;
     *
     *  // ...
     * }
     * Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
     */

    /**
     * 1. С помощью http запроса получить в виде json строки погоду в Санкт-Петербурге на период времени,
     * пересекающийся со следующим занятием (например, выборка погода на следующие 5 дней - подойдет)
     * 2. Подобрать источник самостоятельно. Можно использовать api accuweather, порядок следующий:
     * зарегистрироваться, зарегистрировать тестовое приложение для получения api ключа,
     * найдите нужный endpoint и изучите документацию.
     * Бесплатный тарифный план предполагает получение погоды не более чем на 5 дней вперед
     * (этого достаточно для выполнения д/з).
     */


}
