SELECT flights.flightNumber
 FROM flights 
WHERE departureAirport='Budapest' 
AND arrivalAirport='Kiev' 
AND availableSeats=0 
AND averageTicketPrice<=40