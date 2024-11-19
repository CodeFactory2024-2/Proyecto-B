CREATE TABLE "payment"(
                          "id_payment" bigserial NOT NULL,
                          "id_booking" BIGINT NOT NULL,
                          "amount" DECIMAL(8, 2) NOT NULL,
                          "payment_date" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                          "id_payment_status" BIGINT NOT NULL,
                          "id_payment_method" BIGINT NOT NULL
);
ALTER TABLE
    "payment" ADD PRIMARY KEY("id_payment");
CREATE TABLE "payment_method"(
                          "id_payment_method" bigserial NOT NULL,
                          "name" VARCHAR(255) NOT NULL,
                          "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "payment_method" ADD PRIMARY KEY("id_payment_method");
CREATE TABLE "payment_status"(
                                 "id_payment_status" bigserial NOT NULL,
                                 "name" VARCHAR(255) NOT NULL,
                                 "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "payment_status" ADD PRIMARY KEY("id_payment_status");
CREATE TABLE "pilot"(
                        "id_pilot" bigserial NOT NULL,
                        "first_name" VARCHAR(255) NOT NULL,
                        "last_name" VARCHAR(255) NOT NULL,
                        "license_number" VARCHAR(255) NOT NULL,
                        "date_of_birth" DATE NOT NULL,
                        "nationality" VARCHAR(255) NOT NULL,
                        "rank" VARCHAR(255) NOT NULL,
                        "hours_flown" FLOAT(53) NOT NULL,
                        "employee_date" DATE NOT NULL,
                        "id_pilot_status" BIGINT NOT NULL,
                        "home_base" VARCHAR(255) NOT NULL,
                        "last_medical_check" DATE NOT NULL
);
ALTER TABLE
    "pilot" ADD PRIMARY KEY("id_pilot");
CREATE TABLE "pilot_status"(
                                 "id_pilot_status" bigserial NOT NULL,
                                 "name" VARCHAR(255) NOT NULL,
                                 "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "pilot_status" ADD PRIMARY KEY("id_pilot_status");
CREATE TABLE "seat"(
                       "id_seat" bigserial NOT NULL,
                       "id_flight" BIGINT NOT NULL,
                       "seat_number" VARCHAR(255) NOT NULL,
                       "is_reserved" BOOLEAN NOT NULL,
                       "price" DECIMAL(8, 2) NOT NULL,
                       "id_seat_class" BIGINT NOT NULL
);
ALTER TABLE
    "seat" ADD PRIMARY KEY("id_seat");
CREATE TABLE "seat_class"(
                             "id_seat_class" bigserial NOT NULL,
                             "name" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "seat_class" ADD PRIMARY KEY("id_seat_class");
CREATE TABLE "city"(
                       "id_city" bigserial NOT NULL,
                       "name" VARCHAR(255) NOT NULL,
                       "id_country" BIGINT NOT NULL,
                       "timezone" VARCHAR(255) NOT NULL,
                       "latitude" FLOAT(53) NOT NULL,
                       "longitude" FLOAT(53) NOT NULL
);
ALTER TABLE
    "city" ADD PRIMARY KEY("id_city");
CREATE TABLE "luggage"(
                          "id_luggage" bigserial NOT NULL,
                          "id_passenger" BIGINT NOT NULL,
                          "id_luggage_type" BIGINT NOT NULL,
                          "height_cm" DECIMAL(8, 2) NOT NULL,
                          "weight_kg" DECIMAL(8, 2) NOT NULL,
                          "width_cm" DECIMAL(8, 2) NOT NULL,
                          "extra_free" DECIMAL(8, 2) NOT NULL
);
ALTER TABLE
    "luggage" ADD PRIMARY KEY("id_luggage");
CREATE TABLE "country"(
                          "id_country" bigserial NOT NULL,
                          "name" VARCHAR(255) NOT NULL,
                          "continent" VARCHAR(255) NOT NULL,
                          "language" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "country" ADD PRIMARY KEY("id_country");
CREATE TABLE "plane"(
                        "id_plane" bigserial NOT NULL,
                        "model" VARCHAR(255) NOT NULL,
                        "manufacturer" VARCHAR(255) NOT NULL,
                        "capacity_economy" BIGINT NOT NULL,
                        "capacity_business" BIGINT NOT NULL,
                        "capacity_first_class" BIGINT NOT NULL,
                        "date_manufactured" DATE NOT NULL,
                        "last_maintenance_date" DATE NOT NULL,
                        "registration_number" VARCHAR(255) NOT NULL,
                        "fuel_capacity" FLOAT(53) NOT NULL
);
ALTER TABLE
    "plane" ADD PRIMARY KEY("id_plane");
CREATE TABLE "role"(
                      "id_role" bigserial NOT NULL,
                      "name" VARCHAR(255) NOT NULL,
                      "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "role" ADD PRIMARY KEY("id_role");
CREATE TABLE "permission"(
                      "id_permission" bigserial NOT NULL,
                      "name" VARCHAR(255) NOT NULL,
                      "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "permission" ADD PRIMARY KEY("id_permission");
CREATE TABLE "role_permission"(
                    "id_role_permission" bigserial NOT NULL,
                    "id_role" BIGINT NOT NULL,
                    "id_permission" BIGINT NOT NULL
);
ALTER TABLE
    "role_permission" ADD PRIMARY KEY("id_role_permission");
CREATE TABLE "users"(
                        "id_user" bigserial NOT NULL,
                        "first_name" VARCHAR(255) NOT NULL,
                        "last_name" VARCHAR(255) NOT NULL,
                        "phone_number" VARCHAR(255) NOT NULL,
                        "email" VARCHAR(255) NOT NULL,
                        "nationality" VARCHAR(255) NOT NULL,
                        "date_of_birth" DATE NOT NULL,
                        "document_id" VARCHAR(255) NOT NULL,
                        "passport_number" VARCHAR(255) NOT NULL,
                        "registration_date" DATE NOT NULL,
                        "flyer_number" BIGINT NOT NULL,
                        "address" VARCHAR(255) NOT NULL,
                        "id_users_type" BIGINT NOT NULL,
                        "password_hash" VARCHAR(255) NOT NULL,
                        "id_document_type" BIGINT NOT NULL
);
ALTER TABLE
    "users" ADD PRIMARY KEY("id_user");
CREATE TABLE "users_type"(
                        "id_users_type" bigserial NOT NULL,
                        "name" VARCHAR(255) NOT NULL,
                        "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "users_type" ADD PRIMARY KEY("id_users_type");
CREATE TABLE "flight"(
                         "id_flight" bigserial NOT NULL,
                         "flight_number" BIGINT NOT NULL,
                         "id_plane" BIGINT NOT NULL,
                         "id_departure_city" BIGINT NOT NULL,
                         "id_arrival_city" BIGINT NOT NULL,
                         "departure_time" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                         "arrival_time" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                         "id_flight_status" BIGINT NOT NULL,
                         "flight_duration" TIME(0) WITHOUT TIME ZONE NOT NULL,
                         "distance_km" FLOAT(53) NOT NULL,
                         "seats" INTEGER NOT NULL,
                         "id_captain" BIGINT NOT NULL,
                         "id_sub_captain" BIGINT NOT NULL,
                         "price_economy" DECIMAL(8, 2) NOT NULL,
                         "price_business" DECIMAL(8, 2) NOT NULL,
                         "price_first_class" DECIMAL(8, 2) NOT NULL
);
ALTER TABLE
    "flight" ADD PRIMARY KEY("id_flight");
CREATE TABLE "flight_status"(
                           "id_flight_status" bigserial NOT NULL,
                           "name" VARCHAR(255) NOT NULL,
                           "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "flight_status" ADD PRIMARY KEY("id_flight_status");
CREATE TABLE "booking"(
                          "id_booking" bigserial NOT NULL,
                          "id_flight" BIGINT NOT NULL,
                          "id_user" BIGINT NOT NULL,
                          "booking_date" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                          "id_booking_status" BIGINT NOT NULL
);
ALTER TABLE
    "booking" ADD PRIMARY KEY("id_booking");
CREATE TABLE "booking_status"(
                                "id_booking_status" bigserial NOT NULL,
                                "name" VARCHAR(255) NOT NULL,
                                "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "booking_status" ADD PRIMARY KEY("id_booking_status");
CREATE TABLE "passenger"(
                            "id_passenger" bigserial NOT NULL,
                            "id_seat" BIGINT NOT NULL,
                            "first_name" VARCHAR(255) NOT NULL,
                            "last_name" VARCHAR(255) NOT NULL,
                            "date_of_birth" DATE NOT NULL,
                            "document_id" VARCHAR(255) NOT NULL,
                            "passport_number" VARCHAR(255) NOT NULL,
                            "nationality" VARCHAR(255) NOT NULL,
                            "luggage_included" BOOLEAN NOT NULL,
                            "id_document_type" BIGINT NOT NULL
);
ALTER TABLE
    "passenger" ADD PRIMARY KEY("id_passenger");
CREATE TABLE "booking_passenger"(
                            "id_booking_passenger" bigserial NOT NULL,
                            "id_booking" BIGINT NOT NULL,
                            "id_passenger" BIGINT NOT NULL
);
ALTER TABLE
    "booking_passenger" ADD PRIMARY KEY("id_booking_passenger");
CREATE TABLE "special_request"(
                        "id_special_request" bigserial NOT NULL,
                        "name" VARCHAR(255) NOT NULL,
                        "description" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "special_request" ADD PRIMARY KEY("id_special_request");
CREATE TABLE "passenger_special_request"(
                          "id_passenger_special_request" bigserial NOT NULL,
                          "id_passenger" BIGINT NOT NULL,
                          "id_special_request" BIGINT NOT NULL
);
ALTER TABLE
    "passenger_special_request" ADD PRIMARY KEY("id_passenger_special_request");
CREATE TABLE "scale"(
                        "id_scale" bigserial NOT NULL,
                        "id_flight" BIGINT NOT NULL,
                        "id_city" BIGINT NOT NULL,
                        "arrival_time" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                        "departure_time" TIMESTAMP(0) WITHOUT TIME ZONE NOT NULL,
                        "layover_duration" TIME(0) WITHOUT TIME ZONE NOT NULL
);
ALTER TABLE
    "scale" ADD PRIMARY KEY("id_scale");
CREATE TABLE "users_role"(
                            "id_users_role" bigserial NOT NULL,
                           "id_role" BIGINT NOT NULL,
                           "id_user" BIGINT NOT NULL
);
ALTER TABLE
    "users_role" ADD PRIMARY KEY("id_users_role");
CREATE TABLE "document_type"(
                            "id_document_type" bigserial NOT NULL,
                            "name" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "document_type" ADD PRIMARY KEY("id_document_type");
CREATE TABLE "luggage_type"(
                                "id_luggage_type" bigserial NOT NULL,
                                "name" VARCHAR(255) NOT NULL
);
ALTER TABLE
    "luggage_type" ADD PRIMARY KEY("id_luggage_type");

ALTER TABLE
    "booking_passenger" ADD CONSTRAINT "booking_passenger_id_booking_foreign" FOREIGN KEY("id_booking") REFERENCES "booking"("id_booking");
ALTER TABLE
    "scale" ADD CONSTRAINT "scale_id_flight_foreign" FOREIGN KEY("id_flight") REFERENCES "flight"("id_flight");
ALTER TABLE
    "city" ADD CONSTRAINT "city_id_country_foreign" FOREIGN KEY("id_country") REFERENCES "country"("id_country");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_departure_city_foreign" FOREIGN KEY("id_departure_city") REFERENCES "city"("id_city");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_plane_foreign" FOREIGN KEY("id_plane") REFERENCES "plane"("id_plane");
ALTER TABLE
    "booking_passenger" ADD CONSTRAINT "booking_passenger_id_passenger_foreign" FOREIGN KEY("id_passenger") REFERENCES "passenger"("id_passenger");
ALTER TABLE
    "seat" ADD CONSTRAINT "seat_id_flight_foreign" FOREIGN KEY("id_flight") REFERENCES "flight"("id_flight");
ALTER TABLE
    "scale" ADD CONSTRAINT "scale_id_city_foreign" FOREIGN KEY("id_city") REFERENCES "city"("id_city");
ALTER TABLE
    "booking" ADD CONSTRAINT "booking_id_flight_foreign" FOREIGN KEY("id_flight") REFERENCES "flight"("id_flight");
ALTER TABLE
    "passenger" ADD CONSTRAINT "passenger_id_seat_foreign" FOREIGN KEY("id_seat") REFERENCES "seat"("id_seat");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_arrival_city_foreign" FOREIGN KEY("id_arrival_city") REFERENCES "city"("id_city");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_sub_captain_foreign" FOREIGN KEY("id_sub_captain") REFERENCES "pilot"("id_pilot");
ALTER TABLE
    "booking" ADD CONSTRAINT "booking_id_user_foreign" FOREIGN KEY("id_user") REFERENCES "users"("id_user");
ALTER TABLE
    "luggage" ADD CONSTRAINT "luggage_id_passenger_foreign" FOREIGN KEY("id_passenger") REFERENCES "passenger"("id_passenger");
ALTER TABLE
    "users_role" ADD CONSTRAINT "users_role_id_user_foreign" FOREIGN KEY("id_user") REFERENCES "users"("id_user");
ALTER TABLE
    "payment" ADD CONSTRAINT "payment_id_booking_foreign" FOREIGN KEY("id_booking") REFERENCES "booking"("id_booking");
ALTER TABLE
    "users_role" ADD CONSTRAINT "users_role_id_role_foreign" FOREIGN KEY("id_role") REFERENCES "role"("id_role");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_captain_foreign" FOREIGN KEY("id_captain") REFERENCES "pilot"("id_pilot");
ALTER TABLE
    "role_permission" ADD CONSTRAINT "role_permission_id_role_foreign" FOREIGN KEY("id_role") REFERENCES "role"("id_role");
ALTER TABLE
    "role_permission" ADD CONSTRAINT "role_permission_id_permission_foreign" FOREIGN KEY("id_permission") REFERENCES "permission"("id_permission");
ALTER TABLE
    "payment" ADD CONSTRAINT "payment_id_payment_status_foreign" FOREIGN KEY("id_payment_status") REFERENCES "payment_status"("id_payment_status");
ALTER TABLE
    "payment" ADD CONSTRAINT "payment_id_payment_method_foreign" FOREIGN KEY("id_payment_method") REFERENCES "payment_method"("id_payment_method");
ALTER TABLE
    "users" ADD CONSTRAINT "users_id_document_type_foreign" FOREIGN KEY("id_document_type") REFERENCES "document_type"("id_document_type");
ALTER TABLE
    "passenger" ADD CONSTRAINT "passenger_id_document_type_foreign" FOREIGN KEY("id_document_type") REFERENCES "document_type"("id_document_type");
ALTER TABLE
    "pilot" ADD CONSTRAINT "pilot_id_pilot_status_foreign" FOREIGN KEY("id_pilot_status") REFERENCES "pilot_status"("id_pilot_status");
ALTER TABLE
    "flight" ADD CONSTRAINT "flight_id_flight_status_foreign" FOREIGN KEY("id_flight_status") REFERENCES "flight_status"("id_flight_status");
ALTER TABLE
    "booking" ADD CONSTRAINT "booking_id_booking_status_foreign" FOREIGN KEY("id_booking_status") REFERENCES "booking_status"("id_booking_status");
ALTER TABLE
    "users" ADD CONSTRAINT "users_id_users_type_foreign" FOREIGN KEY("id_users_type") REFERENCES "users_type"("id_users_type");
ALTER TABLE
    "seat" ADD CONSTRAINT "seat_id_seat_class_foreign" FOREIGN KEY("id_seat_class") REFERENCES "seat_class"("id_seat_class");
ALTER TABLE
    "passenger_special_request" ADD CONSTRAINT "passenger_special_request_id_passenger_foreign" FOREIGN KEY("id_passenger") REFERENCES "passenger"("id_passenger");
ALTER TABLE
    "passenger_special_request" ADD CONSTRAINT "passenger_special_request_id_special_request_foreign" FOREIGN KEY("id_special_request") REFERENCES "special_request"("id_special_request");
ALTER TABLE
    "luggage" ADD CONSTRAINT "luggage_id_luggage_type_foreign" FOREIGN KEY("id_luggage_type") REFERENCES "luggage_type"("id_luggage_type");

INSERT INTO country (name, continent, language) VALUES
    ('Estados Unidos', 'América del Norte', 'Inglés'),
    ('México', 'América del Norte', 'Español'),
    ('Japón', 'Asia', 'Japonés'),
    ('Francia', 'Europa', 'Francés'),
    ('Brasil', 'América del Sur', 'Portugués'),
    ('Italia', 'Europa', 'Italiano'),
    ('Argentina', 'América del Sur', 'Español'),
    ('India', 'Asia', 'Hindi'),
    ('Alemania', 'Europa', 'Alemán'),
    ('Canadá', 'América del Norte', 'Inglés y Francés');

INSERT INTO city (name, id_country, timezone, latitude, longitude) VALUES
   ('Nueva York', 1, 'UTC-5', 40.7128, -74.0060),
   ('Ciudad de México', 2, 'UTC-6', 19.4326, -99.1332),
   ('Tokio', 3, 'UTC+9', 35.6895, 139.6917),
   ('París', 4, 'UTC+1', 48.8566, 2.3522),
   ('Río de Janeiro', 5, 'UTC-3', -22.9068, -43.1729),
   ('Roma', 6, 'UTC+1', 41.9028, 12.4964),
   ('Buenos Aires', 7, 'UTC-3', -34.6037, -58.3816),
   ('Nueva Delhi', 8, 'UTC+5:30', 28.6139, 77.2090),
   ('Berlín', 9, 'UTC+1', 52.5200, 13.4050),
   ('Toronto', 10, 'UTC-5', 43.6532, -79.3832);

INSERT INTO document_type (name) VALUES
     ('Passport'),
     ('National ID'),
     ('Driver License'),
     ('Military ID'),
     ('Residence Permit'),
     ('Voter ID'),
     ('Health Card'),
     ('Student ID'),
     ('Work Permit'),
     ('Foreigner ID');

INSERT INTO users_type (name, description) VALUES
       ('Admin', 'Administrador del sistema'),
       ('User', 'Usuario regular'),
       ('VIP', 'Usuario VIP'),
       ('Guest', 'Usuario invitado'),
       ('Staff', 'Personal autorizado');

INSERT INTO users (first_name, last_name, phone_number, email, nationality, date_of_birth, document_id, passport_number, registration_date, flyer_number, address, id_users_type, password_hash, id_document_type) VALUES
       ('John', 'Doe', '+123456789', 'john.doe@example.com', 'USA', '1985-03-21', '123456789', 'US123456', '2022-05-01', 10001, '123 Main St, New York, NY', 1, 'hashedpassword1', 1),
       ('Jane', 'Smith', '+234567890', 'jane.smith@example.com', 'Canada', '1990-07-15', '234567890', 'CA234567', '2022-06-01', 10002, '456 Maple Ave, Toronto, ON', 1, 'hashedpassword2', 2),
       ('Carlos', 'Gomez', '+345678901', 'carlos.gomez@example.com', 'Mexico', '1992-10-30', '345678901', 'MX345678', '2022-07-15', 10003, '789 Oak St, Mexico City, DF', 1, 'hashedpassword3', 3),
       ('Alice', 'Brown', '+456789012', 'alice.brown@example.com', 'UK', '1988-02-20', '456789012', 'UK456789', '2022-08-05', 10004, '101 Birch Rd, London, ENG', 4, 'hashedpassword4', 4),
       ('Liam', 'Nguyen', '+567890123', 'liam.nguyen@example.com', 'Vietnam', '1995-12-11', '567890123', 'VN567890', '2022-09-10', 10005, '202 Pine St, Hanoi', 5, 'hashedpassword5', 5),
       ('Emma', 'Johnson', '+678901234', 'emma.johnson@example.com', 'Australia', '1982-06-25', '678901234', 'AU678901', '2022-10-20', 10006, '303 Cedar Ave, Sydney, NSW', 2, 'hashedpassword6', 6);

INSERT INTO role (name, description) VALUES
         ('Admin', 'Administrador del sistema'),
         ('Pilot', 'Piloto de la aerolínea'),
         ('Customer', 'Cliente de la aerolínea'),
         ('Staff', 'Empleado de la aerolínea'),
         ('Guest', 'Usuario invitado');

INSERT INTO permission (name, description) VALUES
           ('Create Booking', 'Permiso para crear reservaciones'),
           ('Cancel Booking', 'Permiso para cancelar reservaciones'),
           ('Update Booking', 'Permiso para actualizar reservaciones'),
           ('View Reports', 'Permiso para ver reportes del sistema'),
           ('Manage Users', 'Permiso para gestionar usuarios');

INSERT INTO role_permission (id_role, id_permission) VALUES
         (1, 1),
         (1, 2),
         (1, 3),
         (1, 4),
         (1, 5),
         (2, 3),
         (2, 4),
         (3, 1),
         (3, 2),
         (3, 3),
         (4, 1),
         (4, 3),
         (4, 4),
         (5, 1);

INSERT INTO users_role (id_role, id_user) VALUES
             (3, 1),
             (3, 2),
             (3, 3),
             (4, 4),
             (3, 5),
             (3, 6);

INSERT INTO flight_status (name, description) VALUES
          ('Scheduled', 'Vuelo programado'),
          ('Delayed', 'Vuelo retrasado'),
          ('Cancelled', 'Vuelo cancelado'),
          ('In Air', 'Vuelo en el aire'),
          ('Arrived', 'Vuelo aterrizado');

INSERT INTO booking_status (name, description) VALUES
       ('Pending', 'Reservación pendiente'),
       ('Confirmed', 'Reservación confirmada'),
       ('Cancelled', 'Reservación cancelada'),
       ('Completed', 'Reservación completada'),
       ('No Show', 'No se presentó');

INSERT INTO seat_class (name) VALUES ('Economy'), ('Business'), ('First Class');

INSERT INTO special_request (name, description) VALUES
        ('Vegetarian Meal', 'Comida vegetariana para pasajeros'),
        ('Extra Legroom', 'Asiento con espacio adicional para las piernas'),
        ('Window Seat', 'Asiento de ventana'),
        ('Aisle Seat', 'Asiento de pasillo'),
        ('Early Boarding', 'Embarque anticipado');

INSERT INTO plane (model, manufacturer, capacity_economy, capacity_business, capacity_first_class, date_manufactured, last_maintenance_date, registration_number, fuel_capacity) VALUES
     ('Boeing 737', 'Boeing', 150, 20, 10, '2015-03-15', '2024-04-20', 'REG12345', 5000.0),
     ('Airbus A320', 'Airbus', 160, 25, 15, '2016-07-20', '2024-06-15', 'REG23456', 5200.0),
     ('Embraer E190', 'Embraer', 100, 10, 5, '2018-11-25', '2024-07-30', 'REG34567', 4500.0),
     ('Boeing 787', 'Boeing', 250, 30, 20, '2017-05-10', '2024-08-10', 'REG45678', 7000.0),
     ('Airbus A330', 'Airbus', 270, 35, 25, '2019-09-14', '2024-09-25', 'REG56789', 7500.0),
     ('Boeing 777', 'Boeing', 300, 40, 30, '2020-02-28', '2024-10-05', 'REG67890', 8000.0);

INSERT INTO pilot_status (name, description) VALUES
     ('Active', 'Piloto activo en la aerolínea'),
     ('Inactive', 'Piloto actualmente inactivo'),
     ('On Leave', 'Piloto en licencia temporal'),
     ('Suspended', 'Piloto suspendido temporalmente'),
     ('Retired', 'Piloto retirado');

INSERT INTO pilot (first_name, last_name, license_number, date_of_birth, nationality, rank, hours_flown, employee_date, id_pilot_status, home_base, last_medical_check) VALUES
    ('John', 'Doe', 'A12345', '1975-04-12', 'USA', 'Captain', 15000, '2005-06-15', 1, 'JFK', '2023-07-10'),
    ('Jane', 'Smith', 'B67890', '1980-08-22', 'Canada', 'First Officer', 9000, '2008-09-23', 1, 'LAX', '2023-06-12'),
    ('Michael', 'Brown', 'C13579', '1972-12-04', 'UK', 'Captain', 18000, '2002-11-19', 2, 'LHR', '2023-05-08'),
    ('Emily', 'Davis', 'D24680', '1985-05-30', 'Australia', 'First Officer', 7500, '2010-02-27', 1, 'SYD', '2023-07-15'),
    ('Daniel', 'Wilson', 'E11223', '1978-03-18', 'USA', 'Captain', 12000, '2006-01-15', 3, 'ORD', '2023-04-10'),
    ('Sarah', 'Johnson', 'F44556', '1990-07-09', 'USA', 'First Officer', 5000, '2015-08-03', 4, 'MIA', '2023-03-01');

INSERT INTO flight (flight_number, id_plane, id_departure_city, id_arrival_city, departure_time, arrival_time, id_flight_status, flight_duration, distance_km, seats, id_captain, id_sub_captain, price_economy, price_business, price_first_class) VALUES
    (101, 1, 1, 2, '2024-11-01 06:00:00', '2024-11-01 08:00:00', 1, '02:00:00', 800.0, 180, 1, 2, 100.00, 200.00, 300.00),
    (102, 2, 2, 3, '2024-11-01 10:00:00', '2024-11-01 13:30:00', 2, '03:30:00', 1500.0, 220, 3, 4, 120.00, 250.00, 350.00),
    (103, 3, 3, 4, '2024-11-01 15:00:00', '2024-11-01 17:30:00', 1, '02:30:00', 900.0, 115, 5, 6, 90.00, 210.00, 310.00),
    (104, 4, 4, 5, '2024-11-01 18:00:00', '2024-11-01 23:00:00', 3, '05:00:00', 3500.0, 300, 4, 1, 150.00, 300.00, 400.00),
    (105, 5, 5, 6, '2024-11-02 06:00:00', '2024-11-02 09:00:00', 1, '03:00:00', 1200.0, 330, 2, 1, 130.00, 280.00, 380.00),
    (106, 6, 6, 7, '2024-11-02 12:00:00', '2024-11-02 14:45:00', 2, '02:45:00', 1100.0, 240, 1, 5, 110.00, 260.00, 360.00);

INSERT INTO scale (id_flight, id_city, arrival_time, departure_time, layover_duration) VALUES
   (1, 3, '2024-11-01 08:00:00', '2024-11-01 09:00:00', '01:00:00'),
   (1, 4, '2024-11-01 09:30:00', '2024-11-01 10:15:00', '00:45:00'),
   (3, 5, '2024-11-01 13:30:00', '2024-11-01 14:00:00', '00:30:00'),
   (3, 6, '2024-11-01 17:30:00', '2024-11-01 18:30:00', '01:00:00'),
   (4, 2, '2024-11-01 23:00:00', '2024-11-02 00:15:00', '01:15:00'),
   (5, 3, '2024-11-02 09:00:00', '2024-11-02 10:00:00', '01:00:00');

INSERT INTO seat (id_flight, seat_number, is_reserved, price, id_seat_class) VALUES
     (1, '1A', FALSE, 150.00, 1),
     (1, '1B', FALSE, 150.00, 1),
     (1, '2A', FALSE, 300.00, 2),
     (1, '2B', FALSE, 300.00, 2),
     (2, '10A', FALSE, 120.00, 1),
     (2, '10B', FALSE, 120.00, 1),
     (2, '1A', FALSE, 250.00, 2),
     (2, '1B', FALSE, 250.00, 2),
     (3, '5A', FALSE, 100.00, 1),
     (3, '5B', FALSE, 100.00, 1),
     (3, '2A', FALSE, 200.00, 2),
     (3, '2B', FALSE, 200.00, 2);