SELECT flights.flightNumber
 FROM flights 
JOIN airports 
ON airports.airport=flights.departureAirport 
WHERE departureAirport='Kiev' 
AND arrivalAirport='Milan' 
AND availableSeats>=4 
AND averageTicketPrice<=120
 AND priorityBoarding='yes'