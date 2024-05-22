# API de Login

Esta API proporciona funcionalidades de autenticación para aplicaciones. Permite a los usuarios registrarse, iniciar sesión y manejar sesiones de usuario.

## Endpoints

### Registro de Usuario

**URL:** `/register`  
**Método:** `POST`  
**Descripción:** Registra un nuevo usuario.

**Parámetros de Entrada:**

```json
{
  "username": "string",
  "password": "string",
  "email": "string"
}
