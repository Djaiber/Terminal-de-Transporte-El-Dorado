✈️ Terminal de Transporte El Dorado

📌 Descripción

Este proyecto consiste en la implementación de un sistema de gestión de vuelos nacionales e internacionales utilizando Java 22 y Eclipse IDE. La aplicación manejará información sobre vuelos, aerolíneas y viajeros, asegurando la persistencia de datos mediante archivos serializados. Además, se debe respetar la arquitectura MVC y utilizar recursividad en lugar de ciclos.

📋 Requerimientos

🖥 Lenguaje: Java 22

🛠 Entorno de Desarrollo: Eclipse IDE

🎨 Interfaz: Entorno gráfico

💾 Persistencia: Archivos serializados

📐 Patrones: Arquitectura MVC

🔄 Programación: Sin uso de ciclos, solo recursividad

📖 Javadoc: Documentación completa del código

📊 Diagrama de Clases: Diseño estructural de las clases del sistema

🎥 Video Explicativo: Grabación con OBS mostrando el funcionamiento del sistema y la explicación del código

🏗 Estructura del Proyecto

🏷 Clases Principales

🛫 Vuelo

nVuelo (String)

aerolinea (String)

fechaHoraSalida (LocalDateTime)

fechaHoraLlegada (LocalDateTime)

destino (String)

origen (String)

listaViajeros (Lista recursiva de objetos Viajero)

🧳 Viajero

nombre (String)

nacionalidad (String)

fechaNacimiento (LocalDate)

edad (Calculada según fecha de nacimiento)

menor de edad (Indicar si es menor de 18 años)

📅 CalculadoraEdad

Método recursivo para calcular la edad basada en la fecha de nacimiento

💾 Persistencia

Métodos para guardar y cargar datos utilizando serialización

⚙️ Instalación y Ejecución

📥 Clonar o descargar el repositorio

🛠 Importar el proyecto en Eclipse IDE

▶️ Ejecutar la aplicación desde la clase principal con interfaz gráfica

⚠️ Recomendaciones

❌ Evitar errores de codificación (descuentos de 1 unidad en valores enteros)

🏛 Mantener la estructura MVC para evitar penalizaciones

🔄 Implementar toda la lógica con recursividad, sin uso de ciclos

📅 Fecha de Entrega

🗓 Jueves 27, 10 PM



