В классе CollectionMain:
- Точка входа, запись файла в строку, заполнение коллекций, вывод топ N слов.
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