#language: es

  Característica: Reserva de vuelo

    Antecedentes:
      Dado el usuario se encuentra en la pagina web
      Cuando el ingrese las credenciales

      Escenario: Reserva de vuelo exitoso
        Dado el usuario esta en la pagina de vuelos
        Cuando el cambie los datos del vuelo
        Entonces visualizara un mensaje sobre que no hay sillas disponibles