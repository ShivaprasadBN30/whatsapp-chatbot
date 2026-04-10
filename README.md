# WhatsApp Chatbot Backend (Spring Boot)

## 🚀 Features

* REST API endpoint `/webhook`
* Accepts JSON messages
* Responds with predefined replies:

  * Hi → Hello
  * Bye → Goodbye
* Logs incoming messages

## 🧪 API Test

POST `/webhook`

Request:
{
"message": "Hi"
}

Response:
Hello

## 🛠 Tech Stack

* Java
* Spring Boot

## ▶️ Run Locally

mvn spring-boot:run
