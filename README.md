Aplicación de Recordatorios - Android

 Autor
Braulio Sánchez

Descripción del Proyecto

Aplicación móvil Android desarrollada en **Kotlin** utilizando **Android Studio** que permite a los usuarios gestionar sus recordatorios de manera eficiente. La aplicación cuenta con un sistema completo de autenticación, almacenamiento local seguro y notificaciones programadas para nunca olvidar tareas importantes.

Funcionalidades Implementadas

Autenticación y Seguridad
- Sistema de Registro de Usuarios
  - Validación de campos (nombre de usuario y contraseña)
  - Verificación de contraseñas coincidentes
  - Contraseña mínima de 6 caracteres
  - Prevención de usuarios duplicados

- Sistema de Inicio de Sesión
  - Autenticación segura con credenciales
  - Sesión persistente usando EncryptedSharedPreferences
  - Cierre de sesión disponible desde el menú

 Gestión de Recordatorios
- Crear Recordatorios
  - Título del recordatorio
  - Descripción opcional
  - Selector de fecha
  - Selector de hora
  - Almacenamiento en base de datos local (Room)

- Visualizar Recordatorios
  - Lista ordenada por fecha y hora
  - Diseño Material Design con CardViews
  - Muestra título, descripción y fecha/hora

- Completar Recordatorios
  - Checkbox para marcar como completado
  - Texto tachado visual para recordatorios completados
  - Estado persistente

- Eliminar Recordatorios
  - Botón de eliminación en cada recordatorio
  - Cancela automáticamente la notificación asociada

Sistema de Notificaciones
- Solicitud de Permisos
  - Solicitud dinámica de permiso POST_NOTIFICATIONS (Android 13+)
  - Manejo de permisos de alarmas exactas

- Notificaciones Programadas
  - AlarmManager para programar notificaciones exactas
  - Notificaciones en la hora programada
  - Canal de notificaciones dedicado
  - Iconos y diseño personalizado

Almacenamiento de Datos
- Base de Datos Local (Room)
  - Tabla de usuarios con credenciales
  - Tabla de recordatorios con relación a usuarios
  - Consultas optimizadas con LiveData

- Almacenamiento Seguro
  - EncryptedSharedPreferences para la sesión
  - Cifrado AES256_GCM
  - Protección de datos sensibles

 Arquitectura y Tecnologías

Lenguaje y Framework
- Kotlin - Lenguaje de programación principal
- Android Studio - IDE de desarrollo

Librerías y Componentes
- Room Database
- Coroutines
- ViewBinding
- Material Design 3
- EncryptedSharedPreferences
- Lifecycle Components

 Arquitectura
- MVVM (Model-View-ViewModel)
- Repository Pattern con DAOs
- Separation of Concerns

 Estructura del Proyecto

com.example.calendario/
├── data/
│   ├── models/
│   │   ├── User.kt
│   │   └── Reminder.kt
│   ├── dao/
│   │   ├── UserDao.kt
│   │   └── ReminderDao.kt
│   └── AppDatabase.kt
├── adapters/
│   └── ReminderAdapter.kt
├── receivers/
│   └── ReminderReceiver.kt
├── utils/
│   ├── SessionManager.kt
│   └── NotificationHelper.kt
├── MainActivity.kt
├── LoginActivity.kt
├── RegisterActivity.kt
└── CalendarActivity.kt
```

 Pasos para Ejecutar el Proyecto

 Requisitos Previos
- Android Studio Hedgehog (2023.1.1) o superior
- JDK 17 o superior
- SDK mínimo: API 26
- SDK objetivo: API 34

 Instalación

1. Clonar el proyecto:

bash
git clone <url-del-repositorio>
cd calendario-app


2. Abrir en Android Studio

3. Verificar `settings.gradle.kts`:
kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}


 Creador

Braulio Sánchez
