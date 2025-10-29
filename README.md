# API управления книгами

Мини-бэкенд для управления книгами, созданный с использованием Spring Boot, Spring Web и Spring Data JPA, как требуется.

## Выполненные требования

-   **Многоуровневая архитектура**: Код чётко разделён на слои `Entity` → `Repository` → `Service` → `Controller`.
-   **Полная функциональность CRUD**: Все 5 маршрутов CRUD для управления книгами полностью реализованы.
-   **Валидация**: API корректно проверяет запросы, удостоверяясь, что обязательные поля (`title`, `author`) присутствуют.
-   **Корректные HTTP-коды статуса**: Приложение использует соответствующие коды для успешных операций (`200 OK`, `201 Created`, `204 No Content`) и ошибок (`400 Bad Request`, `404 Not Found`).

## Конечные точки API

| Метод  | Конечная точка          | Описание                                              |
| :------ | :---------------------- | :---------------------------------------------------- |
| `POST`  | `/api/books`           | Создаёт новую книгу. Требуются поля `title` и `author`. |
| `GET`   | `/api/books`           | Получает список всех книг.                           |
| `GET`   | `/api/books/{id}`      | Получает одну книгу по её ID.                        |
| `PUT`   | `/api/books/{id}`      | Обновляет существующую книгу.                        |
| `DELETE`| `/api/books/{id}`      | Удаляет книгу по её ID.                              |

---

## Тесты API в Postman

Ниже приведены скриншоты из Postman, демонстрирующие работу всех маршрутов CRUD.

### 1. Создание книги (POST)
*Успешное создание возвращает статус `201 Created`.*

<img width="800" alt="Create-Book(POST)" src="https://github.com/user-attachments/assets/798d201b-5868-4902-942a-0432ac112890" />

### 2. Получение всех книг (GET)
*Успешный запрос возвращает статус `200 OK` со списком книг.*

<img width="800" alt="Get-All-Books(GET)" src="https://github.com/user-attachments/assets/7124443c-8b0c-467a-a198-d31ea9946a0f" />

### 3. Получение книги по ID (GET)
*Успешный запрос для существующего ID возвращает статус `200 OK`.*

<img width="800" alt="Get-Book-By-ID(GET)" src="https://github.com/user-attachments/assets/67b4726d-9837-43f7-a580-21e0375a00b4" />

### 4. Обновление книги (PUT)
*Успешное обновление возвращает статус `200 OK` с изменёнными данными.*

<img width="800" alt="Update-Book(PUT)" src="https://github.com/user-attachments/assets/2612ee0e-465d-41a5-b6e1-3c1c3349880f" />

### 5. Удаление книги (DELETE)
*Успешное удаление возвращает статус `204 No Content`.*

<img width="800" alt="Delete-Book(DELETE)" src="https://github.com/user-attachments/assets/aefa4e82-039e-4315-9deb-7def95551abb" />

### 6. Получение книги — не найдено (404)
*Запрос несуществующего ID корректно возвращает статус `404 Not Found`.*

<img width="800" alt="Get-Book-NotFound(GET)" src="https://github.com/user-attachments/assets/0144c6b6-9394-4da0-938c-c2b97fe6eb01" />

### 7. Создание книги — некорректные данные (400)
*Отправка книги без обязательного поля корректно возвращает статус `400 Bad Request`.*

<img width="800" alt="Create-Book-Invalid(POST)" src="https://github.com/user-attachments/assets/116e91d3-9a61-4336-93b9-ade36fc81605" />
