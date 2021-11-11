В классе CollectionMain:
- Точка входа, заполнение коллекций.
В классе ReadFromPackage:
- Поиск слова в папке с выбором файла.
В пакете api:
- ISearchEngine - контракт метода search.
- EasySearch - реализация метода search с использованем indexOf.
- RegExSearch - реализация метода search с использованем класса Matcher.
	В пакете decorators:
	- SearchDecorator - абстрактный метод, имплементирующий интерфейс ISearchEngine.
	- SearchEnginePunctuationNormalizer - декоратор, убирающий лишнюю пунктуацию.
	- SearchExcludingRegister - декоратор для поиска слова без учета регистра.
В пакете comparators:
- MapValueComparator - сравнение value значений коллекции Map при помощи Entry.
В папке files:
- "test" - небольшой текст для проверки и дебага.
- "Война и мир_книга" - Война и мир.
- "result.txt" - результаты поиска слов.
В папке Utils:
FileUtils - запись файла в строку
ListTop - вывод топ N слов.
В папке threads:
ResultContainer - контейнер для записи подсчета слов из потоков
SearchWordJob - класс для подсчета слов из разных файлов в несколько потоков.
CollectionThreadMain - точка входа, создание потоков.