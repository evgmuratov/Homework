SELECT flights.arrivalAirport
 FROM flights 
JOIN airlines 
ON flights.flightNumber=airlines.flightNumber 
JOIN airports
 ON airports.airport=flights.arrivalAirport 
WHERE departureAirport='New York' 
AND stopsNumber=0
 AND averageTicketPrice<=500 
AND dutyFree='yes'
 AND isMealincluded='yes'