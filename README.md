# 💱 ConversorMonedas

![Java](https://img.shields.io/badge/Java-21+-blue)
![Status](https://img.shields.io/badge/Status-Activo-success)
![API](https://img.shields.io/badge/API-ExchangeRate-orange)

Aplicación de consola desarrollada en **Java** que permite convertir valores entre diferentes monedas utilizando una API externa para obtener tasas de cambio en tiempo real.

Este proyecto fue construido aplicando buenas prácticas de desarrollo backend: separación de responsabilidades, uso de `record`, manejo de excepciones y protección segura de API keys.

---

## 🚀 Características

✔ Menú interactivo en consola  
✔ Conversión entre monedas en tiempo real  
✔ Consumo de API REST externa  
✔ Conversión JSON → Objeto con Gson  
✔ Uso de `HttpClient` moderno (Java 11+)  
✔ Protección de API Key mediante variables de entorno  

---

## 🧱 Arquitectura del Proyecto

El proyecto está estructurado siguiendo separación de responsabilidades:

```
ConversorMonedas/
│
├── src/
│   ├── Principal.java          → Punto de entrada
│   ├── GeneradorConsulta.java  → Lógica HTTP y consumo de API
│   ├── Monedas.java            → Modelo de datos (record)
│
├── .gitignore
└── README.md
```

---

## 🛠 Tecnologías Utilizadas

- Java 17+
- HttpClient
- Gson
- Git
- GitHub

---

## ⚙️ Instalación y Configuración

### 1️⃣ Clonar el repositorio

```bash
git clone https://github.com/RamZero-hub/ConversorMonedas.git
```

---

### 2️⃣ Configurar API Key (IMPORTANTE)

Por seguridad, la API Key **NO está incluida en el proyecto**.

En IntelliJ:

1. Ir a `Run`
2. Seleccionar `Edit Configurations`
3. En **Environment Variables** agregar:

```
EXCHANGE_API_KEY=tu_api_key_aqui
```

En el código se obtiene así:

```java
String apiKey = System.getenv("EXCHANGE_API_KEY");

if (apiKey == null) {
    throw new RuntimeException("API Key no configurada");
}
```

---

## ▶️ Ejecución

Ejecutar la clase `Principal`.

El sistema mostrará un menú como:

```
1. USD → COP
2. USD → EUR
7. Salir
```

Selecciona una opción y el sistema realizará la conversión consultando la API en tiempo real.

---

## 🛡 Buenas Prácticas Implementadas

- ✔ Separación entre presentación y lógica de negocio
- ✔ Uso de `record` para modelo inmutable
- ✔ Manejo de excepciones
- ✔ Validación de variables de entorno
- ✔ Protección de credenciales
- ✔ Uso correcto de `.gitignore`

---

## 🔐 Seguridad

- La API Key no está hardcodeada.
- Se usa `System.getenv()` para evitar exponer credenciales.
- Si la clave se expone accidentalmente, debe regenerarse inmediatamente.

---

## 📈 Posibles Mejoras Futuras

- Agregar más monedas dinámicamente
- Implementar interfaz gráfica (JavaFX o Swing)
- Persistir historial de conversiones
- Implementar pruebas unitarias
- Manejo avanzado de errores HTTP

---

## 📄 Licencia

Proyecto desarrollado con fines educativos y de práctica profesional en consumo de APIs y buenas prácticas backend.

---

## 👨‍💻 Autor

**RamZero-hub**  
Desarrollador en formación enfocado en backend, APIs y buenas prácticas.

