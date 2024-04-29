# README - Proyecto de Prueba Klimber Automation

Mi objetivo es poder demostrar mis habilidades en la automatización de pruebas utilizando el Page Object Model (POM), Java, Selenium y TestNG. A continuación, se presenta una descripción detallada de la estructura y funcionalidades implementadas:

## Estructura del Proyecto

El proyecto sigue una estructura organizada y modularizada, facilitando su mantenimiento y escalabilidad. A continuación, se detalla la estructura de carpetas y archivos principales:

- **src/test/java/tests**: Aqui cree las clases de prueba que validan el funcionamiento de las diferentes funcionalidades del proyecto.
- **src/test/java/helpers**: Implemente el uso de clases con metodos estaticos, DummieDataGenerator contiene metodos para el manejo de datos randomizados y ConfigPropiertiesHelper para leer las propierties del archivo config.properties(actualmente solo el URL). 

## Implementación

### Page Object Model (POM)

Se ha implementado el POM para mejorar la modularidad y mantenibilidad del código. Cada página del proyecto tiene su propia clase Java que representa los elementos de la interfaz y las acciones que se pueden realizar en ella.

### Configuración Global

Se ha creado un `BaseTest` para configurar la suite de pruebas de manera global. Esto garantiza una configuración uniforme y consistente antes de ejecutar las pruebas.

### Configuración Externa

Se utiliza un archivo `config.properties` para almacenar la URL del proyecto y otros parámetros relevantes. Esta práctica facilita la configuración y evita la duplicación de información sensible en el código.

### Tecnologías Utilizadas

El proyecto se ha desarrollado utilizando Java, Selenium y TestNG. Estas tecnologías proporcionan un entorno robusto y flexible para la automatización de pruebas.

### Funcionalidades

El test navega a través de varios formularios, en total 8 pantallas, realizando diversas acciones, como obtener un presupuesto para un seguro, registrar un usuario e ingresar un número de tarjeta válido (dummy). En ocasiones, se utiliza la navegación por teclado para evitar elementos web con comportamiento errático, como las casillas de verificación.

### Organización de Pruebas

Se ha creado un archivo `testng.xml` para organizar suites de pruebas. Esta práctica permite escalar el proyecto fácilmente agregando más pruebas en el futuro.

## Ejecución de Pruebas

Para ejecutar las pruebas, sigue estos pasos:

1. Clona el repositorio en tu máquina local.
2. Asegúrate de tener configurado el entorno de desarrollo con todas las dependencias necesarias.
3. Modifica el archivo `config.properties` con la URL del proyecto y otros parámetros relevantes, según sea necesario.
4. Ejecuta las pruebas utilizando tu entorno de desarrollo preferido o mediante línea de comandos utilizando TestNG.

Espero que les haya gustado, un saludo muy grande.
