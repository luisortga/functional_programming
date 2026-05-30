# ☕ Programación Funcional en Java

Repositorio dedicado al aprendizaje y práctica de **Programación Funcional en Java**, utilizando características modernas del lenguaje como:

* Threads
* Lambda Expressions
* Streams API
* Collectors
* Functional Interfaces
* Concurrencia
* Docker

---

# 📚 Tecnologías Utilizadas

* Java 17+
* Maven
* Docker
* Streams API
* Collectors
* Threads & Concurrency

---

# 📂 Contenido del Repositorio

```bash
functional-programming-java/
│
├── lambdas/
├── streams/
├── collectors/
├── threads/
├── concurrency/
├── functional-interfaces/
├── docker/
│
├── Dockerfile
├── pom.xml
└── README.md
```

---

# ⚡ Temas Implementados

## 🔹 Lambda Expressions

Uso de funciones anónimas para escribir código más limpio y expresivo.

```java
List<String> names = List.of("Java", "Python", "Go");

names.forEach(name -> System.out.println(name));
```

---

## 🔹 Streams API

Procesamiento funcional de colecciones.

```java
List<Integer> numbers = List.of(1,2,3,4,5);

numbers.stream()
       .filter(n -> n % 2 == 0)
       .forEach(System.out::println);
```

---

## 🔹 Collectors

Agrupación, transformación y reducción de datos.

```java
Map<Integer, List<String>> grouped =
    names.stream()
         .collect(Collectors.groupingBy(String::length));
```

---

## 🔹 Threads

Creación y manejo de hilos en Java.

```java
Thread thread = new Thread(() -> {
    System.out.println("Ejecutando hilo");
});

thread.start();
```

---

## 🔹 Programación Concurrente

Uso de herramientas modernas de concurrencia:

* ExecutorService
* CompletableFuture
* Synchronization
* Atomic Variables

```java
ExecutorService executor = Executors.newFixedThreadPool(2);

executor.submit(() -> {
    System.out.println("Task ejecutada");
});
```

---

# 🐳 Docker

El proyecto incluye un `Dockerfile` para ejecutar la aplicación en contenedores.

## Construir la imagen

```bash
docker build -t functional-java .
```

## Ejecutar el contenedor

```bash
docker run functional-java
```

---

# 🛠️ Instalación

## Clonar repositorio

```bash
git clone https://github.com/tu-usuario/functional-programming-java.git
```

## Entrar al proyecto

```bash
cd functional-programming-java
```

## Ejecutar con Maven

```bash
mvn clean install
mvn exec:java
```

---

# 🎯 Objetivos del Proyecto

* Aprender programación funcional en Java
* Mejorar el manejo de concurrencia
* Comprender Streams y Collectors
* Practicar arquitectura limpia
* Ejecutar aplicaciones Java con Docker

---

# 📖 Conceptos Practicados

* Inmutabilidad
* Higher Order Functions
* Functional Interfaces
* Parallel Streams
* Thread Safety
* CompletableFuture
* Asynchronous Programming

---

# 🚀 Futuras Mejoras

* Reactive Programming con Spring WebFlux
* Virtual Threads (Project Loom)
* Tests con JUnit
* Benchmarks de concurrencia
* Integración CI/CD

---

# 👨‍💻 Autor

Proyecto desarrollado con Java para practicar programación funcional, concurrencia y herramientas modernas del ecosistema JVM.

---
