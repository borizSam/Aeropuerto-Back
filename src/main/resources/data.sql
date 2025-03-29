-- AEROPUERTOS
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (1, 'Aeropuerto de Madrid-Barajas', 'Madrid');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (2, 'Aeropuerto de París-Charles de Gaulle', 'París');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (3, 'Aeropuerto de Berlín Brandenburg', 'Berlín');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (4, 'Aeropuerto de Roma-Fiumicino', 'Roma');
INSERT INTO aeropuerto (id, nombre, ciudad) VALUES (5, 'Aeropuerto de Ámsterdam-Schiphol', 'Ámsterdam');

-- AVIONES
INSERT INTO avion (id, modelo, capacidad) VALUES (1, 'Airbus A320', 180);
INSERT INTO avion (id, modelo, capacidad) VALUES (2, 'Boeing 737', 160);
INSERT INTO avion (id, modelo, capacidad) VALUES (3, 'Embraer E190', 110);
INSERT INTO avion (id, modelo, capacidad) VALUES (4, 'Airbus A321', 200);
INSERT INTO avion (id, modelo, capacidad) VALUES (5, 'Boeing 787', 250);

-- VUELOS (20 en total)
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (1, 'París', '2025-04-01T09:00:00', '2025-04-01T11:00:00', 1, 1, 2);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (2, 'Ámsterdam', '2025-04-02T08:30:00', '2025-04-02T10:15:00', 2, 2, 5);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (3, 'Roma', '2025-04-03T12:00:00', '2025-04-03T14:00:00', 3, 3, 4);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (4, 'Berlín', '2025-04-04T07:00:00', '2025-04-04T09:00:00', 4, 5, 3);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (5, 'Madrid', '2025-04-05T15:30:00', '2025-04-05T18:00:00', 5, 4, 1);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (6, 'París', '2025-04-06T10:00:00', '2025-04-06T12:00:00', 2, 5, 2);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (7, 'Madrid', '2025-04-07T13:00:00', '2025-04-07T15:00:00', 1, 2, 1);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (8, 'Roma', '2025-04-08T06:30:00', '2025-04-08T08:45:00', 3, 1, 4);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (9, 'Ámsterdam', '2025-04-09T14:00:00', '2025-04-09T16:00:00', 4, 3, 5);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (10, 'Berlín', '2025-04-10T09:00:00', '2025-04-10T11:15:00', 5, 4, 3);

-- Vuelos adicionales
INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (11, 'París', '2025-04-11T16:30:00', '2025-04-11T18:30:00', 2, 3, 2);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (12, 'Berlín', '2025-04-12T09:15:00', '2025-04-12T11:20:00', 1, 5, 3);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (13, 'Roma', '2025-04-13T13:45:00', '2025-04-13T15:40:00', 4, 2, 4);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (14, 'Madrid', '2025-04-14T07:30:00', '2025-04-14T10:10:00', 3, 4, 1);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (15, 'Ámsterdam', '2025-04-15T12:30:00', '2025-04-15T14:00:00', 5, 1, 5);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (16, 'París', '2025-04-16T18:00:00', '2025-04-16T20:00:00', 2, 4, 2);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (17, 'Berlín', '2025-04-17T08:00:00', '2025-04-17T10:00:00', 3, 1, 3);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (18, 'Roma', '2025-04-18T15:00:00', '2025-04-18T17:00:00', 4, 5, 4);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (19, 'Madrid', '2025-04-19T11:00:00', '2025-04-19T13:30:00', 5, 2, 1);

INSERT INTO vuelo (id, destino, fecha_salida, fecha_llegada, avion_id, origen_id, destino_id)
VALUES (20, 'Ámsterdam', '2025-04-20T17:30:00', '2025-04-20T19:30:00', 1, 3, 5);
