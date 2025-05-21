# Actividad 1 – Integración de ObjectDB en IntelliJ IDEA

📘 Unidad 8 - Programación  
💡 Ciclo: 1º DAM  
🔧 Tema: Bases de datos orientadas a objetos con Java

---

## ✅ Objetivo

Esta actividad consiste en integrar ObjectDB en un proyecto Java desarrollado en IntelliJ IDEA, como alternativa a Eclipse, para poder almacenar y gestionar objetos Java en una base de datos orientada a objetos.

---

## 🛠️ Pasos realizados

### 1. Instalación y configuración de ObjectDB

- Se ha descargado y se ha descomprimido ObjectDB desde [https://objectdb.com/download](https://objectdb.com/download)
- He añadido el archivo `objectdb.jar` como **librería externa** al proyecto en IntelliJ

### 2. Estructura del proyecto

- He creado una carpeta `db/` dentro del proyecto para almacenar la base de datos local
- he creado otra carpeta `META-INF` dentro de `src` para ubicar el archivo `persistence.xml`

### 3. Archivo `persistence.xml`

Este archivo configura la unidad de persistencia y la ruta de la base de datos:

```xml
<persistence-unit name="miBD">
  <provider>com.objectdb.jpa.Provider</provider>
  <class>Persona</class>
  <properties>
    <property name="javax.persistence.jdbc.url" value="db/personas.odb"/>
  </properties>
</persistence-unit>
