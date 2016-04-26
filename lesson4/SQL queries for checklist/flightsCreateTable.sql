CREATE TABLE flights
(
flightNumber integer NOT NULL, 
departureAirport varchar(255) NOT NULL,
arrivalAirport varchar(255) NOT NULL,
stopsNumber integer,
averageTicketPrice integer,
availableSeats integer,
CONSTRAINT pk_FLIGHTS PRIMARY KEY (flightNumber,departureAirport,arrivalAirport)
); 
