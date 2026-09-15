# PatronesDeDiseño

Este repositorio contiene implementaciones prácticas en Java de varios patrones de diseño de software. Cada directorio se enfoca en un patrón de diseño específico e incluye su respectivo enunciado de problema y el código que lo resuelve.

A continuación, se presenta un resumen de cada patrón implementado y cómo funciona su ejemplo práctico:

## 1. Abstract Factory
**Concepto:** Permite crear familias de objetos relacionados sin especificar sus clases concretas.
**Ejemplo Práctico:** Librería para dibujar interfaces gráficas (GUI) que soporta Windows y Mac. Garantiza que si la app está en Windows, los botones y checkboxes creados son del estilo Windows, y lo mismo para Mac, evitando que se mezclen elementos de diferentes familias.

## 2. Adapter
**Concepto:** Actúa como un puente entre dos interfaces incompatibles, permitiendo que trabajen juntas.
**Ejemplo Práctico:** Integración de una pasarela de pago antigua de un banco que solo acepta cobros en números enteros (céntimos) dentro de un sistema de e-commerce moderno que procesa cobros en euros con decimales. El adaptador traduce la petición del sistema moderno al formato del antiguo.

## 3. Decorator
**Concepto:** Permite añadir nuevas funcionalidades a un objeto dinámicamente sin alterar su estructura base, envolviéndolo con objetos "decoradores".
**Ejemplo Práctico:** Sistema de cobro para una pizzería donde se tiene una pizza base estándar y los clientes pueden agregar ingredientes extra (como bacon o champiñones) dinámicamente. Cada ingrediente "decora" la pizza sumando a la descripción y al precio.

## 4. Facade
**Concepto:** Proporciona una interfaz unificada y simplificada para un sistema complejo compuesto por múltiples subsistemas.
**Ejemplo Práctico:** Sistema de "Cine en Casa" que agrupa un televisor, equipo de sonido y luces. La fachada expone un único método `verPelicula()` que orquesta internamente el encendido, ajuste de entradas, configuración de volumen y atenuado de luces.

## 5. Factory Method
**Concepto:** Define una interfaz para crear un objeto, pero deja que las subclases decidan qué clase instanciar.
**Ejemplo Práctico:** Sistema de notificaciones que puede enviar correos electrónicos o SMS. Las fábricas concretas heredan de un creador base y deciden si instanciar y enviar una `NotificacionEmail` o una `NotificacionSMS`.

## 6. Observer
**Concepto:** Define una dependencia de uno-a-muchos entre objetos, de manera que si un objeto cambia de estado, todos sus dependientes son notificados y se actualizan automáticamente.
**Ejemplo Práctico:** Sistema de notificaciones PUSH para un canal de YouTube. El canal de YouTube es el sujeto observable, y cada suscriptor es un observador. Cuando se sube un nuevo video, el canal notifica automáticamente a todos los suscriptores.

## 7. Singleton
**Concepto:** Garantiza que una clase tenga una única instancia en toda la aplicación y proporciona un punto de acceso global a ella.
**Ejemplo Práctico:** Un sistema de registro (`Logger`) centralizado para la aplicación. Evita que diferentes partes del código instancien su propio logger, previniendo gastos de memoria y conflictos al escribir, asegurando el acceso a través de un `getInstance()`.

## 8. State
**Concepto:** Permite a un objeto alterar su comportamiento cuando su estado interno cambia, pareciendo que cambia su clase.
**Ejemplo Práctico:** Reproductor de música simple con un único botón de play/pause. El comportamiento al pulsarlo cambia dependiendo de si el reproductor se encuentra en estado `Detenido`, `Reproduciendo` o `Pausado`.

## 9. Strategy
**Concepto:** Define una familia de algoritmos, los encapsula y los hace intercambiables. Permite que el algoritmo varíe independientemente del cliente que lo utiliza.
**Ejemplo Práctico:** Sistema de cálculo del coste de envío en un carrito de compras. Existen diferentes estrategias (`Envío Estándar`, `Envío Exprés`, `Envío Gratis`) que calculan el costo total, pudiendo elegir y cambiar el método de envío sin modificar el código del pedido en sí.

## 10. Template Method
**Concepto:** Define el esqueleto de un algoritmo en una operación, delegando algunos pasos a las subclases. Permite redefinir ciertos pasos sin cambiar la estructura general del algoritmo.
**Ejemplo Práctico:** Simulador de construcción de casas donde el orden general es fijo (cimientos, paredes, ventanas). Las subclases (`CasaMadera`, `CasaCristal`) heredan la construcción de los cimientos, pero personalizan su propio método para construir paredes e instalar ventanas.
